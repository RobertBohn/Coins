<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
</head>

<html>
<body>

<script src="/resources/scripts/jquery-1.8.3.min.js"></script>

<script>

    $( document ).ready(function() {

        function clearAll() {
            $( "#footer" ).hide();
            $( "#header" ).hide();
            $( "#both" ).hide();
        }

        $( "#footer" ).click(function( event ) {
            clearAll();
            $( "#both" ).show();
        });

        $( "#header" ).click(function( event ) {
            clearAll();
            $( "#footer" ).show();
        });

        $( "#both" ).click(function( event ) {
            clearAll();
            $( "#header" ).show();
        });

    });

</script>




<h1>${message}</h1>

<div id="footer">
    <a id="footer_link" href="#">Footer</a>
</div>
<div id="header">
    <a id="header_link" href="#">Header</a>
</div>
<div id="both">
    <a id="both_link" href="#">Both</a>
</div>

</body>
</html>