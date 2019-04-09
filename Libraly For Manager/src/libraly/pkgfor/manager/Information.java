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
public class Information {
     private  String  CMND;
     private  String Hoten;
     private communications Thongtinlienlac=new communications();
     public Information(){}

    public Information(String CMND, String Hoten,communications lienlac) {
        this.CMND = CMND;
        this.Hoten = Hoten;
        this.Thongtinlienlac=lienlac;
    }

    public String getCMND() {
        return CMND;
    }

    public String getHoten() {
        return Hoten;
    }

    public communications getThongtinlienlac() {
        return Thongtinlienlac;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setThongtinlienlac(communications Thongtinlienlac) {
        this.Thongtinlienlac = Thongtinlienlac;
    }
    public  void Input()
            
    {
//        System.out.print("\n Nhap vao CMND :");
//        CMND=new Scanner(System.in).nextLine();
         System.out.print("\n Nhap vao Ho ten :");
        Hoten=new Scanner(System.in).nextLine();
        Thongtinlienlac.Input();
    }
    public  void Export()
    {
        System.out.print("\n CMND :"+CMND);
        System.out.print("\n Ho ten :"+Hoten);
        System.out.print("\n -- Thong Tien Lien He --- \n");
        Thongtinlienlac.Export();
    }
     
}
