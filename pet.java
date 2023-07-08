package tamagothcigame;


import java.util.Scanner;

public class pet {
    private String name;
    private int hunger;
    private int happiness;

    public pet(String name) {
        this.name = name;
        this.hunger = 0;
        this.happiness = 0;
    }

    public void feed() {
        System.out.println(name + " is eating.");
        hunger -= 10;
        if (hunger < 0)
            hunger = 0;
        happiness += 5;
        if (happiness > 100)
            happiness = 100;
    }

    public void play() {
        System.out.println(name + " is playing.");
        hunger += 5;
        if (hunger > 100)
            hunger = 100;
        happiness += 10;
        if (happiness > 100)
            happiness = 100;
    }

    public void status() {
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your Tamagotchi:");
        String name = scanner.nextLine();

        pet tamagotchi = new pet(name);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed " + name);
            System.out.println("2. Play with " + name);
            System.out.println("3. Check " + name + "'s status");
            System.out.println("4. Quit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tamagotchi.feed();
                    break;
                case 2:
                    tamagotchi.play();
                    break;
                case 3:
                    tamagotchi.status();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}
