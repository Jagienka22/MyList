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
        MyLinkedList l = child;
        String wynik = "[";

        wynik += value + ", ";
        for(int w = 1; w <size-1; w++){
            wynik += l.value + ", ";
            l = l.child;
        }
        if(size!=0){
            wynik += l.value ;
        }
        wynik += "]";
        return wynik;
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
        if(i==0){
            if(size !=1){
                this.value = child.value;
                child = child.child;
            }else{
                this.value = null;
            }
        }
        if(i>=1){
            MyLinkedList l = this;
            for(int j = 0; j<i-1; j++){
                l = l.child;
            }
            l.child = l.child.child;
        }
        size--;
    }


    public int size(){
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(int i) {
        MyLinkedList l = this;
        for(int j = 0; j<size; j++){
            if(l.value == i){
                return j;
            }
            l = l.child;
        }
        return -1;
    }

    public boolean contains(int i) {
        return indexOf(i)!=-1;
    }

    public void addAll(MyLinkedList lista2) {

    }
}
