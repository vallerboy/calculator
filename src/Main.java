import javax.jws.soap.SOAPBinding;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);


        boolean hasTwoNumbers = false;
        boolean hasOneNumber = false;

        do{
            System.out.println("------------");
            if(hasTwoNumbers) {
                System.out.println("0 - dodawanie");
                System.out.println("1 - odejmowanie");
                System.out.println("2 - mnozenie");
                System.out.println("3 - dzielenie");
                System.out.println("7 - potegowanie");
            }
            if(!hasTwoNumbers && hasOneNumber) {
                System.out.println("4 - pierwiastek");
            }
            System.out.println("5 - wprowadz liczby");
            System.out.println("6 - wyjscie");
            System.out.println("------------");


            System.out.print("Wpisz komende: ");
            switch (scanner.nextLine()){
                case "5":{
                    System.out.println("Wpisz 0 jesli nie chcesz uzywac danej liczby");
                    System.out.print("Wpisz wartosc liczby 1: ");
                    x = Double.parseDouble(scanner.nextLine());

                    hasTwoNumbers = false;
                    hasOneNumber = true;
                    System.out.print("Chcesz wprowadzić jeszcze jedną liczbę?");
                    String answer = scanner.nextLine();

                    if(answer.equalsIgnoreCase("tak")){
                        System.out.print("Wpisz wartosc liczby 2: ");
                        y = Double.parseDouble(scanner.nextLine());
                        hasTwoNumbers = true;
                        hasOneNumber = false;
                    }
                    break;
                }

                case "0": {
                    System.out.println("Wynik dodawania to: " + (x + y));
                    hasTwoNumbers = false;
                    break;
                }

                case "1": {
                    System.out.println("Wynik odejmowania to: " + (x - y));
                    hasTwoNumbers = false;
                    break;
                }

                case "2": {
                    System.out.println("Wynik mnozenia to: " + (x * y));
                    hasTwoNumbers = false;
                    break;
                }

                case "3": {
                    if(y == 0){
                        System.out.println("Nie mozna dzielic prez 0");
                        hasTwoNumbers = false;
                        break;
                    }
                    System.out.println("Wynik dzielenia to: " + (x / y));
                    hasTwoNumbers = false;
                    break;
                }

                case "4": {
                    if(x < 0){
                        System.out.println("Nie mozna pierwiastkwowac liczb ujemnych");
                        hasTwoNumbers = false;
                        break;
                    }
                    System.out.println("Pierwiastek kwadratowy z " + x + ", wynosi: " + Math.sqrt(x));
                    hasTwoNumbers = false;
                    break;
                }

                case "7": {
                    double pow = x;
                    for(int i = 1; i <= y; i++){
                        pow *= x;
                    }
                    System.out.println("Potega o wykladniku " + y + " z liczby " + x + " wynosi " + pow);
                    hasTwoNumbers = false;
                    break;
                }

                case "6": {
                      System.exit(0);
                }

            }

        }while (true);
    }
}
