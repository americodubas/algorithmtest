class GDC {

    static int get(int[] given) {
        int smallest = getSmallest(given);
        for (int div = smallest; div >= 1; div--) {
            int i = 0;
            for (; i < given.length; i++) {
                if (given[i] % div != 0) {
                    break;
                }
            }
            if (i == given.length) {
                return div;
            }
        }

        return 1;
    }

    private static int getSmallest(int[] given) {
        int smallest = given[0];
        for (int i : given) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

}
