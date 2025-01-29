package fr.efrei.rag.web.rest;

import fr.efrei.rag.service.AssistantAIService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssistantResource {
    private final AssistantAIService assistantAiService;

    public AssistantResource(AssistantAIService assistantAiService) {
        this.assistantAiService = assistantAiService;
    }

    @PostMapping("/assistants/chat")
    public String hello(@RequestBody String query){
        return assistantAiService.chat(query);
    }
}