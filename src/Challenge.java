import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Arrays;
class Challenge {
    public static Integer packArray( List<Integer> arr ) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++){
            sum = arr.get(i)+ arr.get(i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(packArray({4, 10, 15, 5, 6}));
    }
}
