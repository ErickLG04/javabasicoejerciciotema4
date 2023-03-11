package principal.clases;

public class SmartDevice {

    protected String modelo;
    protected String marca;
    protected boolean wifi;
    protected boolean bluetooth;
    protected int ram;
    protected int memory;
    Procesador procesador;

    public SmartDevice() {
    }

    public SmartDevice(String modelo, String marca, boolean wifi, boolean bluetooth, int ram, int memory, Procesador procesador) {
        this.modelo = modelo;
        this.marca = marca;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.ram = ram;
        this.memory = memory;
        this.procesador = procesador;
    }

    public SmartDevice(String modelo, String marca) {

        this.modelo = modelo;
        this.marca = marca;
    }

    public void aumentarMemory(int ram1) {
        this.ram += ram1;
    }
}
