package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String chuoiNhap = scanner.nextLine();

        // Đảo ngược chuỗi
        String chuoiDaoNguoc = daoNguocChuoi(chuoiNhap);
        System.out.println("Chuỗi đảo ngược: " + chuoiDaoNguoc);

        // Đếm số từ trong chuỗi
        int soTu = demSoTu(chuoiNhap);
        System.out.println("Số từ trong chuỗi: " + soTu);

        // Kiểm tra từ xuất hiện trong chuỗi
        System.out.print("Nhập từ cần kiểm tra: ");
        String tuKiemTra = scanner.next();
        if (kiemTraTu(chuoiNhap, tuKiemTra)) {
            System.out.println("Từ '" + tuKiemTra + "' xuất hiện trong chuỗi.");
        } else {
            System.out.println("Từ '" + tuKiemTra + "' không xuất hiện trong chuỗi.");
        }

        scanner.close();
    }

    // Hàm đảo ngược chuỗi
    private static String daoNguocChuoi(String chuoi) {
        StringBuilder chuoiDaoNguoc = new StringBuilder();
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            chuoiDaoNguoc.append(chuoi.charAt(i));
        }
        return chuoiDaoNguoc.toString();
    }

    // Hàm đếm số từ trong chuỗi
    private static int demSoTu(String chuoi) {
        String[] mangTu = chuoi.split("\\s+");
        return mangTu.length;
    }

    // Hàm kiểm tra từ xuất hiện trong chuỗi
    private static boolean kiemTraTu(String chuoi, String tu) {
        String[] mangTu = chuoi.split("\\s+");
        for (String tuTrongChuoi : mangTu) {
            if (tuTrongChuoi.equals(tu)) {
                return true;
            }
        }
        return false;
    }

	}


