import java.util.Arrays;
import java.util.Scanner;
public class MatrisTranspoze {

    public static void matrisPrinter(int[][] array){

        for(int i = 0; i< array.length;i++){
            for(int j = 0; j < array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rowLength,colLength;

        System.out.print("Array row sayısını girin:  ");
        rowLength = input.nextInt();

        System.out.print("Array col sayısını girin:  ");
        colLength = input.nextInt();

        int [][] myArray = new int[rowLength][colLength];

        // myArray i kullanıcıdan aldığımız değerlerle oluşturuyoruz.

        for(int i = 0; i < rowLength;i++){
            for(int j = 0; j < colLength;j++){
                System.out.print("Arrayın "+ (i+1) +". row , "+ (j+1) + ". col elemanını girin:  ");
                myArray[i][j] = input.nextInt();
            }
        }

        int [][] transpozeArray = new  int [colLength][rowLength];
        for(int i = 0;i<colLength;i++){
            for(int j = 0;j<rowLength;j++){
                transpozeArray[i][j] = myArray[j][i];
            }
        }

        matrisPrinter(myArray);
        System.out.println("Transpozesi:");
        matrisPrinter(transpozeArray);

    }
}
