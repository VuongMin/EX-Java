/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Administrator
 */
public class Phanso {

    /**
     * @return the Mauso
     */
    public int getMauso() {
        return Mauso;
    }

    /**
     * @param Mauso the Mauso to set
     */
    public void setMauso(int Mauso) {
        this.Mauso = Mauso;
    }

    /**
     * @return the Tuso
     */
    public int getTuso() {
        return Tuso;
    }

    /**
     * @param Tuso the Tuso to set
     */
    public void setTuso(int Tuso) {
        this.Tuso = Tuso;
    }
    
    private int Tuso,Mauso;
    public  Phanso(){}
    public  Phanso(int tu,int mau)
    {
        Tuso=tu;
        Mauso=mau;
    }
    public  String CheckPhanSo()
    {
        if(getTuso()/getMauso()<0)
        {
            return "Phan so Am.";
        }
        else if(getTuso()/getMauso()==0)
        {
            return "Phan so Bang khong.";
        }
        return "Phan so Duong.";
        
    }
}
