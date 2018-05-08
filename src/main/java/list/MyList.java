package list;

/**
 * Created by aga on 25.03.18.
 */
public class MyList {
    private int tablica[] = new int[100];
    private int index;

    public void add(int i) {
        if (index == tablica.length) {
            powiekszTablice();
        }
        tablica[index] = i;
        index++;

    }

    public int get(int i) {
        return tablica[i];
    }

    public void remove(int i) {
        for (int j = i; j < index - 1; j++) {
            tablica[j] = tablica[j + 1];
        }
        index--;
    }

    private void powiekszTablice() {
        int[] tablica2 = new int[(tablica.length) + 100];
        for (int j = 0; j < index; j++) {
            tablica2[j] = tablica[j];
        }
        tablica = tablica2;
    }

    public boolean contains(int o) {
        return indexOf(o) != -1;
    }

    public int indexOf(int o) {
        for (int j = 0; j < index - 1; j++) {
            if (tablica[j] == o) {
                return j;
            }
        }
        return -1;

    }

    public boolean isEmpty() {
        return index == 0;
    }


    public void addAll(MyList a){
        int n = a.size();
        for(int j = 0; j < n; j++){
            add(a.get(j));
        }
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        String wynik = "[";
        for (int w = 0; w < index - 1; w++) {
            wynik = wynik + tablica[w] + ", ";
        }
        if (index != 0) {
            wynik = wynik + tablica[index - 1];
        }
        return wynik + "]";
    }
}


