public class Main {

    public static void main(String[] args){

        if (args.length == 2){
            int s = Integer.parseInt(args[0]);
            int e = Integer.parseInt(args[1]);

            Addition sumInRange = (start, end) -> {
                int sum = 0;

                for (int i = start; i <= end; i++){
                    sum += i;
                }

                return sum;
            };

            int total = sumInRange.add(s, e);

            System.out.println("Sum of the start and end number: " + total);
        }

    }

}