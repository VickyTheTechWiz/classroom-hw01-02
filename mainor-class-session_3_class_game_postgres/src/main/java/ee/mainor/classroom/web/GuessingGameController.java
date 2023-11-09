package ee.mainor.classroom.web;


import ee.mainor.classroom.dto.GameCreateRequest;
import ee.mainor.classroom.dto.GameDto;
import ee.mainor.classroom.dto.GameResponse;
import ee.mainor.classroom.model.GuessingGame;
import ee.mainor.classroom.service.GuessingGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("game")
@RequiredArgsConstructor
public class GuessingGameController {

    private final GuessingGameService guessingGameService;

    @PostMapping
    public Long createGame(@RequestBody GameCreateRequest gameCreateRequest) {
        return guessingGameService.createGame(gameCreateRequest);
    }

    @GetMapping("{gameId}/guess/{number}")
    public GameResponse guess(@PathVariable Integer gameId, @PathVariable Integer number) {
        return guessingGameService.guessNumber(gameId, number);
    }

    @GetMapping
    public List<GameDto> getAll() {
        return guessingGameService.getAll();
    }


}
