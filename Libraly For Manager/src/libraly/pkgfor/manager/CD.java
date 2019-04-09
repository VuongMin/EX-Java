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
public class CD extends Publication{
    private String Nhaxuatban;
    private String Noidung;
    public  CD(){}

    public CD(String Nhaxuatban, String Noidung, String Maso, String Tua, int Namxb, int Tinhtrang) {
        super(Maso, Tua, Namxb, Tinhtrang);
        this.Nhaxuatban = Nhaxuatban;
        this.Noidung = Noidung;
    }


    public String getNhaxuatban() {
        return Nhaxuatban;
    }

    public void setNhaxuatban(String Nhaxuatban) {
        this.Nhaxuatban = Nhaxuatban;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }

    public String getNoidung() {
        return Noidung;
    }
    
    public   void Input()
    {
        System.out.print("\n Nhap vao ten  Nha xua ban :");
        Nhaxuatban=new Scanner(System.in).nextLine();
        System.out.print("\n Nhap vao Noi dung :");
        Noidung=new Scanner(System.in).nextLine();
        super.Input();
    }

    public void Export()
    {
     System.out.print("\n Ten nha xuat ban :"+Nhaxuatban);
     System.out.print("\n Noi dung :"+Noidung);
     super.Export();
    }
}
