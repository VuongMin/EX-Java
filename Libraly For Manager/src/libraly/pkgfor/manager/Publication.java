/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraly.pkgfor.manager;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class Publication {

    protected String Maso, Tua;
    protected int Namxb;
    protected int Tinhtrang;

    public String getMaso() {
        return Maso;
    }

    public String getTua() {
        return Tua;
    }

    public int getNamxb() {
        return Namxb;
    }

    public int getTinhtrang() {
        return Tinhtrang;
    }

    public void setMaso(String Maso) {
        this.Maso = Maso;
    }

    public void setTua(String Tua) {
        this.Tua = Tua;
    }

    public void setNamxb(int Namxb) {
        this.Namxb = Namxb;
    }

    public void setTinhtrang(int Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    public Publication() {
    }

    public Publication(String Maso, String Tua, int Namxb, int Tinhtrang) {
        this.Maso = Maso;
        this.Tua = Tua;
        this.Namxb = Namxb;
        this.Tinhtrang = Tinhtrang;
    }
    //Method process
    Scanner sc = new Scanner(System.in);

    public void Input() {
//        System.out.print("\n Nhap vao  Ma An pham :");
//        Maso = sc.nextLine();
        System.out.print("\n Nhap vao  Tua :");
        Tua = sc.nextLine();
        System.out.print("\n Nhap vao  Nam xuat ban :");
        Namxb = Integer.parseInt(sc.nextLine());
        System.out.print("\n Nhap vao  Tinh Trang:");
        Tinhtrang = Integer.parseInt(sc.nextLine());
    }

    public void Export() {
        System.out.print("\n   Ma An pham :" + Maso);
        System.out.print("\n   Tua :" + Tua);
        System.out.print("\n Nam xuat ban  :" + Namxb);
        if (Tinhtrang == 1) {
            System.out.print("\n Tinh trang  : Con hang.");
        } else {
            System.out.print("\n Tinh trang  : Het.");
        }

    }

}
