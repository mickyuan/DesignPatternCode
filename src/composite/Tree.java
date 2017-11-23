package composite;

import java.util.Enumeration;

public class Tree {

	TreeNode root = null;

	public Tree(String name) {

		root = new TreeNode(name);
	}

	public static void main(String[] args) {

		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		nodeB.add(nodeD);
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
		
		Enumeration<TreeNode> trees = tree.root.getChildren().nextElement().getChildren();
		while (trees.hasMoreElements()){
			System.out.println(trees.nextElement().getName());
		}
	}
}