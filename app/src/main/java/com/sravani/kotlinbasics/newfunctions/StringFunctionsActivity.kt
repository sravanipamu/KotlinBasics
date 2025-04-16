package com.sravani.kotlinbasics.newfunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.contracts.contract

class StringFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val name: String? = null
        println(name.isNullOrEmpty()) // true
        println(name.isNullOrBlank()) // true

        val email = "user@example.com"
        println(email.substringBefore("@")) // "user"
        println(email.substringAfter("@"))  // "example.com"

        val jhon  = "Mr.John"
        println(jhon.removePrefix("Mr.")) // John

        val format = "tunes.mpd"
        println(format.removeSuffix(".mpd")) // tunes

        val word = "kotlin"
        println(word.replaceFirstChar { it.uppercase() }) // Kotlin

        val stars = "*".repeat(5)
        println(stars) // *****

        // split, contains, replace,

        val path = "/storage/emulated/0/Download/sample_image.png"
        val fileName = getFileNameFromPath(path)        // "sample_image.png"
        val extension = getFileExtension(fileName)      // "png"

        // looping
        name?.forEach {
            println(it)
        }
    }
}

public inline fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.length == 0
}

public inline fun String.substringBefore(delimeter : String) : String {
       var index = indexOf(delimeter)
       return  if (index == -1) this else substring(0, index)
}

public inline fun String.substringAfter(delimeter : String) : String {
    var index = indexOf(delimeter)
    return  if (index == -1) this else substring(index+1, length)
}

public fun String.removePrefix(prefix: CharSequence): String {
    if (startsWith(prefix)) {
        return substring(prefix.length)
    }
    return this
}
public fun String.removeSuffix(suffix: CharSequence): String {
    if (endsWith(suffix)) {
        return substring(0, length - suffix.length)
    }
    return this
}

fun getFileNameFromPath(path: String): String {
    return path.substringAfterLast("/") // get everything after the last slash
}

fun getFileExtension(fileName: String): String {
    return fileName.substringAfterLast(".")
}

inline fun CharSequence.forEach(action: (Char) -> Unit): Unit {
    for (element in this) action(element)
}

fun validateLoginForm(email: String?, password: String?): String? {
    // 1. Null/Blank check
    if (email.isNullOrBlank()) return "Email cannot be empty"
    if (password.isNullOrBlank()) return "Password cannot be empty"

    // 2. Trim inputs to remove extra spaces
    val trimmedEmail = email.trim()
    val trimmedPassword = password.trim()

    // 3. Email format check
    if (!trimmedEmail.contains("@") || !trimmedEmail.contains(".")) {
        return "Invalid email address"
    }

    // 4. Password strength check
    if (trimmedPassword.length < 6) {
        return "Password should be at least 6 characters"
    }

    // 5. Optional: Check if email is from a specific domain
    if (trimmedEmail.substringAfter("@") != "watcho.com") {
        return "Only watcho.com emails are allowed"
    }

    return null // no errors, validation passed
}
