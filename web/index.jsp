<%-- 
    Document   : index
    Created on : 09/10/2012, 20:34:56
    Author     : heitormaffra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="juros" action="juros.jsp" method="POST">
            <div>
            Valor inicial: <input type="text" name="txtValorInicial" value="1000" size="30" />
            </div>
            <div>
            Taxa de jutos: <input type="text" name="txtTaxaJuros" value="1" size="10" /> &nbsp; %
            </div>
            <div>
            Meses: <input type="text" name="txtMeses" value="12" size="10" /> &nbsp; meses
            </div>
            <div><input type="submit" value="Calcular" name="btnCalcular" />
            <input type="reset" value="Limpar" name="btnLimpar" /></div>
        </form>
    </body>
</html>
