function numberPressed(evt){
    	  var charCode = (evt.which) ? evt.which : evt.keyCode;
          if(charCode > 31 && (charCode < 48 || charCode > 57) && (charCode < 36 || charCode > 40)){
                  return false;
          }
          return true;
      }
      

      // format text to look like a phone number
      function phoneFormat(input){
    	// Strip all characters from the input except digits
          input = input.replace(/\D/g,'');

          // Trim the remaining input to ten characters, to preserve phone number format
          input = input.substring(0,10);

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
          return input;
      }