package demo;

public class Staff {
    private String codeStaff;
    private String name;
    private int old;
    private int numberPhone;
    private String email;

    public Staff(){}
    public Staff(String codeStaff, String name, int old, int numberPhone, String email){
        this.codeStaff = codeStaff;
        this.name = name;
        this.old = old;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(String codeStaff) {
        this.codeStaff = codeStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public double tinhLuong(){
        return  0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "codeStaff='" + codeStaff + '\'' +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
