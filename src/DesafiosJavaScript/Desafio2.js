desafio2 = ()=> {
    var nota1 = prompt('Digite sua nota:');
    var nota2 = prompt('Digite sua nota:');
    var nota3 = prompt('Digite sua nota:');
    var nota4 = prompt('Digite sua nota:');
    var nota5 = prompt('Digite sua nota:');

    multNota1 = nota1 * 2;
    multNota2 = nota2 * 2;
    multNota3 = nota3 * 2;
    multNota4 = nota4 * 2;
    multNota5 = nota5 * 2;

    SomaTotal = multNota1 + multNota2 + multNota3 + multNota4 + multNota5;

    if (SomaTotal < 0) {
        alert("Sua nota final foi " + SomaTotal + " e Seu Conceito é E você está reprovado.");
    } else if (SomaTotal > 0 && SomaTotal <= 35) {
        alert("Sua nota final foi " + SomaTotal + " e Seu Conceito é D você está Aprovado.");
    } else if (SomaTotal > 36 && SomaTotal <= 60) {
        alert("Sua nota final foi " + SomaTotal + "  e Seu Conceito é C você está Aprovado.");
    } else if (SomaTotal > 61 && SomaTotal <= 85) {
        alert("Sua nota final foi " + SomaTotal + " e Seu Conceito é B você está Aprovado.");
    } else if (SomaTotal > 86 && SomaTotal <= 100) {
        alert("Sua nota final foi " + SomaTotal + " e Seu Conceito é A você está Aprovado.");
    } else {
        alert("Sua nota final foi " + SomaTotal + " e Seu Conceito é E você está reprovado.");
    }
}