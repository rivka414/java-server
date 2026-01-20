package com.example.projectrikidiseldorf.repositories;

import com.example.projectrikidiseldorf.entities.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepositories extends CrudRepository<ClassRoom,Integer>{

}
