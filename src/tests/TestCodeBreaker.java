package tests;

import junit.framework.TestCase;
import classes.CodeBreaker;


public class TestCodeBreaker extends TestCase {
	private CodeBreaker cb;
	private String respuestaExpected="";
	private String respuestaActual ="";
	@org.junit.Test
	public void testGuess(){
		cb=new CodeBreaker();
		respuestaExpected = "";
		respuestaActual = cb.guess("4897");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessOneInPosition(){
		cb = new CodeBreaker();
		respuestaExpected = "x";
		respuestaActual = cb.guess("2190");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessTwoInPosition(){
		cb = new CodeBreaker();
		respuestaExpected = "xx";
		respuestaActual = cb.guess("2390");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessThreeInPosition(){
		cb = new CodeBreaker();
		respuestaExpected = "xxx";
		respuestaActual = cb.guess("2360");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessFourInPosition(){
		cb = new CodeBreaker();
		respuestaExpected = "xxxx";
		respuestaActual = cb.guess("2365");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessAppearOnce(){
		cb = new CodeBreaker();
		respuestaExpected = "_";
		respuestaActual = cb.guess("1290");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessAppearTwice(){
		cb = new CodeBreaker();
		respuestaExpected = "__";
		respuestaActual = cb.guess("1296");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessAppear3(){
		cb = new CodeBreaker();
		respuestaExpected = "___";
		respuestaActual = cb.guess("1256");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessAppear4(){
		cb = new CodeBreaker();
		respuestaExpected = "____";
		respuestaActual = cb.guess("3256");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessX_(){
		cb = new CodeBreaker();
		respuestaExpected = "x_";
		respuestaActual = cb.guess("2509");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessXX_(){
		cb = new CodeBreaker();
		respuestaExpected = "xx_";
		respuestaActual = cb.guess("2359");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessX__(){
		cb = new CodeBreaker();
		respuestaExpected = "x__";
		respuestaActual = cb.guess("2056");
		assertEquals(respuestaExpected, respuestaActual);
	}
	
	@org.junit.Test
	public void testGuessX___(){
		cb = new CodeBreaker();
		respuestaExpected = "x___";
		respuestaActual = cb.guess("2536");
		assertEquals(respuestaExpected, respuestaActual);
	}
	

}
