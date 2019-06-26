class LCS {

    public static void main(String[] args) {
        String x = "stone";
        String y = "slongest";

        Matcher.match(x, y);
    }

}

class Matcher {

    public static void match(String x, String y) {
        int b[][] = lcs(x, y);
        printLCS(b, x, y, x.length(), y.length());
        System.out.println();
    }

    private static void printLCS(int[][] b, String x, String y, int i, int j) {
        if (i == 0 || j == 0)
            return;
        if (b[i][j] == 0) {
            printLCS(b, x, y, i - 1, j - 1);
            System.out.print(x.charAt(i - 1));
        } else if (b[i][j] == 1) {
            printLCS(b, x, y, i - 1, j);
        } else
            printLCS(b, x, y, i, j - 1);
    }

    private static int[][] lcs(String x, String y) {
        int m = x.length();
        int n = y.length();
        int c[][] = new int[m + 1][n + 1];
        int b[][] = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = 0;
                } else {
                    if (c[i - 1][j] >= c[i][j - 1]) {
                        c[i][j] = c[i - 1][j];
                        b[i][j] = 1;
                    } else {
                        c[i][j] = c[i][j - 1];
                        b[i][j] = 2;
                    }
                }
            }
        }
        return b;
    }
}