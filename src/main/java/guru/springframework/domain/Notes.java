package guru.springframework.domain;


import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne                           //niente cascade perchè una ricetta può esistere anche se viene cancellata la nota relativa
    private Recipe recipe;

    @Lob                                //per memorizzare stringhe grandi come permette java, invece di essere limitati alle dimensioni di Hybernate standard
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
