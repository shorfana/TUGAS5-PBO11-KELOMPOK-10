/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibagian1_tugasbesar_pbo.error;

/**
 *
 * @author Shorfana
 */
public class PenghuniException extends Exception {

    /**
     * Creates a new instance of <code>PenghuniException</code> without detail
     * message.
     */
    public PenghuniException() {
    }

    /**
     * Constructs an instance of <code>PenghuniException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PenghuniException(String msg) {
        super(msg);
    }
}
