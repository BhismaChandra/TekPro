public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; //dibuat menjadi variabel private supaya tidak dapat diakses langsung oleh kelas lain

	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	public void addStock(int n) {
	//method untuk menambahakan nilai stok dengan nilai yang diberikan
		stok += n;
	}
	
	public int getStock() {
		return stok;
	}
}
