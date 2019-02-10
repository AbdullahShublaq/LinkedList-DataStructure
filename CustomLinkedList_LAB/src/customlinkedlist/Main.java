package customlinkedlist;

/*import java.util.LinkedList;*/

public class Main {

    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        
        /*LinkedList<String> list2 = new LinkedList<>();
        list2.remove(2);*/

        list.addAtHead("Mohammed");
        list.addAtTail("Ali");
        list.addAtTail("Abdullah");
        list.addAtIndex(2, "MWAK");
        list.addAtIndex(1, "Omar");
        list.removeHead();
        list.removeTail();
        list.removeIndex(2);

//        System.out.println(list.getHead().data);
//        System.out.println(list.getTail().data);
//        list.removeIndex(1);
//        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println(list.size());
    }
}
