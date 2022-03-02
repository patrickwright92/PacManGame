package aStarAlgorithm;

import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;

class NodeTest {
	
	
	@Test
	public void FCostTest(){
		Node testNode = new Node(12,12);
		testNode.setG(10);
		testNode.setH(10);
		
		int finalCost = testNode.getG() + testNode.getH();
		testNode.setF(finalCost);
		
		assertEquals(20, finalCost);
	}
	
	@Test
	public void GCostTest() {
		Node currentNode = new Node(10,10);
		currentNode.setG(10);
		int cost = 5;
		
		int gCost = currentNode.getG() + cost;
        currentNode.setG(gCost);
        
        assertEquals(15,gCost);
	}
	
	@Test 
	public void HCostTest() {
		Node currentNode = new Node (4,15);
		Node finalNode = new Node (18,20);
		currentNode.setH(Math.abs(finalNode.getRow() - currentNode.getRow()) + Math.abs(finalNode.getCol() - currentNode.getCol()));
		
		assertEquals(19,currentNode.getH());
	}
	
	@Test
	
	public void negativeTest() {
		//could not think of a negativeTest, the system is entirely in control 
		//cannot decide on what sort of input could possibly throw an error.
	}
}


