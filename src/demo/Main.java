package demo;

public class Main {
    public static void main(String[] args) {
        Staff[] C06 = new Staff[2];
            C06[0] = new StaffPartTime(8, "C06A", "Cuong", 24, 99999999, "Cuong.hm@gmail.com");
            C06[1] = new StaffPartTime(6, "C06B", "Quan", 22, 123456, "Quan.nv@gmail.com");
        Staff[] C05 = new Staff[2];
            C05[0] = new StaffFullTime(10, 1, 20, "CO5A", "HoangCuong",25, 6969696,"CuonghmGgmail.com");
            C05[1] = new StaffFullTime(9, 1, 20, "CO5B", "CuongHoang",26, 96969696,"Hmc@gmail.com");

        QuanLyNV kA = new QuanLyNV(C05,"Kieu Anh") ;
            kA.showAll();
            System.out.println(kA.tinhTongLuong());

        QuanLyNV quan = new QuanLyNV(C06, "Quan");
           quan.showAll();
           System.out.println(quan.tinhTongLuong());
    }

}
