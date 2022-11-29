import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Projeto {

    static File inputFile = new File("matriz.txt");

    public static void main(String[] args) throws FileNotFoundException {
        int[][] temperaturas = lertexto();

        System.out.println("b)");
        ordenar(temperaturas);

        System.out.println("\nc)");
        verMA(temperaturas);

        System.out.println("\nd)");
        matriz2(temperaturas);
        verMA(temperaturas);

        System.out.println("\ne)");
        percentagemMA(temperaturas);

        System.out.println("\nf)");
        menorTemperatura(temperaturas);

    }
    /* a)*/
    public static int[][] lertexto() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int Colunas, Linhas;
        Scanner in = new Scanner(inputFile);
        in.nextLine();
        Linhas = in.nextInt();
        Colunas = in.nextInt();
        int[][] temperaturas = new int[Linhas][Colunas];
        while (in.hasNext()) {
            for (int i = 0; i < Linhas; i++) {
                for (int j = 0; j < Colunas; j++) {
                    temperaturas[i][j] = in.nextInt();
                }
            }
        }
        in.close();
        return temperaturas;

    }
/* b)*/
    public static void ordenar(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
/*c)*/

    public static void verMA(int[][] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j] < 20) {
                System.out.print("M");
            } else if (arr[i][j] <30){
                System.out.print("H");
            } else if (arr[i][j] <40){
            System.out.print("E");
            } else {
            System.out.print("C");}
            }
            System.out.print("\n");
        }
    }

    /*d)*/

    public static final int D=-10;

    public static void matriz2 (int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= arr[i][j]+D;
            System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
 /*e)*/

    public static void percentagemMA (int[][] arr){
        double M=0 , H=0 , E=0 , C=0 ;
        double percM,percH, percE, percC;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j] < 20) {
                    M++;
                } else if (arr[i][j] <30){
                    H++;
                } else if (arr[i][j] <40){
                    E++;
                } else {
                    C++;
                }
            }
        }
        percM = M/(M+H+E+C)*100 ; percH = H/(M+H+E+C)*100 ; percE = E/(M+H+E+C)*100 ; percC = C/(M+H+E+C)*100;

        System.out.printf("MODERATE     : %.2f%%\n",percM);
        System.out.printf("HIGH         : %.2f%%\n",percH);
        System.out.printf("EXTREME      : %.2f%%\n",percE);
        System.out.printf("CATASTROPHIC : %.2f%%\n",percC);
    }
    /*f)*/

    public static void menorTemperatura (int[][] arr) {
        int menor = 2000; int subidaTemperatura;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < menor) {
                    menor=arr[i][j];
                }
            }
        }
        subidaTemperatura = 40-menor;
        System.out.printf("To get all terrain on CATASTROPHIC alert, the temperature has to rise : %d ºC",subidaTemperatura);
    }


    public static final int DIFERENCATEMP = 10;
    public static void alteracaoMA( int [][] arr) {
        int M = 0, H = 0, E = 0, C = 0, G = 0;
        double percDif;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] + D;
                if (arr[i][j] < 20) {
                    System.out.print("M");
                } else if (arr[i][j] < 30) {
                    System.out.print("H");
                } else if (arr[i][j] < 40) {
                    System.out.print("E");
                } else {
                    System.out.print("C");
                }
                System.out.print("\n");
            }
        }


    }
}


