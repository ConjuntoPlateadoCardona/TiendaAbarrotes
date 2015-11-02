<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css.css" title="style">
        <title>Contacto</title>
        <script type="text/javascript">
            function permite(elEvento, permitidos) { // Variables que definen los caracteres permitidos 
                var numeros = "0123456789";
                var caracteres = " abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                var numeros_caracteres = numeros + caracteres;
                var teclas_especiales = [8, 37, 39, 46];
                // 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha 
                // Seleccionar los caracteres a partir del parámetro de la función 
                switch (permitidos) {
                    case 'num':
                        permitidos = numeros;
                        break;
                    case 'car':
                        permitidos = caracteres;
                        break;
                    case 'num_car':
                        permitidos = numeros_caracteres;
                        break;
                }
                // Obtener la tecla pulsada
                var evento = elEvento || window.event;
                var codigoCaracter = evento.charCode || evento.keyCode;
                var caracter = String.fromCharCode(codigoCaracter);
                // Comprobar si la tecla pulsada es alguna de las teclas especiales
                // (teclas de borrado y flechas horizontales)
                var tecla_especial = false;
                for (var i in teclas_especiales) {
                    if (codigoCaracter == teclas_especiales[i]) {
                        tecla_especial = true;
                        break;
                    }
                }
                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos
                // o si es una tecla especial
                return permitidos.indexOf(caracter) != -1 || tecla_especial;
            }

            function limita(maximoCaracteres) {
                var elemento = document.getElementById("texto");
                if (elemento.value.length >= maximoCaracteres) {
                    return false;
                }
                else {
                    return true;
                }
            }
            function validacion() {

                //validamos campo1
                valor1 = document.getElementById("Nombre").value;
                if (valor1 == null || valor1.length == 0 || /^\s+$/.test(valor1))
                {
                    alert("*Campo vacio...Ingresa Nombre");
                    //return false; 
                }
                //validamos campo2
                valor2 = document.getElementById("mensaje").value;

                if (isNaN(valor2)) {
                    alert("*Campo vacio...escribe tu mensaje");
                    //return false; 
                }

                valor3 = document.getElementById("email").value;

                if (isNaN(valor3)) {
                    alert("*Campo vacio...e-mail");
                    //return false; 
                }

                //validar email
                email = document.getElementById("email").value;
                if (!(/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)/.test(email))) {
                    alert("*Email incorrecto");
                    //return false;
                }


            }
        </script>
    </head>
    <body>
        <h1>Contactanos...</h1>
        <div id="menu">
            <ul>
                <c:url value="/Conocenos.jsp" var="itemDetailsURL">
                            <c:param name="itemId" value="Dev"/>
                        </c:url>
                        <c:url value="/Productos.jsp" var="itemProducto">
                            <c:param name="itemIdPro" value="DevProducto"/>
                        </c:url>
                        <c:url value="/Contacto.jsp" var="itemContacto">
                            <c:param name="itemIdCon" value="DevContacto"/>
                        </c:url>
                        <c:url value="/Acceso.jsp" var="itemAcceso">
                            <c:param name="itemIdAcc" value="DevAcceso"/>
                        </c:url>
                        <c:url value="/registro.jsp" var="itemRegistro">
                            <c:param name="itemIdReg" value="DevRegistro"/>
                        </c:url>
                        <li><a href="<c:out value="${itemDetailsURL}"/>"  class = "normalMenu">Conocenos</a></li>
                        <li><a href="<c:out value="${itemProducto}"/>"  class = "normalMenu">Productos </a></li>
                        <li><a href="<c:out value="${itemContacto}"/>"  class = "normalMenu">Contacto</a></li>
                        <li><a href="<c:out value="${itemAcceso}"/>"  class = "normalMenu">Ingresar</a></li>
                        <li><a href="<c:out value="${itemRegistro}"/>"  class = "normalMenu">Registrate_Aquí</a></li>
            </ul>
        </div>
        <section id="contacto" class="clearfix">
            <div class="primary">
                <p class="intro">
                    Si tienes alguna duda, comentario o sugerencia sobre alguna de nuestras tiendas no dudes
                    en informarnos enviandonos un correo, por favor llena todos los campos. <br>
                    Tu respuesta llegará prontamente, gracias!!!
                </p>
                <form method="post" action="Contacto.jsp" id="contactform" onsubmit="return validacion()">
                    <div id="contacto">
                        <div>
                            <p>Envia tu mensaje</p>
                        </div>
                        <div>
                            <label>Nombre<span class="required" onkeypress="return permite(event, 'car')">*</span></label>
                            <input name="Nombre" type="text" id="Nombre" value="" />
                        </div>
                        <div>
                            <label>Email<span class="required">*</span></label>
                            <input name="correo" type="email" id="email" value="" />
                        </div>

                        <div>
                            <label>Mensaje<span class="required" onkeypress="return limita(500);">*</span></label>
                            <textarea name="mensaje" rows="20" cols="25"  id="mensaje" style="resize:none"></textarea><br/><br/>
                        </div>
                        <div>
                            <input type="submit"  value="Enviar" class="button">
                            <input type="reset" value="Limpiar" class="button">
                        </div>
                    </div>
                </form>
            </div>
            <aside>
                <h2>Informacion de Contacto</h2>
                <center>
                    <a href="http://www.facebook.com" target="_blank">Facebook</a></li>
                </center>
                Email: abarrotes@elcompi.com.mx
                </p>
        </section>
    </div>
</body>
</html>
