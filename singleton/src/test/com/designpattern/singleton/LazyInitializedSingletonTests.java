package com.designpattern.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LazyInitializedSingletonTests {

	@Test
	public void testStaticSingleton_can_create_object() {
		LazyInitializedSingleton blockSingleton = LazyInitializedSingleton.getInstance();
		assertNotNull(blockSingleton);
	}
	
	@Test
	public void testStaticSingleton_can_set_description(){
		String description = "description";
		LazyInitializedSingleton blockSingleton = LazyInitializedSingleton.getInstance();
		blockSingleton.setDescription(description);
		
		assertEquals(blockSingleton.getDescription(),description);
		
	}

	@Test
	public void testStaticSingleton_set_description_change_all_reference_values(){
		String description = "description";
		String description2 = "description2";
		LazyInitializedSingleton blockSingleton = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton blockSingletonNew = LazyInitializedSingleton.getInstance();
		blockSingleton.setDescription(description);
		
		assertEquals(blockSingletonNew.getDescription(), description );
		blockSingletonNew.setDescription(description2);

		assertEquals(blockSingleton.getDescription(), description2);
		
	}
}
