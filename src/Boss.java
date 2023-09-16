public class Boss {
    private String nomeBoss;
    private Integer vidaBoss;
    private Integer danoBoss;
    private Integer defesaBoss;

    public Boss(String nomeBoss, Integer vidaBoss, Integer danoBoss, Integer defesaBoss){ // constructor 
    this.nomeBoss = nomeBoss;
    this.vidaBoss = vidaBoss;
    this.danoBoss = danoBoss;
    this.defesaBoss = defesaBoss;
}

public String getNomeBoss()
{ //pegando nome do boss
    return this.nomeBoss;
}

public Integer getVidaBoss()
{  //pegando vida do boss
    return this.vidaBoss;
}

public Integer getDanoBoss()
{  //pegando dano do boss
    return this.danoBoss;
}

public Integer getDefesaBoss()
{  //pegando defesa do boss
    return this.defesaBoss;
}

}

