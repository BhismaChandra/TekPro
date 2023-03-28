public class RestaurantMain {
  public static void main(String[] args) {
    Kitchen kitchen = new Kitchen();
    Restaurant menu = new Restaurant(kitchen);
    
    kitchen.tambahMenuMakanan("Bala-Bala", 1000, 20);
    kitchen.tambahMenuMakanan("Mendoan", 1000, 20);
    kitchen.tambahMenuMakanan("Tahu ", 500, 20);
    kitchen.tambahMenuMakanan("Gehu ", 1000, 20);
    kitchen.tambahMenuMakanan("Bala-Bala", 1000, 20);
    kitchen.tambahMenuMakanan("Cireng", 1000, 20);
    kitchen.tambahMenuMakanan("Ketan", 1000, 20);
    kitchen.tambahMenuMakanan("Lemper", 1000, 20);
    kitchen.tambahMenuMakanan("Pisang Aroma", 1000, 20);
    kitchen.tambahMenuMakanan("Molen", 1000, 20);
    
    menu.pilihPesanan();
    menu.tampilPesanan();
    menu.tampilTagihan();
  }
}
