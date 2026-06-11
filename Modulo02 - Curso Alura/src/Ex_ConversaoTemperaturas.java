import java.util.Locale;
import java.util.Scanner;

public class Ex_ConversaoTemperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite uma temperatura em Celsius (use ponto para decimais): ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 1.8f) + 32;

        System.out.println("Temperatura em Fahrenheit: " + (int)fahrenheit);
        System.out.printf("A temperatura %.2f em Celsius é equivalente e temperatura: %.2f em Fahrenheit %n", celsius, fahrenheit);

        sc.close();
    }
}