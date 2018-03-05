package grailsgit

class GrailsGitController {

    SiteService siteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]


    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond siteService.list(params), model:[siteCount: siteService.count()]
    }

}
