package p5.twoD;

public class ArrayTwoD {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int i, j, k = 0;

        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                arr[i][j] = k;
                k += 1;
            }
        }

        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // 2d arrays are array of arrays, hence we can -
        // individually allocating the size of inner arrays.
        
        int newArr[][] = new int[3][];
        newArr[0] = new int[2];
        newArr[1] = new int[1];
        newArr[2] = new int[3];

        // 1st subarray.
        newArr[0][0] = 1;
        newArr[0][1] = 2;

        // 2nd subarray.
        newArr[1][0] = 3;
        
        // 3rd subarray.
        newArr[2][0] = 4;
        newArr[2][1] = 5;
        newArr[2][2] = 6;

        for(i=0; i<3; i++) {
            for(j=0; j<newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
