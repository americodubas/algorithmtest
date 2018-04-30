import java.util.*;

/**
 * Find the N closest points to the center 0,0
 * Could be faster with a Max Heap
 */
class FindClosestPointToOrigin {

    static List<Point> findNClosest(List<Point> points, int numberOfClosest) {
        Set<Point> set = new TreeSet<>(points);

        List<Point> list = new ArrayList<>();
        Iterator<Point> it = set.iterator();
        while (it.hasNext() && numberOfClosest > 0){
            list.add(it.next());
            numberOfClosest--;
        }

        return list;
    }
}
