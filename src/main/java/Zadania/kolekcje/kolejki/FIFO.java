package Zadania.kolekcje.kolejki;

import java.util.ArrayList;

public class FIFO {

    private final ArrayList<Integer> queue = new ArrayList<>();

    public void push(int value){
        this.queue.add(value);
    }
    public Integer peek(){
        if(this.queue.isEmpty()){
            return null;
        }
        return this.queue.get(0);
    }
    public Integer pop(){
        if(this.queue.isEmpty()){
            return null;
        }
        return this.queue.remove(0);
    }
    public int size(){
       return this.queue.size();
    }
}
