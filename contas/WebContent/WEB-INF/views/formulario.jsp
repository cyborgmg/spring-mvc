<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
    <h3>Adicionar Contas</h3>
    <form action="adicionaConta" method="post">
        Descri��o: <br/>
        <textarea name="descricao" rows="5" cols="100"></textarea>
        <form:errors path="conta.descricao" />
        <br/>
        Valor: <br/>
        <input type="text" name="valor" /><br/>
        Tipo: <br/>
        <select name="tipo">
            <option value="ENTRADA">Entrada</option>
            <option value="SAIDA">Sa�da</option>
        </select>
        <br/><br/>
        <input type="submit" value="Adicionar"/>
    </form>
</body>
</html>