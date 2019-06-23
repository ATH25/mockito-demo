package com.thomas.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheLargest() {
		
		DataSsrvice dataServiceMock = mock(DataSsrvice.class);
		
		when(dataServiceMock.retrieveAllData() ).thenReturn(new int[] {11,18,4,7} );
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl( dataServiceMock );
		int result = businessImpl.findTheLargest();
		System.out.println("Largest: " + result);
		assertEquals(18, result);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testFindTheLargestIn3() {
		
		DataSsrvice dataServiceMock = mock(DataSsrvice.class);
		
		when(dataServiceMock.retrieveAllData() ).thenReturn(new int[] {11,0,4} );
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl( dataServiceMock );
		int result = businessImpl.findTheLargest();
		System.out.println("Largest: " + result);
		assertEquals(11, result);
	}

}


