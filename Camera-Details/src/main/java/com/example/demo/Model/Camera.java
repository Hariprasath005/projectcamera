package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="CameraDetails")
public class Camera {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String cameraBrand;
private String model;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCameraBrand() {
	return cameraBrand;
}
public void setCameraBrand(String cameraBrand) {
	this.cameraBrand = cameraBrand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "Camera [id=" + id + ", cameraBrand=" + cameraBrand + ", model=" + model + "]";
}
}