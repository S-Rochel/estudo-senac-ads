package polimorfismo;

public class Boletim {
    
    private double AM;
    private double AC;
    private double AS;
    private double MS;
    private double MM;
    private double PM;
    
    public void setAM(Double nota) {
        this.AM = nota;
    }

    public void setAC(double nota) {
        this.AC = nota;
    }

    public void setAS(double nota) {
        this.AS = nota;
    }
    public void setMS(double nota) {
        this.MS = nota;
    }

    public void setMM(double nota) {
        this.MM = nota;
    }

    public double calcular_media(double AM, double AC, double AS) {
        double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
        return media;
    }

    public double calcular_media(double PM, double AS) {
        double media = PM * 0.4 + AS * 0.6;
        return media;
    }
}
