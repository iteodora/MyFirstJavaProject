public class Loops {
    public static void main(String[] args) {
        //afisarea numerelor de la 0 la 5 in ordine crescatoare
        for (int i=0;i>=5;i++)
        {
            System.out.println(i);}
        //afisarea numerelor de la 5 la o in ordine descrescatoare
        for (int i=5;i>=0;i--)
        {
            System.out.println(i);}
        //afisarea nr de la 0 la 10 din 2 in 2 in ordine crescatoare
        for (int i=0;i<=10;i+=2)
        {
            System.out.println(i);}

        //FOR EACH
        String cars[]={"BMV","Mazda","Opel","Toyota"}; //la array toate elem trb sa fie de acelasi tip
        for (String car:cars){
            System.out.println(car);}

        //WHILE
        int i=0;
        while (i<5) {
            System.out.println(i);
            i++;} //va face ce face FOR
        //DO...WHILE
        int j=0;
        do {
            System.out.println(j);
            j++;
        } while (j<5);
        System.out.println(".........................");
        //BREAK
        for (int k=0;k<10;k++)
        {
            System.out.println(k);
            if(k==4){break;}
        }
        System.out.println(".......................");
        //BREAK
        int k=0;
        while (k<10){
            if(k==4){break;}
            System.out.println(k);
            k++;}
        System.out.println("..............");
            // CONTINUE
            for (int l=0;l<10;l++) {if(l==4){continue;}
                System.out.println(l);}
        System.out.println("............");
            //CONTIUNE
            while (k<10){k++;
            if(k==4){continue;}
                System.out.println(k);}

        //in for si in while sunt variabile locale

        System.out.println("Exercitii");
        //Ex1
        for (i=0;i<=10;i++){
            System.out.println(i);}
        //Ex2
        for(i=20;i>=10;i--){
            System.out.println(i);
        }
        //Ex3
        System.out.println("Ex3");
        for(i=0;i<=100;i++){if(i%2!=0){continue;}
            System.out.println(i);}
        System.out.println("Ex4");
        String numeFruct[]={"mere","capsune","pere","banane"};
        for (String fruct:numeFruct){
            System.out.println("Imi place sa mananc "+fruct);}
        System.out.println("Ex5");
        int luna=10;
        switch (luna) {
            case 1:
                System.out.println("Ianuarie");break;
            case 2:
                System.out.println("Februarie");break;
            case 3:
                System.out.println("Martie");break;
                case 4:
                System.out.println("Aprilie");break;
            case 5:
                System.out.println("Mai");break;
            case 6:
                System.out.println("Iunie");break;
            case 7:
                System.out.println("Iulie");break;
            case 8:
                System.out.println("August");break;
            case 9:
                System.out.println("Septembrie");break;
            case 10:
                System.out.println("Octombrie");break;
            case 11:
                System.out.println("Noiembrie");break;
            case 12:
                System.out.println("Decembrie");break;}
        }
        }


