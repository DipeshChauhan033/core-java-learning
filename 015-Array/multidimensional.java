class multidimensional{
    public static void main(String[] args){
        
        //2D array
        int[][] arr = new int[2][3];

        arr[0][0] = 101;
        arr[0][1] = 102;
        arr[0][2] = 103;
        arr[1][0] = 104;
        arr[1][1] = 105;
        arr[1][2] = 106;
        
        //Displaying 2-D array

        System.out.println("Elements of 2-D array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
        }

        //3D Array
        int[][][] arr2 = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };

        System.out.println("Enlements of 3D array");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                for(int k=0;k<arr2[i][j].length;k++){
                    System.out.print(arr2[i][j][k]+" ");
                }System.out.println("");
            }System.out.println("-----");
        }
     }
}