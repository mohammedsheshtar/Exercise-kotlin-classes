fun main() {

    var myBook = Book("Harry Potter and the Chamber of Secrets", "JK Rowling", 1998, "Fiction");
    myBook.getBookInfo();
}

class Book(var title: String = "", var author: String = "", var yearPublished: Int = 0, var genre: String = "") {
    fun getBookInfo() {
        println("$title by $author (${yearPublished}) (${genre})");
    }
}
