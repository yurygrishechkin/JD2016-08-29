package by.it.artiuschik.jd_01_08;

public interface IEdition {
    void open(int page);//открыть издание на странице

    void open();//открыть издание по закладке

    void close();//закрыть издание

    void doBookmark(int page);//сделать закладку

    void removeBookmark();//удалить закладку

    void read();//читать издание

    int age();//возраст издания

    boolean isAuthor(String author);//является ли автором

    void showInfo();//вывод подробной информации об издании
}
