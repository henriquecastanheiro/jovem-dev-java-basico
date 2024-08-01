package aula3.tratamentoerros;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercicio3 {
	
    public static void main(String[] args) {
    /*
     * Crie um programa que dispare as seguintes exceções:
     * 
     * ○ ArithmeticException = uma operação aritmética ilegal é realizada. O exemplo mais comum é a divisão por zero.
     * ○ NullPointerException = ocorre quando um programa tenta usar um objeto que está com valor null.
     * ○ StringIndexOutOfBoundsException = é lançada quando um índice fora do intervalo é usado ao acessar uma string. 
     * Isso pode acontecer ao tentar acessar caracteres em posições inválidas.
     * ○ IllegalStateException = ocorre quando o objeto não está em um estado apropriado para a operação desejada.
     * 
     * Utilize o try-catch para capturar a exceção e mostre-a usando printStackTrace(). 
     * Não é permitido disparar a exceção via inicialização (throw new NullPointerException())
     */

    	//Na exceção ArithmeticException, fiz uma tentativa de divisão por zero
        try {
            int resultado = 100 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        //Na exceção NullPointerException, uma tentativa de acessar um método usando null
        try {
            String txt = null;
            txt.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        //Na exceção StringIndexOutOfBoundsException, uma tentativa uma posição maior que a String
        try {
            String nome = "Maria";
            nome.charAt(6);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //Na exceção IllegalStateException, o mapa esta em estado inválido
        try {
            Map<String, String> mapa = new HashMap<String, String>();
            mapa.put("Idade", "Maria");
            Iterator<Map.Entry<String, String>> it = mapa.entrySet().iterator();
            it.remove();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}