public class dublicatesstring {
    public static void main(String[] args){
        String name= "rakshitt";
        String result= "";
        for(int i=0; i<name.length(); i++){
            char ch= name.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;

            }
        }
        System.out.println("after removing dublicates: "+ result);

    }

}
