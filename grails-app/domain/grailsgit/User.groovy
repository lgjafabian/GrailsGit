package grailsgit

class User {

    String name
    String lastName

    String user
    String password


    static constraints = {
        user blank: false, unique: true
        password blank: false
    }
}
