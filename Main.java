public class Main {
    public static void main(String[] args) {

        Person bro = new Person("Heisenberg", 50);

        int age = bro.getAge();
        String name = bro.getName();

        System.out.println("name is : " + name);
        System.out.println("age is : " + age);
        bro.adult();

        System.out.println("-------------------------------------------------------------");

        bro.setage(16) ;
        bro.setName("junior");

        bro.display();
        bro.adult();
    }
}
