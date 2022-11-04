package Lab4_1;
import java.lang.Object;

public interface ArrayOfBool {
    int sizeBitFollow = 1024;

    boolean getByIndex(int index); //проверка элемента с заданным индексом;
    void inversionBit(int index); //инвертирование элемента с заданным индексом;
    void setTrue(int index); //установка (в true) элемента с заданным индексом;
    void setValue(int index, boolean value); //установка элемента с заданным индексом заданным логическим значением;
    void setFalse (int index); //сброс (в false) элемента с заданным индексом;
    int countTrue (); //метод, возвращающий количество элементов, установленных в true;
    String toString(); //возвращающий последовательность нулей и единиц, где каждый символ представляет значение соответствующего элемента массива.



}
