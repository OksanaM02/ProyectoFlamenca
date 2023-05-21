CREATE DATABASE PROYECTO2;
USE PROYECTO2;
CREATE TABLE PRODUCTO (
    CODIGO INT AUTO_INCREMENT PRIMARY KEY, 
    DESCRIPCION VARCHAR(100),
    PRECIO INT,
    CANTIDAD INT,
    FOTO VARCHAR(10)
);
CREATE TABLE USUARIO (
    NOMBRE VARCHAR(20) PRIMARY KEY,
    CONTRASEÑA VARCHAR(20)
);
INSERT INTO PRODUCTO(DESCRIPCION, PRECIO, CANTIDAD, FOTO) VALUES
("Falda-top marrón y chaquetilla negra", 1100 , 2 , "1.jpg"), 
("Falda de flecos negra y chaquetilla flock verde", 1250 , 1 , "2.jpg"), 
("Pantalón y chaquetilla flock marrón", 1200 , 3 , "3.jpg"), 
("Traje de flamenca flock marrón", 1550 , 1 , "4.jpg"), 
("Traje de flamenca flock verde y chaqueta", 1600 , 2 , "5.jpg"), 
("Traje de flamenca negro Dolce", 1070 , 1 , "6.jpg"), 
("Traje de flamenca rosita bordados cortes cintura", 1120 , 3 , "7.jpg"), 
("Traje de flamenca azulón con bordado maquillaje en escote", 1350 , 2 , "8.jpg"), 
("Traje de flamenca coral bordado fucsia entero", 1550 , 1 , "9.jpg"), 
("Traje de flamenca manzana bordado fucsia en escote", 1250 , 2 , "10.jpg"), 
("Traje de flamenca lunar lino azulon y chaquetilla", 1100 , 3 , "11.jpg"), 
("Traje de flamenca para niña morado con lunares y falda vuelo", 1050 , 1 , "12.jpg"), 
("Traje flamenca plumeti rojo de vuelo", 1450 , 2 , "13.jpg"), 
("Traje flamenca bordado rosa", 1400 , 1 , "14.jpg"), 
("Traje flamenca bordado celeste", 1250 , 1 , "15.jpg"), 
("Traje flamenca verde de vuelo y mangas fruncidas", 1100 , 1 , "16.jpg"), 
("Traje flamenca caqui", 900 , 3 , "17.jpg"), 
("Falda flamenca negra y chaqueta lunares con apliques azules", 600 , 2 , "18.jpg"), 
("Falda flamenca volantes desde cintura y chaquetilla con apliques fucsia", 840 , 3 , "19.jpg"), 
("Vestico coctail fucsia flecos negros", 450 , 1 , "20.jpg"), 
("Traje de flamenca plumeti fucsia lunares", 1160 , 2 , "21.jpg"), 
("Traje de flamenca falda volantes verde", 1260 , 3 , "22.jpg"), 
("Traje de flamenca malva bordados morado", 1050 , 1 , "23.jpg"), 
("Traje de flamenca blondas rosita", 1300 , 1 , "24.jpg"), 
("Traje de flamenca rojo de guipur", 1010 , 3 , "25.jpg"), 
("Traje de flamenca estampado con mangas transparentes de tul", 1100 , 2 , "26.jpg"), 
("Traje de flamenca beige de plumeti con transparencias", 1250 , 1 , "27.jpg"), 
("Falda flamenca negra con blusa de leopardo", 1040 , 1 , "28.jpg"), 
("Traje de flamenca beige de plumeti con volante en escote", 1150 , 1 , "29.jpg");
