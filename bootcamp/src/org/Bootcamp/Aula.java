package org.Bootcamp;

import lombok.Data;

@Data
public class Aula extends Conteudo {
	private int duracaoHoras;

	@Override
	public double calcularXp() {
		// Exemplo simples: XP baseado na duração da aula
		return XP_PADRAO * duracaoHoras;
	}
}