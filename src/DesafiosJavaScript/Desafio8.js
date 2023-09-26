desafio8 = () => {
    alert("Reserva de ingressos - Clube JavaScript Night");
    var nome = prompt("Digite o seu nome: ");
    var idade = prompt("Digite a sua idade: ");
    var tipoEstudante = prompt("Você é estudante de JavaScript? s (de sim); n (de não)");
    var tipoIngresso = prompt(`
    1.Padrão R$ 20,00
    2.VIP R$ 50,00
    Promoção: Ser estudande de JavaScript recebe 50% de desconto!
    `);

    if (idade < 18) {
        alert("Não é permitido a entrada de menores de idade.");
        var idadeNova = 18 - idade;
        alert(`Ainda faltam ${idadeNova} anos para participar das festas.`)
        return;
    }

    var valorIngresso = tipoIngresso == 1 ? 20 : 50;
    var valorDescontado = valorIngresso;

    if (tipoEstudante.toLowerCase() == 's') {
        valorDescontado *= 0.5;
    }

    alert(`O valor original do ingresso é R$ ${valorIngresso.toFixed(2)}, e o valor com desconto é R$ ${valorDescontado.toFixed(2)}.`);
}
