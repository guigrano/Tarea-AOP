public aspect BancoExternoAdapterAspect {
    
    // Hace que BancoExterno implemente la interfaz MetodoPago en tiempo de compilación
    declare parents: BancoExterno implements MetodoPago;

    // Inyecta el método requerido por la interfaz dentro de BancoExterno
    public void BancoExterno.pagar(double monto) {
        this.realizarTransferencia(monto);
    }
}
