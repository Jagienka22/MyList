package list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aga on 12.05.18.
 */
public class MyLinkedListTest {
    @Test
    public void get() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);
        Assert.assertEquals(nowalista.get(2), 4);
    }


    public boolean czyRowne(MyLinkedList a, MyLinkedList b) {
        if (a.size() == b.size()) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(j) != b.get(j)) {
                    return false;
                }
            }

        } else return false;

        return true;
    }


    @Test
    public void isEmptyTrue() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();

        Assert.assertEquals(nowalista.isEmpty(), true);
    }

    @Test
    public void isEmptyFalse() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        Assert.assertEquals(nowalista.isEmpty(), false);
    }

    @Test
    public void indexOf() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        Assert.assertEquals(nowalista.indexOf(9), 4);
    }

    @Test
    public void containsTrue() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        Assert.assertEquals(nowalista.contains(4), true);
    }

    @Test
    public void containsFalse() {
        MyLinkedList nowalista;
        nowalista = new MyLinkedList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        Assert.assertEquals(nowalista.contains(133), false);
    }

    @Test
    public void addAllTest(){
        MyLinkedList lista1;
        MyLinkedList lista2 ;
        MyLinkedList nowalista;
        lista1 = new MyLinkedList();
        lista2 = new MyLinkedList();
        nowalista = new MyLinkedList();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);

        lista1.addAll(lista2);

        nowalista.add(1);
        nowalista.add(2);
        nowalista.add(3);
        nowalista.add(4);
        nowalista.add(5);
        nowalista.add(6);
        nowalista.add(7);

        Assert.assertTrue(czyRowne(lista1, nowalista));

    }


}