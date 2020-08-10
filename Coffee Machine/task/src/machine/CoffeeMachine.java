package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        new CoffeeMachine(); {
            Scanner scan = new Scanner(System.in);

            int espressoWater = 250;
            int espressoMilk = 0;
            int espressoCoffee = 16;
            int latteWater = 350;
            int latteMilk = 75;
            int latteCoffee = 20;
            int cappuccinoWater = 200;
            int cappuccinoMilk = 100;
            int cappuccinoCoffee = 12;

            int stockMoney = 550;
            int stockCups = 9;
            int stockWater = 400;
            int stockMilk = 540;
            int stockCoffee = 120;
            boolean tf = true;

            while(tf) {

                System.out.print("Please select either buy, fill, take, remaining, or exit.\n");
                String action = scan.next();

                switch (action) {
                    case "buy":
                        System.out.print("What would you like to buy? Enter 1 for an espresso, 2 for a latter, or 3 for a cappuccino.\n");
                        System.out.print("Type 'back' if you would like to return to the main menu.\n");

                        if (scan.hasNextInt()) {
                            int purchase = scan.nextInt();

                            switch (purchase) {
                                case 1:
                                    if ((stockCups < 1) || (espressoWater > stockWater) || (espressoMilk > stockMilk) || (espressoCoffee > stockCoffee)) {
                                        System.out.print("There are not enough supplies to produce that cup of coffee.\n");
                                        break;
                                    }

                                    stockMoney += 4;
                                    stockCups--;
                                    stockWater -= 250;
                                    stockCoffee -= 16;

                                    System.out.print("I have enough resources, making you a coffee.\n");                                break;
                                case 2:
                                    if ((stockCups < 1) || (latteWater > stockWater) || (latteMilk > stockMilk) || (latteCoffee > stockCoffee)) {
                                        System.out.print("There are not enough supplies to produce that cup of coffee.\n");
                                        break;
                                    }

                                    stockMoney += 7;
                                    stockCups--;
                                    stockWater -= 350;
                                    stockMilk -= 75;
                                    stockCoffee -= 20;

                                    System.out.print("I have enough resources, making you a coffee.\n");
                                    break;
                                case 3:
                                    if ((stockCups < 1) || (cappuccinoWater > stockWater) || (cappuccinoMilk > stockMilk) || (cappuccinoCoffee > stockCoffee)) {
                                        System.out.print("There are not enough supplies to produce that cup of coffee.\n");
                                        break;
                                    }

                                    stockMoney += 6;
                                    stockCups--;
                                    stockWater -= 200;
                                    stockMilk -= 100;
                                    stockCoffee -= 12;

                                    System.out.print("I have enough resources, making you a coffee.\n");
                                    break;
                                default:
                                    System.out.print("Error. Please choose option 1, 2 or 3.\n");
                            }

                        } else {
                            continue;
                        }
                        break;
                    case "fill":
                        System.out.print("How many mL of water would you like to add to the machine?\n");
                        int waterRefill = scan.nextInt();
                        System.out.print("How many mL of milk would you like to add to the machine?\n");
                        int milkRefill = scan.nextInt();
                        System.out.print("How many g of coffee beans would you like to add to the machine?\n");
                        int coffeeRefill = scan.nextInt();
                        System.out.print("How many cups would you like to add to the machine?\n");
                        int cupRefill = scan.nextInt();

                        stockCups += cupRefill;
                        stockWater += waterRefill;
                        stockMilk += milkRefill;
                        stockCoffee += coffeeRefill;

                        break;
                    case "take":
                        int give = stockMoney;
                        stockMoney = 0;
                        System.out.print("I gave you $" + give + "\n");
                        break;
                    case "exit":
                        tf = false;
                        break;
                    case "remaining":
                        System.out.print("The coffee machine has:\n");
                        System.out.print(stockWater + " mL of water\n" + stockMilk + " mL of milk\n" + stockCoffee + " gof coffee beans\n" + stockCups + " of disposable cups\n" + stockMoney + " of money\n\n");
                        break;
                    /*default:
                        System.out.print("Error. Please choose either buy, fill, take, remaining, or exit.\n");*/


                }
            }
        }
    }
}
