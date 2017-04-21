/**
	класс реализует калькулятор.
*/
public class Calculator {
				/**
					Результат вычисления
				*/
	private int result;
				/**
					Сумируем аргументы
					@param params аргументы сумирования
				*/
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
				/**
					Получить результат.
					@return результат вычисления.
				*/
	public int getResult() {
		return this.result;
	}
				/** 
					Очистить результат вычисления.
				*/
	public void cleanResult() {
		this.result = 0;
	}
}