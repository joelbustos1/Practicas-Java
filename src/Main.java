// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        suma(15, 20, 30);
        Coche miCoche = new Coche();
        int totalPuertas = miCoche.incrementarPuertas();
        System.out.println("el coche tiene "+ totalPuertas+" puertas");
    }
    public static void suma(int a, int b, int c){
    int resultado = a+b+c;
        System.out.println("La suma da un total de "+resultado);
    }
    static class Coche{ //mi objeto coche tiene 4 puertas y se le pueden sumar
        int puertas = 4;
        public int incrementarPuertas(){
            this.puertas++;
            return puertas;
        }
    }
}