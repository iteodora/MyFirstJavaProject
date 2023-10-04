import java.util.function.DoubleToIntFunction;

public class MyArray {
    public static void main(String[] args) {
        int []myArray={1,2,3,4};

        String []myStringArray= {"Unu","Doi","Trei"};
        System.out.println(myArray[2]);
        System.out.println(myArray[0]);
        System.out.println(myStringArray[1]);

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);
        for (int i=0;i<myStringArray.length;i++) {
            System.out.println(myStringArray[i]);
        }
        for (String str:myStringArray){
            System.out.println(str);}
        System.out.println(myArray.length); //numarul de elemente din sir
        System.out.println("................");
        System.out.println("Exercitiul 4");
        double []myArrayDouble={1.02,2.13,3.24,4.35};
        System.out.println(myArrayDouble[1]);
        System.out.println(myArrayDouble[3]);
        System.out.println(myArrayDouble.length);
        System.out.println("Exercitiul 5 Optional");
        char [] myArrayChar={'a','b','c','d'}; // la array parantezele patrate pot fi puse inainte sau dupa cand declaram variabila
        System.out.println(myArrayChar[0]);
        System.out.println(myArrayChar[1]);
        System.out.println(myArrayChar[3]);
        System.out.println("..................");
        for(int i=0;i<myArrayChar.length;i++) {
            System.out.println(myArrayChar[i]);}
        }

    }

