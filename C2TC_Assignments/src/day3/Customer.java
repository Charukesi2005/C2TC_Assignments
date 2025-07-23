package day3;

public class Customer {
	private int cid;
	private String name;
	private String city;
	//default constructor
	public Customer()
	{
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Customer(int cid, String name, String city) {
		//this();//invoke the default constructor
        this(200,"kalaivani");
		this.cid = cid;
		this.name = name;
		this.city = city;
	}
	//Constructor overloading
	public Customer(int cid, String name) {
		this.cid = cid;
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
}


