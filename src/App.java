class orang{
    // data member
    String nama;
    int sisa;
    int uang;

    // objek member
    barang barang;

        // konstruktor
    orang(String nama, int uang){
        this.nama=nama;
        this.uang=uang;
    }
    
    void status(){
        System.out.println("nama saya " +this.nama);
        System.out.println("punya uang "+this.uang);
    }

    public void beli(barang jenis){
        System.out.println(this.nama +" membeli "+ jenis.nama +" dengan harga "+ jenis.harga);
        if(uang > jenis.harga){
            sisa = uang - jenis.harga;
        }else{
            sisa=0;
            this.uang-=sisa;
        }
    }

    int tampilSisa() {
        return sisa;
    }

}

class barang{
    String nama;
    int harga;

    barang(String nama, int harga){
        this.nama=nama;
        this.harga=harga;
    }

    // void tampil(){
    //     System.out.println("barang "+this.nama);
    //     System.out.println("harga Rp." +this.harga);
    // }


}
public class App {
    public static void main(String[] args) throws Exception {
        
        orang manusia1 = new orang("eka", 10000);
        barang barang1 = new barang("paku", 2000);
        
        manusia1.status();
        manusia1.beli(barang1);
        
        System.out.println("\nREFRESH DATA ORANG\n");
        manusia1.status();
        System.out.println("Sisa uangku: " + manusia1.tampilSisa());
    }
}
