package datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
	private Queue<Integer> queue = new Queue<>();
	@Before
	public void beforeEach() throws Exception{
		this.queue.add(1);
		this.queue.add(2);
		this.queue.add(3);
		this.queue.add(4);
		this.queue.add(5);
	}

	@After
	public void afterEach() throws Exception{
		this.queue.clear();
	}

	@Test
	public void addAndPeak() throws Exception {
		assertEquals(this.queue.peek(), new Integer(1));
		this.queue.add(6);
		assertEquals(this.queue.peek(), new Integer(1));
	}

	@Test
	public void remove() throws Exception {
		assertEquals(this.queue.remove(), new Integer(1));
		assertEquals(this.queue.remove(), new Integer(2));
		assertEquals(this.queue.remove(), new Integer(3));
		assertEquals(this.queue.remove(), new Integer(4));
		assertEquals(this.queue.remove(), new Integer(5));
	}

	@Test
	public void edgeCases() throws Exception {
		assertEquals(this.queue.remove(), new Integer(1));
		assertEquals(this.queue.isEmpty(), false);
		this.queue.clear();
		assertEquals(this.queue.isEmpty(), true);
		try{
			this.queue.peek();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"Cannot peek from an empty queue");
		}
		try{
			this.queue.remove();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"Cannot remove from an empty queue");
		}
	}

}