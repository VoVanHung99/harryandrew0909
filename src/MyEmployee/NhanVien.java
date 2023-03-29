/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEmployee;

import java.sql.Date;

/**
 *
 * @author Acer
 */
public class NhanVien {
    private String msnv,hoten,sdt,diachi,email,phongban,chucvu,luong;
    private int gioitinh;
    private Date ngaysinh;
    private byte[] img;

    public NhanVien() {
    }

    public NhanVien(String msnv, String hoten, String sdt, String diachi, String email, String phongban, String chucvu, String luong, int gioitinh, Date ngaysinh, byte[] img) {
        this.msnv = msnv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.email = email;
        this.phongban = phongban;
        this.chucvu = chucvu;
        this.luong = luong;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.img = img;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    

    public String getMsnv() {
        return msnv;
    }

    public void setMsnv(String msnv) {
        this.msnv = msnv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
