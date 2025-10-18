package com.mycompany.thtuan5;

public class SachTieuThuyet extends sach {
    private String theLoai;
    private boolean laSachSeries;

public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
    super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
    this.theLoai = theLoai;
    this.laSachSeries = laSachSeries;
}


    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public void hienThiThongTin() {
        System.out.println("===== SÁCH TIỂU THUYẾT =====");
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Thuộc series: " + (laSachSeries ? "Có" : "Không"));
        System.out.println("============================");
    }
}
