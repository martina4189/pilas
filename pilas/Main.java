import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Metodos M = new Metodos();
         Stack <paginaWeb> p = M.LLenarPila();
         M.MostarPila(p);

         while (true){
            System.out.println("\n ....Menú....");
            System.out.println("1. Retroceder a página anterior");
            System.out.println("2. Ver el historial");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                M.Retroceder(p);
                    
                    break;
                case 2:
                M.verHistorial(p);
                    break;

                case 3:
                System.out.println("Saliendo del programa ");
                sc.close();
                return;

                default:
                   System.out.println("Opción no válida, intente de nuevo");
            }
         }


       
        
        
        


    }
    
}
