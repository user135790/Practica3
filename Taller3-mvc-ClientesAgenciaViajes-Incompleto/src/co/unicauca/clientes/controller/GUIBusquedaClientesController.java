package co.unicauca.clientes.controller;

import co.unicauca.clientes.modelo.ClientesDB;
import co.unicauca.clientes.vista.GUIBusquedaClientes;
import co.unicauca.clientes.vista.GUIEstadisticaPorSexo;
import co.unicauca.clientes.vista.GUIEstadisticaPorSexoGrafica;
import java.awt.event.ActionEvent;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano Controlador de la
 * GUIBusquedaClientes. Es la unica que tiene un controlador porque cambia el
 * estado del modelo. Las otras GUIs tienen el controlador dentro de la misma
 * vista.
 */
public class GUIBusquedaClientesController implements java.awt.event.ActionListener {

    private ClientesDB modelo;
    private GUIBusquedaClientes vista;
    private GUIEstadisticaPorSexo vista2;
    private GUIEstadisticaPorSexoGrafica vista3;

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.buscarClientesPorProfesion(vista.getProfesion());
        vista2.update(modelo, vista2);
        vista2.setVisible(true);
        vista3.update(modelo, vista3);
        vista3.setVisible(true);
    }

    public void addModel(ClientesDB m) {
        this.modelo = m;
    }

    public void addView(GUIBusquedaClientes v) {
        this.vista = v;
    }
    
    public void addView2(GUIEstadisticaPorSexo s) {
        this.vista2 = s;
    }
    public void addView3(GUIEstadisticaPorSexoGrafica c){
        this.vista3=c;
    }
}
