/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aopadapter_grupo2;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE ADAPTER CON AOP ---");
        
        // 1. Probamos un pago normal con tarjeta
        MetodoPago pago1 = new PagoTarjeta();
        pago1.pagar(25.50);
        
        // 2. Probamos el BancoExterno adaptado mediante AspectJ
        // No instanciamos un "Adapter", usamos la clase original directamente
        MetodoPago pago2 = new BancoExterno(); 
        pago2.pagar(50.00);
    }
}
