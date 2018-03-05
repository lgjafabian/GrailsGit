package grailsgit

class Category {

    String name
    static belongsTo= [site: Site]

    //punto b
    String urlImage
    Integer visits

    //agrego los constraints
    static constraints = {
        name blank: false, nullable: false
        urlImage blank: false, nullable: false
    }
}
