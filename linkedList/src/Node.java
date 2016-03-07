
public class Node<T> {
    Node next;
    Node previous;
    protected T value;
    public Node(T value){
        this.value=value;
        this.next=null;
        this.previous=null;
    }

    public Object value() {
        return this.value;
    }
}
