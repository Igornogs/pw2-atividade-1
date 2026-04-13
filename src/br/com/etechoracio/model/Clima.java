package br.com.etechoracio.model;

import br.com.etechoracio.enun.CondicaoTempo;
import br.com.etechoracio.enun.DirecaoVento;
import br.com.etechoracio.enun.FaseLua;

public class Clima {
    String titulo;
    String dia;
    int temperatura;
    CondicaoTempo condicaoTempo;
    double probChuva;
    DirecaoVento direcaoVento;
    String umidade;
    FaseLua faseLua;
}