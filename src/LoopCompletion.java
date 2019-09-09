import java.util.Scanner;

public class LoopCompletion {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

               int num, num2= 0, total = 0;
        System.out.println("Enter any integer: ");
          num = key.nextInt();
              total += num;
              num2++;


        System.out.println("Enter another  interger: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any interger 1 to 10: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any interger 1 to 10: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any integer: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter another  interger: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any interger: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any interger: ");
        num = key.nextInt();
        total += num;
        num2++;
        System.out.println("Enter any interger: ");
        num = key.nextInt();
        total += num;
        num2++;

        System.out.println("Enter any interger: ");
        num = key.nextInt();
        total += num;
        num2++;
               while (num2 <= 10)
          System.out.println("The total of all 10 numbers is " + total);
            }

        }

