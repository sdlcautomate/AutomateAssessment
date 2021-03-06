$(document).ready(function(){
document.getElementById('phoneErrorMsg').style.display='none';
document.getElementById('submit-button').disabled=true;

//if(document.getElementById('phone').value.replace(/\D/g,'').substring(0,10).length>0){
//	phoneFormat();
//}
	
	
	
var changeEmail = function (blur){
	var validEmail = validateEmail(document.getElementById('email').value);
	if(validEmail){
		phoneFormat();
		$("#emailErrorMsg").css("display","none");

		return ;
	}
	$("#emailErrorMsg").css("display","block");
	document.getElementById('submit-button').disabled = true;
	
}
	
var validateEmail = function (email) {
	    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	    return re.test(String(email).toLowerCase());
	}
	
	
	
      // format text to look like a phone number
    var  phoneFormat =  function(){
    	// Strip all characters from the input except digits
    	  document.getElementById('phone').value.replace(/\D/g,'');
         var input = document.getElementById('phone').value.replace(/\D/g,'').substring(0,10);
         console.log(input);
         
		  document.getElementById('submit-button').disabled= input.length<10|| !validateEmail(document.getElementById('email').value.trim());
		  
		  if(input.length<10) {
			  //alert("Phone number is less than 10 digits");
			  var id="phoneErrorMsg";
			  document.getElementById('phoneErrorMsg').style.display='block';
			  }else{
				  document.getElementById('phoneErrorMsg').style.display='none';

			  }

          // Based upon the length of the string, we add formatting as necessary
          var size = input.length;
          if(size == 0){
                  input = input;
          }else if(size < 4){
        	      input = '('+input;
          }else if(size < 7){ 
        	      input = '('+input.substring(0,3)+') '+input.substring(3,6);
          }else{
        	      input = '('+input.substring(0,3)+') '+input.substring(3,6)+'-'+input.substring(6,10);
          }
          document.getElementById('phone').value = input;
         
      }
      
   
      $("#emailErrorMsg").css("display","none");
      
    	 $("#phone").on("change",phoneFormat); 
    	 $("#phone").on("blur",phoneFormat) 
    	 $("#email").on("change",changeEmail); 
    	 $("#email").on("blur",changeEmail) 
})      