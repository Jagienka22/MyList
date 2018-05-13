package list;

/**
 * Created by aga on 08.05.18.
 */
public class MyLinkedList {
    Integer value;
    MyLinkedList child ;
    int size = 0;

    public void add(int e) {
        if (value == null) {
            value = e;
            child = new MyLinkedList();
        } else
            child.add(e);
        size++;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "value=" + value +
                '}';
    }

    public int get(int i) {
        MyLinkedList l = child;
        if( i == 0){
            return value;
        }
        for (int j = 1; j < i; j++){
            l = l.child;
        }
        return l.value;
    }

    public void remove(int i) {

    }

    public int size() {

        int i = 0;
        return i;
    }


    public boolean isEmpty() {
        return false;
    }

    public int indexOf(int i) {
        return 0;
    }

    public boolean contains(int i) {
        return false;
    }

    public void addAll(MyLinkedList lista2) {

    }
}
