desafio4 = ()=> {
    var notaA = prompt('Digite sua nota:');
    var notaB = prompt('Digite sua nota:');
    var notaC = prompt('Digite sua nota:');

    notaAtotal = notaA * 0.2;

    notaBtotal = notaB * 0.33;

    notaCtotal = notaC * 0.5;

    media = notaAtotal + notaBtotal + notaCtotal;

    alert("Sua Média Foi " + media + " ,Parabéns.");
}