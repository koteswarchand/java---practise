function rock(){

    var input = document.getElementById("p-choice").innerHTML = "Rock";
    cplay();
}

function paper(){

    var input = document.getElementById("p-choice").innerHTML = "Paper";
    cplay();
}

function scissor(){

    var input = document.getElementById("p-choice").innerHTML = "Scissors";
    cplay();
}


function cplay(){

    var choice = Math.floor(Math.random() * 3);
    if(choice == 0){

        var input = document.getElementById("c-choice").innerHTML = "Rock";
    }

    else if(choice == 1){

        var input = document.getElementById("c-choice").innerHTML = "Paper";

    }

    else{
        var input = document.getElementById("c-choice").innerHTML = "Scissors";
    }

}