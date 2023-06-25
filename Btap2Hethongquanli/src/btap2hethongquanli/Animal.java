package btap2hethongquanli;

abstract class Animal {

    String Ten;
    int Tuoi;
    String MoTa;

    abstract void xemThongTin();

    abstract void tiengKeu();

    public Animal() {
        Ten="Animal";
        Tuoi=1;
        MoTa="animal";
    }

    public Animal(String Ten) {
        this.Ten = Ten;
    }

    public Animal(String Ten, int tuoi) {
        this.Ten = Ten;
        this.Tuoi = tuoi;
    }

    public Animal(String Ten, int tuoi, String moTa) {
        this.Ten = Ten;
        this.Tuoi = tuoi;
        this.MoTa = moTa;
    }

}
