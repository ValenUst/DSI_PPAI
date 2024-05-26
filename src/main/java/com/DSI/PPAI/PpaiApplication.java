package com.DSI.PPAI;

import com.DSI.PPAI.Entities.Bodega;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PpaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpaiApplication.class, args);
	}

	List<String> bodegasAActualizar = new ArrayList<>(Arrays.asList("str_1","str_2"));

	Gestor gestor = new Gestor();

	List<Integer> coordenadas = Arrays.asList(3,8);

	Bodega bodega2 = new Bodega(coordenadas,"desc2","nombre2",1,false);
	Bodega bodega1 = new Bodega(coordenadas,"desc1","nombre1",2,true);

	Bodega[] bodegas = {bodega1};



}
