package com.pavanclasses.constructors;
/*
 * 
 * Constructors Testing
 * 
 */
public class ConstructorsTesting {

	/*
	 * 
	 * Main Method
	 */
	
	public static void main(String[] args) {
		/*
		 * Default Constructors
		 * 
		 */
		DefaultConstructors dc = new DefaultConstructors();
		
		System.out.println(dc.jobNo);
		System.out.println(dc.jobName);
		System.out.println("");
		/*
		 * 
		 * ParamentersConstructors
		 * 
		 */
		
		ParametersConstructors pc = new ParametersConstructors(10,"WhiteField");
		
		System.out.println(pc.siteName);
		System.out.println(pc.siteNo);
		
		System.out.println("");
		/*
		 * 
		 * Copy Constructors
		 * 
		 */
		
		CopyConstructor cc=  new CopyConstructor(516173,"Lekkalavaripalli", true);
		
		System.out.println(cc.villagePinCode);
		System.out.println(cc.villageName);
		System.out.println(cc.isItGoodVillage);
		System.out.println("");
		
		CopyConstructor cc1 = new CopyConstructor(cc);
		System.out.println(cc1.villagePinCode);
		System.out.println(cc1.villageName);
		System.out.println(cc1.isItGoodVillage);
		System.out.println("");
		/*
		 * 
		 * Constructor OverLoading
		 * 
		 */
		ConstructorsOverLoading col1 = new ConstructorsOverLoading(12612, "Venkatadri Express", true);
		System.out.println(col1.trainNo);
		System.out.println(col1.trainName);
		System.out.println(col1.trainIsClean);
		
		System.out.println("");
		
		
		
		ConstructorsOverLoading col2 = new ConstructorsOverLoading(12612, "Venkatadri Express", 70.6);
		System.out.println(col2.trainNo);
		System.out.println(col2.trainName);
		System.out.println(col2.trainSpeed);
		
		
		
		
	}
}
