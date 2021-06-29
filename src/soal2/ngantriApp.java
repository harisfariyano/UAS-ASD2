package soal2;
public class ngantriApp {
    public static void main(String[] args) {
        queue ngantri = new queue(10);
        ngantri.enqueue(23);
        ngantri.show();
        ngantri.enqueue(60);
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
        ngantri.enqueue(70);
        System.out.println("nama saya adalah Muhammad Haris Fariyano");
        System.out.println();
        ngantri.show();
        System.out.println("Nilai yang diambil dari antrian = "+ngantri.dequeue());
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
    }
}