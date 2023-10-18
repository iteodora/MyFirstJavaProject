public class Conditionals {
    public static void main(String[] args) {
        if (5<0) {
            System.out.println("5 is smaller than 0");} //dupa if trb mereu acolade
        else
        {System.out.println("5 is not smaller than 0"); //dupa else nu trb acolade daca e 1 singur statement
            System.out.println("another statement");}
        int time=25;
        if (time<10) {
            System.out.println("Good morning");}
        else if (time<18) {
            System.out.println("Good day");
        }
        else if (time<24) {System.out.println("Good evening");}
        else System.out.println("only 24 hours in a day!");
        // else if poate sa apara de mai multe ori, if si else singur doar o data, daca sunt mai mute else if atunci se termina neaparat cu un else

        int day=9;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default:
                System.out.println("unknown");
        }
        //switch si case se foloseste cand sunt multe else if -uri
        // se pune default pt valori in afara celor din case -uri (ce sa afiseze pt acele valori)
        //dupa fiecare case se pune break ca sa iasa din executie (opreste verificarile, altfel va afisa si urm valori)


    }
}
