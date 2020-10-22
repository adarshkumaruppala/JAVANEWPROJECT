package ds.circularLinkedList;

public class App {

	public static void main(String[] args) {
             CircularLinkedList newList=new CircularLinkedList();
             newList.insertFirst(10);
             newList.insertLast(23);
             newList.insertFirst(9);
             newList.insertLast(45);
            // newList.deleteLast();
             newList.displayList();
	}

}
