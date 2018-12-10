package nl.hva.ss;

public class Brute {

    public static void main(String[] args) {
        String txtString = "AMSTERDAM";
        String patString = "DAM";

        char[] pat = patString.toCharArray();
        char[] txt = txtString.toCharArray();

        int M = pat.length;
        int N = txt.length;
        int comparisons = 0;

        for(int i=0;i<=N-M;i++) {
            int j;
            for(j=0;j<M;j++) {
                if(txt[i+j] != pat[j]) {
                    break;
                }
            }
            if(j == M) {
                System.out.println("found: "+i);
                return;
            }
        }
        System.out.println("not found " + N);
    }
}
