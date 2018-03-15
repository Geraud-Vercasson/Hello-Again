package hello;

public class HelloAgain {
    public static void main(String[] args){

        Bonjour jeanPaul, rouve;
        jeanPaul = new Human();
        rouve = new Dog();

        System.out.println("jeanPaul dit : "+ jeanPaul.sayHello());
        System.out.println("rouve répond : " + rouve.sayHello());
    }
}
