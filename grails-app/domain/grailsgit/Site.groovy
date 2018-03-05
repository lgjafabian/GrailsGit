package grailsgit

class Site {
//santi estuvo aquí
//santi estuvo aquí
//santi estuvo aquí
    String idSite
    boolean active
    String name

    static constraints = {
    }

    static hasMany = [categories:Category]
}
