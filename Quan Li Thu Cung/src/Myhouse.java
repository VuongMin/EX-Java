
import java.util.ArrayList;
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
public class Myhouse {
     private ArrayList<Animal> ListAni=new ArrayList<Animal>();

    /**
     * @return the ListAni
     */
    public ArrayList<Animal> getListAni() {
        return ListAni;
    }

    /**
     * @param ListAni the ListAni to set
     */
    public void setListAni(ArrayList<Animal> ListAni) {
        this.ListAni = ListAni;
    }
     public void Input()
     {
         int Luachon=0;
         do
         {
             System.out.println("1.Dog");
             System.out.println("2.Cat");
             System.out.println("3.Mouse");
             System.out.println("0.Exit");
             System.out.print("\n------------------------------------- \t");
             Luachon=new Scanner(System.in).nextInt();
             Animal ani ;
             if(Luachon==1)
             {
                 ani=new Dog();
                 ani.Input();
                 ListAni.add(ani);
             }else if(Luachon==2)
                 
             {
              ani=new Cat();  
                ani.Input();
                 ListAni.add(ani);
             }
             else if (Luachon==3)
             {
                 ani=new Mouse();
                   ani.Input();
                 ListAni.add(ani);
             }
         }while(Luachon!=0);
     }
     public void Export()
     {
          for(Animal item:ListAni)
          {
              System.out.print("\n -------------------------");
              item.Export();
          }
     }
}
