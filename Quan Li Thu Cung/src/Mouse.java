
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
public class Mouse extends  Animal {

    /**
     * @return the Color
     */
    public int getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(int Color) {
        this.Color = Color;
    }
     private int Color;
     public Mouse(){}
     public Mouse(String name,int tuoi ,double cannang,int mausac)
     {
         super(name,tuoi,cannang);
         Color=mausac;    
     }
     public void Input()
     {
         super.Input();
           System.out.println("1.Mau Nau");
          System.out.println("1.Mau vang");
           System.out.println("1.Mau trang");
           setColor(new Scanner(System.in).nextInt());     
     }
     public void Export()
     {
         super.Export();
         System.out.println("Mau sac :"+ getColor());
         System.out.println("Tien thuc an :"+this.MoneyEat());
     }
     //override
     public double MoneyEat()
     {
         if(getColor()==3)
         {
             return super.getWeight()*0.02;
         }
         return (super.getWeight()+super.getAge())*0.02;
     }
}
