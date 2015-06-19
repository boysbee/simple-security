package simple.security

import grails.plugin.springsecurity.annotation.Secured

class SensitiveContentController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render "Some sensitive content"
    }
}
