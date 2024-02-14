import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Scanner class
        /*Scanner input=new Scanner(System.in);
        System.out.println("Please enter age ");
        double age=input.nextDouble();
        System.out.println("User age :: "+age);*/
        //User Details
        System.out.println("Please enter first name ");
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next();
        System.out.println("Please enter last name ");
        String lastName=scan.next();
        System.out.println("Please enter age ");
        int age =scan.nextInt();
        System.out.println("Please enter salary");
        double salary= scan.nextDouble();
        System.out.println("Please enter gender");
        char gender=scan.next().charAt(0);
//        System.out.println("Are you a major ?");
//        boolean isMajor=scan.nextBoolean();
        if(age>=18){
            System.out.println("user is a mahor !!");
            System.out.println("You can drive the car !!");
        }else{
            System.out.println("User is a minor !!");
            System.out.println("Please enroll for driving class ");
        }
        //Print user details
        System.out.println("User full name :: "+firstName+" "+lastName);
        System.out.println("User age :: "+age);
        System.out.println("User salary :: "+salary);
        System.out.println("Gender ::"+gender);
//        System.out.println("User is a major ::"+isMajor);

        }
    }
