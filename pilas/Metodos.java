
import java.util.Scanner;
import java.util.Stack;


 



public class Metodos{

    Scanner sc = new Scanner (System.in);

    public Stack <paginaWeb> LLenarPila (){

        Stack <paginaWeb> p = new Stack<>();

        Boolean bandera = true;
        int opt = 0;
        while (bandera){
            paginaWeb o = new paginaWeb();
            System.out.println("Ingrese la url de la pagina por favor ");
            o.setUrl(sc.next());
            System.out.println("Ingrese el titulo de la pagina por favor ");
            o.setTitulo(sc.next());
            System.out.println("ingrese por favor la fecha (dd/MM/yy)");
            o.setFechaAcceso(sc.next());
            p.push(o);

            System.out.println("Desea ingresar mas registros? 1 : si, 2 : no");
            while (!sc.hasNextInt()) {
                System.out.println("por favor ingrese un numero válido");
           
        }
         opt = sc.nextInt();
            sc.nextLine();
            if (opt == 2) {
                bandera = false;

        }

    }
    return p;

}

    public void MostarPila (Stack<paginaWeb> p){

        for (paginaWeb i: p) {

            System.out.println("Url" + i.getUrl());
            System.out.println("Titulo" + i.getTitulo());
            System.out.println("Fecha de acceso " + i.getFechaAcceso());
            System.out.println();

            
        }
    }

    public void Retroceder (Stack <paginaWeb> p){

        if (p. isEmpty()){
            System.out.println("no hay paginas en el historial para retroceder");
        }else{
            paginaWeb paginaActual = p.pop(); // desapilar
            if (p.isEmpty()){
                System.out.println("ha retrocedido, no quedan mas paginas en el historial");
            }else{
                paginaWeb paginaAnterior = p.peek();
                System.out.println(" retrocediendo, ahora estas en : " + paginaAnterior);
            }
            }

        }

        public void verHistorial(Stack<paginaWeb>p){

        if (p.isEmpty()){
            System.out.println("el historial de navegacion esta vacio");
        }else{
            System.out.println("Historial de paginas visitadas");
            for (paginaWeb pagina : p) {
                System.out.println(pagina);
                
            }
        }
        }

       

        }

        

        
            
        
    
