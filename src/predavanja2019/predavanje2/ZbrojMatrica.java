// Napišite program koji zbaraja dvije matrice 3x3

package predavanja2019.predavanje2;

public class ZbrojMatrica {

    public static void main(String args[]){

        int[][] a = {{1,1,1}, {1,1,1}, {1,1,1}};
        int[][] b = {{2,2,2}, {2,2,2}, {2,2,2}};

        int[][] c = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf("%d", c[i][j]);
            }
            System.out.print("\n");
        }

    }

}
