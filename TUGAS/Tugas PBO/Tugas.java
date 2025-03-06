import java.util.Scanner;

public class Tugas {
    private static final Scanner penginput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Login:\n1. Admin\n2. Mahasiswa\n3.keluar\nMasukkan Pilihan:");
            int pilihan = penginput.nextInt();
            penginput.nextLine(); 
            switch (pilihan) {
                case 1 -> admin();
                case 2 -> mahasiswa();
                case 3 -> {
                    System.out.println("Terima kasih, program berhenti.");
                    System.exit(0);
                }
                
                
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void admin() {
        System.out.println("Masukkan username: ");
        String usernameAdmin = penginput.nextLine();
        System.out.println("Masukkan Password: ");
        String passwordAdmin = penginput.nextLine();

        if (usernameAdmin.equals("admin456") && passwordAdmin.equals("password456")){
            System.out.println("Login Admin Berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void mahasiswa() {
        System.out.println("Masukkan username: ");
        String usernamemahasiswa = penginput.nextLine();
        System.out.println("Masukkan NIM: ");
        String passwordmahasiswa = penginput.nextLine();

        if (usernamemahasiswa.equals("Hamdan Julfa" ) && passwordmahasiswa.equals("202410370110456")) {
            System.out.println("Login Mahasiswa Berhasil!");
            System.out.println("Nama : "+usernamemahasiswa);
            System.out.println("NIM : "+passwordmahasiswa);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}