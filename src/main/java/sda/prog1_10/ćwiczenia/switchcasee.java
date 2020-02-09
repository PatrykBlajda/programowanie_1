package sda.prog1_10.ćwiczenia;

public class switchcasee {

    public static void main(String[] args) {

       boolean b1 = true;
       boolean b2 = false;
       int a =10;
       int b =3;
       int c = a%b;
       switch (c){
           case 0:
               System.out.println(b1);
               break;
           default:
               System.out.println(b2);
       }
    }
}
