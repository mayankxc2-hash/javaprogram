public class mergetwoarrays {
    public static void main(String[] args){
        int[] arr1= {1,32,45};
        int[] arr2= {4,43,2};
        int[] merged= new int[arr1.length + arr2.length];

        int k=0;
        for(int i=0; i< arr1.length; i++){
            merged[k++]= arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            merged[k++]= arr2[i];

        }
        System.out.println("merged array: ");
        for(int sm : merged){
            System.out.println(sm);
        }
    }

}
