public class multiplytwomatrices {
    public static void main(String[] args){
        int[] arr1= {12,11,4,5,6};
        int[] arr2= {12,34,5,56,4};
        int[] product = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            product[i]=arr1[i] * arr2[i];
            }
            System.out.println("Product of two arrays:");
        for (int val : product) {
            System.out.print(val + " ");
        }
    }

}
