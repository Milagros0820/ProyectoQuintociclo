/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiPedido.entity.Pedido;

/**
 *
 * @author aidas
 */
public interface PedidoRepository extends CrudRepository<Pedido, Long>{   
}
