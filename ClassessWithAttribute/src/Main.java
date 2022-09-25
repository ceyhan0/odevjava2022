
public class Main {

	public static void main(String[] args) {
		
		
		
		Product product1 = new Product(1,"laptop","Asus laptop",500,50 );
		
		//aşağıdaki gibi yazmak yerine constructor bloğundan set edebiliriz
		//veya ikisini de kullanabiliriz onun içinde parametresiz contsturtor kullanılır
		Product product=new Product();
		
		
		product.setName("laptop");
		product.setId(1);;
		product.setStockAmont(20);;
		product.setDescription("Asus laptop");
	
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
	}
	

}
