public class removeaspecificcharacter {
    public static void main(String[] args){
        String name= "mayank";
        char remove= 'y';
        String result = name.replace(String.valueOf(remove), "");

        System.out.println(remove + " " + result) ;
    }

}
