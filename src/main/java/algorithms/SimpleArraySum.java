package algorithms;

import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {

        List<Integer>list = List.of(4, 5, 6, 7);
        System.out.println(simpleArraySum(list));
    }
      /*
       * Complete the 'simpleArraySum' function below.
       *
       * The function is expected to return an INTEGER.
       * The function accepts INTEGER_ARRAY ar as parameter.
       * @parameter
       * @ return
       */
        public static int simpleArraySum(List<Integer> ar) {
            // Write your code here
            int sizeOfar = ar.size();
            int count = 0;
            for(int i = 0; i < sizeOfar; i++) {
                count +=  ar.get(i);
            }
            return count;
        }

}

