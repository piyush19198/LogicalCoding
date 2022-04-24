import java.util.Scanner;

public class SCLL {
    private Node head;
    private int nodesCount;

    protected SCLL() {
        head = null;
        nodesCount = 0;
    }
    
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    protected boolean isEmpty() {
        return (head == null);
    }

    protected int getNodesCount() {
        return this.nodesCount;
    }
    
    protected void display() {
        if (isEmpty()) {
            System.out.println("LIST EMPTY");
        } else {
            Node trav = head;
            System.out.println("Total Nodes Present : " + getNodesCount());
            System.out.println("Stored List is : \nHEAD -> ");
            while (trav != null) {
                System.out.print(trav.data + " -> ");
                trav = trav.next;
            }
            System.out.println("NULL");
        }
    }
    
    protected void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            nodesCount++;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            nodesCount++;
        }
    }

    protected void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            nodesCount++;
        } else {
            newNode.next = head;
            head = newNode;
            nodesCount++;
        }
    }

    protected void insertAt(int pos, int data) {
        if (pos == 1) {
            insertAtHead(data);
        }
        if (pos == getNodesCount()) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            int temp = 1;
            Node trav = head;
            while (temp < pos - 1) {
                temp++;
                trav = trav.next;
                newNode.next = trav.next;
                trav.next = newNode;
                nodesCount++;
            }
        }
    }

    protected void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("LIST EMPTY");
        } else {
            Node trav = head;
            while (trav.next.next != null) {
                trav = trav.next;
            }
            trav.next = null;
            nodesCount--;
        }
    }

    protected void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("LIST EMPTY");
        } else {
            if (head.next == null) {
                head = null;
                nodesCount--;
            } else {
                head = head.next;
                nodesCount--;
            }
        }
    }

    protected void delete(int pos) {
        if (pos == 1) {
            deleteAtHead();
        }
        if (pos == getNodesCount()) {
            deleteAtEnd();
        } else {
            int temp = 1;
            Node trav = head;
            while (temp < pos - 1) {
                temp++;
                trav = trav.next;
                nodesCount--;
            }
        }
    }

    protected void reverse() {
        Node curr = head;
        Node prev = curr.next;
        curr.next = null;

        while (prev != null) {
            Node next = prev.next;
            prev.next = curr;
            curr = prev;
            prev = next;
        }
        head = curr;
    }

    protected void displayReverse(Node trav) {
        if (trav != null) {
            return;
        } else {
            displayReverse(trav.next);
            System.out.print(trav.data);
        }
    }
    
    protected void displayReverse() {
        System.out.println("List in reverse order is : ");
        displayReverse(head);
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SCLL list = new SCLL();
		
		System.out.println("---Welcome to Singly Linked List---");
		
		boolean loop = true;
		while(loop) {
			list.display();
			System.out.println("\nSelect operation to perform: "
					+ "\n1.Display list"
					+ "\n2.Insert node at last position"
					+ "\n3.Insert node at first position"
					+ "\n4.Insert node at specific location"
					+ "\n5.Delete node at last position"
					+ "\n6.Delete node at first position"
					+ "\n7.Delete node at specific location"
					+ "\n8.Reverse the list and display"
					+ "\n9.Display list in reverse manner"
					+ "\n10.Exit");	
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				list.display();
				break;
			case 2:
				list.insertAtEnd(sc.nextInt());
				break;
			case 3:
				list.insertAtHead(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter position to enter data at");
				int posToAdd = sc.nextInt();
				System.out.println("Enter data to insert at position "+posToAdd);
				int dataToAdd = sc.nextInt();
				list.insertAt(posToAdd, dataToAdd);
				break;
			case 5:
				list.deleteAtEnd();
				System.out.println("Last node deleted, Updated List is = \n");
				list.display();
				break;
			case 6:
				list.deleteAtHead();
				System.out.println("Last node deleted, Updated List is = \n");
				list.display();
				break;
			case 7:
				System.out.println("Enter position to delete data from");
				int posToDelete = sc.nextInt();
				list.delete(posToDelete);
				System.out.println("Last node deleted, Updated List is = \n");
				list.display();
				break;
			case 8:
				System.out.println("List before reverse operation: \n");
				list.display();
				if(!list.isEmpty()) {
					list.reverse();
				}
				System.out.println("List after reverse operation: \n");
				list.display();
				break;
			case 9:
				list.displayReverse();
				break;
			case 10:
				loop = false;
				break;
			default:
				System.out.println("!!! PLEASE ENTER VALID OPERATION !!!");
				break;
			}
		}
	}
}
