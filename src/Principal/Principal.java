package Principal;

import Ventanas.Clientes;
import Ventanas.Empleados;
import Ventanas.Formas_de_pago;
import Ventanas.Informes;
import Ventanas.Pedidos;
import Ventanas.Productos;
import Ventanas.Promociones;
import Ventanas.Proveedores;
import Ventanas.Seguridad;
import Ventanas.Ventas;

/**
 *
 * @author Claudio
 */
public class Principal {
    
    public Empleados empleado;
    public Clientes cliente;
    public Formas_de_pago pago;
    public Informes infor;
    public Pedidos pedido;
    public Productos producto;
    public Promociones promo;
    public Proveedores proveedor;
    public Seguridad seguridad;
    public Ventas venta;
    
    public static void main(String[] args) {
       Clientes cliente=new Clientes();
        Empleados empleado=new Empleados();
        Formas_de_pago pago=new Formas_de_pago();
       Informes infor=new Informes(); 
       Pedidos pedido=new Pedidos();
       Productos producto=new Productos();
       Promociones promo=new Promociones();
       Proveedores proveedor=new Proveedores();
       Seguridad seguridad=new Seguridad();
       Ventas venta=new Ventas();
       
      }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setPago(Formas_de_pago pago) {
        this.pago = pago;
    }

    public void setInfor(Informes infor) {
        this.infor = infor;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public void setPromo(Promociones promo) {
        this.promo = promo;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public void setSeguridad(Seguridad seguridad) {
        this.seguridad = seguridad;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    

    
}
