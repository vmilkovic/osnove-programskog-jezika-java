package vjezbe2019.vjezba2;

import predavanja2019.predavanje2.ZbrojMatrica;

public class Zadatak1 {

    int[][] zbrojiMatriceInt(int[][] arr1, int[][] arr2 ){

        int[][] new_arr = new int[arr1.length][arr2.length];

        if( arr1.length == arr2.length ){

            for(int i = 0; i < arr1.length; i++){
                for( int j=0; j < arr2.length; j++){
                    new_arr[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }

        return new_arr;

    }

    double[][] zbrojiMatriceDouble(double[][] arr1, double[][] arr2 ){

        double[][] new_arr = new double[arr1.length][arr2.length];

        if( arr1.length == arr2.length ){

            for(int i = 0; i < arr1.length; i++){
                for( int j=0; j < arr2.length; j++){
                    new_arr[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }

        return new_arr;

    }

    int[][] pomnoziMatriceInt(int[][] arr1, int[][] arr2 ){

        int[][] new_arr = new int[arr1.length][arr2.length];

        if( arr1.length == arr2.length ){
            for(int i = 0; i < arr1.length; i++){
                for( int j=0; j < arr2.length; j++){
                    new_arr[i][j] = arr1[i][j] * arr2[i][j];
                }
            }
        }

        return new_arr;

    }

    double[][] pomnoziMatriceFloat(double[][] arr1, double[][] arr2 ){

        double[][] new_arr = new double[arr1.length][arr2.length];

        if( arr1.length == arr2.length ){
            for(int i = 0; i < arr1.length; i++){
                for( int j=0; j < arr2.length; j++){
                    new_arr[i][j] = arr1[i][j] * arr2[i][j];
                }
            }
        }

        return new_arr;

    }

    void ispisMatriceInt(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for( int j=0; j < arr.length; j++){
                System.out.printf("%d", arr[i][j]);
            }
        }
        System.out.println();

    }

    void ispisMatriceFloat(double[][] arr){

        for(int i = 0; i < arr.length; i++){
            for( int j=0; j < arr.length; j++){
                System.out.printf("%f", arr[i][j]);
            }
        }
        System.out.println();

    }

    public static void main(String args[]){

        int[][] a = {{1,2,1}, {3,2,1}, {1,1,5}};
        int[][] b = {{4,2,2}, {2,2,2}, {2,4,2}};
        double[][] c = {{1.3,2.0,1.0}, {3.0,2.0,1.0}, {1.0,1.0,5.0}};
        double[][] d = {{4.0,2.0,2.8}, {2.0,2.0,2.0}, {2.0,4.0,2.0}};

        Zadatak1 zad1 = new Zadatak1();
        int[][] zbroj = zad1.zbrojiMatriceInt(a, b);
        int[][] umnozak = zad1.pomnoziMatriceInt(a, b);
        double[][] zbrojd = zad1.pomnoziMatriceFloat(c, d);
        double[][] umnozakd = zad1.pomnoziMatriceFloat(c, d);

        zad1.ispisMatriceInt(zbroj);
        zad1.ispisMatriceInt(umnozak);
        zad1.ispisMatriceFloat(zbrojd);
        zad1.ispisMatriceFloat(zbrojd);

    }

}
