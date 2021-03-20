package solutions;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import solutions.FindCommonParentInTree.Node;

public class FindCommonParentInTreeTest {

	FindCommonParentInTree solution;
	Node highestNode;

	private Node buildTestTree() {
		solution = new FindCommonParentInTree();

		Node H = solution.new Node("H");
		Node I = solution.new Node("I");
		Node D = solution.new Node("D");
		D.addChild(H);
		D.addChild(I);

		Node E = solution.new Node("E");
		Node B = solution.new Node("B");
		B.addChild(D);
		B.addChild(E);

		Node F = solution.new Node("F");
		Node G = solution.new Node("G");
		Node C = solution.new Node("C");
		C.addChild(F);
		C.addChild(G);

		Node A = solution.new Node("A");
		A.addChild(B);
		A.addChild(C);
		return A; // highest node
	}

	@Before
	public void setUp() throws Exception {
		highestNode = buildTestTree();
	}

	@Test
	public void findClosestCommonParent() {
		Node node1 = solution.new Node("E");
		Node node2 = solution.new Node("I");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("B"));
	}

	@Test
	public void findClosestCommonParent2() {
		Node node1 = solution.new Node("G");
		Node node2 = solution.new Node("H");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("A"));
	}

	@Test
	public void findClosestCommonParent3() {
		Node node1 = solution.new Node("I");
		Node node2 = solution.new Node("H");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("D"));
	}

}
