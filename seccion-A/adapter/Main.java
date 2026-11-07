public class Main {
    public static void main(String[]args){
        BancoExterno banco= new BancoExterno();
        MetodoPago pago= new Adapter(banco);
        pago.pagar(50);
    } 
}