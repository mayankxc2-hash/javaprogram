public class countwordinstring {
public static void main(String[] args){
    String sentence= "mayank is a good boy";
    String[] words= sentence.trim().split("\\s+");
     System.out.println("no. of words: "+ words.length);
}
    
}
