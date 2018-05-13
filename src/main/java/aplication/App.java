package aplication;

import list.MyLinkedList;
import list.MyList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aga on 25.03.18.
 */
public class App {

    private static List<Integer> javaList;
    private static MyLinkedList mojaLista;
    private static MyList nowalista;

    public static void main(String[] args) {
        //MyList lista = new MyList();
        //lista.add(5);
        //System.out.println(lista);
        javaList = new ArrayList<Integer>();
        mojaLista = new MyLinkedList();
        nowalista = new MyList();

        dodaj(12);
        dodaj(2);
        dodaj(4);
        dodaj(7);
        dodaj(9);
        dodaj(5);
        dodaj(1);


        System.out.println("Javowa lista: " + javaList);
        System.out.println("Moja lista: " + mojaLista);

        mojaLista.add(1);
        mojaLista.add(2);
        System.out.println(mojaLista);

        /*
        System.out.println(javaList.get(2));
        System.out.println(mojaLista.get(2));

        System.out.println(javaList.get(5));
        System.out.println(mojaLista.get(5));
        //zrób żeby twoja lista wypisywała to samo co java'owa

        javaList.remove(4);
        mojaLista.remove(4);

        System.out.println("Javowa lista: " + javaList);
        System.out.println("Moja lista: " + mojaLista);
        //zrób żeby twoja lista wypisywała to samo co java'owa

        javaList.addAll(javaList);
        System.out.println("tttt" + javaList);
        System.out.println(mojaLista.size());
        mojaLista.addAll(mojaLista);
        System.out.println(mojaLista);

        System.out.println("empty : " + mojaLista.isEmpty());
        System.out.println(nowalista.isEmpty());
        System.out.println(javaList.isEmpty());

        System.out.println("contains: " + javaList.contains(14));
        System.out.println(mojaLista.contains(14));

        System.out.println("indexOf: " + javaList.indexOf(9));
        System.out.println(mojaLista.indexOf(9));
        */
    }

    private static void dodaj(int e) {
        javaList.add(e);
        mojaLista.add(e);
    }
}
