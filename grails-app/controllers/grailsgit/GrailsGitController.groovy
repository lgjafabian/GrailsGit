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


}
