package asia.grails.tutorial

class HelloController {

    def index() {
        def list = []
        list << new Person(firstName: 'John', lastName:'Doe', age:50)
        list << new Person(firstName: 'Jane', lastName:'Smith', age:45)
        list << new Person(firstName: 'Sam', lastName:'Robinson', age:47)
        [ list:list ]
    }
}
