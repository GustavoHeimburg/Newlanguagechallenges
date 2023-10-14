desafio4 = ()=> {
    var notaA = parseFloat(prompt('Digite sua primeira nota:'));
    var notaB = parseFloat(prompt('Digite sua segunda nota:'));
    var notaC = parseFloat(prompt('Digite sua terceira nota:'));

    var media = (notaA + notaB + notaC) / 3;

    alert("Sua Média Foi " + media.toFixed(2) + " ,Parabéns.");
}
