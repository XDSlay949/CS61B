public class Exercise2 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max_num = 0;
        int count = 0;
        while(count + 1 < m.length){
            if(m[count] <= m[count + 1]){
                max_num = m[count + 1];
            }else if(max_num <= m[count]){
                max_num = m[count];
            }
            count = count + 1;
        }

        return max_num;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}