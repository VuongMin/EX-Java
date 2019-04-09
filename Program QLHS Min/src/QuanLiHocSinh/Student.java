package QuanLiHocSinh;
public class Student {
	private double Toan,Van;
    private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student() {}
	public Student(double Math,double literature,String hoten)
	{
		Toan=Math;
		Van=literature;
		Name=hoten;
	}

	public double getToan() {
		return Toan;
	}
	public void setToan(double toan) {
		Toan = toan;
	}
	public double getVan() {
		return Van;
	}
	public void setVan(double van) {
		Van = van;
	}
	
	public double TinhDiemTrungBinh()
	{
		return getToan()+getVan()/2.0;
	}
	public void Out()
	{
		System.out.print("\n Ho Ten :"+getName());
		System.out.print("\n Diem toan :"+getToan());
		System.out.print("\n Diem Van :"+getVan());
		System.out.print("\n Diem Trung Binh :"+this.TinhDiemTrungBinh());
		
	}
	
}
