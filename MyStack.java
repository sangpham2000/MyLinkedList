public class MyStack<E> extends MyLinkedList<E> implements StackInterface<E> {
    public MyStack() {
        super();
    }

    @Override
    public void push(E item) {
        addFirst(item);
    }

    @Override
    public E pop() {
        E tmp = null;
        if (!isEmpty()) {
            tmp = getFirst();
            removeFirst();
        }
        return tmp;
    }

    @Override
    public boolean contains(E item) {
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
    public E getPeek() {
        E tmp = null;
        if (!isEmpty()) {
            tmp = getHead().getData();
        }
        return tmp;
    }

    @Override
    public int size() {
        return super.size();
    }

}
