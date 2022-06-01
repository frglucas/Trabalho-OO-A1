package ex3;

public class Student {

    private String name;
    private double notaPrimeiroTrimestre;
    private double notaSegundoTrimestre;
    private double notaTerceiroTrimestre;

    public Student(String name, double notaPrimeiroTrimestre,
                   double notaSegundoTrimestre, double notaTerceiroTrimestre) {
        this.name = name;
        setNotaPrimeiroTrimestre(notaPrimeiroTrimestre);
        setNotaSegundoTrimestre(notaSegundoTrimestre);
        setNotaTerceiroTrimestre(notaTerceiroTrimestre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotaPrimeiroTrimestre() {
        return notaPrimeiroTrimestre;
    }

    public void setNotaPrimeiroTrimestre(double notaPrimeiroTrimestre) {
        if(notaPrimeiroTrimestre > 30){
            this.notaPrimeiroTrimestre = 30;
        } else if(notaPrimeiroTrimestre < 0){
            this.notaPrimeiroTrimestre = 0;
        } else this.notaPrimeiroTrimestre = notaPrimeiroTrimestre;
    }

    public double getNotaSegundoTrimestre() {
        return notaSegundoTrimestre;
    }

    public void setNotaSegundoTrimestre(double notaSegundoTrimestre) {
        this.notaSegundoTrimestre = verificaNotaSegundoETerceiro(notaSegundoTrimestre);
    }

    public double getNotaTerceiroTrimestre() {
        return notaTerceiroTrimestre;
    }

    public void setNotaTerceiroTrimestre(double notaTerceiroTrimestre) {
        this.notaTerceiroTrimestre = verificaNotaSegundoETerceiro(notaTerceiroTrimestre);
    }

    private double verificaNotaSegundoETerceiro(double nota){
        if(nota > 35){
            return 35.0;
        } else if(nota < 0){
            return 0.0;
        } else return nota;
    }

    public double notaFinal(){
        double somaTotal = getNotaPrimeiroTrimestre() + getNotaSegundoTrimestre() + getNotaTerceiroTrimestre();
        return somaTotal;
    }

    public String passouDeAno(){
        if(notaFinal() >= 60){
            return "PASSED!";
        } else {
            double pontosFaltantes = 60 - notaFinal();
            return "FAILED! Faltaram " + pontosFaltantes + " para conseguir atingir a média!";
        }
    }
}