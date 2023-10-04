import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String myString="This is a text";
        int lungime=myString.length();
        System.out.println("lungimea textului este "+lungime);
        System.out.println(myString.length());

        String myName="Ilea Ana Teodora";
        System.out.println(myName.length());
        System.out.println(myName);
        System.out.println("lungimea numelui \"Ilea Ana Teodora\" este \n"+myName.length());
        System.out.println("lungimea numelui \""+myName+"\" este "+myName.length());

        String text="System.out.println(\"lungimea numelui \\\"\"+myName+\"\\\" este \"+myName.length())";
        text.length();
        System.out.println(text.length());

        String myNameWithoutSpace=myName.replace(" ","");
        System.out.println(myNameWithoutSpace);
        int lungimeaNumeluiFaraSpatii= myNameWithoutSpace.length();
        System.out.println(lungimeaNumeluiFaraSpatii);
       myName.charAt(3);
        System.out.println(myName.charAt(3));
        char aPatraLitera=myName.charAt(4);
        System.out.println(aPatraLitera);
        System.out.println(myName.charAt(0));

        String myNam="Teodora";
        myNam.charAt(4);
        System.out.println(myNam.charAt(1));

        String tara="Grecia";
        int n=tara.length();
        System.out.println(n);

        String myFavouriteMovie="Home alone";
        System.out.println("My favourite movie is"+" \""+ myFavouriteMovie +"\". ");
        myFavouriteMovie.toUpperCase();
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase(Locale.ROOT));
        System.out.println(myFavouriteMovie.length());


    }
}
