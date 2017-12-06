package net.mateusgabi.Spark;

import net.mateusgabi.ConversorRomanoArabico.ConversorRomanoArabico;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 05/12/2017.
 */
public class ConversorFacade {

    public static String converte(String valor) {
        return ConversorRomanoArabico.converte(valor);
    }

}
