public class Jmem {

    public static int recAdd(int x) {
        x++;
        if (x < 11) {
            x+=recAdd(x);
        }
        return x;
    }
    public static void main(String[] args) {
        int n = 36;
        n = n >> 2;
        System.out.println(n);
        int r = recAdd(n); System.out.println(r);
    }

}
