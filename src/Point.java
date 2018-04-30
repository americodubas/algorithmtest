public class Point implements Comparable<Point> {
    private int x;
    private int y;
    private double distance;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = calculateDistance(x, y);
    }

    /**
     * PYTHAGOREAN THEOREM
     * To calculate the distance of x and y to origin [0, 0]
     */
    static double calculateDistance(int x, int y) {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }

    @Override
    public int compareTo(@SuppressWarnings("NullableProblems") Point o) {
        return Double.compare(this.distance, o.distance);
    }
}
