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
    @Override
    public void ler(){}
    /**
     * Passa para a proxima pagina
     */
    public void paginaseguinte(){}
    /**
     *Retorna para a pagina anterior
     */
    public void paginaanterior(){}
    /**
     * Marca a pagina atual
     */
    public void marcarpagina(){}
 
}
