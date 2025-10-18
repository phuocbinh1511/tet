package com.mycompany.thtuan5;

public class SachGiaoTrinh extends sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public void hienThiThongTin() {
        System.out.println("===== SÁCH GIÁO TRÌNH =====");
        // Gọi lại phương thức lớp cha để in đủ 5 thuộc tính
        super.hienThiThongTin();
        System.out.println("Môn học: " + monHoc);
        System.out.println("Cấp độ: " + capDo);
        System.out.println("===========================");
    }
}
