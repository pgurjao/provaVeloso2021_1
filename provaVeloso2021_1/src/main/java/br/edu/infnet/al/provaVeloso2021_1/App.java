package br.edu.infnet.al.provaVeloso2021_1;

/**
 * Hello world!
 *
 */
import br.edu.infnet.al.provaVeloso2021_1.controle.ProdutoCtrl; 
//import br.edu.infnet.al.provaVeloso2021_1.modelo.Produto;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Testando adicionar produto" );
        ProdutoCtrl pc = new ProdutoCtrl();
        
        pc.cadastrarProduto ("Titulo 1", 4.05);
        
        
        
    }
}
