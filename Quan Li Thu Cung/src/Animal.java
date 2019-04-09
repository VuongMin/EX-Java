
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
 public abstract class Animal { //chuyen dung de ke thua thoi nhe .. khong the new ra duoc
    private String  Name;
    private  int age;
    private  double Weight;
    public  Animal (){}
    public Animal (String name,int tuoi ,double cannang)
    {
        this.age=tuoi;
        this.Name=name;
        this.Weight=cannang;
    }
    public  void Input()
    {
         System.out.println(" Nhap vao Ten:");
         setName(new Scanner(System.in).nextLine());
         System.out.println("Nhap vao Tuoi :");
         setAge(new Scanner(System.in).nextInt());
         System.out.println("Nhap vao can nang :");
         setWeight(new Scanner(System.in).nextDouble());      
    }
    public void Export()
    {
        System.out.println("Ten :"+this.getName());
         System.out.println("Tuoi :"+this.getAge());
          System.out.println("can nang :"+this.getWeight());
    }
         //Khai bao method astract 
     public  abstract  double MoneyEat();

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the Weight
     */
    public double getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    
}
