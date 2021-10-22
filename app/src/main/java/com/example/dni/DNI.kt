package com.example.dni

Son cadenas de 9 caracteres.
Los primeros 8 caracteres son números, y el último es una letra.
La letra puede ser cualquiera, excepto U, I, O y Ñ.
La última letra se obtiene a partir de un algoritmo que la consulta de una tabla a partir de obtener el resto de dividir la suma de los dígitos numéricos entre 23. Si la letra suministrada no se corresponde con la calculada, el DNI no es válido.
El primer carácter puede ser X, Y o Z, lo que indica un NIE (Número de identificación para personas extranjeras).
Para la validación, las letras XYZ se reemplazan por 0, 1 ó 2, respectivamente.

La tabla en cuestión es esta:
Resto	Letra
0	T
1	R
2	W
3	A
4	G
5	M
6	Y
7	F
8	P
9	D
10	X
11	B
12	N
13	J
14	Z
15	S
16	Q
17	V
18	H
19	L
20	C
21	K
22	E

//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
class DNI(val dni: String) {
}