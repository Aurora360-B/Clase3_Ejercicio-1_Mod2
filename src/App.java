public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Un arrego se declara siempre así:
         * Declaración = Creación
         * int [] numeros = new int[10]
         * 
         * Cuando invoco al new eso quiere decir que estoy llamando a un
         * constructor de una clase.
         * La clase arreglo ya viene integrda el Java
         * El 10 representa el numero de datos que yo quiero implementar en ese arreglo.
         * Es decir, 10 cajitas que se dibujan en memoria RAM, es decir, cantidad de
         * elementos a almacenar, se le dice
         * técnicamente longitud del arreglo, en ingles es Lenght.
         * 
         * Yo puedo separar la declaración de la creación:
         * int [] numeros; Declaración
         * numeros = new int[10]; Instanciación del arreglo, porque se crea a partir de
         * un constructor.
         * 
         * numeros es un atributo público, por lo que no es necesario llamar a un get.
         * 
         */

        int[] numeros = new int[10];
        System.out.println("Longitud del arreglo: " + numeros.length);

        Comentario[] comentarios = new Comentario[5];
        /*
         * Los espacios se empiezan a contar desde 0
         * ========================================
         * C1 | C2 | C3 | C4 | C5 |
         * ========================================
         * 0 | 1 | 2 | 3 | 4 |
         * 
         */

        // Inicialización directa: se evidencia la cantidad de elemntos y tipo de dato.
        //

        int[] punto = { 85, 95, 30, 48 }; // es como decir ".new int [4]"
        System.out.println("Puntos, Longitud del arreglo: " + punto.length);
        String[] color = { "Amarillo", "rojo", "verde", "morado", "rosa" }; // Es decir, ".new String [5]"
        System.out.println("Colores, Longitud del arreglo:  " + color.length);

        int[] edad = new int[5];
        System.out.println("Edad: " + edad.length);

        String[] nombre = new String[10];
        System.out.println("Nombres, Longitud del arreglo: " + nombre.length);


        System.out.println("=========================================================");
        System.out.println("                Inicia otra explicación.");
        System.out.println("=========================================================");

        // ejemploLectura();


    }

    public  static  void  ejemploEscritura(){
        Comentario[] comentarios = new Comentario[3];
        /* Pocisión 0 = texto() y autor()
        Pocisión 1 = texto() y autor() 
        Pocisión 2 = texto() y autor()  */
        comentarios[0] = new Comentario("Ana", "Gracias! "); // Pocisión 0, ya establecido
        /* Los demas están en null,  */
        comentarios[1] = new  Comentario("Juan", "Good luck");
        comentarios[2] = new Comentario("Carlo", "Good job");

        /* La desventaja de los arreglos es que nacen con una cantidad fija de elementos. 
        No es posible crear o agregar mas comentarios 
        Se le llama indice al numero: [1]
        
        Primera pocisión: 0
        Ultima pocisión: longitud - 1 */
        
    }
}
