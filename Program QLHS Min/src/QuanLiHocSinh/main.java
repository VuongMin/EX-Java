package QuanLiHocSinh;
import java.util.Scanner;;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hoten;
		double Toan= 0,Van=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Nhap ten cua ban :");
		Hoten=sc.nextLine();
		boolean checkToan;
		do
		{
			checkToan=true;
			System.out.print("\n Nhap vao Diem Toan:");
			try
			{
				Toan=Double.parseDouble(sc.nextLine());
				if(Toan<0||Toan>10)
				{
					checkToan=false;
					System.out.print("\n  Diem Toan Khong hop le!");
				}
			}
			catch(Exception ex)
			{
				checkToan=false;
				System.out.print("\nKieu du lieu khong hop le!");
			}
		
			 
		}while(checkToan==false);
		boolean checkVan;
		do
		{
			checkVan=true;
			System.out.print("\n Nhap vao Diem Van:");
			try
			{
				Van=Double.parseDouble(sc.nextLine());
				if(Van<0||Van>10)
				{
					checkVan=false;
					System.out.print("\n  Diem Van Khong hop le!");
				}
			}
			catch(Exception ex)
			{
				checkVan=false;
				System.out.print("\nKieu du lieu khong hop le!");
			}
		
			 
		}while(checkVan==false);
			
         Student Hs=new Student(Toan,Van,Hoten);
         Hs.Out();

	}

}
