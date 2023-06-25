package btap2hethongquanli;

public class Tiger extends Animal {

    

    @Override
    void xemThongTin() {
        System.out.println("Loại con vật: " +this.getClass());
        System.out.println("Tên: " +Ten);
        System.out.println("Tuổi: " +Tuoi);
        System.out.println("Mô tả : " +MoTa);
    }

    @Override
    void tiengKeu() {
        System.out.println("Gru");

    }

    public Tiger() {
        super();
    }

    public Tiger(String Ten) {
        super(Ten);
    }

    public Tiger(String Ten, int tuoi) {
        super(Ten, tuoi);
    }

    public Tiger(String Ten, int tuoi, String moTa) {
        super(Ten, tuoi, moTa);
    }

    
}
