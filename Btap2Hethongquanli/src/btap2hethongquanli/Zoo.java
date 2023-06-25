
package btap2hethongquanli;

import java.util.ArrayList;


public class Zoo {
    ArrayList<Chuong> DanhSachChuong = new ArrayList<>(); 
    int maChuong=0;
    void themChuong(Chuong c){
       c.maChuong=++maChuong;
       DanhSachChuong.add(c);
        System.out.println("Đã thêm chuồng có mã " +maChuong);
    }
    
    void xoaChuong(int machuong){
        
            boolean timThay=false;
            for(Chuong c:DanhSachChuong){
                if(machuong==maChuong){
                    DanhSachChuong.remove(c);
                    System.out.println("Đã xóa chuồng có mã "+machuong+" khỏi danh sách");
                    break;
                }
            }
            if(!timThay){
                System.out.println("Không tìm thấy chuồng có mã "+machuong+" trong danh sách chuồng");
            }
        }
       
    
}
