| [./media/image1.png](./media/image1.png)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | **FORMATO DE INFORME DE PRÁCTICA DE LABORATORIO / TALLERES / CENTROS DE SIMULACIÓN – PARA ESTUDIANTES** |                                                                                                                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                                         |                                                                                                                                                                                                  |
| **CARRERA**: Computación                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | **ASIGNATURA**: Plataformas Web                                                                         |                                                                                                                                                                                                  |
| **NRO. PRÁCTICA**:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | 2                                                                                                       | **TÍTULO PRÁCTICA**: Desarrollo de una aplicación JEE basado en Servlets, JSP y JDBC para el intercambio de datos en un modelo de tres capas aplicando los patrones diseño de software MVC y DAO |
| **OBJETIVO ALCANZADO:**  Diseñar y desarrollar modelos de software en diferentes niveles de abstracción y modelos de datos a nivel transaccional y analítico con entornos de desarrollo actuales. Persistencia de datos mediante DAOJdbc y manipulación de estos, ya sea buscando por medio de código o enlistándolos en una tabla                                                                                                                                                                                      |                                                                                                         |                                                                                                                                                                                                  |
| **ACTIVIDADES DESARROLLADAS**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                         |                                                                                                                                                                                                  |
| **Creación del repositorio en GitHub**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                                         |                                                                                                                                                                                                  |
| **RESULTADO(S) OBTENIDO(S)**: Se ha desarrollado una aplicación con tecnología JEE para gestionar una agenda telefónica en la web,se ha aplicado patrones de diseño de software MVC y DAO, en donde, los modelos fueron clases POJOs de Java, la vista fue JSP + JSTL y los controladores a través de DAOs y Servlets.                                                                                                                                                                                                  |                                                                                                         |                                                                                                                                                                                                  |
| **CONCLUSIONES**: La implementación de tecnologías actuales en el desarrollo web es muy importante, porque la tecnología avanza muy rápido y no nos podemos quedar atrás, una de estas tecnologías es JEE, que toma mas tiempo que otras herramientas, pero se puede decir que ofrece mayor seguridad con filtros y sesiones, así también mediante el uso de patrón de diseño se puede conseguir una mejor organización a nuestra aplicación, sabiendo que tener buenas practicas es importante al momento de programar |                                                                                                         |                                                                                                                                                                                                  |
| **RECOMENDACIONES**: Aplicar conceptos de interacción humano máquina para el desarrollo de la GUI.                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                         |                                                                                                                                                                                                  |

![](media/a1ce8ad3015ab774ac925ba2f5d98523.png)

**Arquitectura del Modelo**

![](media/e0408f7c61368613095d413c51792d4d.png)

**Requisitos aplicación Web**

**Los usuarios pueden registrarse en la aplicación a través de un formulario de
creación de cuentas**

**Método Persistencia**

![](media/2844f7891cdd00fee56038ebcd0a5055.png)

**Servlet**

![](media/5914ff8efb21b1353e8d7e0eb2f720fd.png)

Después de una larga validación de datos, se puede crear un nuevo usuario, con
la información que fue obtenida en el JSP, se inicia sesión con el usuario y
creado y se le envía a la pagina principal privada que pertenece a cada usuario

![](media/d1ec1b2c910ed2b61e95c237e43f1a9e.png)

![](media/83e6e5c12cc080ea6a9fa6f4f7140f64.png)

![](media/725846ce5e1955c7946bb0361ad98e79.png)

![](media/d1d1de28c6508e9ff011e3bbb82912de.png)

Después de un largo proceso de validación, finalmente se ha creado el usuario
con éxito y redirige hacia la página principal privada del usuario

![](media/b7bc86178529854ff103a4c1e368cf0a.png)

![](media/216fbb1a94afaa862d84bc2545a2c742.png)

Se puede observar que se ha insertado un nuevo usuario en la base de datos

**JSP**

![](media/d15fbf2f89352d8955c4431f5d50ca4a.png)

**Un usuario puede iniciar sesión usando su correo y contraseña**

**Servlet**

![](media/9492a10b0bd13ba086bb058ea8772dfe.png)

![](media/1753a45334f67e02b79c92e52e18c26c.png)

Se ha trabajado con sesiones para aumentar la seguridad del sistema y se le ha
enviado un objeto de tipo **Usuario,** el cual nos va a permitir personalizar la
parte privada para cada cliente y así mismo mediante filtros asegurar que no sea
posible infiltrarse una vez se ha cerrado sesión

**JSP**

![](media/03e9e3d748efc851b330d7b88528c69f.png)

En esta parte se llama al Servlet Controlador y se le envía los parámetros
necesarios para inicio de sesión, así mismo si los datos son incorrectos, el
servlet devolverá algunos mensajes de validación, de no ser así, redirige hacia
la página principal del usuario en la parte privada.

Como se ha trabajado con formularios, ha sido necesario validar los datos de
entrada para un correcto funcionamiento

**Formulario de log in**

![](media/20cdae1733656e55e29abb1bc7e15c39.png)

**Validación formularios**

![](media/0cd64584230282b6297944f411544756.png)

![](media/07a6d4ba930ef3fc9fe341e7191d1ab4.png)

![](media/95d198fec4e924db5ff0201ca670fec2.png)

Luego de un inicio correcto de sesión redirige hacia la página principal del
usuario

![](media/d16a94763b4dc6d72d9d3781c3f0e657.png)

**Una vez iniciado sesión el usuario podrá:**

-   **Registrar, modificar, eliminar, buscar y listar sus teléfonos**

>   **Método de Persistencia(Registrar):**

![](media/f61984d2dbb2b6b581419802bfdfb68f.png)

