import java.util.*;


public class ColeccionDeLibros {
    public static void main(String[] args) {
        //estructura de la coleccion de tamaño 100 y con 3 datos por
        // libro(Autor, Titulo, Editorial)
        String libros [][] = new String[100][3];
        PrincipalMenu();

    }

    public static void PrincipalMenu(){
        Scanner ScanHD = new Scanner(System.in);
        boolean salir = false;
        int opcionPrincipal;
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Agregar Libro");
            System.out.println("[2] Buscar Libro");
            System.out.println("[3] Mostrar espacios usados");
            System.out.println("[4] Mostrar espacios disponibles");
            System.out.println("[5] Mostrar toda la coleccion");
            System.out.println("[6] Salir");
            opcionPrincipal = ScanHD.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    //llenarMatrizManual(libros[]);
                    System.out.println("Proximamente");

                    break;
                case 2:
                    //buscar libro, cumplir almeno un nombre de las caracteristicas
                    System.out.println("Proximamente");

                    break;
                case 3:
                    //mostrar espacios usados
                    System.out.println("Proximamente");

                    break;
                case 4:
                    //mostrar espacios disponibles
                    System.out.println("Proximamente");

                    break;
                case 5:
                    //mostrar toda la coleccion
                    System.out.println("Proximamente");

                    break;

                case 6:
                    salir = true;

                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
        while (!salir);
    }

   //public static String[][] agregarLibro(String misLibros[], String titulo, String autor, String editorial){}

    public static void llenarMatrizManual(String[] libros) {

        var filas = 100;
        var columnas = 3;
        String titulo;
        String autor;
        String editorial;

        for (var fila = 0; fila < libros.length; fila++) {
            for (var columna = 0; columna < libros.length; columna++) {
                System.out.println("Ingrese un valor");
                //libros[fila][columna] = ingresar();
            }
        }
    }




    // public static int totalLibros(String misLibros[]){  // System.out.println(arreglo.lenght) }

   // public static int espaciosDisponibles(String misLibros[]){}

    public static void mostrarTotalLibros(String misLibros[]){} //buscar con ciclo for
    public static void mostrarEspaciosDisponibles(String misLibros[]){}
    public static void mostrarBusquedaLibroAutor(String misLibros[], String autor){

        /*El siguiente metodo es para la busqueda de un dato en un arreglo, pasar a busqueda de matriz

        * int[] arreglo = {8,4,9,7,1,2}; arreglo presentado
          int dato= 9; dato a buscar

          for(int i =0;i<arreglo.length;i++){
             if(dato == arreglo[i]){
                System.out.println(i+1);
             break;
          }
}
        * */
    }
    public static void mostrarTodaColeccion(String misLibros[]){
        /*
        * for(int i=0;i>arreglo.lenght;i++){
              System.out.println(arreglo[[i]]);
          }
        * //muestra los numeros dentro del arreglo(con parametros(arreglo.lenght)),
        * aunque se agreguen datos dentro del arreglo, muestra todo
        * */

    }

    public static String ingresar() {
        return new Scanner(System.in).next();
    }


}






//para el maximo de la coleccion agregar un if que compare la cantidad maxima de libros,
// con la del momento, si es > 100, desplegar mensaje de que no se puede agregar