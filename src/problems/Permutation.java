package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) throws Exception {
        String st = "BCDE";
        StringBuffer strbf = new StringBuffer(st);
        perm(strbf, st.length());

    }
    private static void perm (StringBuffer st, int index) {
        if (index <= 0)
            System.out.println(st);
        else {// recursively solve this by placing all other charts at current first pos
            perm(st, index - 1);
            int currPos = st.length() - index;
            for (int i = currPos + 1; i < st.length(); i++) {
                //start swapping all other chars with current first char
                swap(st, currPos, i);
                perm(st, index - 1);
                swap(st, i, currPos);
                // restore back my string buffer
            }

        }

    }
     private  static void swap(StringBuffer st, int pos1, int pos2){
        char t1 = st.charAt(pos1);
        st.setCharAt(pos1, st.charAt(pos2));
        st.setCharAt(pos2, t1);

        }
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }

