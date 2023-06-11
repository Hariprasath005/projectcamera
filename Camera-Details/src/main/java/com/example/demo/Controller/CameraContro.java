package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Camera;
import com.example.demo.service.CameraSer;

@RestController
@CrossOrigin("http://localhost:3000")
public class CameraContro {

		@Autowired
		public CameraSer cser;
		@PostMapping("/saveCam")
		public Camera addDetails(@RequestBody Camera ca)
		{
	      return cser.saveInfo(ca);
		}
		@GetMapping("/getCam")
		public List<Camera> getDetails()
		{
			return cser.getInfo();
		}
		
		
		@PutMapping("/updateCam")
		public Camera updateDetails(@RequestBody Camera cb)
		{
			return cser.updateInfo(cb);
		}
		@DeleteMapping("/deleteCam/{cid}")
		public String deleteDetails(@PathVariable int cid)
		{
			cser.deleteInfo(cid);
			return "Carid"+cid+"deleted";
		}
		@GetMapping("/sortDes/{cname}")
		public List<Camera> sortCar(@PathVariable("cname") String cname)
		{
			
			return cser.sortDesc(cname);
		}
		@GetMapping("/pagination/{cnu}/{csize}")
		public List<Camera> paginationData(@PathVariable("cnu") int cnu,@PathVariable("csize") int csize)
		{
			return cser.paginationData(cnu,csize);
		}
		@GetMapping("/pageAndsort/{cnu}/{csize}/{cname}")
		public List<Camera> paginationSorting(@PathVariable int cnu,@PathVariable int csize,@PathVariable String cname)
		{
			return cser.paginationAndSorting(cnu, csize, cname);
		}
		
		
	}