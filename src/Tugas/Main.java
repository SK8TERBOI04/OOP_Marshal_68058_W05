package Tugas;

// File: Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        System.out.println("=== Program Hitung Luas & Keliling ===");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.print("Pilih bangun ruang: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Masukkan jari-jari: ");
            double r = sc.nextDouble();
            shape = new Circle(r);
        } else if (choice == 2) {
            System.out.print("Masukkan panjang: ");
            double p = sc.nextDouble();
            System.out.print("Masukkan lebar: ");
            double l = sc.nextDouble();
            shape = new Rectangle(p, l);
        } else if (choice == 3) {
            System.out.print("Masukkan sisi a: ");
            double a = sc.nextDouble();
            System.out.print("Masukkan sisi b: ");
            double b = sc.nextDouble();
            System.out.print("Masukkan sisi c: ");
            double c = sc.nextDouble();
            shape = new Triangle(a, b, c);
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        System.out.println("Luas: " + shape.getArea());
        System.out.println("Keliling: " + shape.getPerimeter());
    }
}

