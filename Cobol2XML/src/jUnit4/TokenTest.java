package jUnit4;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Token;
public class TokenTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//char c = 'a';
		//Token t = new Token(c);
		//assertFalse(t.isNumber());
		//assertFalse(t.isWord());
		//assertTrue(t.isSymbol());
		
		//int i = 2;
		//Token t1 = new Token(i);
		//assertTrue(t1.isNumber());
		//assertFalse(t1.isWord());
		//assertFalse(t1.isSymbol());
		
		String s = "hello";
		Token t2 = new Token(s);
		assertFalse(t2.isNumber());
		assertTrue(t2.isWord());
		assertFalse(t2.isSymbol());
	}

}
