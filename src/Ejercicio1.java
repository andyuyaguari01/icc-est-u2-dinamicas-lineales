import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    //Metodo que devuelve una cadena de estto invetidad
    // texto invertido
    //texto -> Computacion
    // return -> NOICATUPMOC
    //USANDO SOLO PILAS

    public String invertString( String texto){
        //for ( int i = 0; i < texto.length(); i++){
            //texto.charAt(i);
            //pila.push(texto.charAt(i));
        //}
        Deque<Character> pila = new ArrayDeque<>();
    
        for( char letra : texto.toCharArray()){
            pila.push(letra);

        }
        String invertido = "";
        while ( ! pila.isEmpty()){
            invertido += pila.pop();

        }



        return invertido;
    }

}
