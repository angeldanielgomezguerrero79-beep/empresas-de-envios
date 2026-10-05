public  abstract class Envio {
    protected String codigo;
    protected  String destino;
    protected double peso;
    protected double distancia;


    public Envio() {
    }


    public Envio(String codigo, String destino, double distancia, double peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.distancia = distancia;
        this.peso = peso;
    }

    public void mostrarInformacion(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Destino: " + destino);
        System.out.println("peso: " + peso);
        System.out.println("distancia: " + distancia);

    }

    public abstract double calcularPrecio();

    public abstract String calcularTiempoEntrega();
}
