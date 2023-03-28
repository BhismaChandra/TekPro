class KelasSatu{

	{ //tanpa acces modifier (public/private/...) dipanggil setelah non-access modifier
		System.out.println(11);
	}
	static{ //dipanggil paling awal, hanya dilakukan sekali karena static
		System.out.println(2);
	}
	public KelasSatu(int i){ //dipanggil setelah tanpa nama dan  access modifier, jika memiliki parameter
		System.out.println(3);
	}
	public KelasSatu(){
		System.out.println(4);//dipanggil setelah tanpa nama dan tanpa access modifier, jika tidak memiliki parameter
	}
}