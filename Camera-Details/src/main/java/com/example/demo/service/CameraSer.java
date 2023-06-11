
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Camera;
import com.example.demo.Repository.CameraRepo;


@Service
public class CameraSer {
	
		@Autowired
		public CameraRepo carrepo;
		//posting the info
		public Camera saveInfo (Camera cm)
		{
			return carrepo.save(cm);
		}
	    //getting the info
		public List<Camera> getInfo()
		{
			return carrepo.findAll();
		}
		//put or update
		public Camera updateInfo(Camera cu)
		{
			return carrepo.saveAndFlush(cu);
		}
		//delete
		public void deleteInfo(int id)
		{
			carrepo.deleteById(id);
		}
		//Sort
		public List<Camera> sortDesc( String cname)
		{
			return carrepo.findAll(Sort.by(cname).descending());
		}
		public List<Camera> paginationAndSorting(int cnu,int csize, String cname)
		{
			Page<Camera>p=carrepo.findAll(PageRequest.of(cnu,csize,Sort.by(cname).descending()));
			return p.getContent();
		}
		public List<Camera> paginationData(int cnu,int csize)
		{
			Page<Camera>p=carrepo.findAll(PageRequest.of(cnu,csize));
			return p.getContent();
		}
	
}