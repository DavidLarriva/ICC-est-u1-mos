public class App {
    public static void main(String[] args) throws Exception {

        boolean ascendente = true;
        boolean descendente = false;

        System.out.println("Arreglo desordenado");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arreglo = {5, 2, 8, 1, 9, 3, 6, 4, 7};
        mO.printArreglo(arreglo);
         
        //System.out.println("Arreglo ordenado");
        //arreglo = mO.sortBySeleccion(arreglo);
       // mO.printArreglo(arreglo);


        System.out.println("Metodo de ordenamiento Ascendente");

        mO.sortBySeleccionM(arreglo, ascendente);
        mO.printArreglo(arreglo);

        System.out.println("Metodo de ordenamiento Descendente");


        mO.sortBySeleccionM(arreglo, descendente);
        mO.printArreglo(arreglo);



        



    }
}