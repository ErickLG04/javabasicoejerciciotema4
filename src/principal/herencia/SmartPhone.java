package principal.herencia;

import principal.clases.Procesador;
import principal.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

     int camaras;

     public SmartPhone() {
     }

     public SmartPhone(String modelo, String marca, boolean wifi, boolean bluetooth, int ram, int memory, Procesador procesador, int camaras) {
          super(modelo, marca, wifi, bluetooth, ram, memory, procesador);
          this.camaras = camaras;
     }
}
