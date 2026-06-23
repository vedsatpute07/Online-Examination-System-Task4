import java.util.*;

public class task4 {
    static Scanner sc = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String[] args) {

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        System.out.println("Login Successful");

        int choice;

        do {
            System.out.println("\n1.Update Profile");
            System.out.println("2.Start Exam");
            System.out.println("3.Logout");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    updateProfile();
                    break;

                case 2:
                    startExam();
                    break;

                case 3:
                    System.out.println("Logged Out Successfully");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);
    }

    static void updateProfile() {
        System.out.print("Enter New Username: ");
        username = sc.nextLine();

        System.out.print("Enter New Password: ");
        password = sc.nextLine();

        System.out.println("Profile Updated Successfully");
    }

    static void startExam() {

        String[] questions = {
            "1. Java is a ?\nA.Language\nB.Car\nC.Mobile\nD.Game",
            "2. JVM stands for ?\nA.Java Virtual Machine\nB.Java Very Main\nC.Just Virtual Machine\nD.None",
            "3. Size of int in Java ?\nA.2\nB.4\nC.8\nD.16"
        };

        char[] answers = {'A','A','B'};

        int score = 0;

        long startTime = System.currentTimeMillis();
        long limit = 60000;

        for(int i=0;i<questions.length;i++) {

            if(System.currentTimeMillis() - startTime >= limit) {
                System.out.println("\nTime Over! Auto Submitted");
                break;
            }

            System.out.println("\n" + questions[i]);
            System.out.print("Answer: ");
            char ans = sc.next().toUpperCase().charAt(0);

            if(ans == answers[i])
                score++;
        }

        System.out.println("\nExam Submitted");
        System.out.println("Score = " + score + "/" + questions.length);
    }
}