
public class Main {

	public static void main(String[] args) {
		
		
		int toplam1 =topla2(2,3,4);
		System.out.println(toplam1);
		
	   }
	
	//bunlara void operasyon denir void burada emir vermek gibi bir şeydir bunu yap der 
	public static void ekle() {
		System.out.println("eklendi");
		
		
		
	}
	public static void sil() {
		System.out.println("silindi");
		
	}
	public static void guncelle() {
		System.out.println("Güncelle");
		
		
	}
	//return eden fonksiyonar ise bize bir değer döndürür
	
	public static int topla(int sayi1 , int sayi2) {
		return sayi1+sayi2;
		
	}public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
}
