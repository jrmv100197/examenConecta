package com.conecta.examen.controller;

import com.conecta.examen.dto.TestResponse;
import com.conecta.examen.service.ExamenService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Collection;

@RestController
public class ControllerExamen {

    @Autowired
    private ExamenService examenService;

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = TestResponse.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/testTXT",
            method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public @ResponseBody Collection<TestResponse> testTxt(@RequestBody MultipartFile archivo){
        return examenService.testTx(archivo);
    }

}
