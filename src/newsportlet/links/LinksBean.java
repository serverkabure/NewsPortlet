package newsportlet.links;

import java.io.Serializable;

import org.apache.myfaces.custom.tree.DefaultMutableTreeNode;
import org.apache.myfaces.custom.tree.model.DefaultTreeModel;
import org.apache.myfaces.custom.tree.model.TreeModel;

public class LinksBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private TreeModel treeModel = null;

	public LinksBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public TreeModel getTreeModel() {
		if (treeModel == null) {
			// DefaultMutableTreeNode root = new
			// DefaultMutableTreeNode("自分用リンク集");
			// DefaultMutableTreeNode a = new DefaultMutableTreeNode("ニュース関連");
			// root.insert(a);
			// DefaultMutableTreeNode b = new DefaultMutableTreeNode("AP関連");
			// root.insert(b);
			// DefaultMutableTreeNode c = new DefaultMutableTreeNode("その他");
			// root.insert(c);
			//
			// DefaultMutableTreeNode node = new DefaultMutableTreeNode("a1");
			// a.insert(node);
			// node = new DefaultMutableTreeNode("a2 ");
			// a.insert(node);
			// node = new DefaultMutableTreeNode("b ");
			// b.insert(node);
			//
			// a = node;
			// node = new DefaultMutableTreeNode("x1");
			// a.insert(node);
			// node = new DefaultMutableTreeNode("x2");
			// a.insert(node);

			DefaultMutableTreeNode root = new DefaultMutableTreeNode(
					new TreeItem(1, "XY", "9001", "XY 9001"));
			DefaultMutableTreeNode a = new DefaultMutableTreeNode(new TreeItem(
					2, "A", "9001", "A 9001"));
			root.insert(a);
			DefaultMutableTreeNode b = new DefaultMutableTreeNode(new TreeItem(
					3, "B", "9001", "B 9001"));
			root.insert(b);
			DefaultMutableTreeNode c = new DefaultMutableTreeNode(new TreeItem(
					4, "C", "9001", "C 9001"));
			root.insert(c);

			DefaultMutableTreeNode node = new DefaultMutableTreeNode(
					new TreeItem(5, "a1", "9002", "a1 9002"));
			a.insert(node);
			node = new DefaultMutableTreeNode(new TreeItem(6, "a2", "9002",
					"a2 9002"));
			a.insert(node);
			node = new DefaultMutableTreeNode(new TreeItem(7, "a3", "9002",
					"a3 9002"));
			a.insert(node);
			node = new DefaultMutableTreeNode(new TreeItem(8, "b", "9002",
					"b 9002"));
			b.insert(node);

			a = node;
			node = new DefaultMutableTreeNode(new TreeItem(9, "x1", "9003",
					"x1 9003"));
			a.insert(node);
			node = new DefaultMutableTreeNode(new TreeItem(9, "x2", "9003",
					"x2 9003"));

			treeModel = new DefaultTreeModel(root);

		}
		return treeModel;
	}

	public void setTreeModel(TreeModel treeModel) {
		this.treeModel = treeModel;
	}

}
