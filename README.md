# JavaWebs

Creación del Proyecto con el IDE intellij en su ultima versión, mediante el Servidor WildFly versión 127.001 y la herramienta de desarrollo (jdk) 
eclipse temurin versión 17.

<h3>Formulario</h3> 
<img src="https://user-images.githubusercontent.com/128232148/233503876-7976201b-3394-4e68-a320-31bf70293839.png">

<p><i>After having created structure of workshoop1 JavaWeb</i>  || Despues de haber creado la estructura en el taller1 JavaWeb.</p>
<p>__________________________________________________________________________________________________________________________________________________</p>

# JavaWeb_Taller_2_y_3

<h6><i>User registration and database connection script</i> || Registro de usuario y script de la conexión a la base de datos </h6>

<h6>Dentro de la carpeta webapp; se crea un archivo con extensión <strong>.jsp</strong> y la estructura básica de html.||
    <i>Inside of webapp folder;  create file with extension<strong>.jsp</strong> and basic html structured </h6>
    
<h4>
    <ul><h3>1.Cabeza</h3>
        <li>Contiene la descripción especifica del contenido del documento.</li>
        <li>Lenguaje para realizar la página</li>
        <li>Reconocimiento de Caracteres especiales</li>
        <li>Enlaces de estilos e iconos</i>
    </ul>
    <ul><strong><i>
        <h3>1.Head:</h3></ul>
        <li>Description contain specify about of content of the document</li>
        <li>Language to page the make</li>
        <li>Special caracther recognition</li>
        <li>Links of Style and icons</li>
    </ul></i></strong>  
</h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236696283-13bca895-7c7d-4c80-ae86-a335e3905b4e.png">
<p>
    
<h4>
    <ul><h3>2.Cuerpo:</h3>
        <li>Contiene el contenido del documento.</li>
        <li>Dentro,se crea el formulario</li>
    </ul>
    <ul><strong><i>
        <h3>2.Body:</h3></ul>
        <li>Contain the content of the document</li>
        <li>Inside, is create the form</li>
    </ul></i></strong>   
</h4>
<p align=center>
    <img src="https://user-images.githubusercontent.com/128232148/236697246-c6b64eeb-2892-4e20-b9e5-dbbc3da84b07.png">
</p>

<h4>Dentro la carpeta <b>webapp</b> se crea otra carpeta <b>css</b> para crear los estilos </h4>
<h4><b><i>Inside of the folder <b>webapp</b> is create folder <b>css</b> for create the style's</i></b></h4>
<p align="left">
    <img src="https://user-images.githubusercontent.com/128232148/236699635-9f7e6f7f-745e-4c30-b515-2f909d9d077a.png">
</p>

<h4>Los estilos son enlazados dentro de la cabeza de la siguiente manera :</h4>
<h4><b><i>The style's are linked inside of the <b>head</b> of the manner next:</b></i></h4>
<p align="left">
    <img src="https://user-images.githubusercontent.com/128232148/236699422-dc86cf04-298a-4ad1-a9bb-e5c6f0111cbe.png">
</p>

<h4><i>Style File || Archivo de estilos</h4>
<p align=left>
   <img src="https://user-images.githubusercontent.com/128232148/236701573-c5d1de69-8050-4030-991b-d34456535a24.png">
   <img src="https://user-images.githubusercontent.com/128232148/236701816-87c7ed65-2ea5-4809-aa89-3624175035bf.png"> 
</p>

<h4>
    <ul><h3>3.Pie de Página</h3>
        <li>Se agregan los derechos de autor.</li>
        <li>Enlaces relacionados</li>
        <h6>Va dentro del cuerpo del documento</h6>
    </ul>
    <ul><strong><i>
        <h3>3.Footer:</h3>
        <li>Add copyrigth</li>
        <li>Links related</li>
        <h6>Goes inside of body of document</h6>
    </ul></i></strong>   
</h4>

<h3 align="center">Result: Form of Sign in</h3>
<p align="center">
   <img src="https://user-images.githubusercontent.com/128232148/236699329-7a37827f-1b16-4659-9684-4851c9f5e529.png">
</p>

<h4>La estructura del html es similar para crear el formulario de registro,sin embargo, es necesario agregar otras etiquetas y cajas de texto,adicional,estos elementos son agregados dentro de un contenedor con una clase, la cual, será utilizada para llamar los elementos desde otro archivo y ajustar los estilos.</h4>

<h4>Structure html is the same for create the form of registrer, also, is necessary add others <b>labels</b> and text box a <b>input</b>, this elements are added inside of a container <b>div</b> with a name ,which, It will be used for invoke the elements from another file and style ajust. </h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236698169-b0f1c48d-a1ae-487a-ba3d-84a6862f46f9.png">
</p>

