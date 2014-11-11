package Tablet;

/*
 * Classe principal generica para o leitor de E-book
 * 
 */

/**
 *
 * @author Thales Sousa
 */
public abstract class Reader implements Tela {
    /**
     *Lê a pagina atual até o usuario executar alguma ação
     */
    public abstract void ler();
    /**
     * Passa para a proxima pagina
     */
    public abstract void paginaseguinte();
    /**
     *Retorna para a pagina anterior
     */
    public abstract void paginaanterior();
    /**
     * Marca a pagina atual
     */
    public abstract void marcarpagina();
 
}
