import java.util.Scanner;

public class BicycleTest {
    public static void main(String[] args) {

        String name, make;
        float value;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name=input.nextLine();

        System.out.println("Please enter the value of the bike: ");
        value=input.nextFloat();

        System.out.println("Please enter the make of your bike: ");
        make=input.nextLine();
        make=input.nextLine();

        Bicycle bike1 = new Bicycle(name, value, make);


        Bicycle bike2 = new Bicycle();

        System.out.println("Please enter your name: ");
        bike2.setName(input.nextLine());

        System.out.println("Please enter the value of the bike: ");
        bike2.setValue(input.nextFloat());

        System.out.println("Please enter the make of your bike: ");
        input.nextLine();
        bike2.setMake(input.nextLine());

        bike1.setValue(bike1.getValue()+10);
        System.out.println(bike1.getValue());

        System.out.println(bike1.getName()+", "+bike2.getName());

        System.out.println(bike1.getValue()+bike2.getValue());
    }
}
