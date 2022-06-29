package com.example.demo.service;

import com.example.demo.model.TaiKhoan;

public interface TaiKhoanService {
    void save(TaiKhoan user);

    TaiKhoan findByUsername(String username);
}
