package tests;

import root.ContaCorrente;
//import root.Investimento;
//import root.Transacao;

class ClasseTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("gfdgdgf", 456.00);
        
        System.out.println(cc.getNumero());
    }
}
