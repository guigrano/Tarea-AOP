public class Main {
    public static void main(String[] args) {

        ConfiguracionSistema config1 =
                ConfiguracionSistema.getInstancia();
        ConfiguracionSistema config2 =
                ConfiguracionSistema.getInstancia();

        System.out.println(config1.getNombreSistema());

        System.out.println("¿Son el mismo objeto? "
                + (config1 == config2));
    }
}