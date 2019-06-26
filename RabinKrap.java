import java.util.Scanner;

class RabinKrap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();
        match(t, "12345", 13);

    }

    public static void match(String t, String p, int modulo) {
        int n = t.length();
        int m = p.length();
        int hashP = 0;
        int hashT = 0;
        int d = (int) Math.pow(10, m - 1);

        for (int i = 0; i < m; i++) {
            System.out.println(d);
            hashP += Integer.valueOf(p.substring(i, i + 1)) * d % modulo;
            int f = Integer.valueOf(t.substring(i, i + 1)) * d % modulo;
            hashT += f;
            d /= 10;
        }

        System.out.println(hashP % 13);
        System.out.println(hashT % 13);

    }

}