# Personajes
Ejemplo de app y uso de clases con kotlin

# Importante
en esta seccion del codigo hay que corregir:

        var resultado = "Nombre; ${personaje.name} , Edad: ${personaje.age}, Trabajo: ${personaje.job} "
        /* android studio no le gusta como estamos pasando los datos a la string*/
        resultText!!.text = resultado
        /* aca se imprime codigo y no la cadena con los datos de Ash o los que se hayan ingresado */
