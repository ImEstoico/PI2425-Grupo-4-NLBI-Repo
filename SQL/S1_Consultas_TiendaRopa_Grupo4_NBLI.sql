-- 1. Consultas de selección necesarias para la implementación

-- a) Muestra todos los artículos.
select * 
from articulo;

-- b) Muestra toda la información sobre TODA la ropa disponible.
select R.*
from ropa R, articulo A
where R.cod_art=A.cod_art
and A.activo = true;

-- c) Muestra toda la información sobre las camisas disponibles.
select R.*
from ropa R, articulo A
where R.cod_art=A.cod_art
and A.activo = true
and R.tipo_ropa like 'Camisa';

-- d) Muestra toda la información sobre las chaquetas disponibles.
select R.*
from ropa R, articulo A
where R.cod_art=A.cod_art
and A.activo = true
and R.tipo_ropa like 'Chaqueta';

-- e) Muestra toda la información sobre los pantalones disponibles.
select R.*
from ropa R, articulo A
where R.cod_art=A.cod_art
and A.activo = true
and R.tipo_ropa like 'Pantalón';

-- f) Muestra toda la información sobre TODOS los accesorios disponibles.
select AC.*
from articulo A, accesorio AC
where A.cod_art=AC.cod_art
and A.activo = true;

-- g) Muestra toda la información sobre TODOS los zapatos disponibles.
select AC.*
from articulo A, accesorio AC
where A.cod_art=AC.cod_art
and A.activo = true
and AC.tipo_accesorio like 'Zapatos';

-- h) Muestra toda la información sobre TODOS los bolsos disponibles.
select AC.*
from articulo A, accesorio AC
where A.cod_art=AC.cod_art
and A.activo = true
and AC.tipo_accesorio like 'Bolso';

-- i) Muestra toda la información sobre el artículo con código 15.
select *
from articulo
where cod_art = 15;

-- j) Muestra toda la información de los empleados.
select *
from empleado;

/*k) Muestra toda la información de los empleados Administradores (los administradores son aquellos
	 empleados que tienen privilegios).*/
select *
from empleado
where tiene_privilegios = true;
     
-- l) Muestra toda la información de los empleados que trabajan en Administración.
select E.*
from empleado E, departamento D
where E.dpto=D.codigo
and D.nombre like 'Administración';

-- m) Muestra toda la información del empleado con DNI = 12345678A.
select *
from empleado
where DNI like '12345678A';

-- n) Muestra toda la información del administrador cuyo DNI = 90123456I.
select *
from empleado
where tiene_privilegios = true
and DNI like '90123456I';

-- o) Muestra toda la información de los empleados que trabajan en ventas.
select E.*
from empleado E, departamento D
where E.dpto=D.codigo
and D.nombre like 'Ventas';

-- p) Muestra toda la información de los empleados que trabajan en el almacén.
select E.*
from empleado E, departamento D
where E.dpto=D.codigo
and D.nombre like 'almacén';

-- q) Muestra toda la información de los clientes.
select *
from cliente;

-- r) Muestra toda la información del cliente con DNI = 12345678J.
select *
from cliente
where DNI like '12345678J';

-- s) Muestra toda la información del cliente cuyo nombre es Carmen, y sus apellidos "López Martínez".
select *
from cliente
where nombre like 'Carmen'
and apellidos like 'López Martínez';

-- t) Muestra toda la información sobre los pedidos (SIN el detalle o líneas de los pedidos).
select *
from pedido;

-- u) Muestra toda la información sobre los pedidos (CON el detalle o líneas de los pedidos y la descripción de los artículos).
select P.*, LP.*, A.descripcion
from pedido P, linea_pedido LP, articulo A
where P.numero=LP.num_pedido
and LP.cod_art=A.cod_art;

-- v) Muestra la información de los pedidos del cliente con DNI = 01234567I (SIN el detalle o líneas de los pedidos).
select *
from pedido
where DNI_cliente like '01234567I';

/* w) Muestra la información de los pedidos del cliente con DNI = 01234567I (CON el detalle o líneas de
	  los pedidos y la descripción de los artículos).*/
