import javax.jws.soap.SOAPBinding;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private boolean hasTwoNumbers;
    private boolean hasOneNumber;
    private double x;
    private double y;
    private Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
        hasOneNumber = false;
        hasTwoNumbers = false;
    }

    public void start() {
        do {
            printMenu();
            checkChoice();
        } while (true);
    }


    private void printMenu() {
        System.out.println("------------");
        if (hasTwoNumbers) {
            System.out.println("0 - dodawanie");
            System.out.println("1 - odejmowanie");
            System.out.println("2 - mnozenie");
            System.out.println("3 - dzielenie");
            System.out.println("7 - potegowanie");
        }
        if (hasOneNumber) {
            System.out.println("4 - pierwiastek");
        }
        System.out.println("5 - wprowadz liczby");
        System.out.println("6 - wyjscie");
        System.out.println("------------");
    }


    private void checkChoice() {
        System.out.print("Wpisz komende: ");
        switch (scanner.nextLine()) {
            case "5": {
                getNumbersFromUser();
                break;
            }

            case "0": {
                add();
                break;
            }

            case "1": {
                remove();
                break;
            }

            case "2": {
                multiply();
                break;
            }

            case "3": {
                divide();
                break;
            }

            case "4": {
                sqrt();
                break;
            }

            case "7": {
                pow();
                break;
            }

            case "6": {
                System.exit(0);
            }

        }
    }

    private void pow() {
        double pow = x;
        for (int i = 1; i <= y; i++) {
            pow *= x;
        }
        System.out.println("Potega o wykladniku " + y + " z liczby " + x + " wynosi " + pow);
        hasTwoNumbers = false;
    }

    private void sqrt() {
        if (x < 0) {
            System.out.println("Nie mozna pierwiastkwowac liczb ujemnych");
            hasTwoNumbers = false;
            return;
        }
        System.out.println("Pierwiastek kwadratowy z " + x + ", wynosi: " + Math.sqrt(x));
        hasTwoNumbers = false;
    }

    private void divide() {
        if (y == 0) {
            System.out.println("Nie mozna dzielic prez 0");
            hasTwoNumbers = false;
            return;
        }
        System.out.println("Wynik dzielenia to: " + (x / y));
        hasTwoNumbers = false;
    }

    private void multiply() {
        System.out.println("Wynik mnozenia to: " + (x * y));
        hasTwoNumbers = false;
    }

    private void remove() {
        System.out.println("Wynik odejmowania to: " + (x - y));
        hasTwoNumbers = false;
    }

    private void add() {
        System.out.println("Wynik dodawania to: " + (x + y));
        hasTwoNumbers = false;
    }

    private void getNumbersFromUser() {
        System.out.println("Wpisz 0 jesli nie chcesz uzywac danej liczby");
        System.out.print("Wpisz wartosc liczby 1: ");
        x = Double.parseDouble(scanner.nextLine());

        hasTwoNumbers = false;
        hasOneNumber = true;
        System.out.print("Chcesz wprowadzić jeszcze jedną liczbę?");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("tak")) {
            System.out.print("Wpisz wartosc liczby 2: ");
            y = Double.parseDouble(scanner.nextLine());
            hasTwoNumbers = true;
            hasOneNumber = false;
        }
    }
}
