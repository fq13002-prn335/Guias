
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;


public class Metodos {
     public String getresumen(String resumen){
        
        return resumen.substring(0,30);
    }
    
   public String capitalizar(String resumen){
       String nuevacadena="";
       for(String palabra : resumen.split(" ")){
          nuevacadena +=palabra.substring(0,1).toUpperCase()+palabra.substring(1,palabra.length()).toLowerCase()+" ";
       }
       nuevacadena = nuevacadena.trim();
       resumen=nuevacadena;
       return resumen;
   }
   public int contarCoincidencias(String frase, String resumen){
       int posicion , contador=0;
       posicion=resumen.indexOf(frase);
       while(posicion!= -1 ){
           contador++;
           posicion=resumen.indexOf(frase,posicion+1);
       }
       return contador;
       
    
    
    
}
}