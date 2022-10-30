package by.bsuir.wt.lab1.book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object object) {
        if (object instanceof ProgrammerBook) {
            return super.equals(object) && language == ((ProgrammerBook) object).language
                    && level == ((ProgrammerBook) object).level;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s; Language - %s; Level - %d;", super.toString(), language, level);
    }
}

