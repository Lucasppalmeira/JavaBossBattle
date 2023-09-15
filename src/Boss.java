public class Boss {
    private String nome;
    private Integer vida;
    private Integer dano;
    private Integer defesa;
}

public Boss(String nome, Integer vida, Integer dano, Integer defesa){ // constructor 
    this.nome = nome;
    this.vida = vida;
    this.dano = dano;
    this.defesa = defesa;
}

public String Getnome{ //pegando nome do boss
    return this.name;
}

public Integer Getvida{  //pegando vida do boss
    return this.vida;
}

public Integer Getdano{  //pegando dano do boss
    return this.dano;
}

public Integer Getdefesa{  //pegando defesa do boss
    return this.defesa
}
