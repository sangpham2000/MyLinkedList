public class MyQueue<E> extends MyLinkedList<E> implements QueueInterface<E> {
    public MyQueue() {
        super();
    }

    @Override
    public void enQueue(E item) {
        addFirst(item);
    }

    @Override
    public E deQueue() {
        E rerult = null;
        if (!isEmpty()) {
            rerult = removeLast();
        }
        return rerult;
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean constains(E item) {
        return super.contains(item);
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public E getFront() {
        return super.getHead().getData();
    }
}
