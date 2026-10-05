//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Envio> lstEnvios = new ArrayList<>();



    Scanner teclado = new Scanner(System.in);
    int menu;
    String codigo, destino;
    double distancia, peso;

   
    for(Envio e: lstEnvios){
        e.mostrarInformacion();
        System.out.println(e.calcularPrecio());
        System.out.println(e.calcularTiempoEntrega());

    }

    boolean estado= true;

    while (estado){
        System.out.println("""
                1. Registrar envío terrestre.
                2. Registrar envío aéreo.
                3. Mostrar todos los envíos.
                4. Buscar envío por código.
                5. Mostrar el envío más costoso.
                6. Calcular total recaudado.
                7. Mostrar cantidad de envíos por tipo.
                8. Salir.
                """);
        System.out.println("selecciona opcion del menu: ");
        menu = teclado.nextInt();
        switch (menu){
            case 1:
                System.out.println("Registrar envío terrestre.");
                System.out.println("INGRESE EL CODIGO");
                codigo = teclado.next();

                System.out.println("INGRESE SU DESTINO");
                destino = teclado.next();

                System.out.println("INGRESE SU DISTANCIA");
                distancia = teclado.nextDouble();

                System.out.println("INGRESE SU PESO");
                peso = teclado.nextDouble();
                EnvioTerrestre ET3 = new EnvioTerrestre(codigo, destino, distancia, peso);
                lstEnvios.add(ET3);
                break;


            case 2:
                System.out.println("INGRESE EL CODIGO");
                codigo = teclado.next();

                System.out.println("INGRESE SU DESTINO");
                destino = teclado.next();

                System.out.println("INGRESE SU DISTANCIA");
                distancia = teclado.nextDouble();

                System.out.println("INGRESE SU PESO");
                peso = teclado.nextDouble();
                EnvioTerrestre EA2 = new EnvioTerrestre(codigo, destino, distancia, peso);
                lstEnvios.add(EA2);
                break;

            case 3:
                System.out.println("todos los envios: ");
                for(Envio e: lstEnvios) {
                    e.mostrarInformacion();
                }
                break;
            case 4:

                System.out.println("ingrese codigo para buscar: ");
                codigo = teclado.next();
                Envio encontrado = null;
                for (Envio E : lstEnvios){
                    if (E.codigo.equalsIgnoreCase(codigo)) {
                        encontrado = E;

                    }
                }
                if (encontrado != null ){
                    System.out.println(encontrado);
                }else {
                    System.out.println("no encontrado");
                }
                break;



        }
    }

}
