package com.groupeisi.backendclasse.web;

import com.groupeisi.generated.api.ClassesApi;
import com.groupeisi.generated.model.ClasseDTO;
import com.groupeisi.generated.model.ClassesResultListDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClasseController implements ClassesApi {
    @Override
    public ResponseEntity<ClassesResultListDTO> getAllClasses(Integer currentPage, Integer sizePage) throws Exception {

        ClassesResultListDTO classesResultListDTO = new ClassesResultListDTO();
        List<ClasseDTO> classeDTOList = new ArrayList<>();

        ClasseDTO classeDTO = new ClasseDTO();
        classeDTO.setIdClasse(1L);
        classeDTO.setName("M1GL");
        classeDTOList.add(classeDTO);

        classeDTO = new ClasseDTO();
        classeDTO.setIdClasse(2L);
        classeDTO.setName("M2GL");
        classeDTOList.add(classeDTO);

        classesResultListDTO.setClasseList(classeDTOList);

return new ResponseEntity<>(classesResultListDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ClasseDTO> getClasse(Long idClasse) throws Exception {

        ClasseDTO classeDTO = new ClasseDTO();
        classeDTO.setIdClasse(idClasse);
        classeDTO.setName("M1GL");

        return ResponseEntity.ok(classeDTO);
    }
}
