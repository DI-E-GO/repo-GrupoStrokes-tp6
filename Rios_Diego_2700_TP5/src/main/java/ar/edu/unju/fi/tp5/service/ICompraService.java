package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Compra;

public interface ICompraService {
	public Compra getCompra();
	public void addCompra(Compra compra);
	public List<Compra> getCompras();
}
