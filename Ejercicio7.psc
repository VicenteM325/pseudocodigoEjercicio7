Algoritmo Ejercicio7
	Para i <- 1 Hasta 15 Con Paso 1 Hacer
		x <- azar(36)
		Escribir x, " "
		Si x == 0 Entonces
			a <- a+1
		FinSi
		Si x mod 2 == 0 Entonces
			b <- b+1
		SiNo
			c <- c+1
		FinSi
		i <- i+1
	Fin Para
	porcentajecero = (a*15)/100
	porcentajepar = (b*15)/100
	porcentajeimpar = (c*15)/100
	Escribir "El número de ceros generados es = " a
	Escribir "El número de pares generados es = " b
	Escribir "El número de impares generados es = " c
	
	Escribir "El porcentaje de ceros es = " porcentajecero
	Escribir "El porcentaje de pares es = " porcentajepar
	Escribir "El porcentaje de impares es = " porcentajeimpar	
FinAlgoritmo
