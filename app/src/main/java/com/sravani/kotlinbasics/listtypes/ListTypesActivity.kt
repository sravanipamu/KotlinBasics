package com.sravani.kotlinbasics.listtypes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ListTypesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myList = listOf("Home", "Live", "Plans")
        println(myList)
        val mutableList = mutableListOf("Accounts", "Languages", "Downloads", "Help")
        mutableList.remove("Downloads")
        println(mutableList)
        // empty list
        var emptyList = emptyList<String>()
        // mutable list with empty array
        val emptyMutableList = mutableListOf<String>()
        emptyMutableList.add("Video Quality")
        emptyMutableList.add("Dark Mode")
        // arrayof
        val array = arrayOf("A", "B", "C")


        // functions in list
        val names = listOf("Alice", "Bob", "Charlie", "Bob")

        // iteration

        for (item in names) {
            println(item)
        }

        // Get all unique names
        val uniqueNames = names.distinct()
        println(uniqueNames)

       // Filter names starting with 'B'
        val bNames = names.filter { it.startsWith("B") }
        println(bNames)

       // Capitalize all names
        val caps = names.map { it.uppercase() }
        println(caps)

        // Find first Bob
        val firstBob = names.find { it == "Bob" }
        println(firstBob)

        val numbers = listOf(10, 5, 25, 1)

        val asc = numbers.sorted()            // [1, 5, 10, 25]
        val desc = numbers.sortedDescending() // [25, 10, 5, 1]
        val reverse = numbers.reversed() // [1, 5, 10, 25]

        val listNumbers = listOf(1, 2, 3, 4, 5, 6)

        val (even, odd) = listNumbers.partition { it % 2 == 0 }

        println("Even: $even") // [2, 4, 6]
        println("Odd: $odd")   // [1, 3, 5]

        val listItem = names.find { it == "Bob" }

        val nameMap = mapOf(
            1 to "Alice",
            2 to "Bob",
            3 to "Charlie"
        )
        val mapItem = nameMap[1]
        println(mapItem) // Output: Bob

        val mapByFirstChar = names.associateBy { it.first() }
        println(mapByFirstChar)
    }

    inline fun <T> Iterable<T>.partition( predicate : (T) -> Boolean) : Pair<List<T>, List<T>>{
        var first = mutableListOf<T>()
        var second = mutableListOf<T>()
        this.forEach {
            if(predicate(it))
                first.add(it)
            else
                second.add(it)
        }
        return Pair(first, second)
    }

    inline fun <T> Iterable<T>.filter(predicate : (T) -> Boolean) : List<T>{
        var destination = mutableListOf<T>()

        this.forEach {
            if(predicate(it))
                destination.add(it)
        }
        return destination
    }
}