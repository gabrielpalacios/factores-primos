import java.util.Scanner;


public class Factores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner objEntrada = new Scanner(System.in);
         System.out.println("Insertar número para ver sus factores primos (con repetición): ");
         int numero = objEntrada.nextInt();
         factor(numero);
    }

    static void factor(int numeroPasado)
    {
         int nro = 2;

         while(numeroPasado!=1)
         {
              while(numeroPasado%nro==0)
              {
                   System.out.print(nro); 
                   System.out.print(" ");
                   numeroPasado /= nro;
                   if(numeroPasado==1){
                       System.exit(0);
                   }
              }
              nro++;
         }
	}

}
