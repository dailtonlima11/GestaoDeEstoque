create database if not exists GestaoDeEstoque;

use GestaoDeEstoque;
Create table if not exists Produtos (
Id_Produto smallint auto_increment primary key,
Nome_Produto varchar(50) not null,
Categoria varchar(50) not null,
Preco float (10) not null,
Quantidade int not null default 0
);

Create table if not exists Funcionarios (
Id_Funcionarios smallint auto_increment primary key,
Nome_Funcionarios varchar(50) not null,
Cargo varchar(20) not null,
Login varchar (20) not null,
Senha varchar(200) not null
);

Create table if not exists Entradas (
Id_Entrada smallint auto_increment primary key,
Id_Produto_Entrada smallint,
foreign key (Id_Produto_Entrada) references Produtos(Id_Produto),
Quantidade int not null,
Data_Entrada date not null,
Fornecedor varchar (50) not null
);

Create table if not exists Saidas (
Id_Saida smallint auto_increment primary key,
Id_Produto_Saida smallint,
foreign key (Id_Produto_Saida) references Produtos(Id_Produto),
Quantidade int not null,
Data_Saida date not null,
Destinatario varchar (50) not null
);

Create table if not exists Relatorios (
id_Relatorios smallint auto_increment primary key,
Tipo varchar(10),
Data_Relatorios date,
Detalhes varchar (500)
);

DELIMITER //

CREATE TRIGGER trg_entrada_produto
AFTER INSERT ON entradas
FOR EACH ROW
BEGIN
    UPDATE produtos
    SET Quantidade = Quantidade + NEW.Quantidade
    WHERE Id_Produto = NEW.Id_Produto_Entrada;
END;
//

DELIMITER ;

DELIMITER //

CREATE TRIGGER trg_saida_produto
AFTER INSERT ON saidas
FOR EACH ROW
BEGIN
    UPDATE produtos
    SET Quantidade = Quantidade - NEW.Quantidade
    WHERE Id_Produto = NEW.Id_Produto_Saida;
END;
//

DELIMITER ;

