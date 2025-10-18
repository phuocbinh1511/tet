package com.mycompany.thtuan5;

import java.util.ArrayList;

public class QuanLySach {
    private final ArrayList<sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách mới
    public void themSach(sach s) {
        danhSach.add(s);
        System.out.println("✅ Đã thêm sách: " + s.getTieuDe());
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        sach sachXoa = timKiemTheoMa(maSach);
        if (sachXoa != null) {
            danhSach.remove(sachXoa);
            System.out.println("❌ Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("⚠ Không tìm thấy sách có mã: " + maSach);
        }
    }

    // Cập nhật thông tin sách
    public void capNhatSach(String maSach, sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                System.out.println("♻ Đã cập nhật sách có mã: " + maSach);
                return;
            }
        }
        System.out.println("⚠ Không tìm thấy sách có mã: " + maSach);
    }

    // Tìm kiếm theo mã sách
    public sach timKiemTheoMa(String maSach) {
        for (sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị danh sách sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("📭 Danh sách sách trống!");
        } else {
            System.out.println("📚 DANH SÁCH CÁC SÁCH:");
            for (sach s : danhSach) {
                s.hienThiThongTin();
                System.out.println("--------------------");
            }
        }
    }
}
