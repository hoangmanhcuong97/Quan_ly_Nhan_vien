package demo;

public class StaffPartTime extends Staff{
    private double hour;

    public StaffPartTime(){
    }
    public StaffPartTime(double hour, String codeStaff, String name, int old, int numberPhone, String email){
        super(codeStaff, name, old, numberPhone, email);
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double tinhLuong() {
        return hour*100000;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                "hour=" + hour +
                '}';
    }
}
