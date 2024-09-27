SELECT id,
    (SELECT COUNT(*) FROM pedido WHERE pedido.id_cliente = cliente.id)::INT AS pedidos
FROM cliente;