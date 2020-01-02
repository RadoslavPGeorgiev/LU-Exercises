
public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Ivan");
        linkedList.add("Georgi");
        linkedList.add("Radoslav");
        linkedList.add("Nikena");
        linkedList.remove("Georgi");
        MyLinkedList.Node temp = linkedList.head;
        while(temp != null){
            System.out.println(temp.word);
            temp = temp.next;
        }

    }
}
