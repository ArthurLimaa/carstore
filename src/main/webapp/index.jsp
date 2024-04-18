<html>
<body>
<h1>Cadastro de carro</h1>

<form action="/create-car" method="post">
    <label> Car name: </label>
    <input type="text" name="name" id="name" value="${param.name}">
    <input type="hidden" name="id" id="id" value="${param.id}">
    <button type="submit">Cadastrar</button>
</form>
</body>
</html>
