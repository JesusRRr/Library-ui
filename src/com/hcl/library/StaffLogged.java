package com.hcl.library;

import com.hcl.library.model.bo.StaffBO;
import com.hcl.library.service.StaffService;

public class StaffLogged {
	private static StaffBO staff;
	
	
	public static void setStaff(StaffBO staffbo) {
		staff =StaffService.getInstance().findByUserName(staffbo.getUserName());
		
	}
	
	public static StaffBO getStaff() {
		
		return staff;
	}
}
