package com.thomas.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImplTest {

	@Test
	public void testFindTheLargest() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl( new DataServiceImpl() );
		int result = businessImpl.findTheLargest();
		System.out.println("Largest: " + result);
		assertEquals(18, result);
//		fail("Not yet implemented");
	}

}


class DataServiceImpl implements DataSsrvice{

	@Override
	public int[] retrieveAllData() {
		return new int[]{4,8,18,0};
	}
	
}