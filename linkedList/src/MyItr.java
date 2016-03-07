
public class MyItr {
    private LinkList list;
    private int currentIndex;
    private Node currentNode;

    public MyItr(LinkList list,int index){
        this.list=list;
        this.currentIndex=index;
        currentNode =  (Node) list.getNodeAt(index);
    }

    public boolean hasNext(){
        return currentNode.next!=null;
    }
    public void next(){
        currentNode=currentNode.next;
    }
    public Object currentValue(){
        return currentNode.value();
    }

}
