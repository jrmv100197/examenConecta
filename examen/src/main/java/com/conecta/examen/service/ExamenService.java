package com.conecta.examen.service;

import com.conecta.examen.dto.TestResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Collection;

public interface ExamenService {

    Collection<TestResponse> testTx(MultipartFile file);

}
