/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thtuan5;

/**
 *
 * @author BINH
 */

// File: Sach.java
public class sach { 
    // Thuộc tính (để private thể hiện tính đóng gói - Encapsulation)
    private String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong; // ✅ Thêm thuộc tính mới

    // Constructor mặc định
    public sach() {
    }

    // Constructor đầy đủ tham số
    public sach(String maSach, String tieuDe, String tacGia, int namXuatBan,int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Getter và Setter (đóng gói dữ liệu)
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    // ✅ Getter và Setter cho soLuong
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("===== Thông tin sách =====");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong); // ✅ Thêm hiển thị số lượng
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        sach sach1 = new sach("B001", "Lập trình Java", "Nguyễn Văn A", 2022,5);
        sach sach2 = new sach("B002", "Cơ sở dữ liệu", "Trần Thị B", 2022,3);

        // Gọi phương thức hiển thị
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        // Tạo sách bằng constructor mặc định + setter
        sach sach3 = new sach();
        sach3.setMaSach("B003");
        sach3.setTieuDe("Cấu trúc dữ liệu");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2020);
        sach3.setSoLuong(10); // ✅ Gán giá trị cho số lượng

        sach3.hienThiThongTin();
    }
}
