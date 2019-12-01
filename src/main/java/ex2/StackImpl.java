package ex2;

import java.util.EmptyStackException;

public class StackImpl<T> implements Stack<T>{

    private Object[] table;

    public void clear() {
        table = new Object[0];
    }

    public boolean isEmpty() {
        if (table.length == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(T t) {
        if (table == null){
            table = new Object[0];
        }
        Object[] newTable = new Object[table.length+1];
        for (int i=0; i<newTable.length-1; i++){
            newTable[i] = table[i];
        }
        newTable[table.length] = t;
        table = newTable;
    }

    public T pop() {
        if (table != null || table.length>0){
            T object = (T)table[table.length-1];
            Object[] newTable = new Object[table.length-1];
            for (int i=0; i<newTable.length; i++){
                newTable[i] = table[i];
            }
            table = newTable;
            return object;
        }
        else {
            throw new EmptyStackException();
        }

    }

    public int size() {
        return table.length;
    }
}
