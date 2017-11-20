package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class IdStrategyTest {

	@Test
	public void testIdFromFileNameOutput() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals(obj.idFromFilename("test"),"test");
	}
	
	@Test
	public void testIdFromFilesNameOuptut1() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals(obj.idFromFilename("$F"),"");
	}
	@Test
	public void testIdFromFilesNameOuptut2() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals(obj.idFromFilename("$11111"),"ᄑ1");
	}

}
