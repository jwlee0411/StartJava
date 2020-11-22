//3강 소스코드

import java.util.Arrays;

public class Class03 {

    public static void main(String[] args)
    {
        //int a[100];

        //int[100] a;

        int[] a;
        a = new int[10];
        //int[] a = new int[10];

        int[][] k = new int[][]{
                {1, 2,},
                {3,4,},

        };

        for(int i = 0; i<k.length; i++)
        {
            for(int j = 0; j<k[i].length; j++)
            {
                System.out.println(k[i][j]);
            }
        }

       // System.out.println(Arrays.toString(k));
        System.out.println(Arrays.deepToString(k));

        int[][][] j = new int[][][]{
                {
                        {1,2,3},
                        {4,5,6},
                }
                ,
                {
                        {7,8,9}
                }
        };


        String[] str = new String[]{
                "123", "456",
        };

        String[] str2 = new String[100];





    }
}
