
import java.util.Scanner;
public class Main {
                      public static void calc(int a, int b, String op) { 1 usage
        if(op.equals("+")){
            System.out.print(a+b);
        }else if(op.equals("-")){
            System.out.print(a-b);
        }else if(op.equals("x")){
            System.out.print(a*b);
        }else if(op.equals(":")) {
            System.out.print(a/b);
        }else if(op.equals("%")){
            System.out.print(a%b);
        }else {
            System.out.print("input Tidak Valid!");
        }
    }
    Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan a: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan b: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan Operator: ");
            String op = scanner.nextLine();

           calc (a,b,op);
            System.out.print("\nLanjut?");
            String tanya = scanner.nextLine();
            if (tanya.equals("ya")) {
                kondisi = true;
            } else {
                kondisi = false;
            }
        }
        scanner.close();
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        while (kondisi) {
//            System.out.print("Masukkan a: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan b: ");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan Operator: ");
//            String op = scanner.nextLine();
//
//            if (op.equals("+")) {
//                System.out.print(a + b);
//            } else if (op.equals("-")) {
//                System.out.print(a - b);
//            } else if (op.equals("x")) {
//                System.out.print(a * b);
//            } else if (op.equals(":")) {
//                System.out.print(a / b);
//            } else if (op.equals("%")) {
//                System.out.print(a % b);
//            } else {
//                System.out.print("input Tidak Valid!");
//            }
//            System.out.print("\nLanjut?");
//            String tanya = scanner.nextLine();
//            if (tanya.equals("ya")) {
//                kondisi = true;
//            } else {
//                kondisi = false;
//            }
//        }
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        int a, b;
//        char operator;
//        char lanjutkan;
//
//        do {
//            // Input angka pertama
//            System.out.print("Masukkan angka pertama (a): ");
//            a = scanner.nextInt();
//
//            // Input angka kedua
//            System.out.print("Masukkan angka kedua (b): ");
//            b = scanner.nextInt();
//
//            // Input operator
//            System.out.print("Masukkan operator (+, -, *, /): ");
//            operator = scanner.next().charAt(0);
//
//            // Proses sesuai operator
//            switch (operator) {
//                case '+':
//                    System.out.println("Hasil: " + (a + b));
//                    break;
//                case '-':
//                    System.out.println("Hasil: " + (a - b));
//                    break;
//                case '*':
//                    System.out.println("Hasil: " + (a * b));
//                    break;
//                case '/':
//                    if (b != 0) {
//                        System.out.println("Hasil: " + (a / b));
//                    } else {
//                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
//                    }
//                    break;
//                default:
//                    System.out.println("Operator tidak valid!");
//            }
//
//            // Tanya apakah pengguna ingin lanjut
//            System.out.print("Lanjutkan kalkulasi? (y/n): ");
//            lanjutkan = scanner.next().charAt(0);
//        } while (lanjutkan == 'y' || lanjutkan == 'Y');
//
//        System.out.println("Terima kasih telah menggunakan kalkulator!");
//        scanner.close();
//
//        System.out.println("masukan a = ");
//        int a = scanner.nextInt();
//        System.out.println("masukan b = ");
//        int b = scanner.nextInt();
//        System.out.print("mau yang mana (+, -, *, /, %): ");
//        String operation = scanner.next();
//        int result = rumus(a, b, operation);
//        System.out.println("hasil : " + result);
//        System.out.println("Continue?");
//        String lanjut = scanner.nextLine()
//    }
//
//    public static int rumus(int a, int b, String operation)
//    {
//        int result = 0;
//        if (operation.equals("+")) {
//            result = a + b;
//        }
//        else if (operation.equals("-")) {
//            result = a - b;
//        }
//        else if (operation.equals("*")) {
//            result = a * b;
//        }
//        else if (operation.equals("%")) {
//            result = a % b;
//        }
//        else if (operation.equals("/")) {
//            result = a / b;
//        }
//        else {
//            System.out.println("error");
//        }
//        return result;
//



//        Scanner scanner = new Scanner (System.in);
//        System.out.print ("Masukkan nama Anda: ");
//        String nama = scanner.nextLine();
//
//        System.out.println ("Halo, " + nama + "!");
//        if (nama.equals("risa")) {
//            System.out.println("Apa Kabar!");
//        }else {
//            System.out.println("Kenalan Yuk!");
//        }
//
//        scanner.close();



 //       String nama = "Disny Adelia Novita";

 //       System.out.println(nama);
        //      System.out.println("Nama Saya " + nama);
//int a =24;
//int b =16;
//
//int kurang = a-b;
//int kali = a*b;
//int bagi = a/b;
//    System.out.println(a+b);
//        System.out.println(a%b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);

        // operator logika atu, dan, & bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(true && (true||false));

//        < > == <= >=
//        int a = 30;
//        int b = 31;
//
//        System.out.println(a>=b);

//        int saldo = 2000;
//        int tarik = 1900;
//
//        if(tarik>1000 && tarik <= saldo){
//            System.out.println("Saldo berhasil ditarik, tapi kena pajak 25%");
//        }else if (tarik <=saldo){
//            System.out.println("Saldo berhadil ditarik");
//            }
//        else {
//            System.out.println("Saldo Anda Kurang");
//        }

//        int cek = 1;
//        while (cek <= 2){
//            System.out.println("looping");
//
//            cek =cek + 1;
//        }

//        for (int i = 1;i<=2;i++){
//            System.out.println("looping "+ i);
//        }
