package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Given tree below, create function with the following signature which finds
 * closest common parent of second and third parameter.
 * 
 * function (top_node, node1, node2) where top_node = highest node in tree node1
 * = any other node in tree != top_node node2 = any other node in tree !=
 * top_node or node1
 *
 *          A 
 *         / \ 
 *        B   C 
 *       / \ / \ 
 *      D  E F  G 
 *     / \ 
 *    H   I
 *
 */
public class FindCommonParentInTree {

	public class Node {

		private String name;
		private List<Node> children;

		public Node(String name) {
			this.setName(name);
			children = new ArrayList<Node>();
		}

		public List<Node> getChildren() {
			return children;
		}

		public void addChild(Node child) {
			children.add(child);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static Node findClosestCommonParent(Node highestNode, Node topNode, Node node1, Node node2) {

		List<Node> parents1 = new ArrayList<Node>();
		List<Node> parents2 = new ArrayList<Node>();

		searchTree(highestNode, highestNode, node1, parents1);
		searchTree(highestNode, highestNode, node2, parents2);

		for (Node n : parents1) {
			Predicate<Node> p_str = k -> n.getName().contentEquals(k.getName());
			if (parents2.stream().anyMatch(p_str)) {
				return n;
			}
		}
		return null;

	}

	private static void searchTree(Node highestNode, Node topNode, Node node, List<Node> parents) {

		for (Node n : topNode.getChildren()) {
			if (n.getName().contentEquals(node.getName())) {
				parents.add(topNode);
				searchTree(highestNode, highestNode, topNode, parents);
				return;
			} else {
				searchTree(highestNode, n, node, parents);
			}
		}
	}
}
