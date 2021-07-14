package net.smallacademy.authenticatorapp;

public class Sinhvien {
    private String ten;
    private String masv;
    private int hinh;

    public Sinhvien(String ten, String masv, int hinh) {
        this.ten = ten;
        this.masv = masv;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
