
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Cat extends  Animal {
     private String Style;
     public Cat(){}
     public Cat(String name,int tuoi ,double cannang,int mausac,String loai)
     {
         super(name,tuoi,cannang);
         Style =loai;
     }
     public void Input()
     {
         super.Input();
           System.out.println("Nhap vao Loai meo :");
           setStyle(new Scanner(System.in).nextLine());
          
           
             
     }
     public void Export()
     {
         super.Export();
         System.out.println("Loai meo :"+ getStyle());
           System.out.println("Tien thuc an :"+this.MoneyEat());
      
     }
     //override
     public double MoneyEat()
     {
         return (super.getWeight()-1)*0.04;
     }

    /**
     * @return the Style
     */
    public String getStyle() {
        return Style;
    }

    /**
     * @param Style the Style to set
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }
}