package misc;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import misc.FindCommonParentInTree.Node;

public class FindCommonParentInTreeTest {

	FindCommonParentInTree solution;
	Node highestNode;

	private Node buildTestTree() {
		solution = new FindCommonParentInTree();

		Node H = solution.new Node("H");
		Node I = solution.new Node("I");
		Node D = solution.new Node("D");
		D.addReportee(H);
		D.addReportee(I);

		Node E = solution.new Node("E");
		Node B = solution.new Node("B");
		B.addReportee(D);
		B.addReportee(E);

		Node F = solution.new Node("F");
		Node G = solution.new Node("G");
		Node C = solution.new Node("C");
		C.addReportee(F);
		C.addReportee(G);

		Node A = solution.new Node("A");
		A.addReportee(B);
		A.addReportee(C);
		return A; // highest node
	}

	@Before
	public void setUp() throws Exception {
		highestNode = buildTestTree();
	}

	@Test
	public void testfindClosestCommonParent() {
		Node node1 = solution.new Node("E");
		Node node2 = solution.new Node("I");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("B"));
	}

	@Test
	public void testfindClosestCommonParent2() {
		Node node1 = solution.new Node("G");
		Node node2 = solution.new Node("H");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("A"));
	}

	@Test
	public void testfindClosestCommonParent3() {
		Node node1 = solution.new Node("I");
		Node node2 = solution.new Node("H");
		Node common = FindCommonParentInTree.findClosestCommonParent(highestNode, highestNode, node1, node2);
		assertTrue(common != null);
		assertTrue(common.getName().contentEquals("D"));
	}

}
