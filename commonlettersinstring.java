
public class commonlettersinstring {
    public static void main(String[] args){
        String name= "rakshit";
        String name1 = "mayank";
        String common= "";
        for(int i=0; i<name.length(); i++){
            char ch= name.charAt(i);
            if(name1.indexOf(ch)!=-1){
                if(common.indexOf(ch)== -1){
                    common+=ch;
                }

            }
        }
        System.out.println("common words: "+ common);

    }

}
