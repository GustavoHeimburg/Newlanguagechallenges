desafio6 = ()=> {
    var valor = []
    for (let i = 1; i <= 5; i++) {
        var num = prompt(`Digite o seu ${i} valor (apenas numeros inteiros + ou -`);
        valor.push(num)
    }
    console.log(valor)
    var positivo = 0;
    var negativo = 0;
    var par = 0;
    var impar = 0;
    var zero = 0;

    for (var num of valor) {
        console.log(num);
        if (num % 2 == 0){
            par++;
        } else {
            impar++
        }
        if (num > 0) {
            positivo++;
        } else if (num < 0) {
            negativo++;
        } else {
            zero++
        }
    }

    alert(`Em seus numeros contem: ${par} numeros pares, ${impar} impares, ${positivo} positivos, ${negativo} negativos e ${zero} zeros`)
    console.log("Par: " + par);
    console.log("Impar: " + impar);
    console.log("Positivo: " + positivo);
    console.log("Negativo: " + negativo);
    console.log("Zero: " + zero);
}