class array{
    public static void main(String[] args){

        //Declaration mathod1
        int[] arr = new int[5];
        arr[0]= 10;
        arr[1]= 30;
        arr[2]= 15;
        arr[3]= 42;
        arr[4]= 53;
        System.out.println(arr[4]); //Particular element

        System.out.print("Array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        //Declaration method2
        int[] arr2;
        arr2 = new int[5];
        arr2[0]= 110;
        arr2[1]= 300;
        arr2[2]= 151;
        arr2[3]= 426;
        arr2[4]= 513;

        System.out.print("Array elements: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");

        //Declaration mathod3
        int[] arr3 = {50,20,10,41,32,50,10};

        System.out.print("Array elements: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}