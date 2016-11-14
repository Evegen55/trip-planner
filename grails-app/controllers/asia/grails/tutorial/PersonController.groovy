package asia.grails.tutorial

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        Person person = new Person(firstName: 'John', lastName:'Doe', age:55)
        [ person:person ]
    }
}
