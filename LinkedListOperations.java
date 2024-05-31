class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void insertAtPos(int data, int position) {
	        Node newNode = new Node(data);
	        if (position == 1) {
	            newNode.next = head;
	            head = newNode;
	        } else {
	            Node current = head;
	            for (int i = 1; i < position - 1 && current != null; i++) {
	                current = current.next;
	            }
	            if (current == null) {
	                System.out.println("Position out of range");
	                return;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }
	    }

	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        if (position == 1) {
	            head = head.next;
	            return;
	        }
	        Node current = head;
	        for (int i = 1; i < position - 1 && current != null; i++) {
	            current = current.next;
	        }
	        if (current == null || current.next == null) {
	            System.out.println("Position out of range");
	            return;
	        }
	        current.next = current.next.next;
	    }

	    public void deleteAfterNode(Node node) {
	        if (node == null || node.next == null) {
	            System.out.println("No node after the given node to delete");
	            return;
	        }
	        node.next = node.next.next;
	    }

	    public void searchNode(int value) {
	        Node current = head;
	        int position = 1;
	        while (current != null) {
	            if (current.data == value) {
	                System.out.println("Node with value " + value + " found at position " + position);
	                return;
	            }
	            current = current.next;
	            position++;
	        }
	        System.out.println("Node with value " + value + " not found");
	    }
	}

	class Stack {
	    Node head;

	    public Stack() {
	        this.head = null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    public int pop() {
	        if (head == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int data = head.data;
	        head = head.next;
	        return data;
	    }

	    public int peek() {
	        if (head == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return head.data;
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        // Singly Linked List operations
	        LinkedList linkedList = new LinkedList();
	        linkedList.insertAtPos(5, 1);
	        linkedList.insertAtPos(10, 2);
	        linkedList.insertAtPos(15, 2);
	        linkedList.deleteAtPosition(2);
	        linkedList.searchNode(10);

	        // Stack operations
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println(stack.peek()); // Output: 3
	        System.out.println(stack.pop());  // Output: 3
	        System.out.println(stack.pop());  // Output: 2
	    }
}


