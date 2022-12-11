package bai_11;

import java.util.Objects;
import java.util.Scanner;

public abstract class GiangVien implements IGiangVien{
    private String name;
    private String address;
    private int type;
    private int soTietDay;
    private int donGia;
    private double thuNhap;
    private int luongCB;
    private float hsLuong;
    private int phuCap;
    private int namCongTac;

    public GiangVien(String name, String address, int type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public float getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(float hsLuong) {
        this.hsLuong = hsLuong;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }

    public int getNamCongTac() {
        return namCongTac;
    }

    public void setNamCongTac(int namCongTac) {
        this.namCongTac = namCongTac;
    }

    @Override
    public void input(Scanner s) {
        System.out.print("Name: ");
        this.name = s.nextLine();
        System.out.print("Address: ");
        this.address = s.nextLine();
        System.out.println("The type of GiangVien");
        System.out.println("1. Giang vien thinh giang");
        System.out.println("2. Giang vien co huu");
        do {
            System.out.print("Type: ");
            this.type = Integer.parseInt(s.nextLine());
            if (this.type != 1 && this.type != 2) {
                System.out.println("The choose is not correct! Please re-enter: ");
            }
        } while (this.type != 1 && this.type != 2);
        if (Objects.equals(type, 1)){
            System.out.println("So tiet day: ");
            this.soTietDay = Integer.parseInt(s.nextLine());
            System.out.println("Don gia: ");
            this.donGia = Integer.parseInt(s.nextLine());
            this.thuNhap = 0.15 * this.soTietDay * this.donGia;
        }
        else{
            System.out.println("Luong co ban: ");
            this.luongCB = Integer.parseInt(s.nextLine());
            System.out.println("He so luong: ");
            this.hsLuong = Float.parseFloat(s.nextLine());
            if (this.namCongTac < 5){
                this.phuCap = 0;
            }
            else {
                this.phuCap = (this.namCongTac / 100) * this.luongCB;
            }
        }

    }
    public abstract double countSalary();
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type + '\'' + ", Salary: " +this.countSalary();
    }

    public void output(){
        System.out.println(toString());
    }
}
