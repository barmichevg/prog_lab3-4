package story.scene;

import story.actions.Assumption;
import story.person.Cast;
import story.person.Group;
import story.person.characters.Boy;
import story.person.characters.Character;
import story.place.Place;

public record Scene(Boy boy, Assumption randomGuess, Place place, Character Carlson, Character Basket, Group group, Cast cast) {
    public Scene(Boy boy, Assumption randomGuess, Place place, Character Carlson, Character Basket, Group group, Cast cast, Boolean o) {
        this(boy, randomGuess, place, Carlson, Basket, group, cast);
    }
}