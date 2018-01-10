package by.katomakhina.task3dot3.controller.util;

import static by.katomakhina.task3dot3.controller.util.ListOutputHelper.NUMBER_ELEMENTS_AT_PAGE;

public final class Paginator {
    private static final int ADDITIONAL_PAGE = 1;
    private int firstPage;
    private int lastPage;
    private int previousPage;
    private int nextPage;
    private int currentPage;
    private int contentSize;

    private Paginator() {
        firstPage = 1;
    }

    public Paginator(int contentSize, int currentPage) {
        this();
        this.contentSize = contentSize;
        this.currentPage = currentPage;
        setLastPage();
        setNextPage();
        setPreviousPage();
    }

    private void setLastPage() {
        if (contentSize % NUMBER_ELEMENTS_AT_PAGE > 0) {
            lastPage = contentSize / NUMBER_ELEMENTS_AT_PAGE + ADDITIONAL_PAGE;
        } else {
            lastPage = contentSize / NUMBER_ELEMENTS_AT_PAGE;
        }
    }

    private void setPreviousPage() {
        previousPage = currentPage - 1;
    }

    private void setNextPage() {
        nextPage = currentPage + 1;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public int getPreviousPage() {
        return previousPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getContentSize() {
        return contentSize;
    }
}
