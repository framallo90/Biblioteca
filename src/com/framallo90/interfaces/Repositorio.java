package com.framallo90.interfaces;

public interface Repositorio    {

    void register(Object object);
    void search(String id);
    void update(String id);
    void delete(String id);
}
