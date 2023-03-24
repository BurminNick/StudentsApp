package com.scaleapp.service;

import com.scaleapp.Group;
import com.scaleapp.Student;

import java.util.List;

public interface GroupService {

    public List<GroupResponseDto> getAllGroups();

    public void saveGroup (Group group);

    public Group getGroup (int id);

    public void deleteGroup(int id);
}
