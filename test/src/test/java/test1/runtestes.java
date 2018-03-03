package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runtestes {
	@Test
	public void Dummy_test_to_pass(){
		Assert.assertEquals(1, 1);
		
	}
	@Test
	public void Dummy_test_to_fail(){
		Assert.assertEquals(2,2);
		
	}
}
