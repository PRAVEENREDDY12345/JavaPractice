package com.pavanclasses.constructors;

public class ConstructorsOverLoading {
	int trainNo ;
	String trainName ;
	double trainSpeed;
	boolean trainIsClean;
	public ConstructorsOverLoading() {
		// TODO Auto-generated constructor stub
	}
	public ConstructorsOverLoading(int trainNo, String trainName, boolean trainIsClean) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.trainIsClean = trainIsClean;
	}
	public ConstructorsOverLoading(int trainNo, String trainName, double trainSpeed) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.trainSpeed = trainSpeed;
	}
	
	
	
	

}
