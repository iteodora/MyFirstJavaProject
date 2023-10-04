public class Operators {
    public static void main(String[] args) {
        System.out.println("Suma");
        int sum1=100+50;
        int sum2=sum1+50;
        int sum3=sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
        System.out.println("...................");
        int number1=100;
        int number2=50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2); // % modulo este restul impartirii
        System.out.println(9%2); // restul impartirii lui 9 la 2 este 1
        System.out.println(9/2); // catul impartirii lui 9 la 2
        System.out.println(10%7); // restul impartirii lui 10 la 7
        // operatorul % este folosit pentru a vedea daca un nr se imparte exact
        System.out.println("..............");
        System.out.println(++number1); // operator de incrementare
        // la ++variabila prima data incementeaza si dupa afiseaza, daca se pune variabila++ atunci prima data afiseaza si dupa incrementeaza
        System.out.println(--number2); // operator de decrementare
        System.out.println("...................");
        int number3=10;
        System.out.println("number3="+number3);
        System.out.println(number3++);
        System.out.println(number3);
        System.out.println(++number3);
        System.out.println("...............");
        int number4=number2;
        System.out.println(number4);
        number2=1;
        System.out.println(number4);
        System.out.println(number2);
        System.out.println("....................");
        //number2=number2+2;
        number2+=2; // inseamna ca number2 = number2+2
        System.out.println(number2);
        System.out.println(number2-=2);
        number2*=2;
        System.out.println(number2);
        number2=6;
        number1=100;
        System.out.println(number1>number2); //100>6 true
        System.out.println(number1<number2);// 100<6 false
        System.out.println(10>5);
        System.out.println('A'=='A'); // == arata faptul ca se compara daca sunt egale, daca punem = atunci atribuim o valoare unei variabile

        System.out.println('A'!='A');// != inseamna diferit
        System.out.println('A'!='a');
        System.out.println('A'>'B');
        // cand se compara doua litere se compara codul hexa
        System.out.println("..........");
        System.out.println(true);
        System.out.println(!true); // ! inseamna not
        System.out.println("..........");
        System.out.println(++number1);
        System.out.println(number2);
        boolean condition=number1>number2 && number1>100; // && (doi and) inseamna "si"
        System.out.println(condition);
        boolean condition2=number1>number2 && !(number1<100);
        System.out.println(condition2);
        boolean condition3=number1<number2 || number1<100;// || inseamna "sau"
        System.out.println(condition3);
        // la "sau" ||: T||T-> T, T||F->T, F||T->T, F||F->F
        System.out.println("...................");
        if(condition){
            System.out.println("Conditia este adevarata");}
        System.out.println(".......");
        if(!condition)
            System.out.println("Conditia este adevarata");
        System.out.println(".........");
        if(condition) {
            System.out.println("Conditia este adevarata");
        }
        else System.out.println("Conditia nu este adevarata");

        System.out.println(".........");
        System.out.println("Exercitiul 1");
        System.out.println(10*6);
        System.out.println(10/5);
        
    }
}
