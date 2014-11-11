package Tablet;

import Tablet.Reader;

/*
 * Classe Kindle que herda as funções de Reader com @Override
 * 
 */
/**
 *
 * @author Thales Sousa
 */
public class Kindle extends Reader {

    @Override
    public void ler() {
    
    }

    @Override
    public void marcarpagina() {
    }

    @Override
    public void paginaseguinte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paginaanterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
