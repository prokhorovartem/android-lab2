import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        doFirstTask();
        doSecondTask();
        doThirdTask();
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
}
