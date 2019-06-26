import java.util.Scanner;

class Hash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String values[] = sc.nextLine().split(" ");

        int hash = 0;

        for (int i = 0; i < values.length; i++) {
            int v = Integer.parseInt(values[i]);
            int e = (int) Math.pow(10, values.length - i - 1) * v % 13;
            hash += e;
            System.out.println(e);

        }

        System.out.println(hash % 13);

    }
}