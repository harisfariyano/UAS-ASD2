package soal1;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(23);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah Muhamad Haris Fariyano");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
}