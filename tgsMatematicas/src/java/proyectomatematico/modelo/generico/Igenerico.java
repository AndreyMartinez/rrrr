/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematico.modelo.generico;

import java.util.List;

/**
 *
 * @author developer
 */
public interface Igenerico<T> {
    public abstract void insertar (T vo);
    public List<T>   consultar (T vo);
    public abstract void modificar (T vo);
    public abstract  void eliminar (T vo);
}
