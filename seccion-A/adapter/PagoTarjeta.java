public class PagoTarjeta implements MetodoPago{
    @Override 
    public void pagar(double monto){
        System.out.println("Pago con tarjet: $"+ monto );
    }  
}
