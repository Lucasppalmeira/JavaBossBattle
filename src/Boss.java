public class Boss {
    private String nomeBoss;
    private Integer vidaBoss;
    private Integer danoBoss;
    

    public Boss(String nomeBoss, Integer vidaBoss, Integer danoBoss){ // constructor 
    this.nomeBoss = nomeBoss;
    this.vidaBoss = vidaBoss;
    this.danoBoss = danoBoss;
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


}