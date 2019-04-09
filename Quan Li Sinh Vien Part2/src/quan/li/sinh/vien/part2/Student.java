/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.sinh.vien.part2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {

    /**
     * @return the Maso
     */
    public String getMaso() {
        return Maso;
    }

    /**
     * @param Maso the Maso to set
     */
    public void setMaso(String Maso) {
        this.Maso = Maso;
    }

    /**
     * @return the Hoten
     */
    public String getHoten() {
        return Hoten;
    }

    /**
     * @param Hoten the Hoten to set
     */
    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    /**
     * @return the Lop
     */
    public String getLop() {
        return Lop;
    }

    /**
     * @param Lop the Lop to set
     */
    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    /**
     * @return the CMND
     */
    public String getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    /**
     * @return the Ngaysinh
     */
    public String getNgaysinh() {
        return Ngaysinh;
    }

    /**
     * @param Ngaysinh the Ngaysinh to set
     */
    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    /**
     * @return the DiemChuyenNganh
     */
    public double getDiemChuyenNganh() {
        return DiemChuyenNganh;
    }

    /**
     * @param DiemChuyenNganh the DiemChuyenNganh to set
     */
    public void setDiemChuyenNganh(double DiemChuyenNganh) {
        this.DiemChuyenNganh = DiemChuyenNganh;
    }

    private String Maso, Hoten, Lop, CMND;
    private String Ngaysinh;
    private double DiemChuyenNganh;

    public Student() {
    }

    public Student(String maso, String hoten, String lop, String cmnd, String sinhngay, double diemchuyennganh) {
        this.CMND = cmnd;
        this.Hoten = hoten;
        this.Lop = lop;
        this.Maso = maso;
        this.DiemChuyenNganh = diemchuyennganh;
        this.Ngaysinh = sinhngay;
    }

    public void Input() {
//        System.out.print("\n Nhap vao Ma so :");
//        Maso = new Scanner(System.in).nextLine();
        System.out.print("\n Nhap vao Ho ten :");
        Hoten = new Scanner(System.in).nextLine();
        System.out.print("\n Nhap vao CMND :");
        CMND = new Scanner(System.in).nextLine();
        System.out.print("\n Nhap vao lOP :");
        Lop = new Scanner(System.in).nextLine();
        boolean checkDCN;
        do {
            checkDCN = true;
            try {
                System.out.print("\n Nhap vao Diem chuyen nganh :");
                DiemChuyenNganh = Double.parseDouble(new Scanner(System.in).nextLine());
                if (DiemChuyenNganh < 0 || DiemChuyenNganh > 10) {
                    checkDCN = false;
                    System.out.print("\n  Diem chuyen nganh khong hop le! ");
                }

            } catch (Exception ex) {
                checkDCN = false;
            }
        } while (checkDCN == false);
        System.out.printf("\n Nhap vao ngay sinh:");
        Ngaysinh = new Scanner(System.in).nextLine();

    }

    public void Export() {
        System.out.print("\n Ma so :" + Maso);
        System.out.print("\n Ho ten :" + Hoten);
        System.out.print("\n CMND :" + CMND);
        System.out.print("\n Lop :" + Lop);
        System.out.print("\n Ngay sinh :" + Ngaysinh);
        System.out.print("\n Diem chuyen Nganh :" + DiemChuyenNganh);
    }
}
