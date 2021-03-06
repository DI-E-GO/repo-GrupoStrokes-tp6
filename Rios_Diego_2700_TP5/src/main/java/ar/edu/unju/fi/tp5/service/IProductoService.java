package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Producto;

public interface IProductoService {
	public void addProducto(Producto producto);
	public Producto getUltimoProducto();
	public Producto getProducto();
	public List<Producto> listaProductos();
}
