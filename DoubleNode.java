public class DoubleNode {
    private double data;
    private DoubleNode next;
    public DoubleNode(){
        data = 0.0;
        next = null;
    }

    public DoubleNode(double data){
        this(data, null);
    }

    public DoubleNode(double data, DoubleNode next){
        this.data = data;
        this.next = next;
    }

    public double getData()
    {
        return data;
    }

    public DoubleNode getNext()
    {
        return next;
    }

    public void setNext(DoubleNode n){
        next = n;
    }
}
