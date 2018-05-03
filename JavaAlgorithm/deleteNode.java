class Node{
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
}

public boolean deleteNode(Node n){
	if (n == null || n.next == null) {
		return false;
	}

	int tmp = n.data;
	n.data = n.next.data;
	n.next.data = tmp;
	n.next = n.next.next;
	return true;
}