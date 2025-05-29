package Prova;

class LaptopBateria {

    public static int getBattery(int[] eventos) {
        int bateria = 50; // carga inicial

        for (int evento : eventos) {
            bateria += evento; // positivo: carrega | negativo: consome

            // Para que a bateria fique entre 0% e 100%
            if (bateria > 100) {
                bateria = 100;
            } else if (bateria < 0) {
                bateria = 0;
            }
        }

        return bateria;
    }

    public static void main(String[] args) {
        int[] eventos = {10, -20, 61, -15};
        int resultado = getBattery(eventos);
        System.out.println("Bateria final: " + resultado + "%");
    }
}



