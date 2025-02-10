package nested.test.ex1;

public class Library {
    private int bookCount;
    private Book[]books;    //객체 배열 생성

    public Library(int num) {

        books=new Book[num];
        bookCount=0;

    }

    public void addBook(String title, String author) {

        //검증 로직을 다 처리하고
        if(bookCount>=books.length){
            System.out.println("도서관 저장 공간 부족");
            return;
        }

        //정상 로직을 처리
        books[bookCount++] = new Book(title, author);

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i=0;i<bookCount;i++){

            System.out.println("도서 제목: "+books[i].title+", 저자: "+books[i].author);
        }

    }

    private static class Book{     //외부에 노출하면 안되니깐 private으로
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
