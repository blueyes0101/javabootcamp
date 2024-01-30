package j7GrundMat;

public class grundmat {
    public static void main (String[] args){
        /* 
         * + --> Addition 
         * - --> Subtraktion
         * * --> Multiplikation
         * / --> Division
         * % --> Rest
         */

    System.out.println(3 + 4);// 7
    System.out.println(3 - 5f);// -2.0
    System.out.println(10 / 4);// 2
    System.out.println(10d / 4);// 2.5
    System.out.println(10 % 4); // 2

    int a = 4;
    a = a + 2;
    System.out.println(a); //6
    
    int b = 6;
    b = b * 3;
    System.out.println(b); //18

    int c = 6;
    c +=4;
    System.out.println(c); //10 --> 6 + 4 = 10

    int d = 10;
    d *=4;
    System.out.println(d);// 40 --> 10 * 4 = 40

    int e = 7;
    e++; // --> 7 + 1 (postfix)
    System.out.println(e); // 8
    
    int f = 5;
    f--; // --> 5 - 1
    System.out.println(f); // 4

    int g = 9;
    --g; // (prefix)
    System.out.println(g);
    
    //Unterschied zwischen Update-Priorität
    }
}
