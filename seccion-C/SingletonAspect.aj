public aspect SingletonAspect {

    // Guarda la única instancia de ConfiguracionSistema
    private ConfiguracionSistema instancia;

    // Pointcut: selecciona cada "new ConfiguracionSistema()" que haga el programa
    pointcut crearConfiguracion(): call(ConfiguracionSistema.new(..));

    // Advice around: se ejecuta en lugar de ese new.
    // Solo la primera vez crea el objeto (proceed); las demás devuelve el mismo.
    // synchronized evita que dos hilos lo creen al mismo tiempo.
    ConfiguracionSistema around(): crearConfiguracion() {
        synchronized (this) {
            if (instancia == null) {
                instancia = proceed();
            }
            return instancia;
        }
    }
}
