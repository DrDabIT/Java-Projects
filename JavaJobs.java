import java.util.Scanner;

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
        int age;

        System.out.println("Have you had or have experience with Java");
        String exp = scan.nextLine();



        return true;
    }

}
