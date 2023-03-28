public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";
	}
	
	public Item(String name) {
		this(); //ditambah this untuk mengakses isi string "name" pada kelas ini
		System.out.println(this.name); //mencetak isi variabel name pada kelas ini
	}
}