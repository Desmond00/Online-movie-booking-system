<!DOCTYPE html>
<html>
  <head lang="en">
  <meta charset="UTF-8">
  <script language="JavaScript">
    function showInput() {
        /*document.getElementById('display').innerHTML = 
                    document.getElementById("user_input").value;*/
		var c=0;
		for(c=1;c<=5;c++)
		{	document.getElementById('display').innerHTML=c;}
    }
  </script>

  </head>
<body>

  <form>
    <label><b>Enter a Message</b></label>
    <input type="text" name="message" id="user_input">
  </form>

  <input type="submit" onclick="showInput();"><br/>
  <label>Your input: </label>
  <p><span id='display'></span></p>
</body>
</html>