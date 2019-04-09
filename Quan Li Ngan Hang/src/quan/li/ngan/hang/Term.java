/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.ngan.hang;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Term extends Book {

    private int Kyhan;

    public Term() {
        super();//goi lai construtor cua class cha
    }

    public Term(String cmnd, String name, Date ngaylapso, double laisuat, double tiengui, int kyhan) {
        super(cmnd, name, ngaylapso, laisuat, tiengui);
        Kyhan = kyhan;
    }

    public void Input() throws ParseException {
        super.Input();
        do {
            System.out.print("\n Nhap vao ky han gui:");
            Kyhan = Integer.parseInt(new Scanner(System.in).nextLine());
            if (Kyhan < 0) {
                System.out.printf("\n Ky han ko hop le!");
            }

        } while (Kyhan < 0);
    }

    public void Export() {
        super.Export();
        System.out.print("\n Ky han gui :" + Kyhan);
        System.out.print("\n Tien Lai :"+this.TinhLai());
    }

    public double TinhLai() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
         if(cal.getTime().getYear()-super.getDayCreateBook().getYear()>=Kyhan)
         {
             return super.getDeposits()*super.getInterest_rate()*Kyhan;
         }
        return 0;
    }

}
