public class StairCase {
    public static void main(String[] args){
        int current = 0;
        int Final = 5;
        int ways = stairCases(current,Final);
        System.out.println(ways);
    }
    public static int stairCases(int current, int Final){
        if(current == Final){
            return 1;
        }
        if(current > Final){
            return 0;
        }
        return stairCases(current+1,Final) + stairCases(current+2,Final);
    }
}
