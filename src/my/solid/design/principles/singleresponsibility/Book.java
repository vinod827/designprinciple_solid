/**
 * To implement Single Responsibility Principle
 */

package my.solid.design.principles.singleresponsibility;

public class Book implements IBook{

    private int numOfPages;
    private String authorName;

    public Book(int numOfPages, String authorName){
        this.numOfPages = numOfPages;
        this.authorName = authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void print(){
        System.out.println("Lets print the book");
    }

    @Override
    public void save(){
        System.out.println("Lets save the book");
    }

    @Override
    public String toString(){
        return numOfPages + "-" + authorName;
    }
}