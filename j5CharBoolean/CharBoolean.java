package j5CharBoolean;

public class CharBoolean {
    public static void main (String [] args){
        //Char = 2 byte - 2^16 
        //Boolean = true/false

        char a = 'A';
        char b = '?';
        char c = '\u2121'; // unicodetable
        System.out.println(c);

        boolean d = true;
        System.out.println(d);//true
        System.out.println(a+b);

    }
}
