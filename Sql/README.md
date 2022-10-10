# Sql dependency

1.La configuracion para que nos cree la tabla y use la base de datos que tenemos creada en mySql es la siguiente (en application.properties):

> Password y user son datos que varian según lo que tengas configurado

<img width="657" alt="Captura de Pantalla 2022-10-10 a las 10 18 02" src="https://user-images.githubusercontent.com/107991714/194824562-09fe5233-1b9f-4994-92aa-9cee707bbe8a.png">

En myWorkbench se vería lo siguiente:
(he añadido unos datos desde el main)

<img width="327" alt="Captura de Pantalla 2022-10-10 a las 10 19 58" src="https://user-images.githubusercontent.com/107991714/194824586-499b4915-b078-4c3a-bf9a-fa3e21e85645.png">

2. Una vez se cree la tabla es importante cambiar el valor "create" a "none" para que no nos duplique las tablas:

<img width="1440" alt="Captura de Pantalla 2022-10-10 a las 10 23 55" src="https://user-images.githubusercontent.com/107991714/194825141-763891c4-adf6-4bab-85bc-81672fa8bfe3.png">

