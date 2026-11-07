public class Adapter implements MetodoPago {
    private BancoExterno banco;
    public Adapter(BancoExterno banco){
        this.banco= banco;
    }
    @Override 
    public void pagar(double monto){
        banco.realizarTransferencia(monto);
    }
}
