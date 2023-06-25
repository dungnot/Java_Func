
package btap2hethongquanli;


public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String Ten) {
        super(Ten);
    }

    public Cat(String Ten, int tuoi) {
        super(Ten, tuoi);
    }

    public Cat(String Ten, int tuoi, String moTa) {
        super(Ten, tuoi, moTa);
    }
   
    @Override
    void xemThongTin() {
        System.out.println("Loại con vật: " +this.getClass());
        System.out.println("Tên: " +Ten);
        System.out.println("Tuổi: " +Tuoi);
        System.out.println("Mô tả : " +MoTa);
    }

    @Override
    void tiengKeu() {
        System.out.println("Meo");
    }
    
}
