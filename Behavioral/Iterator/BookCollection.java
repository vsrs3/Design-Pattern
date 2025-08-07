package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IterableCollection<String> {
    private List<String> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<String> {
        private List<String> books;
        private int position = 0;

        public BookIterator(List<String> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return books.get(position++);
            }
            return null;
        }
    }
}