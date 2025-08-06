public class KMP {
    private final int R;
    private int[][] dfa;

    private String pat;

    public KMP(String pat) {
        this.R = 256;
        this.pat = pat;

        // build DFA from pattern
        int m = pat.length();
        dfa = new int[R][m];
        dfa[pat.charAt(0)][0] = 1;

        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][x];
            dfa[pat.charAt(j)][j] = j + 1;
            x = dfa[pat.charAt(j)][x];
        }
    }

    public int search(String txt) {
        // simulate operation of Dfa on text
        int m = pat.length();
        int n = txt.length();
        int i, j;
        for(i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if ( j== m) return i - m;
        return n;
    }

    public static void main(String[] args) {
        String pat = "abcd";
        String txt = "I love abc, then abcd is my best character";

        KMP kmp = new KMP(pat);
        int index = kmp.search(txt);

        System.out.println("text : " + txt);
        System.out.println("pattern : ");
        for(int i = 0; i <= index; i++) {
            System.out.print(" ");
        }
        System.out.println(pat);

        return;
    }
}
