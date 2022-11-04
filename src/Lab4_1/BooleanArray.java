package Lab4_1;

public class BooleanArray implements ArrayOfBool{
    int sizeBitFollow = 64;
    private boolean [] booleans = new boolean[sizeBitFollow];
    @Override
    public boolean getByIndex(int index) {
        return booleans[index];
    }

    @Override
    public void inversionBit(int index) {
        booleans[index]=!booleans[index];
    }

    @Override
    public void setTrue(int index) {
        booleans[index] = true;
    }

    @Override
    public void setValue(int index, boolean value) {
        booleans[index]=value;
    }

    @Override
    public void setFalse(int index) {
        booleans[index] = false;
    }

    @Override
    public int countTrue() {
        int cnt =0;
        for (int i=0; i<sizeBitFollow; i++){
            if (booleans[i]==true){cnt++;}
        }
        return cnt;
    }

    @Override
    public String toString() {
        String str="";
        for (int i=0; i<sizeBitFollow; i++){
            str= str+ (booleans[i] ? "1":"0");
        }
        return str;
    }
}
