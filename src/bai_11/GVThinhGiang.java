package bai_11;
import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
    public GVThinhGiang(String name, String address, int type) {
        super(name, address, type);
    }

    @Override
    public void input(Scanner s) {
        super.input(s);
    }
    public String toString(){
        return super.toString();
    }

    @Override
    public void output() {
        super.output();
    }

    @Override
    public double countSalary() {
        return this.getSoTietDay() * this.getDonGia() - this.getThuNhap();
    }
}
