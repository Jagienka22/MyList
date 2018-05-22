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

    public static void main(String[] args) {
        javaList = new ArrayList<Integer>();
        mojaLista = new MyLinkedList();

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

    }

    private static void dodaj(int e) {
        javaList.add(e);
        mojaLista.add(e);
    }
}
