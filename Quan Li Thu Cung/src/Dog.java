
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
public class Dog extends  Animal {
     private double height;
     private double Width;
     public Dog(){}
     public Dog(String name,int tuoi ,double cannang,int mausac,double chieucao,double chieudai)
     {
         super(name,tuoi,cannang);
         height=chieucao;
         Width=chieudai;
     }
     public void Input()
     {
         super.Input();
           System.out.println("Nhap vao chieu cao :");
           setHeight(new Scanner(System.in).nextDouble());
               System.out.println("Nhap vao dai :");
           setWidth(new Scanner(System.in).nextDouble());
           
             
     }
     public void Export()
     {
         super.Export();
         System.out.println("Chieu cao :"+ getHeight());
          System.out.println("Chieu cao :"+getWidth());
            System.out.println("Tien thuc an :"+this.MoneyEat());
     }
     //override
     public double MoneyEat()
     {
         return super.getWeight()*0.05;
     }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the Width
     */
    public double getWidth() {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(double Width) {
        this.Width = Width;
    }
}