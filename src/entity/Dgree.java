package entity;

public enum Dgree {
    BANGF("Bằng lái loại F"),
    BANGE("Bằng lái loại E"),
    BANGD("Bằng lái loại D"),
    BANGC("Bằng lái loại C"),
    BANGB("Bằng lái loại B"),
    BANGA("Bằng lái loại A");

    private String dgree;
    Dgree(String dgree){
            this.dgree = dgree;
    }

    @Override
    public String toString() {
        return "Dgree{" +
                "dgree='" + dgree + '\'' +
                '}';
    }
}
