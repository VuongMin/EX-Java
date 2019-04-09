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
public class Journal extends  Publication {
    
    private int Soanpham;
    public Journal(){}

    public Journal(int Soanpham, String Maso, String Tua, int Namxb, int Tinhtrang) {
        super(Maso, Tua, Namxb, Tinhtrang);
        this.Soanpham = Soanpham;
    }

    public int getSoanpham() {
        return Soanpham;
    }

    public void setSoanpham(int Soanpham) {
        this.Soanpham = Soanpham;
    }
    public void Input()
    {
        System.out.print("\n Nhap vao So an Pham :");
        Soanpham=Integer.parseInt(new Scanner(System.in).nextLine());
        super.Input();//In put of parent
    }
    public void Export()
    {
           System.out.print("\n  So an Pham :" +Soanpham);
           super.Export();
    }
}
