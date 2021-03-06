import java.util.Scanner;

public class Bhaskara {
   
    public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    double a , b , c , delta , R1 , R2;

    System.out.println ("Digite valor de a: ");
    a = scan.nextDouble();
    
    System.out.println ("Digite valor de b: ");
    b = scan.nextDouble();
    
    System.out.println ("Digite valor de c: ");
    c = scan.nextDouble();

    delta = Math.pow(b,2) - (4*a*c);

    if (delta >= 0 || a  != 0  ) {

    R1 =  ( - b + Math.sqrt(delta) )   / ( 2 * a) ;

    R2 =  ( - b - Math.sqrt(delta) )   / ( 2 * a) ;

    System.out.println ("R1: " + R1 );
    System.out.println ("R2: " + R2 );

    } else { System.out.println("Impossivel calcular");  

    }

    }
}


