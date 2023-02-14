import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6,1,3,2,9,0,10,42,4,5));


        for (int i = 0; i < numbers.size(); i++) {
            int min = numbers.get(i);
            for (int x = i; x < numbers.size(); x++) {
                int num = numbers.get(x);

                if (num < min) {
                    min = num;
                }
            }
            Integer rmv = numbers.remove(numbers.indexOf(min));

            numbers.add(i, rmv);
        }

        System.out.println(numbers);

    }
}
