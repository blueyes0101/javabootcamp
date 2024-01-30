package j6String;

public class strings {
    public static void main (String[] args){
        
        String a = "Hello";
        System.out.println(a + " welcome"); // Hello welcome
        String b = " \tm3mo ";
        String c = " \nJava ";
        System.out.println(a + b + c); // Hello m3mo  Java

        int d = 35;
        double e = 3.52;
        String summe = a + b + 
        c + d + e;
        System.out.println(summe); // Hello m3mo  Java 353.52
    }
}
