package com.mycompany.thtuan5;

public class test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số (đã thêm số lượng)
        sach sach1 = new sach("B001", "Lập trình Java", "Nguyễn Văn A", 2022, 5);
        sach sach2 = new sach("B002", "Cơ sở dữ liệu", "Trần Thị B", 2022, 3);

        // Gọi phương thức hiển thị
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        // Tạo sách bằng constructor mặc định + setter
        sach sach3 = new sach();
        sach3.setMaSach("B003");
        sach3.setTieuDe("Cấu trúc dữ liệu");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2020);
        sach3.setSoLuong(10); // Gán số lượng
        sach3.hienThiThongTin();

        // --- PHẦN MỚI (Tuần 6) ---
        System.out.println("\n===== PHẦN QUẢN LÝ SÁCH =====");
        QuanLySach ql = new QuanLySach();

        // Thêm các sách cơ bản vào danh sách quản lý
        ql.themSach(sach1);
        ql.themSach(sach2);
        ql.themSach(sach3);

        // Thêm các loại sách khác (Sách giáo trình & tiểu thuyết)
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT001", "Nhập môn lập trình", "Nguyễn Văn D", 2021, 15, "CNTT", "Đại học");
        SachTieuThuyet tth = new SachTieuThuyet("TT001", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 1950, 20, "Thiếu nhi", false);

        ql.themSach(sgk);
        ql.themSach(tth);

        // Hiển thị danh sách tất cả sách
        System.out.println("\n--- Danh sách các sách hiện có ---");
        ql.hienThiDanhSach();

        // Tìm kiếm theo mã
        System.out.println("\nTìm sách có mã GT001:");
        sach timThay = ql.timKiemTheoMa("GT001");
        if (timThay != null) timThay.hienThiThongTin();
        else System.out.println("Không tìm thấy sách!");

        // Cập nhật thông tin sách
        System.out.println("\nCập nhật thông tin sách B002...");
        ql.capNhatSach("B002", new sach("B002", "Cơ sở dữ liệu nâng cao", "Trần Thị B", 2023, 8));

        // Hiển thị lại danh sách sau cập nhật
        System.out.println("\n--- Danh sách sau khi cập nhật ---");
        ql.hienThiDanhSach();

        // Xóa sách
        System.out.println("\nXóa sách có mã B003...");
        ql.xoaSach("B003");

        // Hiển thị danh sách sau khi xóa
        System.out.println("\n--- Danh sách sau khi xóa ---");
        ql.hienThiDanhSach();
    }
}
