package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Mayor;

public class examento {
Mayor m=new Mayor();
	@Before
	public void setUp() throws Exception {
		m.setA(5);
		m.setB(3);
	}

	@Test
	public void test() {
		assertEquals(5,m.mayor());
	}

}
