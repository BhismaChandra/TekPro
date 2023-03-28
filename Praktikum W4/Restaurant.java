import java.util.Scanner;

public class Restaurant {
	private Kitchen menu;
	private int[] order;
	private double total;

	public Restaurant(Kitchen menu) {
		this.menu = menu;
		order = new int[10];
		total = 0;
		inisiasiPesanan(order);
	}
	
	public void tampilMenuMakanan() {
		System.out.println("            M E N U");
		System.out.println(" No Makanan      Stok     Harga");
		System.out.println("=================================");
		for (byte i = 0; i < menu.getId(); i++) {
			System.out.printf("%2d. %-12s [%d]\tRp %,.0f\n", (i + 1), menu.getNamaMakanan(i), menu.getStok(i), menu.getHargaMakanan(i));
		}
	}
  
	public void pilihPesanan() {
		byte option = 0;
		byte quantity = 0;
		boolean keluar = false;
		
		tampilMenuMakanan();
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Silahkan Pilih Pesanan Anda:");
			option = input.nextByte();
			if (option < 1 || option > menu.getId()) {
				System.out.println("Pesanan tidak tersedia.");
				continue;
		}
		
		System.out.println("Tulis Jumlah Pesanan Tersebut:");
		quantity = input.nextByte();
		option--;
		
		if((menu.getStok(option) - quantity) >= 0) {
			menu.useStock(option, quantity);
			keluar = true;
		} else {
			System.out.println("Maaf, Kami Kehabisan Persediaan Untuk Memenuhi Pesanan Anda");
			}
		}while (!keluar);
		this.order[option] += quantity;
		System.out.println("Pesanan Anda Telah Berhasil Dilakukan");
		System.out.println("Apakah Anda Ingin Memesan Lagi (y/n)?");
		String again = input.next();

		if (again.equalsIgnoreCase("y")) {
			pilihPesanan();
		}
		input.close();
	}
	
	private void inisiasiPesanan(int[] order) {
		for (int i =0; i < 10; i++) {
			order[i] = 0;
		}
	}
	
	
	public void tampilPesanan() {
		byte i = 0;
		byte j = 1;
		
		System.out.println("Pesanan Anda Adalah:");
		for (; i < menu.getId(); i++) {
			if(this.order[i] > 0) {
				System.out.printf("%d. %s\t[%d]\n",j, menu.getNamaMakanan(i), this.order[i]);
				j++;
			}
		}
	}
	
	public void hitungHarga(){
		for (byte i = 0; i < menu.getId(); i++) {
			if(this.order[i] > 0) {
				this.total += menu.getHargaMakanan(i) * order[i];
			}
		}
	}
	
	public void tampilTagihan() {
		hitungHarga();
		System.out.println("Total Pesanan Anda:");
		System.out.printf("Rp %,.0f", this.total);
	}
}