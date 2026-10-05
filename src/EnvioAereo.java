public class EnvioAereo extends Envio{

    private double Costo=20000;



    public EnvioAereo() {
    }


    public EnvioAereo(String codigo, String destino, double distancia, double peso) {
        super(codigo, destino, distancia, peso);
    }

    @Override
    public double calcularPrecio() {
        double costoTotal=Costo+(peso*4000)+(distancia*600);
        if(peso>10){
            System.out.println("se incrementa 20% por el peso: ");
            return costoTotal*0.2;
        } else if (peso<0) {
            System.out.println("error peso no regiastrado...");

        } else{
            System.out.println("no hay costo adicional...");

        }

        if (distancia>1000){
            System.out.println("se descuenta 5% por la distancia mayor 1000 KL" );
            return costoTotal-0.05;
        } else if (distancia<0) {
            System.out.println("error peso no regiastrado...");

        } else{
            System.out.println("no hay costo adicional...");

        }

        return costoTotal;
    }

    @Override
    public String calcularTiempoEntrega() {
        String OP;
        if (distancia<=500){
            OP = "tiempo de llegada 1 dia.  ";
        } else if (distancia>501 && distancia<=1500) {
            OP = "tiempo de llegada 2 dia.  ";
        }else if (distancia>1501) {
            OP = "tiempo de llegada 3 dia.  ";
        }else{
            OP = "tiempo de llegada 5 dia.  ";
        }
        return OP;
    }

    @Override
    public String toString() {
        return "EnvioAereo{" +
                "Costo=" + Costo +
                ", codigo='" + codigo + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", peso=" + peso +
                '}';
    }
}
