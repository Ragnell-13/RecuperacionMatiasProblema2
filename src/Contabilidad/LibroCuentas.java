package Contabilidad;

import java.util.ArrayList;

public class LibroCuentas {

    ArrayList<Integer> lista = new ArrayList<Integer>();
    public final int TOP = lista.size()-1;

    public void push (int value)  {lista.add(value);}
    public int pop () {return lista.remove(TOP);}

    public void totalCalc() {
        final int SIZE = lista.size();
        int amount = 0;

        for (int i = SIZE; i < TOP; i++) {
            amount = amount + lista.get(i);
            pop();
        }
        System.out.println(amount);
    }

    public void mostrarGastos () {
        final int SIZE = lista.size();

        for (int i = 0; i < SIZE; i++) {
            System.out.println(lista.get(i));
        }
    }

}
