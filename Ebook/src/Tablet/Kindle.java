package Tablet;

import java.util.Scanner;
import Main.Main;
import Tablet.Reader;
import Biblioteca.Ebook;
import Biblioteca.Editora;
import Biblioteca.Livro;

/*
 * Classe Kindle que herda as funções de Reader com @Override
 * 
 */
/**
 *
 * @author Thales Sousa
 */
public class Kindle extends Reader {
      int paginaatual;
      static  Scanner input = new Scanner(System.in);
    public void pagina(){
      this.paginaatual = paginaatual;
    }
        
    @Override
    public void ler() {
        super.ler();
    }
    @Override
    public void marcarpagina() {
        this.pagina();
    }
    @Override
    public void paginaseguinte() {
        this.paginaatual = this.paginaatual + 1;
    }
    @Override
    public void paginaanterior() {
                this.paginaatual = this.paginaatual - 1;
    }
    public static void menu(int opcao){
        System.out.println("1 - Inserir as informacoes de um livro \n ");
        System.out.println("2 - Imprime as informacoes de um livro \n ");
        System.out.println("3 - Le o Ebook \n ");
        System.out.println("4 - Passa para  a proxima pagina \n ");
        System.out.println("5 - Volta para a pagina anterior \n ");
        System.out.println("6 - Marca a pagina atual"); 
        Main.opcao = input.nextInt();
    }
}