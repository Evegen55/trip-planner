package bookdemo

class BookController {

    //def index() { }
    def scaffold = Book

    public String writeSimpleString() {
        println 'This works fine under url mappings'
        response
        return
    }
}
