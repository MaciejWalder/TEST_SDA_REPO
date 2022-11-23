import java.util.Scanner;

public class Testy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz poniżej swoje imię:");
        String name = scanner.nextLine();
        System.out.println("Wpisz poniżej swoje nazwisko:");
        String rename = scanner.nextLine();
        System.out.println("Wpisz poniżej miasto zamieszkania:");
        String address = scanner.nextLine();
        System.out.println("Poniżej wpisz swój wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Poniżej wpisz czy jesteś w związku Yes/No:");
        String b=scanner.nextLine();
        Boolean Yes=true;
        Boolean No=false;
        if (Yes){
            System.out.println("Witam Cię " + name+" " +rename+ " w KLUBIE  TESTERSKIM");
        }else{
            System.out.println("Witam Cię" + name+ rename+ "w KLUBIE  TESTERSKIM");
        }

    }
}