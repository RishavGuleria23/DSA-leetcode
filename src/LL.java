public class LL {
    private Node head;
    private Node tail;
    private  int size;
    public LL(){
        this.size= 0 ;
    }
    public void duplicates(){
        Node node = head ;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next= node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
            tail = node;
            tail.next = node;

        }
    }
    public void insertRec(int val , int index){
        head = insertRec(val,index,head);

    }
    private Node insertRec(int val , int index, Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp ;
        }
        node.next = insertRec(val ,index-1, node.next);
        return node;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1 ;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print( temp.value + " -> ");
           temp =  temp.next;

        }
        System.out.print("end");
        System.out.println();
    }
    private class Node{
        private int value;
        private Node next ;



        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        private Node(int value) {
            this.value = value;
    }



    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(6);
        list.display();
        list.insertRec(88,2);
        list.display();





    }
}
