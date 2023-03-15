package com.example.liskov_principle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiskovPrincipleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiskovPrincipleApplication.class, args);
	}
	EtreHumain e=new EtreHumain();
	Vegetaux v=new Vegetaux();
	Animaux a=new Animaux();

	Savage s=new Savage();
	Domestique d=new Domestique();

	EtreHumain ev = new Vegetaux();
	EtreHumain ea = new Animaux();
	Animaux va = s;
	EtreHumain es = s;
}
