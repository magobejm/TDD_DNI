package com.example.dni

import org.junit.Test

import org.junit.Assert.*
import org.junit.jupiter.api.assertThrows

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DniTest {
    //Paso 1 Demasiado Larga
    @Test
    fun testDebeFallarCuandoLongitudEsDemasiadoLarga() {
        val exception = assertThrows<LengthException> {
            DNI("0123456789")
        }
        assertEquals("Demasiado Larga", exception.message)
    }

    //Paso 2 Demasiado Corta

    //Paso 3 Termina con un número

    //Paso 4 Termina con una letra incorrecta

    //Paso 5 Letras en el medio

    //Paso 6 Empieza con letra y es diferente a X Y o Z

    //Paso 7 Calculo del digito de control inválido "00000000S"

    //Paso 8 Calculo del digito de control válido acaba en T "00000000T"

    //Paso 9 Calculo dígito de control empieza en X

    //Paso 10 //Paso 9 Calculo dígito de control empieza en Y
}

