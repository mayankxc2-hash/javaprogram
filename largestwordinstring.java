public class largestwordinstring {
public static void main(String[] args){
    String sentence= "java is powerful and interesting";
    String[] words= sentence.split(" ");
    String longest= words[0];

    for(String w : words){
        if(w.length() > longest.length())
        longest= w;
    }
    System.out.println("longest word: " + longest);
}
}