<h3 align="center">Result: Form of Sign Up</h3>
<p align="center">
     <img src="https://user-images.githubusercontent.com/128232148/236692510-b9ce1773-329f-4ee1-b1b4-a16817aca87f.png">
</p>

<h3 align="center">Realizar Conexión a la base de datos</h3>
<h3 align="center"><b><i>Make conection to database</b></i></h3>
    
<h4>Crear script</h4>
<h4><b><i>Create script</i></b></h4>
<p>
  <img src="https://user-images.githubusercontent.com/128232148/236725686-c78c9f3b-a064-4a78-84c8-ffb5dd939404.png">
</p>


    
<h4>Como primera medida; Agregar las dependencias al archivo gestor <b>pom.xml</b> para poder conectar la base de datos</h4>
<h4><b><i>As a first measure; Added the dependencies to the file manager <b>pom.xml</b> to be able to connect the database</i></b></h4>
<p align="center">
  <img src="https://user-images.githubusercontent.com/128232148/236692560-233e2319-355b-464c-b218-f1a41f3a55b6.png" />
</p>

    
<h4>Dentro de la carpeta Java crear carpeta de  modelo y un archivo llamado usuario en donde se crearan: </h4>
<h4><b><i>Inside the Java folder, create a folder called model and a file called user where will be created:</b><i></h4>
 
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236708734-b0ca4302-6d61-4e41-90de-81c5c1035885.png">
</p>
    
<h4>The Attributes || Los atributos</h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236712845-6dde8ced-0149-42b4-896f-e90ca863e291.png">
</p>
    
<h4>Void constructor || Constructor vacio</h4>
<p align="center">
   <img src="https://user-images.githubusercontent.com/128232148/236712867-64bc5ce5-9a4b-4ffe-bf5a-09474c4bf3e9.png">
</p>
    
<h4>Constructor with parameters || Constructor con parámetros</h4>
<p align="center">
   <img src="https://user-images.githubusercontent.com/128232148/236712882-3455c08e-99d3-4be0-a1aa-7241fce1ff4f.png">
</p>
    
<h4>Accesor Methods || Metodos Accesores</h4>
<p align="center">
   <img src="https://user-images.githubusercontent.com/128232148/236713013-c21b0eb9-ba53-4967-974a-bab77c4192da.png">
</p>
    
<h4>Metodo String</h4>
<p align="center">
   <img src="https://user-images.githubusercontent.com/128232148/236713161-9ce9234a-b353-4768-96f5-ecbf587b93ac.png">
</p>
    
    
<h4>Dentro de la carpeta Java crear carpeta de  util y un archivo llamado BDConnection en donde se crearan la Conexión </h4>
<h4>Inside the Java folder, create a folder called util and a file called DBConection where is create Conexión</h4>
    
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236708741-2fa8cc1d-a556-42e0-93ac-7c087efbe817.png">
</p>

<h4>Crear atributos estaticos que tendran valor fijo y son necesarios para realizar la conexion: url,usuario,contraseña</h4>
<h4>Create attributes static that they will have fixed value neccesary for do the connection: url,username,password</h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236713670-6d0a173a-fcef-4e55-99c5-f745c5afe505.png">
</p>

<h4>Se crea un método estatico mediante <i><b>pool</b>(conjunto de recursos  ya almacenados para realizar conexiones)</i>,en el se acceden a los atributos y collecciones necesarias para realizar la conexión.</h4>
<h4>It's create a method static through <i><b>pool</b>(set of resources already stored to make connections)</i>,in the is to accces the attributes y collection need for realice the conection</h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236713697-dfa736b2-899b-4eb1-af28-16c0c14e1204.png">
</p>
    
<h4>Crear método estatico para retornar la conexión</h4>
<h4>Create méthod static for return the connection</h4>
<p align="center">
    <img src="https://user-images.githubusercontent.com/128232148/236713704-c58d5aa6-d195-4c10-8405-ebb312b80065.png">
</p>

<p>___________________________________________________________________________________________________________________________________________________________</p>

# JavaWeb_Taller_4_y_5
Conexión de Base de Datos y Encriptación de Contraseña
<p>Para crear la conexión es necesario dentro de la carpeta java de la estructura del documento ,luego, allí se crea una clase con el nombre BasicConexion </p>
<p>Conexión Basica Super Usuario</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/9922c277-9e21-4ebb-bccd-3756ce5ebb79">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/9883a779-563f-487a-809f-35ed1fb1d995">
</p>

<p>Conexión Sainglenton Super Usuario</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/310b6bd4-eca9-4cec-978b-47092461d432">
</p>

