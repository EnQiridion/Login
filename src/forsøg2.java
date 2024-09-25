import java.util.Scanner;
public class forsøg2 {

    static String[] username = {"admin", "user1", "user2"};
    static String[] passwords = {"password123", "letmein", "letmein"};

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert Username here ");
        String insertUsername = input.nextLine();

        int userIndex = findUsername(insertUsername);

        if (userIndex != -1){
            boolean succes = login(userIndex, input);
            if (succes) {
                System.out.println("Welcome " + username[userIndex] + "!");
            }
            else {
                System.out.println("Your account is locked because of extended amount of wrong attempts!");
            }
        } else {
            System.out.println("User does not exist");
        }
        input.close();
    }
    public static int findUsername(String inputUsername) {
        for (int i = 0; i < username.length; i++) {  // Fixed loop condition
            if (username[i].equals(inputUsername)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean login(int userIndex, Scanner input ){
        int attempts = 0;
        while (attempts < 3){
            System.out.println("Insert Password here");
            String insertPswd = input.nextLine();

            if (validateUsername(userIndex, insertPswd)){
                return true;
            } else {
                System.out.println("Wrong Paswword, Try Again!");
            }
            attempts++;
        }
        return false;
    }
    public static boolean validateUsername(int userIndex, String password){
        return passwords[userIndex].equals(password);
    }

}
