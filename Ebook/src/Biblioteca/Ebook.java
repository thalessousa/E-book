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
    
    private int numerodepaginas,isbn;
    private static int paginamarcada;
    private static String ano;
    private String autor,nomedolivro;
    static Scanner input = new Scanner(System.in);
    
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
        if(this.numerodepaginas <0){
            System.out.println("Numero de paginas invalido,insira novamente \n");
            this.numerodepaginas = input.nextInt();
        }
        System.out.println("Insira o isbn \n");
        this.isbn = input.nextInt();
        if(this.isbn <0){
            System.out.println("Numero ISBN invalido,insira novamente \n");
            this.isbn = input.nextInt();
        }
        System.out.println("Insira o autor do livro");
        this.autor = input.next(); 
        if(this.autor.contains("^[a-Z]")){
                System.out.println("Autor valido \n"); 
        }
        System.out.println("Insira o nome do livro \n");
        this.nomedolivro = input.nextLine();
        if(this.nomedolivro.contains("^[a-Z]")){
                System.out.println("Nome de livro valido \n");
        }
        System.out.println("Insira o ano de publicacao do livro(Formato Dia Mes Ano) \n");
        Ebook.ano = input.next();
                if(Ebook.ano.contains("^[1,2,3,4,5,6,7,8,9,0]")){
                System.out.println("Data valida \n");
                }
    }   
     public static void marcarpagina(){
         System.out.println("Insira a pagina atual de leitura \n");
         Ebook.paginamarcada = input.nextInt();
     }
     @Override
     public void imprimirdados(){
        System.out.println("Isbn "+this.isbn+" \n Autor do Livro "+this.autor+" \n Nome do Livro \n"+this.nomedolivro+ " Data de publicacao \n "+Ebook.ano);
    }
}