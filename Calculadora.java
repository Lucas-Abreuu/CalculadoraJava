
class Calculadora {

	
	// METODOS DA CALCULADORA
	
	private double soma(double n1, double n2) 
	{
		return n1+n2;
	}
	
	private double subtração(double n1, double n2) 
	{
		return n1-n2;
	}
	
	private double multiplicação(double n1, double n2) 
	{
		return n1*n2;
	}
	
	private double divisão(double n1, double n2) 
	{
		if(n2 == 0)
		{
			System.out.println("Não é possível dividir por zero");
		}
		return n1/n2;
	}
	
	public double calcular(double n1, double n2, char operador)
	{
		double resultado = 0;
		
		
	
	switch (operador) 
	{
			case '+':
			resultado = soma(n1, n2);
			break;
			
		case '-':
			resultado = subtração(n1,n2);
			break;
		
		case '*':
			resultado = multiplicação(n1,n2);
			break;
			
		case '/':
			resultado = divisão(n1,n2);
			break;
			
		default:
			System.out.println("Favor escolher +, -, /, *");
			
	}
	
	return resultado;
}
	
}
