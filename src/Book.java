public class Book {

    private String bookName;
    private int pageName;
    private String authorName;
    private int releaseDate;

    public Book(String bookName,int pageName,String authorName,int releaseDate){
        this.bookName=bookName;
        this.pageName=pageName;
        this.authorName=authorName;
        this.releaseDate=releaseDate;
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public int getPageName() {
        return pageName;
    }

    public void setPageName(int pageName) {
        this.pageName = pageName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
