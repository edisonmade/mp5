package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class IdStrategyTest {

	@Test
	public void testIdFromFileNameOutput() {
		IdStrategy.CaseInsensitive obj = new IdStrategy.CaseInsensitive();
		assertEquals(obj.idFromFilename("test"),"test");
	}
	
	@Test
	public void testIdFromFilesNameOuptut1() {
		IdStrategy.CaseInsensitive obj = new IdStrategy.CaseInsensitive();
		assertEquals(obj.idFromFilename("aads-~$11111"),"11111");
	}

}
