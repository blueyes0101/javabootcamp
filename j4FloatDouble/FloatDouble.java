package j4FloatDouble;

public class FloatDouble {
    public static void main (String[] args){
        //Double : 64 bit - 8 byte
        //Float : 32 bit - 4 byte
        //automatische Konvertierung : int --> float --> double

        double a = 5.25;
        double b = 4.0;
        double c = 4d; //4.0
        double d = 4.25d; //4.25
        
        float e = (float)5.0;
        float f = 6f; //6.0
        float g = 6.2f; //6.2

        int h = 22/7;
        float i = 22f/7f;
        double j = 22d/7f;

        System.out.println(h); //3
        System.out.println(i); //3.142857
        System.out.println(j); //3.142857142857143
        System.out.println(a+b+c+d+e+f+g);
    }
}
