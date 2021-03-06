/**
 * 
 */
package ar.edu.unju.fi.tp5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
@Entity
@Table(name = "COMPRAS")
@Component("unaCompra")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@ManyToOne
	private Producto producto;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "total")
	private double total;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param producto
	 * @param cantidad
	 * @param total
	 */
	public Compra(int id, Producto producto, int cantidad, double total) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total + "]";
	}
	
}
