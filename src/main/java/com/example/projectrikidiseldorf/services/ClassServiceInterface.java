package com.example.projectrikidiseldorf.services;

import com.example.projectrikidiseldorf.entities.ClassRoom;

import java.util.List;
public interface ClassServiceInterface {
    List<ClassRoom> getClassC();

    ClassRoom getClassByRoomNumber(int roomNumber);

    void addClass( ClassRoom classroom);

    void updateClass(int roomNumber, ClassRoom classroom);


    void deleteClass( int roomNumber);


}
