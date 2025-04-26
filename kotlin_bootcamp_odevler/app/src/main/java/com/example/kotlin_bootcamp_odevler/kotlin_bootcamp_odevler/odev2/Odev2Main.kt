package com.example.kotlin_bootcamp_odevler.kotlin_bootcamp_odevler.odev2

fun main() {
    val odev2 = Odev2()

    val ornek1 = odev2.FahnrenhietHesaplama(30)
    println("Fahrenheit sonucu: $ornek1")

    val ornek2 = odev2.CevreHesaplama(5,10)
    println("Dikdortgen cevresi: $ornek2")

    val ornek3= odev2.FaktoriyelHesaplama(5)
    println("Faktoriyel sonucu: $ornek3")

    val ornek4 = odev2.HarfSayisiHesaplama("Ahsan")
    println("$ornek4 adet a harfi vardir.")

    val ornek5 = odev2.IcAciToplamHesaplama(3)
    println("Ic aci toplami: $ornek5")

    val ornek6 = odev2.maasHesaplama(20)
    println("Toplam maas: $ornek6")

    val ornek7 = odev2.ucretHesapla(50)
    println("Toplam ucret: $ornek7")


}