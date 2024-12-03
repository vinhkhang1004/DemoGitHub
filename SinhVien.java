package Java;

public class SinhVien {
    private String ma;
    private String ten;
    private double diemTrungBinh;

    // Khởi tạo
    public SinhVien(String ma, String ten, double diemTrungBinh) {
        this.ma = ma;
        this.ten = ten;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Getter và Setter
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void showThongTin() {
        System.out.println("Ma sinh vien: " + ma);
        System.out.println("Ten sinh vien: " + ten);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("Xep loai: " + xepLoai());
    }

    public String xepLoai() {
        if (diemTrungBinh >= 8) {
            return "Gioi";
        } else if (diemTrungBinh >= 6.5) {
            return "Kha";
        } else if (diemTrungBinh >= 5) {
            return "Trung binh";
        } else if (diemTrungBinh >= 4) {
            return "Yeu";
        } else {
            return "Kem";
        }
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("MD1502", "Ngo Vinh Khang", 3);
        sv.showThongTin();
    }
}
