/**
 * Calculate the area of overlapping rectangles
 * Receive two rectangles represented with [x1,y1,x2,y2]
 * where x1 and y1 equals to the lower point and x2 and y2 equals to the higher point
 * If they aren't overlapping return 0
 */
class AreaOverlappingRectangles {

    static int getArea(int[] r1, int[] r2) {
        int xDistance = getDistance(r1[0], r2[0], r1[2], r2[2]);
        if (xDistance <= 0) {
            return 0;
        }
        int yDistance = getDistance(r1[1], r2[1], r1[3], r2[3]);
        if (yDistance <= 0) {
            return 0;
        }
        return xDistance * yDistance;
    }


    /**
     * Calculate the distance getting the overlapping lower X or Y and the higher X or Y
     * @param r1LXY r1 lower X or Y
     * @param r2LXY r2 lower X or Y
     * @param r1HXY r1 higher X or Y
     * @param r2HXY r2 higher X or Y
     * @return distance
     */
    private static int getDistance(int r1LXY, int r2LXY, int r1HXY, int r2HXY) {
        return minimum(r1HXY, r2HXY) - maximum(r1LXY, r2LXY);
    }

    private static int maximum(int n1, int n2) {
        return (n1 > n2)? n1 : n2;
    }

    private static int minimum(int n1, int n2) {
        return (n1 < n2)? n1 : n2;
    }

}
