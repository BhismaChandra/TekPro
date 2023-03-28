public class Inventori {
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStock() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStock() + ")");
	}
	
	void pengadaan() {
		initBarang();
		barangs[0].addStock (20); //stok ditambah 20
		}

	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
		beli.showBarang(); //tampilkan setelah dipengadaan
		
	}
}