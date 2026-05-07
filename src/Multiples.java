import java.util.ArrayList;

public class Multiples {
    // 1. add all multiples to a list (make sure it's a set so no duplicates, or just make sure that the conditions don't overlap so it only adds once
    // 2. calculate and print the length of that list
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 1; i < 999; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive  = i % 5 == 0;

            if (divisibleByThree || divisibleByFive) {
                lst.add(i);
            }
        }
        System.out.println(lst.size());
    }
}