package day2.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("raja");
		c1.setCity("Chennai");
		System.out.println(c1.getCid());
		System.out.println(c1.getName());
		System.out.println(c1.getCity());
		System.out.println(c1);
		System.out.println(" ");
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setName("priya");
		c2.setCity("Bangalore");
		System.out.println(c2.getCid());
		System.out.println(c2.getName());
		System.out.println(c2.getCity());
		System.out.println(c2);
		
	}

}
