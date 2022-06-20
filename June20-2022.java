public class WeeklyChallenge {

    public static int Squares(long a, long b){
        return (int) (Math.ceil(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)));
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println(Squares(3, 9));
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(Squares(17, 24));
        endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        System.out.println(Squares(1, 1000000000));
        endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
