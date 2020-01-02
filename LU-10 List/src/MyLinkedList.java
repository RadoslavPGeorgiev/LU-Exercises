public class MyLinkedList {
    public class Node {
        public Node next;
        public String word;
    }

    public Node head;

    public void add(String word)
    {
        if (head == null) {
            head = new Node();
            head.word = word;
            return;
        }

        Node newNode = new Node();
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.word = word;
    }

    public void remove(String word) throws Exception {
        Node temp = head;

        if (head == null)
        {
            throw new Exception("The list is empty. ");
        }

        if (head.word == word){
            head = temp.next;
            return;
        }

        Node previousNode = null;
        while(temp.next != null && temp.word != word)
        {
            previousNode = temp;
            temp = temp.next;
        }

        previousNode.next = temp.next;

    }
}

