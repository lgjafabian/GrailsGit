package grailsgit

import static org.springframework.http.HttpStatus.NO_CONTENT

class GrailsGitController {
    CategoryService categoryService


    def sumar(Long id) {
        def cat = categoryService.get(id)
        cat.setVisits(cat.visits + 1)
        categoryService.save(cat)
        println "a"
        [visitas: cat.visits]
    }



    SiteService siteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]


    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond siteService.list(params), model:[siteCount: siteService.count()]
    }

    def index() {
        def usuario = params.usuario
        def contrasenia = params.contrasenia

        if (usuario == "admin"){
            if (contrasenia == "123"){
                render (view: "list")
            }
        } else {
            render  (view: "index")
        }

    }

}
