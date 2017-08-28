package datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
	private Stack<Integer> stack = new Stack<>();
	@Before
	public void beforeEach() throws Exception{
		this.stack.push(1);
		this.stack.push(2);
		this.stack.push(3);
		this.stack.push(4);
		this.stack.push(5);
	}

	@After
	public void afterEach() throws Exception{
		this.stack.clear();
	}

	@Test
	public void addAndPeak() throws Exception {
		assertEquals(this.stack.peek(), new Integer(5));
		this.stack.push(6);
		assertEquals(this.stack.peek(), new Integer(6));
	}

	@Test
	public void remove() throws Exception {
		assertEquals(this.stack.pop(), new Integer(5));
		assertEquals(this.stack.pop(), new Integer(4));
		assertEquals(this.stack.pop(), new Integer(3));
		assertEquals(this.stack.pop(), new Integer(2));
		assertEquals(this.stack.pop(), new Integer(1));
	}

	@Test
	public void edgeCases() throws Exception {
		assertEquals(this.stack.pop(), new Integer(5));
		assertEquals(this.stack.isEmpty(), false);
		this.stack.clear();
		assertEquals(this.stack.isEmpty(), true);
		try{
			this.stack.peek();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"Can't peek from an empty stack");
		}
		try{
			this.stack.pop();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"Can't pop from an empty stack");
		}
	}

}