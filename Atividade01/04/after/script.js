var calcular = document.getElementById('calcular')
var masc = document.getElementById('Masculino')
var fem = document.getElementById('Feminino')
var sexo = document.getElementById('sexo')
var salvar = document.getElementById('salvar')
var ehsexo = ''
var saida_elementos = document.getElementById('saida')

function calc_imc() {
    var nome = document.getElementById('nome').value
    var peso = document.getElementById('peso').value
    var altura = document.getElementById('altura').value
    var result = document.getElementById('total').value

    var resultado = document.getElementById('resultado')
    var imc = document.getElementById('imc')

    result = valida_campos(nome, altura, peso, valida)
    if (result === false) {
        //throw new Error('Parameter is not a number!');
        windows.alert('Error')
    }
    imc.innerHTML = result
}

function saida() {
    saida_elementos.innerHTML += 'Nome: ' + nome.value + '<br>'
    saida_elementos.innerHTML += 'Altura: ' + altura.value + '<br>'
    saida_elementos.innerHTML += 'Peso: ' + peso.value + '<br>' + '<br>'
}

function sexof() {
    var ehsexo = 'Feminino'
    sexo.innerHTML = ehsexo
}

function sexom() {
    var ehsexo = 'Masculino'
    sexo.innerHTML = ehsexo
}

valida_campos(nome, altura, peso, valida) {
    if (nome !== '' && altura !=='' && peso !== '') {
        const val_imc = (peso / (altura * altura)).toFixed(1)

        if (val_imc < 18.5) {
            return 'Abaixo do peso'
        } 
        
        if (val_imc < 25) {
            return 'Peso ideal'
        }
        
        if (val_imc < 30) {
            return 'Sobrepeso'
        } 
        
        if (val_imc < 35) {
            return 'Obesidade grau I'
        } 
        
        if (val_imc < 45) {
            return 'Obesidade grau II'
        } 
            
        return 'Obesidade grau III'
    } 
    return false
}