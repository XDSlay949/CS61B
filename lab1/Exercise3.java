public class Exercise3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max_num = 0;
        for(int i = 0; i + 1 < m.length; i = i + 1){
            if(m[i] <= m[i + 1]){
                max_num = m[i + 1];
            }else if(max_num <= m[i]){
                max_num = m[i];
            }
        }
        return max_num;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