>   **Servlet:**

![](media/1e3da60bd544e0e3862b8bf12c166488.png)

>   Despues de validar correctamente los parámetros, se procede a crear el
>   teléfono, se agregar al usuario el teléfono creado, y posteriormente se en
>   via el objeto Usuario a la sesion para refrescar la tabla

![](media/80ec4fb11f229e175cbe62183c6a12ac.png)

![](media/418435d8ef0a8b47738c179a95673515.png)

![](media/c529ecf777d1193b2beb11713062d773.png)

![](media/90023d92cf1656492bb53378d85edc44.png)

![](media/18c25b5ec41a3b8404fcb9a2f21d9d2d.png)

![](media/233e92ab17d9964b946680b40cc75bb8.png)

>   Registrado correctamente y de forma automática se refresca la tabla

>   **JSP**

![](media/efde87da575e4bf65edc0c0b54353c18.png)

>   Envia de parámetro **acción=crear_telefono,** puesto que todas las acciones
>   se encuentran en el mismo controlado y es necesario identificarlas

>   **Actualizar y Eliminar**

![](media/42d29acfdb228832b3731daf89db6d6f.png)

>   El usuario tiene una lista de números que pueden ser eliminados o
>   actualizados, ingresa el numero en la caja de texto indicada y puede
>   realizar cualquiera de las dos acciones

![](media/4dc03c67ad09ff5d7a9825e318e2ec63.png)

![](media/73d9310261410a130333168c44c359ad.png)

![](media/bd2469212741df0f76382b4d73b15dfc.png)

>   **Listar los números de teléfono de un usuario usando su número de cédula o
>   correo electrónico**

>   Para esto se ha creado dos métodos en la persistencia

>   **Buscar por cedula**

![](media/5d7bbc8f25b3c3ed733880b6e4536cdd.png)

>   **Buscar por correo**

![](media/44ca8a899acd26e967860676399d96b2.png)

>   **Servlet(Controlador)**

![](media/fe0eb429e8821df8ff9cd5190f7676e3.png)

![](media/347525a7532696a647c3c4d28c4e9e0c.png)

>   Realiza la respectiva validación y luego busca con los métodos antes
>   expuestos.

![](media/f9a37db2bf1678900d2881145d9dfa06.png)

![](media/b83489c5f2c40957d12f13f61120fd45.png)

![](media/0044b1bd6d6dd49eaac74ede13f23d12.png)

![](media/c75236cafdbf982cf569ac1ce66f6bdf.png)

![](media/4b312b0c7921522f87690abb0059fe91.png)

>   Es un correo valido por lo tanto devuelve la siguiente tabla, ocurre lo
>   mismo con la cedula

![](media/7953e7bd79fc07936acbe1553a7e11e7.png)

![](media/7840917c2f99fd57f544bf039d7ab9fe.png)

>   Al dar click en el enlace de correo, automáticamente se abre la aplicación
>   predeterminado para correo

![](media/476192fced709440d36270ded002e974.png)

>   Así mismo ocurre cuando se da click a uno de los teléfonos de la lista, se
>   abre la aplicación predeterminada para hacer llamadas

>   **Filtros**

>   Se ha creado dos filtros, uno para redireccion de JSPs y otro para la
>   redireccion de los Servlets, los dos dirigen hacia la ventana llamada
>   **IniciarSesion.jsp**

>   **FiltroServlet**

![](media/a208a8a9a4892bc62f682b0d73c616b9.png)

![](media/102c6c981c38f252c91e2fae7c3ef5e7.png)

>   **Filtro JSPs**

![](media/eef3eadb76190e0cf7d17a1193b2985d.png)

![](media/6f69c36c83102755795761b98424dd67.png)

>   **Funcionamiento Filtro**

>   Estoy en mi cuenta

![](media/f99eb38871be23b9b0c8fe1a5d6fe19f.png)

>   Al momento de aplastar en el icono de teléfono, me dirigió hacia la parte
>   publica de la pagina web

![](media/1bbbd8733eaec6115038b25edc1461c2.png)

>   Ahora quiero volver a mi cuenta personal, entonces como la sesión sigue
>   iniciada, me va a permitir regresar.

![](media/070258c7af8a3943a23f4f1cc7d058aa.png)

>   Ahora voy a cerrar sesion en mi cuenta

![](media/f13323f8cc68b53d8f94d081fe420968.png)

>   Y me encuentro nuevamente en la parte del inicio

![](media/f900667810a86376145f85949e3f7028.png)

>   Al momento de hacer click en **Mi cuenta**, el filtro va a activarse, pues
>   no encuentra ninguna sesión activa, me redirige hacia la página de login.

![](media/bf6aff82d1e8cbdba757df3bed6d8d89.png)

>   **Parte publica**

>   Pagina propuesta por el docente:

![](media/41dbe3d7e5fcbe0a847c07b05e35ed4b.png)

>   Se ha diseñado una pagina muy similar a la propuesta por el docente:

![](media/93d4d833922e2a8a9635e4bebf6dd68e.png)

![](media/5ea0cd50b01fa3044fb4eae13497708a.png)

![](media/db015dcba9c8fc8bb6d4d5930d948623.png)

![](media/85c4b3c8c528b8cac0af402dc5781730.png)

![](media/65bb5b1d030d79be044bd6476a872c0d.png)

**Nombre de estudiante: \_____________________Bryam Guzman_______\_**

**Firma de estudiante: \___________\_**

![C:\\Users\\ASUS\\AppData\\Local\\Microsoft\\Windows\\INetCache\\Content.MSO\\824E4B25.tmp](media/1f539ae40276caca5147b5134db17da1.png)

**\__________________\_**
