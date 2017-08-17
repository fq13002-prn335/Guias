
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author usuario
 */
public class Utilities {
   public static void main(String[] args) {
        // TODO code application logic here
        Metodos metodos = new Metodos();
       String resumen="";
       resumen= ("variable que contiene las variables, a utilizar para ejecutar este metodo "+
               "vistas en clase");
       System.out.println(metodos.getresumen(resumen.replace(" ","")));
       
       System.out.println(metodos.capitalizar(resumen));
       System.out.println(metodos.contarCoincidencias(resumen,resumen));
    }
    
}
