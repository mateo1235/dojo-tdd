package classes;

public class CodeBreaker {

	static String NUMERO = "2365";

	/**
	 * 
	 * @param inputNumber
	 *            Numero ingresado para ser comparado con el numero secreto.
	 * @return
	 */
	public String guess(String inputNumber) {
		String respuesta = "";
		for (int i = 0; i < inputNumber.length(); i++) {
			if (inputNumber.charAt(i) == NUMERO.charAt(i)) {
				respuesta += "x";
			} else if (NUMERO.contains(String.valueOf(inputNumber.charAt(i)))) {
				respuesta += "_";
			}
		}
		return respuesta;
	}

}
