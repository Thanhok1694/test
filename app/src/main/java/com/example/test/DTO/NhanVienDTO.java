package com.example.test.DTO;

public class NhanVienDTO {
    public int maNV;
    public String tenNV;
    public int namSinh;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String tenNV, int namSinh) {
        this.tenNV = tenNV;
        this.namSinh = namSinh;
    }

    public NhanVienDTO(int maNV, String tenNV, int namSinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
