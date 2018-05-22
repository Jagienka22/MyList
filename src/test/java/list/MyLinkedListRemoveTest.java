package list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aga on 22.05.18.
 */
public class MyLinkedListRemoveTest {
    @Test
    public void remove() {
        MyLinkedList nowalista;
        MyLinkedList poUsunieciu;
        nowalista = new MyLinkedList();
        poUsunieciu = new MyLinkedList();

        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        poUsunieciu.add(12);
        poUsunieciu.add(2);
        poUsunieciu.add(4);
        poUsunieciu.add(7);
        poUsunieciu.add(5);
        poUsunieciu.add(1);

        nowalista.remove(4);
        Assert.assertTrue(czyRowne(nowalista, poUsunieciu));
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
    public void removeSecondElement() {
        MyLinkedList nowalista;
        MyLinkedList poUsunieciu;
        nowalista = new MyLinkedList();
        poUsunieciu = new MyLinkedList();

        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        poUsunieciu.add(12);
        poUsunieciu.add(4);
        poUsunieciu.add(7);
        poUsunieciu.add(9);
        poUsunieciu.add(5);
        poUsunieciu.add(1);

        nowalista.remove(1);
        Assert.assertTrue(czyRowne(nowalista, poUsunieciu));
    }

    @Test
    public void removeFirstElement() {
        MyLinkedList nowalista;
        MyLinkedList poUsunieciu;
        nowalista = new MyLinkedList();
        poUsunieciu = new MyLinkedList();

        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);

        poUsunieciu.add(2);
        poUsunieciu.add(4);
        poUsunieciu.add(7);
        poUsunieciu.add(9);
        poUsunieciu.add(5);
        poUsunieciu.add(1);


        nowalista.remove(0);
        Assert.assertTrue(czyRowne(nowalista, poUsunieciu));
    }

    @Test
    public void removeElement() {
        MyLinkedList nowalista;
        MyLinkedList poUsunieciu;
        nowalista = new MyLinkedList();
        poUsunieciu = new MyLinkedList();

        nowalista.add(12);

        nowalista.remove(0);
        Assert.assertTrue(czyRowne(nowalista, poUsunieciu));
    }


}