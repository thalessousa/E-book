/*
 * Classe Main
 * 
 */
package Main;

import Biblioteca.Ebook;
import Biblioteca.Livro;
import Tablet.Kindle;
import Tablet.Reader;
/**
 *
 * @author Thales Sousa
 */

public class Main {
    public static int opcao;
    public static void main(String[] args){
    System.out.println("Bem vindo");
    Ebook Livronovo = new Ebook();
    Kindle Kindle = new Kindle();
    Kindle.menu(opcao);
    while(opcao!=0)
    switch(opcao){
        case 1:  
           Livronovo.setAtributos();
           break;
        case 2:
           Livronovo.imprimirdados();
           break;
        case 3:
           Kindle.ler();
           break;
        case 4:
           Kindle.paginaseguinte();
           break;
        case 5:
           Kindle.paginaanterior();
           break;
        case 6:
           Kindle.marcarpagina();
    }
    }
    
}
