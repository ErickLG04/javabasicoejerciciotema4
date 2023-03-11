package principal.clases;

public class Procesador extends SmartDevice {

    int nucleos;
    String marcas;
    double VelocidadNucleo;

    public Procesador(int nucleos, String marcas, double velocidadNucleo) {
        this.nucleos = nucleos;
        this.marcas = marcas;
        VelocidadNucleo = velocidadNucleo;
    }
}
