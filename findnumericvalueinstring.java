public class findnumericvalueinstring {
    public static void main(String[] args){
        String num= "mayank 123";
        String[] words= num.trim().split(" ");
        String numeric= "";

        for(String n: words){
            if(n.matches("\\d+")){
                numeric=n;
            } 
        }
        System.out.println(numeric);
    }

}
