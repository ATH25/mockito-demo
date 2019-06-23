package com.thomas.mockito;

public class SomeBusinessImpl {
	
	private DataSsrvice dataSsrvice;
	
	
	public SomeBusinessImpl(DataSsrvice dataSsrvice) {
		super();
		this.dataSsrvice = dataSsrvice;
	}


	int findTheLargest(){
		int[] dataArray = dataSsrvice.retrieveAllData();
		int largest = Integer.MIN_VALUE;
		
		for (int i : dataArray) {
			
			if (largest < i){
				largest = i;
			}//for
			
		}
		return largest;
	}//findTheLargest
	
}

