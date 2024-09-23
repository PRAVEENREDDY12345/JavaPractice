package com.pavanclasses.constructors;

public class CopyConstructor {
	
	int villagePinCode ;
	String villageName ;
	Boolean isItGoodVillage ;
	
	
	public CopyConstructor() {
		// TODO Auto-generated constructor stub
	}


	public CopyConstructor(int villagePinCode, String villageName, Boolean isItGoodVillage) {
		this.villagePinCode = villagePinCode;
		this.villageName = villageName;
		this.isItGoodVillage = isItGoodVillage;
	}


	public CopyConstructor(CopyConstructor cc) {
		
		this.villagePinCode = cc.villagePinCode;
		this.villageName = cc.villageName;
		this.isItGoodVillage =cc.isItGoodVillage;
	}
	
	
	


	
	
	
	
	

}
