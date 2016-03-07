
public class LinkList<T> {
    public Node first;
    public Node last;
    public int length;
    public Node node;

    public LinkList(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    public int add(T value){
        node = new Node<>(value);
        if(this.length==0){
            this.first=node;
            this.last=node;
        }
        else {
            node.previous=this.last;
            this.last.next=node;
            this.last=node;
        }
        this.length++;
        return this.length;
    }

    public Object getValueAt(int index){
        Node node = this.first;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node.value;
    }

    public Object getNodeAt(int index){
        Node node = this.first;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public String getFullList(){
        Node node = this.first;
        String result="";
        for(int i=0;i<this.length;i++){
            result+=node.value+"\t";
            node = node.next;
        }
        return result;
    }

    public int size(){
        return this.length;
    }

    public int indexOf(T value) {
        Node node = this.first;
        for (int i=0;i<this.length;i++){
            if(node.value.equals(value))
                return i;
            node=node.next;
        }
        return -1;
    }


    public boolean contains(T value) {
        return indexOf(value)!=-1;
    }

    public int remove(T value) throws Exception{
        Node node = (Node) getNodeAt(indexOf(value));
        if(node.previous==null){
            this.first=node.next;
        }else
        if(node.next==null){
            this.last=node.previous;
        }
       else {
            node.previous.next=node.next;
            node.next.previous=node.previous;
        }
        length--;
        return length;
    }

    public MyItr listIterator(int index){
        return new MyItr(this,index);
    }

}
