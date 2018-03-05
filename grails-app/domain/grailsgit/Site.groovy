package grailsgit

class Site {

    String name

    static constraints = {
    }

    static hasMany = [categories:Category]
}
