package com.sail.service;

import java.util.List;

/**
 * Created by wy on 2017/4/13.
 */
public interface UserService {
    List<String> getPermissions(Long id);
}
