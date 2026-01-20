package com.example.projectrikidiseldorf.services;

import com.example.projectrikidiseldorf.entities.ClassRoom;
import com.example.projectrikidiseldorf.repositories.ClassRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ClassRoomService implements ClassServiceInterface{
    @Autowired
    ClassRepositories classRepositories;
    public List<ClassRoom> getClassC() {
        return (List<ClassRoom>) classRepositories.findAll();
    }

    public ClassRoom getClassByRoomNumber(int roomNumber) {
        return classRepositories.findById(roomNumber).orElse(null);
    }

    public void addClass( ClassRoom classroom){classRepositories.save(classroom);}

    public void updateClass(int roomNumber, ClassRoom classroom)
    {
        classRepositories.deleteById(roomNumber);
        classRepositories.save(classroom);
    }

    public void deleteClass( int roomNumber){classRepositories.deleteById(roomNumber);}



}
