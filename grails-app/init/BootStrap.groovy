
import bookdemo.Book

class BootStrap {

    def init = { servletContext ->
        new Book(author:"Stephen King",title:"The Shining", ISBN: "123-456789").save()
        new Book(author:"James Patterson",title:"Along Came a Spider", ISBN: "123-456789").save()
    }
    def destroy = {
    }
}
