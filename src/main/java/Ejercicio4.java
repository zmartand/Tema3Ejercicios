public class Ejercicio4 {
    /*4. El tiempo de cocción
Sabiendo que:

Para cocinar 500 gramos de carne de vacuno, se necesita:

10 minutos si quieres una cocción casi cruda

17 minutos si quieres una cocción al punto

25 minutos si quieres una cocción bien hecha

Para cocinar 400 gramos de cordero se necesita:

15 minutos si quieres una cocción casi cruda

25 minutos si quieres una cocción al punto

40 minutos si quieres una cocción bien hecha

El tiempo de cocción es proporcional al peso.

Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.*/
    public static void main(String[] args) {
        int peso = 500;
        String tipoCarne = "vacuno";
        String coccion = "al punto";
        int tiempoCoccion = 0;
        if (tipoCarne.equals("vacuno")) {
            if (coccion.equals("crudo")) {
                tiempoCoccion = 10;
            } else if (coccion.equals("al punto")) {
                tiempoCoccion = 17;
            } else if (coccion.equals("bien hecha")) {
                tiempoCoccion = 25;
            }
        } else if (tipoCarne.equals("cordero")) {
            if (coccion.equals("crudo")) {
                tiempoCoccion = 15;
            } else if (coccion.equals("al punto")) {
                tiempoCoccion = 25;
            } else if (coccion.equals("bien hecha")) {
                tiempoCoccion = 40;
            }
        }
        System.out.println("El tiempo de cocción es de " + tiempoCoccion * peso + " segundos");
    }
}

