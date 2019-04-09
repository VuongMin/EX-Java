/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraly.pkgfor.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Book extends Publication{
 private List<String> Dstacgia=new ArrayList<>();
 private String Nhaxuatban;

    public Book() {
    }

    public Book(String Maso, String Tua, int Namxb, int Tinhtrang) {
        super(Maso, Tua, Namxb, Tinhtrang);
    }

    public List<String> getDstacgia() {
        return Dstacgia;
    }

    public String getNhaxuatban() {
        return Nhaxuatban;
    }

    public void setDstacgia(List<String> Dstacgia) {
        this.Dstacgia = Dstacgia;
    }

    public void setNhaxuatban(String Nhaxuatban) {
        this.Nhaxuatban = Nhaxuatban;
    }

 @Override
     public  void Input()
     {
         int Luachon=0;
         do
         {
             
             System.out.print("\n1.Input Tac gia!");
             System.out.print("\n0.Exit");
                          System.out.print("\n-----------------------------\t");                          
             Luachon= Integer.parseInt(new Scanner(System.in).nextLine());
             if(Luachon==1)                 
             {
                              System.out.print("\nNhap ten tac gia :");
                String tacgia= new Scanner(System.in).nextLine();
                 Dstacgia.add(tacgia);
             }             
         }while(Luachon!=0);
             System.out.print("\n Nhap nha xuat ban :");
           Nhaxuatban=new Scanner(System.in).nextLine();
           super.Input();
                      
     }
 @Override
     public  void Export()
     {
         super.Export();
         System.out.print("\n Ten tac Gia :");
         for(String item :Dstacgia)
             
         {
             System.out.print (item+" - ");
         }
         System.out.println("\nNha xuat ban :"+Nhaxuatban);
     }
}
