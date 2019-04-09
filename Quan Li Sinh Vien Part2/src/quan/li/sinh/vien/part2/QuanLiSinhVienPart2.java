/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.sinh.vien.part2;

/**
 *
 * @author Administrator
 */
public class QuanLiSinhVienPart2 {
/*
     Viết chương trình nhập dữ liệu danh sách các sinh viên có trong 1 lớp biết 
thông tin 1 sinh viên gồm có: Mã số, họ tên, lớp, ngày sinh, số CMND, điểm thi 
môn chuyên ngành. Hãy tìm ra sinh viên có điểm thi chuyên ngành cao nhất lớp, 
nếu có nhiều sinh viên có điểm thi chuyên ngành bằng nhau thì xuất ra tất cả các 
sinh viên đó theo thứ tự tăng dần của tên.
    */
    public static void main(String[] args) {
        // TODO code application logic here
              Lophoc lp=new Lophoc();
              lp.Input();
              lp.Export();
              System.out.printf("\n ==== Danh sach hoc sinh diem chuyen nganh cao nhat ========\n");
              lp.ExportMaxChuyenNganh();
    }
    
}
