package com.example.projectrikidiseldorf.controllers;

import com.example.projectrikidiseldorf.entities.ClassRoom;
import com.example.projectrikidiseldorf.services.ClassServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Class")
public class ControllerClass {
    @Autowired
    ClassServiceInterface classServiceInterface;
    @GetMapping
    public List<ClassRoom> getClassC() {
        return classServiceInterface.getClassC();
    }
    @GetMapping("/{roomNumber}")
    public ClassRoom getClassByRoomNumber(@PathVariable int roomNumber) {
        return classServiceInterface.getClassByRoomNumber(roomNumber);
    }
    @PostMapping
    public void addClass(@RequestBody ClassRoom classroom){classServiceInterface.addClass(classroom);}
    @PutMapping("/{roomNumber}")
    public void updateClass(@PathVariable int roomNumber,@RequestBody ClassRoom classroom)
    {
        classServiceInterface.updateClass(roomNumber,classroom);
    }
    @DeleteMapping("/{roomNumber}")
    public void deleteClass(@PathVariable int roomNumber){classServiceInterface.deleteClass(roomNumber);}

}
