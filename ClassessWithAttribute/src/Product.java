
public class Product {
	//constuctor// aslında her bir classsın kendi ismiyle bir constructor ı varıdır //yapıcı method
	//ve bunlar newlendiğinde çalışır
	public Product(int id, String name,String description,double price, int stockAmount) {
		this.id=id;
		this.description=description;
		this.name=name;
		this.price=price;
		this.stockAmont=stockAmount;//bu yapıya overloading aşırı yükleme denir.
		
		
	}//yıkarıdakine parametrili constructor denir
	
	public Product() {//parametresiz contstructor
		
	};
	
	
	//attribute or field we say for this class
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmont;
	private String kod;
	
	
	
	//getter
	
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id = id;//this benim içerisinde bulunduğum class demektir this id bu classın id si demektir
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmont() {
		return stockAmont;
	}
	public void setStockAmont(int stockAmont) {
		this.stockAmont = stockAmont;
	}
	public String getKod() {
		return this.name.substring(0,1) + id ;
	}
	
	
	
	

}
