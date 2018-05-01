class OneAway {

    static boolean of(String s1, String s2) {

        //fast return
        if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2 ) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int i1 = 0, i2 = 0, changes = 0;

        while (i1 < c1.length && i2 < c2.length) {

            if (c1[i1] != c2[i2]) {
                changes++;

                //check is next one from c2 is equal to current c1
                //to see if it is a remove or a change
                if (i2+1 < c2.length && c1[i1] == c2[i2+1]) {
                    //count as remove of c2[i2] and put the pointer forward
                    i2++;
                }
            }

            i1++;
            i2++;
        }

        //see the rest, don't need length - 1
        //because the end of the while loop will increment + 1
        if (i1 != c1.length){
            changes += c1.length - i1;
        }
        if (i2 != c2.length){
            changes += c2.length - i2;
        }

        return changes <= 1;
    }

}

