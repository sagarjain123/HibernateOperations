package com.sai.om.test;

import com.sai.om.dao.MobileDAO;
import com.sai.om.dto.MobileDTO;

public class Tester {
	
	public static void main(String[] args) {
		
		MobileDTO dto=new MobileDTO();
		dto.setMobileid(2);
		dto.setMobilebrand("samsung");
		dto.setMobiletype("smartphone");
		dto.setMobilecost(67000.00);
		
		MobileDAO dao=new MobileDAO();
		//dao.SaveMobile(dto);
		//dao.updateMobile(dto);
		//dao.deleteMobile(dto);
//		MobileDTO dto1=dao.getMobile(dto);
//	System.out.println(dto1.getMobilebrand());
		dao.mergeMobile(dto);
		System.out.println("data save");
	}
}

