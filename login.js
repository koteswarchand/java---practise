function credentials() {

    //checking whether the login details empty or not
    var username  = document.getElementById("user");
    var passw = document.getElementById("pass");
   
    if(username.value == "" && passw.value == ""){

        alert("fileds can not be empty");
        return false;
    }

    else if(username.value == ""){

        alert("User name can not be empty");
        return false;
    }

    else if(passw.value == ""){

        alert("Password can not be empty");
        return false;
    }

    else{
        return true;
    }



}