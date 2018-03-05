package grailsgit

class Category {

// sofi esta aca
    String name
    static belongsTo= [site: Site]

    //punto b sdljvcbdhsajlvdglchsdjchvgbckzdn<bc ,dhjv,kbchchkdhjkshkuwehfcajksulbiwyO9GCYBHKIRUCBLIwerui
    String urlImage
    Integer visits

    //agrego los constraints por 2 vez
    static constraints = {
        name blank: false, nullable: false
        urlImage blank: false, nullable: false
        visits blank: false
    }
}
