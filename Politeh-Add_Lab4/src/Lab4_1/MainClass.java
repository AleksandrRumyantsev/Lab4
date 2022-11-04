package Lab4_1;

public class MainClass {
    public static void main(String[] args) {
        //Реализация класса Binary (целочисленный)
        System.out.println("Реализация класса Binary (целочисленный)");
//        Binary booleanArray = new Binary();
//        System.out.println(booleanArray.getByIndex(5));
//        booleanArray.inversionBit(5);
//        System.out.println(booleanArray.toString());
//        booleanArray.setTrue(4);
//        booleanArray.setTrue(1);
//        booleanArray.setTrue(6);
//        System.out.println(booleanArray.toString());
//        booleanArray.setFalse(6);
//        System.out.println(booleanArray.toString());
//        System.out.println(booleanArray.countTrue());
//        booleanArray.setValue(5,false);
//        System.out.println(booleanArray.toString());

        //Реализация класса BooleanArray (массив булевых значений)
        System.out.println("Реализация класса BooleanArray (массив булевых значений)");
        BooleanArray booleanArray = new BooleanArray();
        System.out.println(booleanArray.getByIndex(5));
        booleanArray.inversionBit(5);
        System.out.println(booleanArray.toString());
        booleanArray.setTrue(4);
        booleanArray.setTrue(1);
        booleanArray.setTrue(6);
        System.out.println(booleanArray.toString());
        booleanArray.setFalse(6);
        System.out.println(booleanArray.toString());
        System.out.println(booleanArray.countTrue());
        booleanArray.setValue(5,false);
        System.out.println(booleanArray.toString());



    }
}
