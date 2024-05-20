
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Person person = new Person("John Doe", 30, "123 Main St");
        while (true) {
            System.out.println("The details of the person: ");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.print("If you want to update anything respond with Y/N: ");
            String choice = key.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.print("Please select an option between *Age* and *Address*: ");
                choice = key.nextLine();
                if (choice.equalsIgnoreCase("age")) {
                    System.out.print("Introduce the updated age: ");
                    person.setAge(key.nextInt());
                    key.nextLine();
                    System.out.println("Updated age: " + person.getAge());
                    System.out.println("");

                }
                if (choice.equalsIgnoreCase("address")) {
                    System.out.print("Introduce the updated address: ");
                    person.setAddress(key.nextLine());
                    System.out.println("Updated address: " + person.getAddress());
                    System.out.println("");
                }
            }
            if (choice.equalsIgnoreCase("N")) {
                System.out.print("See you next time !");
                break;
            }
        }
    }
}

class Person {

    Scanner key = new Scanner(System.in);
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age has to be positive!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }
}
