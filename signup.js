function valiation(){

    //validating sign up page

    var fname = document.getElementById("first name");
    var lname = document.getElementById("last name");
    var email = document.getElementById("email");
    var mbl = document.getElementById("Mobile");
    var passw = document.getElementById("pass");
    var passw2 = document.getElementById("pass2");
    var addr = document.getElementById("address");
    var zip = document.getElementById("zip code");
    var city = document.getElementById("city");
    var state = document.getElementById("state");

    if(fname.value == "" && lname.value == "" && email.value =="" && mbl == "" && passw == "" && passw2 == "" && addr == "" & zip == "" && city == "" && state == ""){

        alert("fileds can not be empty");
        return false;
    }

    else if(fname.value == ""){
        alert("First Name  can not be empty");
        return false;
    }

    else if(lname.value == "" ){
        alert("Last name can not be empty");
        return false;
    }

    else if(email.value ==""){
        alert("Email can not be empty");
        return false;
    }

    else if(mbl == "" ){
        alert("Mobile Number can not be empty");
        return false;
    }

    else if(passw == ""){
        alert("Please enter password which will be used for sign in");
        return false;
    }

    else if(passw2 == ""){
        alert("Please Re- enter your password");
        return false;
    }

    else if(addr == ""){
        alert("This address will be used as delivery address, please fill it");
        return false;
    }

    else if( zip == ""){
        alert("Zp code can not be empty");
        return false;
    }

    else if(city == ""){
        alert(" city can not be empty");
        return false;
    }

    
    else if(state == ""){
        alert(" State can not be empty");
        return false;
    }

    else{
        return true;
    }



    


}