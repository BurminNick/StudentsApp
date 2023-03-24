package com.scaleapp.controller;

import com.scaleapp.Group;
import com.scaleapp.service.GroupResponseDto;
import com.scaleapp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<GroupResponseDto> showAllGroups(){
        List<GroupResponseDto> allGroups = groupService.getAllGroups();
        return allGroups;
    }

    @GetMapping("/{id}")
    public Group getGroup(@PathVariable int id){
        Group group = groupService.getGroup(id);
        return group;
    }

    @PostMapping// заменить на AddGroupRequestDto
    public Group addNewGroup (@RequestBody Group group){
        groupService.saveGroup(group);
        return group;
    }

    @PutMapping
    public Group updateGroup (@RequestBody Group group){
        groupService.saveGroup(group);
        return group;
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable int id){
        groupService.deleteGroup(id);
    }
}
