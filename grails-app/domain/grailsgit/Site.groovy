package grailsgit

class Site {
//santi estuvo aquí
//santi estuvo aquí
//santi estuvo aquí
    String idSite
    boolean active
    //asd
    String name

    static constraints = {
    }

    static hasMany = [categories:Category]
}
