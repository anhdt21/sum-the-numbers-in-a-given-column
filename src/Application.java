import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tran gom "+matrix.length+" hang va "+matrix[0].length+" cot :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }

        System.out.println("Mang vua nhap la :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+"; ");
            }
            System.out.println();
        }

        System.out.println("Nhap vi tri dong can tinh tong: ");
        int index = sc.nextInt();
        while (index > matrix[0].length) {
            System.out.println("Khong ton tai vi tri cot phu hop!");
            System.out.println("Nhap vi tri dong can tinh tong: ");
            index = sc.nextInt();
        }

        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            total += matrix[row][index-1];
        }
        System.out.println("Tong cua cot thu " + index + " la: " + total + ".");
    }
}
