public class Main {

    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SINGLETON CON AOP ---");

        // Usamos new dos veces; el aspecto hace que ambas devuelvan la misma instancia
        ConfiguracionSistema config1 = new ConfiguracionSistema();
        ConfiguracionSistema config2 = new ConfiguracionSistema();

        System.out.println(config1.getNombreSistema());
        System.out.println("¿Son el mismo objeto? " + (config1 == config2));
    }
}
