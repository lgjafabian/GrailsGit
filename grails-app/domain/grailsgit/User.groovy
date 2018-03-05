package grailsgit

class User {
//santi estuvo aquí
//santi estuvo aquí
    String name
    String lastName
    String user
    String password


    static constraints = {
        user blank: false, unique: true
        password blank: false
    }
}
