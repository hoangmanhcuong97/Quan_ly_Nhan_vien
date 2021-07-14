package demo;

public class QuanLyNV {
//    private String Quanly;
    private Staff [] danhSachNV;
    private String name;

    public QuanLyNV(Staff[] danhSachNV, String name){
        this.danhSachNV = danhSachNV;
        this.name = name;
    }
    public Staff[] getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(Staff[] danhSachNV) {
        this.danhSachNV = danhSachNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAll(){
        for (Staff staff: danhSachNV) {
            System.out.println(staff); //goi phuong thuc toString()
        }
    }

    public double tinhTongLuong(){
         double sum = 0;
        for (Staff sumNV: danhSachNV) {
            sum += sumNV.tinhLuong();
        }
        return sum;
    }
}
