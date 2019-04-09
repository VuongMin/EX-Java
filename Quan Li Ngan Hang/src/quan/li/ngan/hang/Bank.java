/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.ngan.hang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bank {
    private List<Book> ArrBook= new ArrayList<Book>();
     public Bank(){}
    public void nhap() throws ParseException
    {
        int Luachon;
        do
        {
            System.out.print("\n -----------------------Menu------------------\n");
            System.out.print("\n1.Term");
             System.out.print("\n2.NonTerm");
              System.out.print("\n3.Exit");
               System.out.print("\n-----------------------------------------------\n");
                Luachon=Integer.parseInt(new Scanner(System.in).nextLine());
                Book sach;
                if(Luachon==1)
                {
                    sach=new Term();
                    sach.Input();
                    ArrBook.add(sach);
                    
                }else if(Luachon==2)                   
                {
                       sach=new NonTerm();
                    sach.Input();
                    ArrBook.add(sach);
                }          
        }while(Luachon!=0);
    }
    public void xuat()
    {
        for(Book item :ArrBook)            
        {
            System.out.print("\n-------------------------------------\n");
            item.Export();
        }
        System.out.print("\n Tong can tra :"+TongTienLai());
    }
     public double TongTienLai()
     {
         double Tong=0;
         for(Book item :ArrBook)
         {
             if(item  instanceof Term)                 
             {
                 Tong+=((Term)item).TinhLai();
             }
             else 
             {
                 Tong+=((NonTerm)item).TinhLai();
             }
         }
        return Tong;
     }
}
