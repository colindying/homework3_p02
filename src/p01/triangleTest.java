package p01;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class triangleTest {

	@RunWith(Parameterized.class) 
	public static class TestPara { 
		private int input;  
		private boolean expected; 
		private triangle tr = null;
	public TestPara(int input, boolean expected){ 
		this.input = input;  
		this.expected = expected; 
		}
	@Before 
	public void setUp(){ 
		tr = new triangle(); 
		}
	@Parameters 
	public static Collection<Object[]> getData(){ 
		return Arrays.asList(
				new Object[][]{ 
					{1,true}, 
					{2,true}, 
					{3,true},
					{5,true},
					{6,true},
					{20,true},
					{50,true},
					{53,true},
					{70,true},
					{71,true},
					{73,true},
					{76,true}
			    }); 
		} 
	@Test public void testTr() { 
		assertEquals(this.expected,tr.whether(input)); 
		}
	}

}
