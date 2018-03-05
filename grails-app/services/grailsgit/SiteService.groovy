package grailsgit

import grails.gorm.services.Service

@Service(Site)
interface SiteService {
    //santi estuvo aquí

    Site get(Serializable id)

    List<Site> list(Map args)

    Long count()

    void delete(Serializable id)

    Site save(Site site)

}