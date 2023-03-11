package principal.clases;

import principal.herencia.SmartPhone;
import principal.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        Procesador snapdragon = new Procesador(8,"Sanadragon ", 2.1);
        SmartDevice celular = new SmartDevice("G9 plus", "Motorla", true, true, 4, 64, snapdragon);
        System.out.println(celular.marca);
        System.out.println(celular.modelo);
        System.out.println("Wifi 5.1"+celular.wifi);
        System.out.println("Si cuenta con bluetooth"+celular.bluetooth);
        System.out.println(celular.memory);
        System.out.println(celular.procesador.marcas);
        celular.aumentarMemory(2);
        System.out.println(celular.ram);

        SmartPhone samsung = new SmartPhone();
        samsung.modelo = "Samsung A10";

        SmartWatch xiaomi = new SmartWatch();
        xiaomi.modelo = "Xiaomi Mi";

        SmartDevice smartDevice;

        smartDevice = new SmartPhone();
        smartDevice.aumentarMemory(5);
        smartDevice.modelo ="LG G5";
        System.out.println(smartDevice.ram);

    }
}
