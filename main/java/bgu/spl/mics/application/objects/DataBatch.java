package bgu.spl.mics.application.objects;

import java.util.Vector;

/**
 * Passive object representing a data used by a model.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */

public class DataBatch {
    private Vector<Integer> dataBatch;

    public DataBatch(){
        dataBatch =new Vector<Integer>(1000);
    }
    public DataBatch(int size){
        dataBatch = new Vector<Integer>(size);
    }
    public int size(){
        return dataBatch.size();
    }
}
