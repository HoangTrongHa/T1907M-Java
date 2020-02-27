package dm;

import HomeWork.New;

public class News implements INews {
    private long Id;
private String Title;
private String PublishDate;
private String Author;
private String Content;
private Float AverageRate;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println(getId());
    }

    @Override
    public void sleep() {

    }
}
class MyMainClass {
    public static void main(String[] args) {
        News myPig = new News() {};
        myPig.setId(123);
        System.out.println(myPig);
        myPig.Display();
    }
}
