public class ConfiguracionSistema {

    private static final ConfiguracionSistema instancia = new ConfiguracionSistema();
    private String nombreSistema;
    
    private ConfiguracionSistema() {
        nombreSistema = "Sistema de Pagos";
    }

    public static ConfiguracionSistema getInstancia() {
        return instancia;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }
}