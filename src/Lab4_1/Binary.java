package Lab4_1;

import java.util.Arrays;
import java.util.Objects;

public class Binary implements ArrayOfBool{
    int sizeBitFollow = 64;
    int size = sizeBitFollow/32;
    int [] ints = new int[size];

    @Override
    public boolean getByIndex (int index){ //true если 1, false если 0
        int indexElement = index/32;
        int element = ints[indexElement];
        int indexBit = index%32;
        int mask = 1<<indexBit;
        return (element&mask)==mask;
    }
    @Override
    public String toString(){
        String str="";
        for(int i =0; i<sizeBitFollow; i++){
            str = getByIndex(i) ? str+"1":str+"0";
        }
        return str;
    }
    @Override
    public void inversionBit (int index){
        int indexElement = index/32;
        int indexBit = index%32;
        int mask = 1<<indexBit;
        ints[indexElement]= ints[indexElement]^mask;
    }

    @Override
    public void setTrue(int index) {
        int indexElement = index/32;
        int indexBit = index%32;
        int mask = 1<<indexBit;
        ints[indexElement]= ints[indexElement]|mask;
    }

    @Override
    public void setValue(int index, boolean value) {
        if (value) {
            setTrue(index);
        }else{
            setFalse(index);
        }
    }

    @Override
    public void setFalse(int index) {
        if (getByIndex(index)) {
            inversionBit(index);
        }
    }

    @Override
    public int countTrue() {
        int count=0;
        for (int i=0; i<sizeBitFollow;i++){
            if (getByIndex(i)) {count++;}
        }
        return count;
    }
}
