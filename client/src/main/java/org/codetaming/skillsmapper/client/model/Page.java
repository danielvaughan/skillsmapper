package org.codetaming.skillsmapper.client.model;

public class Page {

    Integer size;
    Integer totalElements;
    Integer totalPages;
    Integer number;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Page{" +
                "size=" + size +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                ", number=" + number +
                '}';
    }
}
