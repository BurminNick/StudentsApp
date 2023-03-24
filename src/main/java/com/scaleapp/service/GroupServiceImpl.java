package com.scaleapp.service;

import com.scaleapp.Group;
import com.scaleapp.data.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public List<GroupResponseDto> getAllGroups(){
        List<Group> groups = groupRepository.findAll();
        List<GroupResponseDto> groupResponseDtos = groups.stream().
                map(group ->
                {GroupResponseDto groupResponseDto = new GroupResponseDto();
                groupResponseDto.setQuantity(group.students.size());
                groupResponseDto.setId(group.getId());
                groupResponseDto.setNumber(group.getName());
                    return groupResponseDto;
                }).
                sorted((x,y)->y.getQuantity() - x.getQuantity()).collect(Collectors.toList());

        return groupResponseDtos;
    }

    @Override
    public void saveGroup (Group group){
        groupRepository.save(group);
    }

    @Override
    public Group getGroup (int id){
        return groupRepository.findById(id).orElseThrow(null);
    }

    @Override
    public void deleteGroup(int id){
        groupRepository.deleteById(id);
    }

}
