package Dog;
import java.util.Scanner;
public class Dog {

	String name, breed;

	public Dog(String n, String b){

		name=n;
		breed=b;
	}
	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter dog's name and breed");

		Dog dog1=new Dog(scanner.nextLine(),scanner.nextLine());

		System.out.println("Enter dog's name and breed");

		Dog dog2=new Dog(scanner.nextLine(),scanner.nextLine());

		System.out.println("Enter dog's name and breed");

		Dog dog3=new Dog(scanner.nextLine(),scanner.nextLine());


		Dog[]dogs=new Dog[3];

		dogs[0]=new Dog(dog1.name, dog1.breed);
		dogs[1]=new Dog(dog2.name, dog2.breed);
		dogs[2]=new Dog(dog3.name, dog3.breed);

		System.out.println(dogs[1].name + ", the " + dogs[1].breed);
	}
}


