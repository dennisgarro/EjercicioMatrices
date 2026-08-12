import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];
        while (continuar) {
            System.out.println("Que desea realizar 1: llenar matriz de enteros"
                    + "2 Mostrar Matriz de enteros, 3 Llenar matriz Objetual 4 Mostrar matriz Objetual");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    ME = m.LLenarMatrizEntera(ME);
                    break;
                case 2:
                    m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.LlenarMatrizObjetual(MO);
                    break;
                case 4:
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 5:
                    System.out.println("hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esa opcion no existe por favor validar...");
                    break;
            }
        }
    }
}
