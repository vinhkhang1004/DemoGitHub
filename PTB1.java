package Java;

class PhuongTrinhBacNhat {
    float a;
    float b;

    public PhuongTrinhBacNhat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PTVSN");
            } else {
                System.out.println("PTVN");
            }
        } else {
            float x = -b / a;
            System.out.println("Nghiem cua pt la: " + x);
        }
    }

    public void output() {
        System.out.println(a + "x + " + b + "=0");
    }
}

public class PTB1 {
    public static void main(String[] args) {
        PhuongTrinhBacNhat pt = new PhuongTrinhBacNhat(2, 6);
        pt.output();
        pt.giaiPT();
    }
}
