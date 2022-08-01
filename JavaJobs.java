import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class JavaJobs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("************JAVA JOBS **********");
        System.out.println("********************************\n");

        System.out.println("Welcome to JAVA Jobs. What would you like to do?");
        System.out.println("\t- Apply for a job (type a)");
        System.out.println("\t- Work a shift (type b)");
        System.out.println("\t- Ask for a raise (type c)");
        System.out.println("\t- Learn about Java (type d)");
        String option = scan.nextLine();

        switch(option) {
            case "a": 

                Boolean allowed = applyJobAllowed();
                if (allowed = true){
                    apply();
                }

                break;
            case "b": break;
            case "c": break;
            case "d": break;
        }

        scan.close();
        
    }

    public static boolean applyJobAllowed() {
        Scanner scan = new Scanner(System.in);

        System.out.println("To make sure you are allowed to apply, lets take a quick test");

        System.out.print("What is your age?: ");
        int age = scan.nextInt();

        System.out.println("Have you had or have experience with Java (yes/no)");
        String exp = scan.nextLine();

        if (age < 15 ||!exp.contains("y")){
            System.out.println("You are not eligible to apply!");
            scan.close();
            return false;
        } else {
            scan.close();
            return true;
        }

        
    }

    public static void apply(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Here are the jobs that we have available: ");
        System.out.println("\t- Game Developer,  200k year (type a)");
        System.out.println("\t- Course Developer, 150k year (type b)");
        System.out.println("\t- Java Web Developer, 125k year (type c)");
        System.out.println("\t- Basic Java Developer, 90k year (type d)");
        System.out.println("\t- App Designer, 150k year (type e)");
        System.out.println("\t- App Developer, 200k year (type f)");
        System.out.println("\t- OS Developer, 350k year (type g)");
        System.out.println("\t- OS Designer, 250k year (type h)");

        String jobOption = scan.nextLine();

        switch(jobOption) {
            case "a": break;
            case "b": break;
            case "c": break;
            case "d": break;
            case "e": break;
            case "f": break;
            case "g": break;
            case "h": break;
        }




        scan.close();
    }

    

}
