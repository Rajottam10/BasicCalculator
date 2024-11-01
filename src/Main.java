import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("This is the basic calculator.\nYou can enter any 2 numbers and perform the calculation.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers, delimited by comma");
        String[] numb = scanner.nextLine().split(",");
        int number1 = Integer.parseInt(numb[0]);
        int number2 = Integer.parseInt(numb[1]);
        System.out.println("Enter the arithmetic operator to perform the desired operation\n");
        System.out.println("+, -, *, /\n");
        String opr = scanner.nextLine();

        switch(opr){
            case "+"-> { System.out.println("The numbers are: "+number1+" and "+number2);
                System.out.println("The answer is: "+ number1 + number2);}
            case "-"-> {System.out.println("The numbers are: "+number1+" and "+number2);
                System.out.printf("The answer is: ", number1 - number2);}
            case "*"-> {System.out.println("The numbers are: "+number1+" and "+number2);
                System.out.println("The answer is: "+ number1 * number2);}
            case "/"-> {System.out.println("The numbers are: "+number1+" and "+number2);
                if(number2 != 0){
                    System.out.println("The answer is: "+ number1 / number2);
                }
                else{System.out.println("The numbers are: "+number1+" and "+number2);
                    System.out.println("cant divide with zero");
                }
            }
                default -> { System.out.println("Failure");}
        };
    }
}
