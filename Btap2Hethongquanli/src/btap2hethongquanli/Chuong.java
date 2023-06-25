package btap2hethongquanli;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong {

    int maChuong;
    ArrayList<Animal> AnimalList = new ArrayList<>();

    void themConVat(Animal a) {   //thêm 1 con vật vào AnimalList
        Scanner sc = new Scanner(System.in);
        boolean trungTen = false;
        do {
            System.out.println("Mời nhập tên con vật: ");
            a.Ten = sc.nextLine();
            for (Animal an : AnimalList) {
                if (a.Ten.equals(an.Ten)) {
                    trungTen = true;
                    System.out.println("Tên con vật đã có, mời bạn nhập lại tên khác!");
                    break;
                }
            }
        } while (a.Ten.length() == 0 || trungTen == true);

        do {
            System.out.println("Mời nhập tuổi con vật: ");
            a.Tuoi = sc.nextInt();
        } while (a.Tuoi < 0);
        sc.nextLine();
        do {
            System.out.println("Mời nhập mô tả: ");
            a.MoTa = sc.nextLine();
        } while (a.MoTa.length() == 0);

        AnimalList.add(a);
        System.out.println("Đã thêm con vật có tên " + a.Ten + " vào chuồng có mã " + maChuong);
    }

    void xoaConVat(String ten) {    //xóa con vật có tên tương ứng khỏi AnimalList
        if (AnimalList.isEmpty()) {
            System.out.println("Chuồng có mã" + maChuong + "không có con vật nào!");
        } else {
            boolean timThay = false;
            for (Animal an : AnimalList) {
                if (ten.equals(an.Ten)) {
                    timThay = true;
                    AnimalList.remove(an);
                    System.out.println("Đã xóa con vật" + ten + "ra khỏi chuồng có mã" + maChuong);
                    break;
                }
            }
            if (!timThay) {
                System.out.println("Không có con vật nào tên" + ten + "ở trong chuồng" + maChuong);
            }
        }

    }

}
