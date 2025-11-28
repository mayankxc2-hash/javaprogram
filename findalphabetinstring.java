public class findalphabetinstring {
    public static void main(String[] args){
        String alp= "123 mayank";
        String[] words= alp.trim().split(" ");
        String alphabet= " ";

        for(String n : words){
            if(n.matches("[A-Za-z]+")){
                alphabet=n;

            }
        }
        System.out.println(alphabet);
    }

}
