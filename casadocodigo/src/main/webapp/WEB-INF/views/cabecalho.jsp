<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%-- 
<head>
		<c:url value="/" var="contextPath" />	  
		<link rel="icon" href="//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979" type="image/ico" />
		<link href="https://plus.googlecom/108540024862647200608" rel="publisher"/>
		
		<link href="${contextPath}resources/css/cssbase-min.css" rel="stylesheet" type="text/css" media="all" />
		<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'/>
		<link href="${contextPath}resources/css/fonts.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/fontello-ie7.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/fontello-embedded.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/fontello.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/layout-colors.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/responsive-style.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${contextPath}resources/css/guia-do-programador-style.css" rel="stylesheet" type="text/css"  media="all"  />
	    <link href="${contextPath}resources/css/produtos.css" rel="stylesheet" type="text/css"  media="all"  />
		<link rel="canonical" href="http://www.casadocodigo.com.br/" />	
</head>
<body class="produto">
 --%>
  <header id="layout-header">
		<div class="clearfix container">
			<a href="/" id="logo">
			</a>
			<div id="header-content">
				<nav id="main-nav">
					
					<ul class="clearfix">
						<li><a href="${contextPath}/carrinho" rel="nofollow">Carrinho (${carrinhoCompras.quantidade})</a></li>

						<li><a href="/pages/sobre-a-casa-do-codigo" rel="nofollow">Sobre N�s</a></li>

						<li><a href="/pages/perguntas-frequentes" rel="nofollow">Perguntas Frequentes</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
	<nav class="categories-nav">
		<ul class="container">
			<li class="category"><a href="http://www.casadocodigo.com.br">Home</a></li>
			<li class="category"><a href="/collections/livros-de-agile">Agile </a></li>
			<li class="category"><a href="/collections/livros-de-front-end">Front End </a></li>
			<li class="category"><a href="/collections/livros-de-games">Games </a></li>
			<li class="category"><a href="/collections/livros-de-java">Java </a></li>
			<li class="category"><a href="/collections/livros-de-mobile">Mobile </a></li>
			<li class="category"><a href="/collections/livros-desenvolvimento-web"> Web </a></li>
			<li class="category"><a href="/collections/outros"> Outros </a></li>
		</ul>
	</nav>