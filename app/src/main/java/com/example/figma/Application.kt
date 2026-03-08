package com.example.figma

class Application(
    var fornavn: String,
    var efternavn: String,
    var alder: Int,
    var stilling: String,
    var kompetencer: String,
    var om: String

) {
    override fun toString(): String {
        return "Application(fornavn='$fornavn', efternavn='$efternavn', alder=$alder, stilling='$stilling', kompetencer=$kompetencer, om=$om)"
    }
}