/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.sinh.vien.part2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lophoc {
    private ArrayList<Student> arr=new ArrayList<>();
    public ArrayList<Student> getArr() {
        return arr;
    }
    public void setArr(ArrayList<Student> arr) {
        this.arr = arr;
    }
    public void Input()
    {
        int Luachon=0;
        do
        {
              System.out.printf("\n-------------Menu--------------\n");
          System.out.printf("\n1.Input");
            System.out.printf("\n0.Exit.");
              System.out.printf("\n-------------<>--------------\n");
              Luachon=Integer.parseInt(new Scanner(System.in).nextLine());
              String maso;
              boolean checkID;
              do
              {
                  checkID=true;
                   System.out.print("\n Nhap vao Ma so :");
                     maso = new Scanner(System.in).nextLine();
                     for(Student item:arr )
                     {
                         if(item.getMaso().equals(maso))
                         {
                             checkID=false;
                             System.out.printf("\n Ma so bi trung !");
                         }
                     }
              }while(checkID==false);
              if(Luachon==1)
              {
                  Student hs=new Student();
                  hs.Input();
                  hs.setMaso(maso);
                  arr.add(hs);
              }
        }while(Luachon!=0);      
    }
    public void Export()
    {
        //Vong lap forech trong java ne...
        for(Student item :arr )
        {
            System.out.print("\n----------------------------\n");
            item.Export();
        }
    }
    public double MaxChuyenNganh()
    {
        double max=arr.get(0).getDiemChuyenNganh();
       int size=arr.size();
       for(int i=1;i<size;i++)
       {
           if(max<arr.get(i).getDiemChuyenNganh())
           {
               max=arr.get(i).getDiemChuyenNganh();
           }
       }
       return max;
    }
    public void ExportMaxChuyenNganh()
    {
        double Maxchuyennganh=this.MaxChuyenNganh();
        for(Student item:arr)
        {
            if(item.getDiemChuyenNganh()==Maxchuyennganh)
            {
                item.Export();
            }
        }
    }
    
}
