package TravailPratique

open class personne() {
    var nom: String
    var sexe: String
    var adresse: Stringgit
    var age: Int

    init {
        nom = "BASHIZI"
        sexe = "M"
        adresse = "GOMA KESHERO"
        age = 26
    }

    open fun printPers(): Unit {

        println(" NOM : " + nom)
        println(" SEXE : " + sexe)
        println(" ADRESSE : " + adresse)
        println(" AGE : " + age)

    }

    constructor(name : String, sexe:String,adresse:String, age:Int):this(){
        this.nom = name
        this.sexe = sexe
        this.adresse = adresse
        this.age = age
    }
    open fun  saisiePers():Unit{
        println("QUEL EST VOTRE NOM COMPLET :")
        nom = readLine()!!
        println(" TON SEXE :")
        sexe = readLine()!!
        println("QUEL EST VOTRE ADRESSE COMPLETE :")
        adresse = readLine()!!
        println(" TON AGE :")
        age = readLine()!!.toInt()

    }


}

class pere:personne() {
    var tel: String = ""
    var nbenfant: Int = 0

    init {
        this.tel = "+243973697114"
        this.nbenfant = 34
    }
    override fun  saisiePers():Unit{
        println("QUEL EST VOTRE NOM COMPLET :")
        nom = readLine()!!
        println(" TON SEXE :")
        sexe = readLine()!!
        println("QUEL EST VOTRE ADRESSE COMPLETE :")
        adresse = readLine()!!
        println(" TON AGE :")
        age = readLine()!!.toInt()

    }


    fun printPere(): Unit {
        saisiePers()

        println(" PHONE : " + tel)
        println(" ENFANT  : " + nbenfant)
    }

}

class agent:personne(){
    var salaireB : Double = 0.0
    var poste : String = ""
    var hjr :  Double = 0.0
    var salaireNet :  Double = 0.0
    var tva :  Double = 0.0
    override fun printPers(): Unit {
        println("OVERRIDE DE PERSONNE")
        println(" NOM : " + nom)
        println(" SEXE : " + sexe)
        println(" ADRESSE : " + adresse)
        println(" AGE : " + age)

    }

    fun calSalaire():Double{

        salaireNet = salaireB - tva
        return salaireNet
    }
    override fun  saisiePers():Unit{
        println("QUEL EST VOTRE NOM COMPLET :")
        nom = readLine()!!
        println(" TON SEXE :")
        sexe = readLine()!!
        println("QUEL EST VOTRE ADRESSE COMPLETE :")
        adresse = readLine()!!
        println(" TON AGE :")
        age = readLine()!!.toInt()

    }

    fun printAgent():Unit{

        saisiePers()
        printPers()



        println(" SALAIRE NET  : " + calSalaire())
        println(" TVA  : " + tva)

    }



}



fun main(args: Array<String>){
    var p = personne()
    var agent = agent()
    var pere = pere()
    //affichage depuis la classe parent
    println("AFFICHAGE DEPUIS PERSONNE")
    p.printPers()
    //detail du p avec heritage personne
    println("HERITAGE DE  LA CLASSE PERSONNE DANS AGENT")
    agent.tva = 34.5
    agent.salaireB = 140.50
    agent.printAgent()
    println(" TON SALAIRE EST :"+agent.calSalaire())
    //detail du pere avec heritage personne
    println("HERITAGE DE  LA CLASSE PERSONNE DANS PERE")
    pere.printPere()



}

