import java.util.Scanner;
public class limites {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, i;
        
        System.out.print("Introduce minimo número: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce maximo número: ");
        numero2 = sc.nextInt();
        i=numero1;
        
        for(i=numero1; i<numero2+1; ++i)
        {
          //System.out.println( i);
          if (i % 2 == 0)
          {
            System.out.println("Par "+i);
          }
        }
        i=numero1;
        while (i>=numero1 && i<numero2+1)
        {
          if (i % 2 != 0)
          {
            System.out.println("Impar "+i);
          }
          i=i+1;
        }
    }
} 