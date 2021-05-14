package algorithms;

import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List <Integer> a = List.of(17, 28, 30);
        List <Integer> b = List.of(99, 16, 8);
        System.out.println(compareTriplets(a, b));
    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int comparisonPt_a = 0;
        int comparisonPt_b = 0;

        if (a.get(0) > b.get(0)) {
            comparisonPt_a++;
        } else if (a.get(0) < b.get(0)) {
            comparisonPt_b++;
        } else {
            comparisonPt_a += 0;
            comparisonPt_b += 0;
        }

        if (a.get(1) > b.get(1)) {
            comparisonPt_a++;
        } else if (a.get(1) < b.get(1)) {
            comparisonPt_b++;
        } else {
            comparisonPt_a += 0;
            comparisonPt_b += 0;
        }

        if (a.get(2) > b.get(2)) {
            comparisonPt_a++;
        } else if (a.get(2) < b.get(2)) {
            comparisonPt_b++;
        } else {
            comparisonPt_a += 0;
            comparisonPt_b += 0;
        }

        List<Integer> comparisonList = List.of(comparisonPt_a, comparisonPt_b);
        return comparisonList;
    }

}
