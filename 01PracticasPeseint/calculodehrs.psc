Algoritmo calculodehrs
	Escribir "Desarrolle un algoritmo que permita calcular la nomina de unos trabajadores."
	
	horas <- 0
	dias <- 0
	salario <- 0
	continuar <- "S"
	nomina <- 0
	trabajador <- ""
	salario = 100 //por hora 
	Repetir
		Escribir "Dime el nombre del trabajador."
		Leer trabajador
		
		Escribir "Ingresa el salario por hora."
		Leer salario
		Repetir // calcula  con las horas de trabajo pagadas normalmente 
			Escribir "Ingresa la cantidad de horas entre semana que trabajaste esta quincena.(no horas extra, ni fines de semana)"
			Leer horas
			Si horas > 80 o horas < 0 Entonces
				Escribir "Ese valor no es valido"
			FinSi
		Hasta Que horas <= 80 y horas >= 0
		nomina = horas * salario
		
		Repetir // calcula las horas de trabajo pagadas al doble 
			Escribir "Ingresa la cantidad de horas extra entre semana y los sabado que trabajaste esta quincena.(no domingos)"
			Leer horas
			Si horas > 46 o horas < 0 Entonces
				Escribir "Ese valor no es valido"
			FinSi
		Hasta Que horas <= 46 y horas >= 0
		nomina = nomina + (horas * salario * 2)
		
		Repetir // calcula las horas de trabajo pagadas al triple
			Escribir "Ingresa la cantidad de horas que trabajaste los domingos esta quincena."
			Leer horas
			Si horas > 16 o horas < 0 Entonces
				Escribir "Ese valor no es valido"
			FinSi
		Hasta Que horas <= 16 y horas >= 0
		nomina = nomina + (horas * salario * 3)
		
		Escribir "La nomina del trabajador ", trabajador, " es de: ", nomina, "Esta quincena "
		
		Escribir "¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera considerado como no.)"
		Leer continuar 
	Hasta Que (continuar <> "S") y (continuar <> "s")
	
FinAlgoritmo
