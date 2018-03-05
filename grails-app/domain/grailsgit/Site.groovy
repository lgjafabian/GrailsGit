package grailsgit

class Site {
//santi estuvo aquí

    String name

    static constraints = {
    }

    static hasMany = [categories:Category]
}
