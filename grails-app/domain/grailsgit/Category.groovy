package grailsgit

class Category {
//santi estuvo aquí

    String name

    static belongsTo= [site: Site]

    static constraints = {
    }
}
