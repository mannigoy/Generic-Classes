package Map;

import java.util.ArrayList;
import java.io.*;

public class MyMap <K, V>{
   private final ArrayList <K> keyArr;
   private final ArrayList <V> valueArr;

     public MyMap(){
         this.keyArr=new ArrayList<>();
         this.valueArr=new ArrayList<>();
     }
    public void put(K key, V value) {
       for (K k: keyArr){
            if(key.equals(k)){
                valueArr.set(keyArr.indexOf(k),value);
                return;
            }
       }
        valueArr.add(value);
        keyArr.add(key);
    }

    public V get(K key){
        V pos=null;

        for (K k:keyArr){
             if(valueArr.equals(k)){
                pos=valueArr.get(keyArr.indexOf(k));
            }
        }
    return pos;
    }

    public V remove(K key){
        V pos=null;
        for (K k:keyArr){
            if(key.equals(k)){
                pos=valueArr.get(keyArr.indexOf(k));
                valueArr.remove(pos);
                keyArr.remove(k);
                return pos;
            }
        }
        return pos;
    }

    }


