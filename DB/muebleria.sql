create database Muebleria;
use Muebleria;

CREATE TABLE Clientes(
idCliente varchar(10) primary key not null,
DineroEnBanco int(7),
nombre_Cliente varchar(100)
);

CREATE TABLE Proveedores (
nombre_prv varchar(45) primary key, 
telefono_prv varchar(10),
dir_prv varchar(100),
email_prv varchar(100)
);


CREATE TABLE Productos (
idProducto varchar(20) primary key, 
nombre_prod varchar(45),
desc_prod varchar(45),
cant_prod float,
precioCompra_prod float,
precioVenta_prod float,
nombre_prv varchar(45),
foreign key(nombre_prv) references Proveedores(nombre_prv) on delete cascade on update cascade
);

CREATE TABLE Ventas(
idVenta int(7) primary key not null auto_increment,
idCliente varchar(10),
fecha_venta date,
ivaAcumPag_venta float,
total_venta float,
foreign key(idCliente) references Clientes(idCliente) on delete cascade on update cascade
);

insert into Proveedores values("La Sierra","0","0","0");



use muebleria;
select * from ventas;