package Java;

class XeTai {
    private String tenChuXe;
    private String mauXe;
    private int soBanhXe;
    private float trongTai;

    public XeTai(String tenChuXe, float trongTai, int soBanhXe, String mauXe) {
        this.tenChuXe = tenChuXe;
        this.trongTai = trongTai;
        this.soBanhXe = soBanhXe;
        this.mauXe = mauXe;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    public int getSoBanhXe() {
        return soBanhXe;
    }

    public void setSoBanhXe(int soBanhXe) {
        this.soBanhXe = soBanhXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public void show() {
        System.out.println("Ten chu xe: " + tenChuXe);
        System.out.println("Trong tai: " + trongTai);
        System.out.println("So banh xe: " + soBanhXe);
        System.out.println("Mau xe: " + mauXe);
        System.out.println("Tien thue: " + tienThue());
    }

    public String tienThue() {
        if (trongTai > 10) {
            return "Nop 900";
        } else if (trongTai > 5) {
            return "Nop 800";
        } else if (trongTai > 3) {
            return "Nop 600";
        } else {
            return "Nop 500";
        }
    }
}

public class XT {
    public static void main(String[] args) {
        XeTai xt = new XeTai("Khang", 11.0f, 5, "Do");
        xt.show();
    }
}