select P.*, LP.*, A.descripcion
from pedido P, linea_pedido LP, articulo A
where P.numero=LP.num_pedido
and LP.cod_art=A.cod_art
and P.DNI_cliente like '01234567I';
      
-- x) Mostrar la información del cliente que ha realizado el pedido número 8.
select C.*
from cliente C, pedido P
where C.DNI=P.DNI_cliente
and P.numero = 8;

-- y) Calcular el número de pedidos que ha realizado cada cliente.
select nombre, sum(num_pedidos) as 'Número Pedidos'
from cliente
group by nombre;

-- z) Calcular el número de pedidos que se han pagado con Bizum.
select sum(C.num_pedidos) as 'Pago Bizum'
from cliente C, metodo_pago MP
where C.m_pago=MP.codigo 
and MP.descripcion like 'Bizum';

-- 2. Consultas de manipulación necesarias para la implementación
/*a) Insertar un artículo nuevo con la siguiente información:
• nombre → Pantalón de chándal
• precio → 9.99
• marca → Decathlon
• descripción → Pantalón de chándal punto unisex
• activo → true
• imagen → imagen21.jpg
• material → poliéster
• cod_art → deberemos averiguar
• talla → S
• color → Negro
• tipo_cierre → Goma
• tipo_pantalón → Chándal
• tiene_bolsillos → false
• tipo_ropa → Pantalón*/

insert into articulo (nombre, precio, marca, descripcion, activo, imagen,color, material) values
('Pantalón de chándal', 9.99, 'Decathlon', 'Pantalón de chándal punto unisex', true, 'imagen21.jpg', 'Negro', 2);
select * from articulo; -- Articulo 21
insert into ropa (cod_art, talla_ropa, tipo_cierre, tipo_pantalón, tiene_bolsillos, tipo_ropa) values
(21, 'S', 'Goma', 'Chándal', false, 'Pantalón');

/*b) Insertar un empleado que trabaje en departamento de Administración y tenga privilegios. Los datos
podrían ser los siguientes:
• DNI → 33407774K
• nombre → Jorge
• apellidos → Sanz López
• teléfono → 607473813
• dirección → Calle Constitución, 66
• email → jorge.sanz@example.com
• activo → true
• tiene_privilegios → true
• pass -→ 123456
• departamento → Administración (no sabemos el código del departamento, solo el nombre)*/

insert into empleado (DNI, nombre, apellidos, telefono, direccion, email, activo, tiene_privilegios, pass, dpto) values
('33407774K', 'Jorge', 'Sanz López', 607473813, 'Calle Constitución, 66', 'jorge.sanz@example.com', true, true, 123456, (select codigo 
from departamento 
where nombre like 'Administración'));

/*c) Insertar un cliente nuevo, con los siguientes datos :
• DNI → 33456789A
• nombre, → María
• apellidos → Gómez López
• teléfono, → 691223344
• f_nacimiento → 1980-07-25
• dirección, → Calle Mayor, 23
• email → maria.gomez@example.com
• pass → 123456
• saldo_cuenta → 100.00
• num_pedidos → 0
• dir_envío → Calle Sol, 10
• tarjeta_fidelización → false
• activo → true
• m_pago → Efectivo ( no sabemos el código del método de pago, solo el nombre)*/

insert into cliente (DNI, nombre, apellidos, telefono, f_nacimiento, direccion, email, pass, saldo_cuenta, num_pedidos, dir_envio, tarjeta_fidelizacion, activo, m_pago) values
('33456789A', 'María', 'Gómez López', 691223344, '1980-07-25', 'Calle Mayor, 23', 'maria.gomez@example.com', 123456, 100.00, 0, 'Calle Sol, 10', false, true, (select codigo 
from metodo_pago 
where descripcion like 'Efectivo'));

-- d) Insertar método de pago nuevo, por ejemplo Transferencia.

insert into metodo_pago (descripcion) values
('Transferencia');

-- e) Borrar método de pago "Transferencia".
delete from metodo_pago
where descripcion like 'Transferencia';

