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
                    //agregarLibro();
                    System.out.println();

                    break;
                case 2:
                    //buscar libro
                    System.out.println();

                    break;
                case 3:
                    //mostrar espacios usados
                    System.out.println();

                    break;
                case 4:
                    //mostrar espacios disponibles
                    System.out.println();

                    break;
                case 5:
                    //mostrar toda la coleccion
                    System.out.println();

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

   // public static String[][] agregarLibro(String misLibros[], String titulo, String autor, String editorial){}

   // public static int totalLibros(String misLibros[]){}

   // public static int espaciosDisponibles(String misLibros[]){}

    public static void mostrarTotalLibros(String misLibros[]){}
    public static void mostrarEspaciosDisponibles(String misLibros[]){}
    public static void mostrarBusquedaLibroAutor(String misLibros[], String autor){}
    public static void mostrarTodaColeccion(String misLibros[]){}









}






//para el maximo de la coleccion agregar un if que compare la cantidad maxima de libros,
// con la del momento, si es > 100, desplegar mensaje de que no se puede agregar