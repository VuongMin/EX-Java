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
public class communications {
    private String Diachi,Dienthoai,Email;
    public communications(){}

    public communications(String Diachi, String Dienthoai, String Email) {
        this.Diachi = Diachi;
        this.Dienthoai = Dienthoai;
        this.Email = Email;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getDienthoai() {
        return Dienthoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     public  void Input()
     {
         System.out.print("\n Nhap vao Dia chi :");
          Diachi=new Scanner(System.in).nextLine();
          System.out.print("\n Nhap vao Dien thoai :");
          Dienthoai=new Scanner(System.in).nextLine();
          System.out.print("\n Nhap vao Email:");
          Email=new Scanner(System.in).nextLine();
     }
     public void Export()
     {
         System.out.print("\nDia chi :"+Diachi);
           System.out.print("\nDien thoai :"+Dienthoai);
             System.out.print("\nEmail :"+Email);
     }
    
}
