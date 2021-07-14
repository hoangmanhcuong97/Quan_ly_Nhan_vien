package demo;

public class StaffFullTime extends Staff{
    private double tienThuong;
    private double tienPhat;
    private double luongCung;

    public StaffFullTime(){}

    public StaffFullTime(double tienThuong, double tienPhat, double luongCung, String codeStaff, String name, int old, int numberPhone, String email){
        super(codeStaff, name, old, numberPhone, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double tinhLuong() {
        return luongCung + tienThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
                "tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +
                '}';
    }
}
