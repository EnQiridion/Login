import java.util.Scanner;
public class Chatpgt {

    // Arrays til at gemme brugernavne og adgangskoder
    static String[] brugernavne = {"bruger1", "bruger2", "bruger3"};
    static String[] adgangskoder = {"kode1", "kode2", "kode3"};

    public static void main(String[] args) {
        // Scanner objekt til at tage input fra brugeren
        Scanner scanner = new Scanner(System.in);

        // Bed om brugernavn
        System.out.print("Indtast brugernavn: ");
        String indtastetBrugernavn = scanner.nextLine();

        // Find brugeren
        int brugerIndex = findBrugernavn(indtastetBrugernavn);

        // Hvis brugernavn findes, forsøg at logge ind
        if (brugerIndex != -1) {
            boolean success = login(brugerIndex, scanner);
            if (success) {
                System.out.println("Velkommen, " + brugernavne[brugerIndex] + "!");
            } else {
                System.out.println("Din konto er låst på grund af for mange forkerte forsøg.");
            }
        } else {
            System.out.println("Brugernavn findes ikke.");
        }

        scanner.close();
    }

    // Metode til at finde brugernavn i arrayet
    public static int findBrugernavn(String brugernavn) {
        for (int i = 0; i < brugernavne.length; i++) {
            if (brugernavne[i].equals(brugernavn)) {
                return i;
            }
        }
        return -1; // Brugernavn ikke fundet
    }

    // Metode til login forsøg
    public static boolean login(int brugerIndex, Scanner scanner) {
        int forsøg = 0;
        while (forsøg < 3) {
            // Bed om adgangskode
            System.out.print("Indtast adgangskode: ");
            String indtastetAdgangskode = scanner.nextLine();

            // Valider adgangskode
            if (validateAdgangskode(brugerIndex, indtastetAdgangskode)) {
                return true; // Login succesfuld
            } else {
                System.out.println("Forkert adgangskode. Forsøg igen.");
            }

            forsøg++;
        }
        return false; // Login fejlet efter 3 forsøg
    }

    // Metode til at validere adgangskode
    public static boolean validateAdgangskode(int brugerIndex, String adgangskode) {
        return adgangskoder[brugerIndex].equals(adgangskode);
    }
}
