package btap2hethongquanli;

import java.util.Scanner;

public class TestZoo {

    static void menu() {
        System.out.println("1.Thêm chuồng");
        System.out.println("2.Xóa chuồng");
        System.out.println("3.Thêm con vật");
        System.out.println("4.Xóa con vật");
        System.out.println("5.Xem tất cả các con vật");
        System.out.println("6.Thoát");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int choice = 0;
        do {
            menu();
            System.out.println("Please enter choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Chuong c = new Chuong();
                    zoo.themChuong(c);
                    break;
                case 2:
                    if (zoo.DanhSachChuong.isEmpty()) {
                        System.out.println("Công viên chưa có chuồng nào");
                    } else {
                        System.out.println("Nhập mã muốn xóa: ");
                        zoo.xoaChuong(input.nextInt());
                    }
                    break;
                case 3:
                    if (zoo.DanhSachChuong.isEmpty()) {
                        System.out.println("Không thể thêm con vật, công viên chưa có chuồng nào");
                    } else {
                        int loaiConVat;
                        do {
                            System.out.println("Nhập loại con vật muốn thêm(1.Tiger, 2.Dog, 3.Cat)");
                            loaiConVat = input.nextInt();
                        } while (!(loaiConVat == 1 || loaiConVat == 2 || loaiConVat == 3));

                        Animal a;

                        if (loaiConVat == 1) {
                            a = new Tiger();
                        } else if (loaiConVat == 2) {
                            a = new Dog();
                        } else {
                            a = new Cat();
                        }
                        boolean timThay = false;
                        for (Chuong ch : zoo.DanhSachChuong) {
                            if ((ch.maChuong % 3 == loaiConVat || ch.maChuong % 3 == 0) && ch.AnimalList.size() < 10) {
                                timThay = true;
                                zoo.DanhSachChuong.get(zoo.DanhSachChuong.indexOf(ch)).themConVat(a);
                                break;
                            }

                        }
                        if (!timThay) {
                            System.out.println("Không có chuồng phù hợp");
                        }
                    }
                    break;
                case 4:
                    if (zoo.DanhSachChuong.isEmpty()) {
                        System.out.println("Không thể thêm con vật, công viên chưa có chuồng nào");
                    } else {
                        String ten;
                        do {
                            System.out.println("Mời nhập tên con vật muốn xóa: ");
                            ten = input.nextLine();
                        } while (ten.length() == 0);
                        boolean timThay = false;
                        for (Chuong ch : zoo.DanhSachChuong) {
                            for (Animal a : ch.AnimalList) {
                                if (a.Ten.equals(ten)) {
                                    zoo.DanhSachChuong.get(zoo.DanhSachChuong.indexOf(ch)).xoaConVat(ten);
                                    break;
                                }
                            }
                            if (timThay) {
                                break;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Không có con vật nào tên " + ten + " trong danh sách chuồng");
                        }
                    }
                    break;
                case 5:
                    if (zoo.DanhSachChuong.isEmpty()) {
                        System.out.println("Không thể thêm con vật, công viên chưa có chuồng nào");
                    } else {
                        System.out.println("Danh sách các con vật trong công viên");
                        for (Chuong ch : zoo.DanhSachChuong) {
                            if (ch.AnimalList.isEmpty()) {
                                System.out.println("Chuồng có mã " + ch.maChuong + " không có con vật nào!");
                            } else {

                                System.out.println("Danh sách các con vật trong chuồng có mã " + ch.maChuong);
                                for (Animal a : ch.AnimalList) {
                                    a.xemThongTin();
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exited");
                    break;

            }
        } while (choice != 6);
    }
}
