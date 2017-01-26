package samsung;

import java.util.LinkedList;
import java.util.Scanner;

/**
@FILE  : Test2_2.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	트리는 형태와 특성에 따라 순서트리, 이진트리, 사향트리 등으로 나눈다.
	이진트리는 한 노드가 최대 2개의 자식노드를 가진 트리를 의미하며
	순회, 이진탐색트리에 활용된다.
	입력되는 정보(노드)로 이진트리를 [그림 2-5]와 같이 구축한다.
	[그림 2-5]의 이진트리를 보고 연결리스트를 이용하여 각 노드의 레벨을 줄(열)에 맞추어 문자를 출력하라.
	
	(입력)
	입력된 노드와 연결된 노드를 짝을 지어 순서대로 쓰되, 시작은 루트노드이고,
	짝지어진 두 개의 노드( 예)N-M일 때, N은 부모노드, M은 자식노드)의 형태로 입력한다.
	
	(출력)
	각 노드의 레벨에 맞게 '-'으로 간격을 맞추고 (노드)문자를 출력한다. 
	예) 루트는 A, 1레벨은 -B, 2레벨은 --C 순으로 출력
 */
public class Test06 {
	public static Node root;
	public Test06() {
		this.root = null;
	}
	
	public void insert(String parent, String child) {
		Node newNode = new Node(parent, child);
		if(root==null) {
			root = newNode;
			return;
		}
		Node cNode = root; // 현재 노드
		Node pNode = null; // 부모 노드
		while(true) {
			pNode = cNode;
			if(parent.equals(newNode.parent)) { // 만드려는 노드가 
				
			} else if (child.equals(newNode.parent)) {
				
			} else if (parent.equals(newNode.child)) {
				
			} else {
				
			}
		}
	}
	
	public void print(Node root) {
		String s = "";
		if(root!=null) { // 부모 노드가 null이 아닐 때
			System.out.println(root.parent);
			if(hasChild(root)) {
				s += "-";
				System.out.print(root.child);
			} else if(!hasChild(root)) {
				s.substring(1);
			}
			print(root.cnode1);
			print(root.cnode2);
		}
	}
	
	public boolean hasChild(Node node) {
		if(node.child!=null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasParent(Node node) {
		if(node.parent!=null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parent = "", child = "";
		Test06 tree = new Test06();
		while(true) {
			System.out.println("순서대로 두 개의 노드를 입력하세요[예)A-B]:");
			parent = sc.next();
			parent = parent.split("-")[0];
			child = parent.split("-")[1];
			tree.insert(parent, child);;
			System.out.println("더 입력하시겠습니까(Y)?");
			if(sc.next().equals("Y")) {
				break;
			} 
		}
//		print(tree);
	}
}

class Node {
	String parent, child;
	Node cnode1, cnode2;
	int level;
	public Node(String parent, String child) {
		this.parent = parent;
		this.child = child;
		cnode1 = null; cnode2 = null;
	}
}
