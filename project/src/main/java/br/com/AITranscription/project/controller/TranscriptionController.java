package br.com.AITranscription.project.controller;

import br.com.AITranscription.project.service.TranscriptionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class TranscriptionController {

    private final TranscriptionService transcriptionService;

    public TranscriptionController(TranscriptionService transcriptionService) {
        this.transcriptionService = transcriptionService;
    }

    @PostMapping("/ia/transcribe")
    public ResponseEntity<String> transcribeAudio (@RequestParam("file") MultipartFile file) {
        try {
            String transcription = transcriptionService.transcribeAudio(file);
            return ResponseEntity.ok(transcription);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(""+e);
        }
    }

}
