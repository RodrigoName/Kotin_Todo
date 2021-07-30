package br.com.dio.todolist.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*


private val locale = Locale("pt", "BR")

fun Date.format() : String {
    return SimpleDateFormat("dd/MM/yyy", locale).format(this)
}

var TextInputLayout.text : String
    get() = editText?.text?.toString() ?: "" //Se o editText estiver nulo retorna vazio
    set(value) {
        editText?.setText(value)
    }
