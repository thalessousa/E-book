package Biblioteca;
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thales Sousa
 */
public class Ebook extends Livro {
    
    private int numerodepaginas,isbn,paginamarcada;
    private static String ano;
    private String autor,nomedolivro;
    private final int paginainicial= super.paginainicial;
    Scanner input = new Scanner(System.in);
    
    /*Construtor default*/
    public Ebook() {
        Ebook.ano="01/01/2014";
        this.numerodepaginas = 0;
        this.isbn = 0;
        this.autor = "desconhecido";
        this.nomedolivro = "desconhecido";
    }
    /*Construtor de inicialização pelo usuario*/
    public Ebook(int numerodepaginas, int isbn, String autor, String nomedolivro) {
        Ebook.ano = ano;
        this.numerodepaginas = numerodepaginas;
        this.isbn = isbn;
        this.autor = autor;
        this.nomedolivro = nomedolivro;
    }
    /*Construtor default copia*/
    public Ebook(Ebook copia) {
        Ebook.ano = Ebook.ano;
        this.numerodepaginas = copia.numerodepaginas;
        this.isbn = copia.isbn;
        this.autor = copia.autor;
        this.nomedolivro = copia.nomedolivro;
    } 
    @Override
    public void setAtributos() {
        System.out.println("Insira o numero de paginas do livro");
        this.numerodepaginas = input.nextInt();
        while(this.numerodepaginas <0){
            System.out.println("Numero de paginas invalido,insira novamente ");
            this.numerodepaginas = input.nextInt();
        }
        System.out.println("Insira o isbn");
        while(this.isbn <0){
            System.out.println("Numero ISBN invalido,insira novamente ");
            this.isbn = input.nextInt();
        }
        this.isbn = input.nextInt();
        System.out.println("Insira o autor do livro");
        this.autor = input.nextLine();
        System.out.println("Insira o nome do livro");
        this.nomedolivro = input.nextLine();
        System.out.println("Insira o ano de publicacao do livro(Formato Dia Mes Ano");
        Ebook.ano = input.nextLine();
    }   
     public void marcarpagina(){
         System.out.println("Insira a pagina atual de leitura");
         this.paginamarcada = input.nextInt();
     }
     @Override
     public void imprimirdados(){
       // System.out.println("Isbn %d \n Autor do Livro %s \n Nome do Livro %s ",this.isbn,this.autor,this.nomedolivro);
    }
}