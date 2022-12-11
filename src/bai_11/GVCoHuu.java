package bai_11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien{
    public GVCoHuu(String name, String address, int type) {
        super(name, address, type);
    }
    public void input(Scanner s){
        super.input(s);
    }
    public String toString(){
        return super.toString();
    }
    public void output(){
        super.output();
    }

    @Override
    public double countSalary() {
        return this.getLuongCB() * this.getHsLuong() + this.getPhuCap();
    }
}
