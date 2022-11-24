public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        var ma = "Ingrid";
        var pa = "Eduardo";
        var sof = "Sofía";
        var me = "Diego";
        System.out.println("Mi familia está confornada por; mis padres: " + ma + " y " + pa + "; mi hermana: " + sof + " y yo, "+ me);

        //Ejercicio 2
        //Convertir a INT:
        char c = 'z';
        System.out.println((int) c);

        //Convertir a long y luego a short
        int i = 250;
        System.out.println((long) i);
        System.out.println((short) i);

        //Convertir a long:
        double d = 301.067;
        System.out.println((long) d);

        //Sumar y convertirlo a float
        int a = 100;
        var b = 5000.66;
        System.out.println((float) (a+b));

        //Multiplicar por 100 y convertirlo a byte
        int r = 737;
        int f = 100;
        System.out.println((byte) (r * f));

        //Dividir y convertir a long:
        double g = 298.638;
        var k = 25;
        System.out.println((long) (g / k));
    }
}