package list;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aga on 09.05.18.
 */
public class MyListTest {
    @Test
    public void get() {
        MyList nowalista;
        nowalista = new MyList();
        nowalista.add(12);
        nowalista.add(2);
        nowalista.add(4);
        nowalista.add(7);
        nowalista.add(9);
        nowalista.add(5);
        nowalista.add(1);
        Assert.assertEquals(nowalista.get(2), 4);
    }

    @Test
    public void remove() {
        MyList nowalista;
        MyList poUsunieciu;
        MyList a;
        MyList b;
        nowalista = new MyList();
        poUsunieciu = new MyList();
        a = new MyList();
        b = new MyList();

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

    public boolean czyRowne(MyList a, MyList b) {
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
        MyList nowalista;
        nowalista = new MyList();

        Assert.assertEquals(nowalista.isEmpty(), true);
    }

    @Test
    public void isEmptyFalse() {
        MyList nowalista;
        nowalista = new MyList();
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
        MyList nowalista;
        nowalista = new MyList();
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
        MyList nowalista;
        nowalista = new MyList();
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
        MyList nowalista;
        nowalista = new MyList();
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
        MyList lista1;
        MyList lista2 ;
        MyList nowalista;
        lista1 = new MyList();
        lista2 = new MyList();
        nowalista = new MyList();

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

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test(){
        MyList nowalista;
        nowalista = new MyList();

        nowalista.add(1);
        nowalista.add(2);

        nowalista.get(4);
    }

}
