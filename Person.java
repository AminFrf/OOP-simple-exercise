public class Person {
    private String name;
    private int age;

    public Person (String name , int age ){
        this.name = name ;
        this.age = age ;
    }

    //getter
    public String getName () {
        return name ;
    }
    //getter
    public int getAge() {
        return age ;
    }
    //setter
    public void setName (String name) {
        this.name = name ;
    }
    //setter
    public void setage (int age) {
        this.age = age ;
    }
    public void display(){
        System.out.println("name : " +  name + " age : " + age);
    }
    public void adult(){
        if(age >= 18){
            System.out.println("lets laugh at those kids who have to go to school!!! ");
        }
        else{
            System.out.println("what are you doing here?\ngo do your homeworks!!!");
        }
    }
}