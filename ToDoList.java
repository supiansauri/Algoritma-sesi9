import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Queue<String> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Selamat datang di aplikasi ToDoList!");
        while (isRunning) {
            System.out.println("Silahkan pilih opsi:");
            System.out.println("1. Tambah kegiatan ke to-do list");
            System.out.println("2. Hapus kegiatan dari to-do list");
            System.out.println("3. Lihat to-do list");
            System.out.println("4. Keluar dari aplikasi");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan kegiatan baru: ");
                    String newTask = scanner.nextLine();
                    toDoList.add(newTask);
                    System.out.println("Kegiatan \"" + newTask + "\" telah ditambahkan ke to-do list.");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-do list kosong.");
                    } else {
                        String removedTask = toDoList.remove();
                        System.out.println("Kegiatan \"" + removedTask + "\" telah dihapus dari to-do list.");
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-do list kosong.");
                    } else {
                        System.out.println("To-do list:");
                        for (String task : toDoList) {
                            System.out.println("- " + task);
                        }
                    }
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opsi yang Anda pilih tidak valid.");
            }

            System.out.println(); 
        }

        System.out.println("Terima kasih telah menggunakan aplikasi ToDoList!");
    }
}