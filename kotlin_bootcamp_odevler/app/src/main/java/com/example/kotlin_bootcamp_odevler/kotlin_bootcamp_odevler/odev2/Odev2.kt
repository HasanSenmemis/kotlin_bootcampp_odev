package com.example.kotlin_bootcamp_odevler.kotlin_bootcamp_odevler.odev2

class Odev2 {

    fun FahnrenhietHesaplama(derece: Int): Double {
        val sonuc = (derece * 1.8) + 32
        return sonuc
    }

    fun CevreHesaplama(kenar1: Int,kenar2: Int): Int {
        val cevre = 2*(kenar1+kenar2)
        return cevre
    }

   fun FaktoriyelHesaplama(sayi: Int): Int {
        var sonuc=1
        for (i in 1..sayi) {
            sonuc=sonuc*i
       }
       return sonuc
   }

    fun HarfSayisiHesaplama(kelime: String): Int {
        var sayac=0
        for (i in kelime) {
            if(i=='a'|| i=='A')
            sayac++
        }
        return sayac
    }

    fun IcAciToplamHesaplama(kenarSayisi:Int): Int {
        val sonuc=(kenarSayisi-2)*180
        return sonuc
    }

    fun maasHesaplama(gunSayisi: Int): Int {
        val calismaSaatUcreti = 10
        val mesaiSaatUcreti = 20
        val maxNormalSaat = 160
        val saatlikCalisma = 8

        val toplamCalismaSaati = gunSayisi * saatlikCalisma

        val normalSaat = if (toplamCalismaSaati <= maxNormalSaat) toplamCalismaSaati else maxNormalSaat
        val mesaiSaat = if (toplamCalismaSaati > maxNormalSaat) toplamCalismaSaati - maxNormalSaat else 0

        val maas = (normalSaat * calismaSaatUcreti) + (mesaiSaat * mesaiSaatUcreti)

        return maas
    }
    fun ucretHesapla(kotaMiktariGB: Int): Int {
        val temelKota = 50
        val temelUcret = 100
        val asimUcretiGB = 4
        var asimMiktari = 0
        var toplamUcret = temelUcret

        if (kotaMiktariGB > temelKota) {
            asimMiktari = kotaMiktariGB - temelKota
            val asimUcreti = asimMiktari * asimUcretiGB
            toplamUcret = temelUcret + asimUcreti
        } else {
            toplamUcret = temelUcret
        }

        return toplamUcret
    }
}