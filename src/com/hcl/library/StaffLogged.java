package com.hcl.library;

import com.hcl.library.model.bo.StaffBO;

public class StaffLogged {
	private static StaffBO staff;
	
	
	public static void setStaff(StaffBO staffbo) {
		staff=staffbo;
	}
	
	public static StaffBO getStaff() {
		return staff;
	}
}
