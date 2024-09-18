package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[]args) {
        Matrix matrix1 = new Matrix(3, 3);//mutable matrix
        double[][] a = new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        matrix1.fillMatrix(a);
        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        Matrix matrix2 = new Matrix(3, 3);//mutable matrix
        double[][] b = new double[][]{
                {-1.0, 2.0, 10.0},
                {4.0, -5.0, 6.4},
                {7.2, -8.0, 9.0}
        };
        matrix2.fillMatrix(b);
        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        // Calling equals implicitly (e.g., in a collection)
            Set<Matrix> matrixSet = new HashSet<>();
            matrixSet.add(matrix1);
            matrixSet.add(matrix2);

            // Calling equals explicitly
            boolean areEqual = matrix1.equals(matrix2);
            System.out.println("Are matrix1 and matrix2 equal? " + areEqual); // Should print true

            // Calling hashCode explicitly
            int hashCode1 = matrix1.hashCode();
            int hashCode2 = matrix2.hashCode();
            System.out.println("Hash code of matrix1: " + hashCode1);
            System.out.println("Hash code of matrix2: " + hashCode2);

            // Hash codes should be the same for equal objects


          //x1.getNumRows(), matrix1.getNumColumns()); //розмірність матриці
    }
}
