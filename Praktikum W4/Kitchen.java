public class Kitchen {
	private String[] namaMakanan;
	private double[] hargaMakanan;
	private int[] stok;
	private static byte id = 0;
	
	public Kitchen() {
		namaMakanan = new String[10];
		hargaMakanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan (String nama, double harga, int stok) {
		this.namaMakanan[id] = nama;
		this.hargaMakanan[id] = harga;
		this.stok[id] = stok;
		id++;
	}
	
	public boolean isOutOfStock(byte id) {
		if (stok[id] == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void useStock(byte id, byte minus) {
		stok[id] -= minus;
	}
	
	 public byte getId() {
		 return id;
	 }
	 
	 public String getNamaMakanan(byte id){
		 return namaMakanan[id];
	 }
	 
	 public int getStok(byte id) {
		 return stok[id];
		 }
	 
	 public double getHargaMakanan(byte id) {
		 return hargaMakanan[id];
	 }
}
