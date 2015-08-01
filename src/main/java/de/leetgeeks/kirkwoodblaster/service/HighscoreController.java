package de.leetgeeks.kirkwoodblaster.service;

import de.leetgeeks.kirkwoodblaster.service.orm.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class HighscoreController {

    @Autowired(required = true)
    public ScoreRepository scoreRepository;

    @RequestMapping(value = "/scores", method = RequestMethod.GET)
    public Collection<Score> scores() {
        return Arrays.asList(new Score("Tosken", 500), new Score("Tosken2", 150));
    }

    @RequestMapping(value = "/score/{playerNick}", method = RequestMethod.GET)
    public Score score(@PathVariable String playerNick) {
        return new Score(playerNick, 100000);
    }



    @RequestMapping(value = "/score", method = RequestMethod.POST)
    ResponseEntity<Score> add(@RequestBody Score input) {
        final Iterable<Score> all = scoreRepository.findAll();
        for (Score score : all) {
            return new ResponseEntity<>(score, HttpStatus.OK);
        }

        return new ResponseEntity<Score>(HttpStatus.BAD_REQUEST);


       /* this.validateUser(userId);
        return this.accountRepository
                .findByUsername(userId)
                .map(account -> {
                    Bookmark result = bookmarkRepository.save(new Bookmark(account,
                            input.uri, input.description));

                    HttpHeaders httpHeaders = new HttpHeaders();
                    httpHeaders.setLocation(ServletUriComponentsBuilder
                            .fromCurrentRequest().path("/{id}")
                            .buildAndExpand(result.getId()).toUri());
                    return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
                }).get();*/

    }
}
