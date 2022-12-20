package welcome;
import java.util.*;
public class productName {
	class Product
	{
	     String name;
		 float price;
		 int qty;
		 float bill,disc,nbill;
	}
	class Rect
	{
		public  void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			Product p=new Product();
		
			System.out.print("product name: ");
			String name=sc.nextLine();
			System.out.print("price:");
			float price=sc.nextFloat();
			System.out.print("quantity");
			int qty=sc.nextInt();
	       
	         p.bill=p.price*p.qty;
			p.disc=p.bill*5/100;
			p.nbill=p.bill-p.disc;
			
			System.out.println("Product name : "+p.name+"Price : "+p.price+"Quantity : "+p.qty+"Bill : "+p.bill+"Discount : "+p.disc+"Net bill : "+p.nbill);
			}
	}

}

