/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEmployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ketnoi.sqlConnect;

/**
 *
 * @author Acer
 */
public class Model {
    public  boolean add(NhanVien nv) throws Exception{
        String sql = "insert into Employee(msnv,ht,gt,ns,sdt,dc,email,cv,pb,luong,img) values(?,?,?,?,?,?,?,?,?,?,?)";
        try(
            Connection con = sqlConnect.ketnoiSQL();
            PreparedStatement pr = con.prepareStatement(sql);
            ){
            pr.setString(1,nv.getMsnv());
            pr.setString(2,nv.getHoten());
            pr.setInt(3,nv.getGioitinh());
            pr.setDate(4,nv.getNgaysinh());
            pr.setString(5,nv.getSdt());
            pr.setString(6,nv.getDiachi());
            pr.setString(7,nv.getEmail());
            pr.setString(8,nv.getChucvu());
            pr.setString(9,nv.getPhongban());
            pr.setString(10,nv.getLuong());
            pr.setBytes(11, nv.getImg());

            
            return pr.executeUpdate()>0; 
        }
    }
    public List load()throws Exception{
        String sql ="select * from Employee";
        try(
                Connection con = sqlConnect.ketnoiSQL();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            List<NhanVien> l = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMsnv(rs.getString("msnv"));
                nv.setHoten(rs.getString("ht"));
                nv.setDiachi(rs.getString("dc"));
                nv.setEmail(rs.getString("email"));
                nv.setGioitinh(rs.getInt("gt"));
                nv.setNgaysinh(rs.getDate("ns"));
                nv.setSdt(rs.getString("sdt"));
                nv.setPhongban(rs.getString("pb"));
                nv.setChucvu(rs.getString("cv"));
                nv.setLuong(rs.getString("luong"));
                nv.setImg(rs.getBytes("img"));
                l.add(nv);
            }
                     
            return l; // >0 là thành công
        }
    }
    public boolean capnhat(NhanVien nv) throws Exception{
        String sql="update Employee set msnv = ?,ht = ?,gt = ?,email = ?,ns = ?,sdt = ?,dc = ?,pb = ?,cv = ?,luong = ?, img=? where msnv = ?";
        try(
                Connection con = sqlConnect.ketnoiSQL();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            pr.setString(12, nv.getMsnv());
            pr.setString(1, nv.getMsnv());// 1 tương ứng với ? đầu tiên trong câu truy v
            pr.setString(2, nv.getHoten());
            pr.setInt(3, nv.getGioitinh());
            pr.setString(4, nv.getEmail());
            pr.setDate(5, nv.getNgaysinh());
            pr.setString(6, nv.getSdt());
            pr.setString(7, nv.getDiachi());
            pr.setString(8, nv.getPhongban());
            pr.setString(9, nv.getChucvu());
            pr.setString(10, nv.getLuong());
            pr.setBytes(11, nv.getImg());
            
            
            return pr.executeUpdate() > 0; // >0 là thành công
        }
    }
    public boolean xoa(NhanVien nv) throws Exception{
        String sql = "delete Employee where msnv = ?";
        try (
                Connection con = sqlConnect.ketnoiSQL();
                PreparedStatement pr = con.prepareStatement(sql);
            ) {
                pr.setString(1,nv.getMsnv());
                return pr.executeUpdate() > 0;
            }
    }
}
