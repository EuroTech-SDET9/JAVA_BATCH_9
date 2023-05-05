package days.day28;

public class HasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }

    //    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//    such as with "badxxx" or "xbadxx" but not "xxbadxx".
//    The string may be any length, including 0. Note: use .equals() to compare 2 strings.//
//
//            hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false


    public static boolean hasBad(String str) {
        boolean result = false;
        if (str.length() < 3) {
            result = false;
        } else {
//            if (str.startsWith("bad")) {
//                result = true;
//            }
//            if (str.substring(1, 4).equals("bad")) {
//                result = true;
//            }
            if (str.contains("bad")) {
                if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1) {
                    result = true;
                }
            }


        }
        return result;
    }
}
