/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraly.pkgfor.manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Libraly {

    private static List<Loanslip> ListLoanslip = new ArrayList<Loanslip>();

    public Libraly() {
    }

    public static List<Loanslip> getListLoanslip() {
        return ListLoanslip;
    }

    public void setListLoanslip(List<Loanslip> ListLoanslip) {
        Libraly.ListLoanslip = ListLoanslip;
    }

    public  void Input() {
        int Luachon;
        do
        {
               System.out.print("\n------------------------- Menu -------------------");
                    System.out.print("\n1.Input Loansplit");
                    System.out.print("\n0. Exit");
                    System.out.print("\n----------------------------------------\t");
                    Luachon=new Scanner(System.in).nextInt();
                    if(Luachon==1)
                    {
                        String Maso;
                        boolean checkId;
                        do
                        {
                            checkId=true;
                            System.out.print("\n Nhap vao Ma phieu :");
                            Maso = new Scanner(System.in).nextLine();
                            for(int i =0;i<ListLoanslip.size();i++)
                            {
                                if(ListLoanslip.get(i).getMaso().equals(Maso))
                                {
                                    System.err.println("\n Ma so Bi trung roi!");
                                    checkId=false;
                                }
                            }
                        }while(checkId==false);
                        Loanslip x=new Loanslip();
                        x.Input();
                        x.setMaso(Maso);
                        ListLoanslip.add(x);
                    }
        }while(Luachon!=0);
                 
    }

    public void Export() {
        ListLoanslip.forEach((item) -> {
            item.Export();
        });
    }

}
