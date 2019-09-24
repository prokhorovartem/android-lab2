import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        doFirstTask();
        doSecondTask();
        doThirdTask();
        doFourthTask();
        doFifthTask();
        doSixthTask();
        doSeventhTask();
        doEighthTask();
    }

    private static void doFirstTask() {
        int var1 = 7;
        int var2 = 10;
        int result = var1 + var2;
        System.out.println(result);
    }

    private static void doSecondTask() {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        System.out.println(s1 + s2 + s3 + s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    private static void doThirdTask() {
        String a, b, c, d, e;
        Scanner sc = new Scanner(System.in);

        a = sc.next();
        b = sc.next();
        c = sc.next();
        d = sc.next();
        e = sc.next();

        String[] array = {a, b, c, d, e};
        Map<String, Integer> map = new HashMap<>();

        for (String inputVar : array) {
            if (map.containsKey(inputVar)) {
                Integer countForThisValue = map.get(inputVar);
                map.put(inputVar, countForThisValue + 1);
            } else {
                map.put(inputVar, 1);
            }
        }

        List<String> inputVars = map.keySet().stream()
                .filter(x -> map.get(x) > 1).collect(Collectors.toList());

        if (inputVars.isEmpty()) {
            System.out.println("Все разные");
        } else {
            inputVars.forEach(x -> {
                for (int i = 0; i < map.get(x); i++) {
                    System.out.print(x + " ");
                }
            });
        }
    }

    private static void doFourthTask() {
        System.out.println("Если студент получил 0-60 баллов – то оценка 2.\n" +
                "Если студент получил 60-74 баллов – то оценка 3.\n" +
                "Если студент получил 75-90 баллов – то оценка 4.\n" +
                "Если студент получил 91-100 баллов – то оценка 5.");
        System.out.println("Пожалуйста, введите количество баллов:");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 90) {
            System.out.println("Оценка 5");
        } else if (grade > 74) {
            System.out.println("Оценка 4");
        } else if (grade > 60) {
            System.out.println("Оценка 3");
        } else {
            System.out.println("Оценка 2");
        }
    }

    private static void doFifthTask() {
        System.out.println("Если студент получил 0-60 баллов – то оценка 2.\n" +
                "Если студент получил 60-74 баллов – то оценка 3.\n" +
                "Если студент получил 75-90 баллов – то оценка 4.\n" +
                "Если студент получил 91-100 баллов – то оценка 5.");
        System.out.println("Пожалуйста, введите количество баллов:");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        switch (grade) {
            case 91:
                System.out.println("Оценка 5");
                break;
            case 75:
                System.out.println("Оценка 4");
                break;
            case 61:
                System.out.println("Оценка 3");
            default:
                System.out.println("Оценка 2");
        }
    }

    private static void doSixthTask() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void doSeventhTask() {
        int[] array = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Возникло исключение: " + ex);
        }
    }

    private static void doEighthTask() {
        AirBusA320 airBusA320 = new AirBusA320();
        AirBusA380 airBusA380 = new AirBusA380();
        airBusA380.setSpeed(900);
    }
}
