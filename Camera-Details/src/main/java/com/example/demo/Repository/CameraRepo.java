package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Camera;

@Repository
public interface CameraRepo extends JpaRepository<Camera,Integer>{

}