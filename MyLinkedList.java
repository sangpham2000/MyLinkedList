import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int numNode;

    public MyLinkedList() {
        head = null;
        numNode = 0;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<E>(item, head);
        numNode++;
    }

    @Override
    public void addAfter(Node<E> curr, E item) {
        if (curr == null) {
            addFirst(item);
        } else {
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public void addLast(E item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    @Override
    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list ");
        } else {
            Node<E> preNode = null;
            Node<E> delNode = head;
            if (delNode.getNext() == null) {
                return removeFirst();
            }
            while (delNode.getNext() != null) {
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode--;
            return delNode.getData();
        }
    }

    @Override
    public void print() {
        if (head != null) {
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }

    @Override
    public boolean isEmpty() {
        if (numNode == 0)
            return true;
        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an empty list");
        } else {
            return head.getData();
        }
    }

    @Override
    public Node<E> getHead() {
        return head;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public boolean contains(E item) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public E removeCurr(Node<E> curr) {
        Node<E> preNode = null;
        Node<E> delNode = head;
        while (delNode != curr) {
            preNode = delNode;
            delNode = delNode.getNext();
        }
        return preNode == null ? removeFirst() : removeAfter(preNode);
    }

    public int countEven() {
        int count = 0;
        Node<E> item = head;
        for (int i = 0; i < numNode; i++) {
            if ((int) item.getData() % 2 == 0) {
                count += 1;
            }
            item = item.getNext();
        }
        return count;
    }

    public boolean checkPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int countPrime() {
        int count = 0;
        Node<E> item = head;
        for (int i = 0; i < numNode; i++) {
            if (checkPrime((int) item.getData())) {
                count += 1;
            }
            item = item.getNext();
        }
        return count;
    }

    public void addItemBeforeEven(E item) {
        Node<E> preNode = null;
        Node<E> tmp = head;
        if (isEmpty()) {
            addFirst(item);
        } else {
            for (int i = 0; i < numNode; i++) {
                preNode = tmp;
                tmp = tmp.getNext();
                if ((int) tmp.getData() % 2 == 0) {
                    addAfter(preNode, item);
                    break;
                }
            }
        }
    }

    public int findMax() {
        int tmp = 0;
        Node<E> item = head;
        for (int i = 0; i < numNode; i++) {
            if ((int) item.getData() > tmp) {
                tmp = (int) item.getData();
            }
            item = item.getNext();
        }
        return tmp;
    }

    public void sortList() {
        Node<E> curr = head;
        Node<E> index = null;
        Node<E> temp = null;
        if (head == null) {
            return;
        } else {
            while (curr != null) {
                index = curr.getNext();
                while (index != null) {
                    if ((int) curr.getData() > (int) index.getData()) {
                        temp = curr;
                        curr = index;
                        index = temp;
                    }
                    index = index.getNext();
                }
                curr = curr.getNext();
            }
        }
    }
}
