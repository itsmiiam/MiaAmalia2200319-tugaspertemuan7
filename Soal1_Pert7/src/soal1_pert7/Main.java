package soal1_pert7;

import java.util.Arrays;

// Definisi kelas StopWatch
class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    // Metode untuk memulai waktu
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk menghentikan waktu
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mengambil waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Metode untuk mengambil nilai startTime
    public long getStartTime() {
        return startTime;
    }

    // Metode untuk mengambil nilai endTime
    public long getEndTime() {
        return endTime;
    }
}

// Program uji untuk mengukur waktu eksekusi pengurutan 100.000 angka menggunakan selection sort
public class Main {
    // Metode untuk melakukan pengurutan menggunakan Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();

        // Memulai waktu
        stopwatch.start();

        // Melakukan pengurutan menggunakan selection sort
        selectionSort(arr);

        // Menghentikan waktu
        stopwatch.stop();

        // Mengambil waktu yang telah berlalu
        long elapsedTime = stopwatch.getElapsedTime();

        // Menampilkan waktu yang telah berlalu dalam milidetik
        System.out.println("Waktu yang diperlukan untuk pengurutan (dalam milidetik): " + elapsedTime);
    }
}

