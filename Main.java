public class Main {

    public static void main(String[] args){

        Addition sumInRange = (start, end) -> {
            int sum = 0;

            for (int i = start; i <= end; i++){
                sum += i;
            }

            return sum;
        };
    }

}