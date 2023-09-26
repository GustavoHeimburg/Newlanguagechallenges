desafio7 = ()=>{
    var pedestre = () => {
        var naFaixa = prompt("Você está na faixa? (s) sim . (n) não");
        var semaforo = prompt("O sinal está vermelho? (s) sim . (n) não");
        if (naFaixa && semaforo) {
            alert("Você pode atravessar a rua.");
            console.log("Você pode atravessar a rua.");
        } else {
            alert("Você não pode atravessar a rua.");
            console.log("Você não pode atravessar a rua.");
        }
    }
    var motorista = ()=>{
        var cinto = prompt("Você está usando o cinto de segurança? (s) sim . (n) não");
        var bebeu = prompt("Você ingeriu alguma bebida alcoólica recentemente? (s) sim . (n) não");
        var sinal = prompt("O semáforo está verde? (s) sim . (n) não");

        if(cinto === "s" && bebeu === "n" && sinal === "s"){
            alert("Você pode dirigir com segurança.");
            console.log("Você pode dirigir com segurança.");
        }else{
            alert("Você não pode dirigir.");
            console.log("Você não pode dirigir.")
        }
    }
    var tipoCaso = prompt("Você é pedestre? digite 1; Você é motorista? digite 2");
    if (tipoCaso === "1"){
        pedestre();
    } else if (tipoCaso === "2"){
        motorista();
    } else {
        alert("Opção não encontrada.")
    }
}
