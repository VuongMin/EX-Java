/*/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package libraly.pkgfor.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Loanslip {

    private String Maso;
    private Date Ngaymuon = new Date();
    private Date Ngaytra = new Date();
    private Information ThongTinNguoiMuon = new Information();
    private Publication TypeBook;//vi day la astract nen khong new moi duoc

    public Loanslip() {
    }

    public Loanslip(String Maso, Publication TypeBook, Date ngaymuon, Date ngaytra) {
        this.Maso = Maso;
        this.TypeBook = TypeBook;
        this.Ngaymuon = ngaymuon;
        this.Ngaytra = ngaytra;
    }

    public String getMaso() {
        return Maso;
    }

    public Date getNgaymuon() {
        return Ngaymuon;
    }

    public Date getNgaytra() {
        return Ngaytra;
    }

    public Information getThongTinNguoiMuon() {
        return ThongTinNguoiMuon;
    }

    public Publication getTypeBook() {
        return TypeBook;
    }

    public void setMaso(String Maso) {
        this.Maso = Maso;
    }

    public void setNgaymuon(Date Ngaymuon) {
        this.Ngaymuon = Ngaymuon;
    }

    public void setNgaytra(Date Ngaytra) {
        this.Ngaytra = Ngaytra;
    }

    public void setThongTinNguoiMuon(Information ThongTinNguoiMuon) {
        this.ThongTinNguoiMuon = ThongTinNguoiMuon;
    }

    public void setTypeBook(Publication TypeBook) {
        this.TypeBook = TypeBook;
    }

    @SuppressWarnings("empty-statement")
    public void Input()
   {

//        System.out.print("\n Nhap vao Ma phieu :");
//        Maso = new Scanner(System.in).nextLine();
        System.out.print("\nNhap vao Ngay Muon :");
        try {
            this.Ngaymuon = new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Loanslip.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean checkNgay;
        do {
            checkNgay = true;
            System.out.print("\nNhap vao Ngay tra :");
            try {
                this.Ngaytra = new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).nextLine());
                if (Ngaytra.getTime() < Ngaymuon.getTime()) {
                    System.out.print("\n Ngay tra phai lon hon ngay muon");
                    checkNgay=false;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Loanslip.class.getName()).log(Level.SEVERE, null, ex);
                  checkNgay=false;
            }
         

        }   while (checkNgay == false);
        //Kiem tra cmnd
        String CMND;
        boolean CheckCMND;
        do
        {
            CheckCMND=true;
                 System.out.print("\n Nhap vao CMND :");
                 CMND=new Scanner(System.in).nextLine();
                 for(int i=0;i<Libraly.getListLoanslip().size();i++)
                 {
                     if(Libraly.getListLoanslip().get(i).ThongTinNguoiMuon.getCMND().equals(CMND))
                     {
                         System.err.print("\nCMND bi trung Roi!");
                         CheckCMND=false;
                     }
                 }
                 
        }while(CheckCMND==false);

        ThongTinNguoiMuon.Input();
        ThongTinNguoiMuon.setCMND(CMND);
        
        System.out.print("\n -----------------------menu -------------");
        System.out.print("\n1.CD");
        System.out.print("\n2.Book");
        System.out.print("\n3.Tap chi");
        System.out.print("\n--------------------------------------------");
        int Luachon=new Scanner(System.in).nextInt();
        String Maso;
        boolean checkid;
        do
        {
            checkid=true;
              System.out.print("\n Nhap vao  Ma An pham :");
          Maso =new Scanner(System.in).nextLine();
          for(int i=0;i<Libraly.getListLoanslip().size();i++)
          {
              if(Libraly.getListLoanslip().get(i).TypeBook.getMaso().equals(Maso))
              {
                  System.out.print("\n Ma an pham bi trung !");
                  checkid=false;
              }
          }
        }while(checkid==false);
        
        if(Luachon==1)
        {
             TypeBook=new CD();
             TypeBook.Input();
             TypeBook.setMaso(Maso);
            
        }else if(Luachon==2)
        {
              TypeBook=new Book();
             TypeBook.Input();
             TypeBook.setMaso(Maso);
        }else if(Luachon==3)
        {
              TypeBook=new Journal();
             TypeBook.Input();
             TypeBook.setMaso(Maso);
        }
          
        
   }
        public void Export()
        {
            System.out.print("\nMa phieu :"+Maso);
            System.out.print("\nNgay muon :"+new SimpleDateFormat("dd/MM/yyyy").format(Ngaymuon));
            System.out.print("\nNgay Tra :"+new SimpleDateFormat("dd/MM/yyyy").format(Ngaytra));
            System.out.print("\n---------- Thong Tin Nguoi Muon ----------\n");
            ThongTinNguoiMuon.Export();
            if(TypeBook instanceof CD)              
            {
               System.out.print("\n -------------- CD --------------\n");
                 ((CD)TypeBook).Export();
            }
            else if(TypeBook instanceof Book)
                
            {
                System.out.print("\n --------------BOOK --------------\n");
                ((Book)TypeBook).Export();
            }
            else
            {
                System.out.print("\n -------------- Tap chi --------------\n");
                ((Journal)TypeBook).Export();
            }
            
        }
    
}
