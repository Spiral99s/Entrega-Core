USE clientesPedidosv1;

SELECT * FROM clientes;
SELECT * FROM pedidos;

-- Inserta al menos cinco nuevos clientes en la tabla «clientes».
INSERT INTO clientes (nombre, direccion, telefono)
VALUES ('Catalina Peréz', 'Av.Irrarazabal 1890, Ñuñoa, Chile', '+56987654321'),
('Nicolás Jara', 'Av. Nueva Providencia 1280, Providencia, Chile', '+56912345678'),
('Alejandro Montoya', 'Carrera 15 # 93-45, Bogotá, Colombia', '+573001234567'),
('Lucía Méndez', 'Av. Paseo de la Reforma 250, CDMX, México', '+525512345678'),
('Joaquín Pazos', 'Av. Corrientes 1580, Buenos Aires, Argentina', '+541198765432');

-- Inserta al menos diez nuevos pedidos en la tabla «pedidos».
INSERT INTO pedidos (fecha, total, clientes_id_cliente)
VALUES ('2026-02-17', 138.96, 1),
('2025-01-18', 252.67,2),
('2026-04-28', 55.25, 3),
('2025-09-09', 545.99,4),
('2026-03-30', 980.65, 5),
('2026-05-10', 450.20, 1),
('2026-05-15', 125.50, 2),
('2026-05-22', 89.90, 3),
('2026-06-01', 320.75, 4),
('2026-06-12', 670.30, 5);

INSERT INTO pedidos (fecha, total, clientes_id_cliente)
VALUES ('2026-04-21', 189.97, 3),
('2025-02-19', 29.9,5),
('2026-03-03', 935.5, 1);


-- Proyecta todos los clientes de la tabla «clientes» y sus respectivos pedidos.
SELECT clientes.nombre, pedidos.* FROM clientes INNER JOIN pedidos ON clientes.id_cliente = pedidos.clientes_id_cliente;

-- Proyecta todos los pedidos realizados por un cliente específico, utilizando su ID.
SELECT clientes.nombre, pedidos.* FROM clientes INNER JOIN pedidos ON pedidos.clientes_id_cliente = clientes.id_cliente WHERE clientes.id_cliente = 3;

-- Calcula el total de todos los pedidos para cada cliente.
SELECT clientes.id_cliente, clientes.nombre, sum(pedidos.total) AS total_pedidos FROM clientes LEFT JOIN pedidos ON clientes.id_cliente = pedidos.clientes_id_cliente GROUP BY clientes.id_cliente, clientes.nombre;

-- Elimina un cliente específico de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».
DELETE FROM pedidos WHERE clientes_id_cliente = 5;
DELETE FROM clientes WHERE id_cliente = 5;
SELECT clientes.nombre, pedidos.* FROM clientes INNER JOIN pedidos ON pedidos.clientes_id_cliente = clientes.id_cliente WHERE clientes.id_cliente = 5; -- verificamos que se hayan eliminado los registros
-- Proyecta los tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos.
SELECT clientes.nombre, COUNT(pedidos.id_pedido) AS total_pedidos FROM clientes INNER JOIN pedidos ON clientes.id_cliente = pedidos.clientes_id_cliente GROUP BY clientes.nombre ORDER BY total_pedidos DESC LIMIT 3;
