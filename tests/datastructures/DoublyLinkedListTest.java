package datastructures;

import org.junit.*;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {
	private DoublyLinkedList<Integer> linkedList = new DoublyLinkedList();
	@Before
	public void beforeEach() throws Exception{
		this.linkedList.insertLast(1);
		this.linkedList.insertLast(2);
		this.linkedList.insertLast(3);
		this.linkedList.insertLast(4);
		this.linkedList.insertLast(5);
	}

	@After
	public void afterEach() throws Exception{
		this.linkedList.clear();
	}


	@Test
	public void headMethods() throws Exception {
		assertEquals(this.linkedList.getFirst(), new Integer(1));
		assertEquals(this.linkedList.getLast(), new Integer(5));
		this.linkedList.insertFirst(0);
		assertEquals(this.linkedList.getFirst(), new Integer(0));
		assertEquals(this.linkedList.removeFirst(), new Integer(0));
		assertEquals(this.linkedList.getFirst(), new Integer(1));
	}

	@Test
	public void tailMethods() throws Exception {
		assertEquals(this.linkedList.getFirst(), new Integer(1));
		assertEquals(this.linkedList.getLast(), new Integer(5));
		this.linkedList.insertLast(6);
		assertEquals(this.linkedList.getLast(), new Integer(6));
		assertEquals(this.linkedList.removeLast(), new Integer(6));
		assertEquals(this.linkedList.getLast(), new Integer(5));
	}

	@Test
	public void deleteElements() throws Exception {
		assertEquals(this.linkedList.has(100),false);
		assertEquals(this.linkedList.getFirst(), new Integer(1));
		assertEquals(this.linkedList.getLast(), new Integer(5));
		assertEquals(this.linkedList.delete(100),false);
		assertEquals(this.linkedList.delete(1),true);
		assertEquals(this.linkedList.delete(5),true);
		assertEquals(this.linkedList.getFirst(), new Integer(2));
		assertEquals(this.linkedList.getLast(), new Integer(4));
		assertEquals(this.linkedList.delete(3),true);
		assertEquals(this.linkedList.delete(2),true);
		assertEquals(this.linkedList.delete(4),true);
		try{
			this.linkedList.getFirst();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"LinkedList is empty");
		}
		try{
			this.linkedList.getLast();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"LinkedList is empty");
		}
	}

	@Test
	public void helperMethods() throws Exception {
		assertEquals(this.linkedList.has(3), true);
		this.linkedList.clear();
		try{
			this.linkedList.getFirst();
		}
		catch(Exception e){
			assertEquals(e.getMessage(),"LinkedList is empty");
		}
	}

	@Test
	public void edgeCases() throws Exception {
		this.linkedList.clear();
		assertEquals(this.linkedList.has(1), false);
		this.linkedList.insertFirst(1);
		assertEquals(this.linkedList.getFirst(), this.linkedList.getLast());
		assertEquals(this.linkedList.has(1), true);

	}
}