package grailsgit

class GrailsGitController {

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
