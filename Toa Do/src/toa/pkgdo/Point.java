/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toa.pkgdo;

/**
 *
 * @author Administrator
 */
public class Point {
    double x,y;
    public  Point(){}
    public  Point(double X,double Y)
    {
        x=X;
        y=Y;
    }
    public  double TinhKhoangcach(Point diem)
    {
        return (Math.sqrt((Math.pow(this.x, diem.x))+Math.pow(this.y,diem.y)));
    }
    
}
