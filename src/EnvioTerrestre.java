public class EnvioTerrestre extends Envio{

    private double costo=8000;


    public EnvioTerrestre() {
    }

    public EnvioTerrestre(String codigo, String destino, double distancia, double peso) {
        super(codigo, destino, distancia, peso);
    }


    @Override
    public double calcularPrecio() {
        double costoTotal=costo+(peso*1500)+(distancia*400);
        if(peso>20){
            System.out.println("se incrementa 10% por el peso: ");
            return costoTotal*0.1;
        } else if (peso<0) {
            System.out.println("error peso no regiastrado...");

        } else{
            System.out.println("no hay costo adicional...");

        }

        if (distancia>500){
            System.out.println("se incrementa 15% por la distancia mayor 500 KL: ");
            return costoTotal*0.15;
        } else if (distancia<0) {
        System.out.println("error peso no regiastrado...");

        } else{
        System.out.println("no hay  adicional...");

        }

        return costoTotal;


    }

    @Override
    public String calcularTiempoEntrega() {

        String op;
        if (distancia<=200){
            op ="tiempo de llegada 1 dia.  ";

        } else if (distancia>201 && distancia<=500) {
            op ="tiempo de llegada 2 dia.  ";
        }else if (distancia>501 && distancia<=1000) {
            op ="tiempo de llegada 3 dia.  ";
        }else if (distancia>1000) {
            op ="tiempo de llegada 5 dia.  ";
        }else{
            op ="no hay transportes disponibles.  ";
        }
        return op;
    }

    @Override
    public String toString() {
        return "EnvioTerrestre{" +
                "costo=" + costo +
                ", codigo='" + codigo + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", peso=" + peso +
                '}';
    }
}
