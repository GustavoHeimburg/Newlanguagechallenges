desafio5 = ()=> {
    var colab = prompt('Digite nome do colaborador:');
    var valorHrs = prompt('Digite o valor por hora trabalhada:')
    var hrsTrab = prompt('Digite a quantidade de horas Trabalhadas:');

    salario = valorHrs * hrsTrab;

    alert(colab + ' deve receber ' + salario + ' reais pelo seu trabalho.')
}