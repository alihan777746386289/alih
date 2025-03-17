import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CombinatoricsCalculator {

    // Факториал числа
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Обычные перестановки: P(n) = n!
    public static long permutations(int n) {
        return factorial(n);
    }

    // Перестановки с повторяющимися элементами: P(n) / (p1! * p2! * ... * pk!)
    public static long permutationsWithRepetitions(String word) {
        int n = word.length();
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        long denominator = 1;
        for (int count : freq.values()) {
            denominator *= factorial(count);
        }

        return factorial(n) / denominator;
    }

    // Круговые перестановки: P(n) = (n-1)!
    public static long circularPermutations(int n) {
        return factorial(n - 1);
    }

    // Размещения: A(n, k) = n! / (n-k)!
    public static long arrangements(int n, int k) {
        return factorial(n) / factorial(n - k);
    }

    // Сочетания: C(n, k) = n! / (k! * (n-k)!)
    public static long combinations(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип задачи:");
        System.out.println("1 - Обычные перестановки");
        System.out.println("2 - Перестановки с повторяющимися элементами (например, NOTEBOOK)");
        System.out.println("3 - Круговые перестановки");
        System.out.println("4 - Размещения");
        System.out.println("5 - Сочетания");
        int choice = scanner.nextInt();

        if (choice == 2) {
            System.out.print("Введите слово: ");
            String word = scanner.next();
            System.out.println("Число уникальных перестановок: " + permutationsWithRepetitions(word));
        } else {
            System.out.print("Введите n (общее количество элементов): ");
            int n = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Количество перестановок: " + permutations(n));
            } else if (choice == 3) {
                System.out.println("Количество круговых перестановок: " + circularPermutations(n));
            } else {
                System.out.print("Введите k (выбранное количество элементов): ");
                int k = scanner.nextInt();
                
                if (choice == 4) {
                    System.out.println("Количество размещений: " + arrangements(n, k));
                } else if (choice == 5) {
                    System.out.println("Количество сочетаний: " + combinations(n, k));
                } else {
                    System.out.println("Некорректный выбор!");
                }
            }
        }

        scanner.close();
    }
}