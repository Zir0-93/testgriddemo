///////////////////////////////////////////////////////////////////////////
// Generated by TestGrid
// Generated on: 20160328_111150
///////////////////////////////////////////////////////////////////////////

package demotest.complexIntegerPackage;

import org.junit.Assert;
import org.junit.Test;

public class reactorLevelTooHighTest {

	TestGridDemo TestClass = new TestGridDemo();

	// This test corresponds to these requirements:
	// ((reactorLevel1 + reactorLevel2) > 100) = true
	@Test
	public final void reactorLevelTooHighTest0() throws Exception {
		Assert.assertEquals(TestClass.reactorLevelTooHigh(101, 0), true);
	}

	// This test corresponds to these requirements:
	// ((reactorLevel1 + reactorLevel2) <= 100) = false
	@Test
	public final void reactorLevelTooHighTest1() throws Exception {
		Assert.assertEquals(TestClass.reactorLevelTooHigh(100, 0), false);
	}

}