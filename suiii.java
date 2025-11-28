class animal{
    void eat(){
        System.out.println("dog eats");
    }


    void barks(){
        System.out.println("dog barks");
    }
            

    public static void main(String[] args) {
        animal a = new animal();
        a.eat();
        a.barks();
    }
}
