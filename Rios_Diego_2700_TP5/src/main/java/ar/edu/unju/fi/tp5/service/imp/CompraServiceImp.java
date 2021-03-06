package ar.edu.unju.fi.tp5.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.util.ListaCompras;
@Service("compraUtilService")
public class CompraServiceImp implements ICompraService {
	private static final Log LOGGER = LogFactory.getLog(ClienteServiceImp.class);

	@Autowired
	@Qualifier("unaCompra")
	private Compra compra;
	
	private List<Compra> compras;
	@Override
	public Compra getCompra() {
		// TODO Auto-generated method stub
		LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
		LOGGER.info("METHOD: getCompra()");
		LOGGER.info("RESULT: a object Compra");
		return compra;
	}

	@Override
	public void addCompra(Compra compra) {
		compras=ListaCompras.listaCompras;
		compras.add(compra);
		// TODO Auto-generated method stub
		LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
		LOGGER.info("METHOD: addCompra(Compra compra)");
		LOGGER.info("RESULT: add a new object to list of type Compra");
		LOGGER.info(compra);
	}

	@Override
	public List<Compra> getCompras() {
		// TODO Auto-generated method stub
		LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
		LOGGER.info("METHOD: getCompras()");
		LOGGER.info("RESULT: a list of Compras");
		return compras;
	}

}