<p>Conexión Con Recursos Super Usuario</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/ea347628-772f-46c3-9bca-3cd7582e06b2">
</p>

<p>Conexión Pool Super Usuario</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/59304a45-f985-467b-ad16-e6eb6a1de5d3">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/7424ce1a-eae4-4d75-a49c-93b79dfa0175">
</p>

</p>
<p>Resultado de la Conexión Super Usuario</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/e478cb7d-16d6-447e-aba5-c17b26c4036e">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/d69c605f-d876-450d-a1e2-4b8ca88928b5">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/e2214727-df3f-4647-8330-6a9ade1e9465">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/ab507da1-5242-4c63-97ea-446251aed5ba">

</p>
<p>Crear cuenta de usuario con contraseña desde PhpMyAdmin </p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/40b553e5-c6fe-4562-9562-2125ff70b8f4">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/25523ce7-3611-4b25-8a21-8d8b1a72a3de">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/fc69009a-94a3-4dea-a488-711d6589d99f">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/d0e67837-49ba-49ef-af43-49daaab24f06">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/107c45d1-95f8-469c-8771-6640fe66afef">

</p>

<p>Resultado de Conexión con cuenta de Usuario</p>
<p align="center">
    <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/4ebc0915-475a-44d5-b0af-9235d7d6d1b3">
    <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/6762ced9-057f-4d60-80de-f0cb156e2751">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/ceb7f12a-472f-4331-91ae-60e9870e00c1">

  <img src="https://github.com/Maria-06/JavaWeb_Taller_4_y_5/assets/128232148/1031ac5e-b3dc-43de-b85d-419e4ca1e333">
</p>

<p>______________________________________________________________________________________________________________________________________________________</p>
# JavaWeb_Taller_6
Creación del Repository Pattern 

<h4>Creación Repositorio</h4>
<p>Aquí se crean los metodos </p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/a69c33c1-315b-48ea-ab45-5decd4a7f2ac">
</p>

<h4>Implementación del Repositorio al Usuario</h4>
<p>Aquí es necesario sobre escribir cada metodo aplicando los atributos del usuario</p>
<p align="center">
  <p>Metodo Crear</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/f030e352-ed27-4b0a-aa27-27f0818d28c7">
  <p>Metodo Listar Todos los Usuarios</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/f6710fb6-3379-40a5-b886-a041575642e3">
  <p>Metodo Buscar por Id</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/ac8a1c86-a918-42e1-8c04-076a1a73ad7a">
  <p>Metodo Guardar</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/78b35e36-8044-4772-ada2-405238c927b3">
  <p>Metodo Eliminar</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_6/assets/128232148/7b4604e2-157b-4691-a112-4e6bc221d1bb">
</p>

<p>Se repite el mismo proceso para las tablas deCategoria y Pro</p>

<p>_____________________________________________________________________________________________________________________________________________________</p>
# JavaWeb_Taller_7

### Ampliación Repository

<p align="center">Aqui se crearán en la carpeta del modelo dos archivos nuevos para Categoria y Producto</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/e1f4cbf6-cdc5-4381-a44b-f5dd70ff0c1d">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/cfe96f93-9459-49fa-a4fa-3eff7fd49557">
</p>

<p>Luego, dentro de la carpeta repository se crearán los metodos correspondientes</p>
<p align="center"> se crea el  archivo "CategoryRepositoryImpl" y se implementan los metodos de su repositorio</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/eccd27b5-2c80-4e39-8eec-04cf5f5dd218">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/a838206c-c04d-4157-82f7-55097d9bbbb6">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/67e271df-8407-474f-be8b-041367b55458">
</p>

<p align="center">se crea el  archivo "ProductCategoryImpl" y se implementan los metodos de su repositorio</p>
<p align="center">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/ac94d78f-5bf8-4aca-a292-257a1cf32cf0">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/7e938d2e-e026-44be-b560-385d8ed6bd55)">
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/77240258-0a95-4d16-94ad-f968768e6f56">
</p>

<p align="center">A continuación, se crearán los Test de cada tabla</p>
<p align="center"> se crea el  archivo "TestCategoryRepositoryImpl" en donde se pobrarán los metodos</p>
<p align="center">
    <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/15d339b5-bc2e-485b-9179-f928050ff781">
  <p align="center">Prueba en Consola</p>
    <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/bf0efb43-8941-4f2c-9d33-2b5285f3a963">
</p>

<p align="center">
<p align="center"> se crea el  archivo "TestProductRepositoryImpl" en donde se pobrarán los metodos</p>
  <img src="https://github.com/Maria-06/JavaWeb_Taller_7/assets/128232148/6e290600-7ad7-4ac5-8691-c9c45f00fd2a">
</p>



