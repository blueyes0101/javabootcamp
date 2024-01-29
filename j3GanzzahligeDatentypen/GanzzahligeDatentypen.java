package j3GanzzahligeDatentypen;
public class GanzzahligeDatentypen {
    public static void main (String [] args){
        //byte --> short --> int --> long
        // Konvertiert automatisch
        //long --> int --> short --> byte
        //Kann nicht automatisch konvertiert werden
        short j = 1000;
        int i = (j / 2);
        System.out.println(i); //500

        byte a = 100;
        byte b = (byte)(a / 2);
        System.out.println(b);//50
    }
}
