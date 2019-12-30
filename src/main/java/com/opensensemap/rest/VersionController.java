package com.opensensemap.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "version")
public class VersionController {

	private String version;

	public VersionController(@Value("${api.version}") String version) {
		this.version = version;
	}

	@GetMapping
	public ResponseEntity<String> getCurrentVersion() {
		return ResponseEntity.ok().body(version);
	}

}
