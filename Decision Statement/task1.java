import java.util.Scanner;
class task1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int option;
        int quantity =1;
        int total = 0;

        while (true)
        {
            System.out.println("Enter your option \n1.Veg \n2.Non Veg\n3.show bill\n");
            option = sc.nextInt();

            switch (option)
            {
                case 1 ->
                {
                    System.out.println(" ---------- Options for Veg -------------- \n 1. North Indian\n 2.South Indian\n3.French\n");
                    int vegChoice = sc.nextInt();
                    switch (vegChoice)
                    {
                        case 1 ->
                        {
                            System.out.println("------------Options for North Indian-------\n 1.Paratha Rs.100\n2.Panner Kadhai Rs.200\n3.Roti Rs.70");
                            int item1 = sc.nextInt();
                            switch (item1)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Paratha do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 100 * quantity; 
                                        }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Paneer Kadhai do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 200 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Roti do you want:");
                                             quantity = sc.nextInt(); 
                                             total += 70 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }
                        }
                        case 2 ->
                        {
                            System.out.println("------------Options for South Indian-------\n 1.Idli Rs.50\n2.Dosa Rs.70\n3.Filter cofee Rs.10");
                            int item2 = sc.nextInt();
                            switch (item2)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Idli do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 50 * quantity; 
                                            }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Dosa do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 70 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Filter Coffee do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 10 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }
                        }
                        case 3 ->
                        {
                            System.out.println("------------Options for French-------\n 1.Pizza Rs.500\n2.Crossaint Rs.70\n3.Cappacino Rs.100");
                            int item3 = sc.nextInt();
                            switch (item3)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Pizza do you want:");
                                            quantity = sc.nextInt();
                                            total += 500 * quantity; 
                                        }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Crossaint do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 70 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Cappacino do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 100 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }
                        }
                        default -> System.out.println("Invalid Option");
                    }
                    break;
                }
                case 2 ->
                {
                    System.out.println(" ---------- Options for Non Veg -------------- \n 1. North Indian\n 2.South Indian\n3.Chinese\n");
                    int nonVegChoice = sc.nextInt();
                    switch (nonVegChoice)
                    {
                        case 1 ->
                        {
                            System.out.println("------------Options for North Indian-------\n 1.Paratha Rs.100\n2.Chicken Kadhai Rs.200\n3.Roti Rs.70");
                            int item4 = sc.nextInt();
                            switch (item4)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Paratha do you want:");
                                            quantity = sc.nextInt();
                                            total += 100 * quantity; 
                                        }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Chicken Kadhai do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 200 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Roti do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 70 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }break;
                        }
                        case 2 ->
                        {
                            System.out.println("------------Options for South Indian-------\n 1.Anjal Fish Fry Rs.500\n2.Sukkha Rs.70\n3.Coke Rs.10");
                            int item5 = sc.nextInt();
                            switch (item5)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Anjal Fish Fry do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 500 * quantity; 
                                        }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Sukkha do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 70 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Coke do you want:");
                                            quantity = sc.nextInt(); 
                                            total += 10 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }
                        }
                        case 3 ->
                        {
                            System.out.println("------------Options for Chinese-------\n 1.Chicken Chilly Rs.250\n2.Chicken Manchurian Rs.150\n3.Old Rs.1000");
                            int item6 = sc.nextInt();
                            switch (item6)
                            {
                                case 1 -> { 
                                            System.out.println("What is the Quantity of Chicken Chilly do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 250 * quantity; 
                                        }
                                case 2 -> { 
                                            System.out.println("What is the Quantity of Chicken Manchurian do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 150 * quantity; 
                                        }
                                case 3 -> { 
                                            System.out.println("What is the Quantity of Old Monk do you want:"); 
                                            quantity = sc.nextInt(); 
                                            total += 1000 * quantity; 
                                        }
                                default -> System.out.println("Invalid Option");
                            }
                        }
                        default -> System.out.println("Invalid Option");
                        
                    }break;
                }
                case 3 ->
                {
                    System.out.println("Bill is:" + total);
                    return;
                }
                default -> System.out.println("Invalid option ");
            }
        }
    }
}
