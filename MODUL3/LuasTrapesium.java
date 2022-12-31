public class LuasTrapesium {
public AreaTrapezoid(double sisi_atas, double sisi_bawah, double tinggi){
double area = (sisi_atas + sisi_bawah) * tinggi / 2;
 
System.out.println("Diketahui, sebuah trapesium");
System.out.println("Memiliki panjang sisi atas " + sisi_atas + " satuan panjang");
System.out.println("Memiliki panjang sisi bawah " + sisi_bawah + " satuan panjang");
System.out.println("Memiliki tinggi trapesium " + tinggi + " satuan panjang");
System.out.println();
System.out.println("Didapat luas trapesium adalah " + area + " satuan luas");
}
}