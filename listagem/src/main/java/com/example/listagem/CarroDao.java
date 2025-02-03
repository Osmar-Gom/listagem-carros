package com.example.listagem;

import java.util.ArrayList;

public class CarroDao {
    ArrayList<Carro> carros;

    public CarroDao() {
            carros =new ArrayList<>();
            carros.add(new Carro("Hb20",R.drawable.hb20, "O Hyundai HB20 é um modelo de carro compacto que foi lançado pela montadora sul-coreana Hyundai no Brasil em 2012. Ele foi desenvolvido especialmente para o mercado brasileiro, mas sua aceitação foi tão boa que se tornou um dos modelos mais vendidos da marca no país."));
            carros.add(new Carro("Jeep",R.drawable.jeep, "A Jeep é uma marca americana famosa por seus SUVs e veículos 4x4, conhecida pela robustez e capacidade off-road. Fundada durante a Segunda Guerra Mundial, a marca criou o icônico Jeep Wrangler, que até hoje é o modelo mais associado à sua imagem."));
            carros.add(new Carro("Toro",R.drawable.toro, "O Jeep Toro é uma picape compacta com design robusto, disponível com motor 1.8 Flex ou 2.0 Diesel. Oferece versões 4x2 ou 4x4, ideal para uso urbano e off-road, com boa capacidade de carga e tecnologia como câmera de ré e conectividade"));
            carros.add(new Carro("Gol",R.drawable.gol, "O Volkswagen Gol é um hatch compacto, econômico e de baixo custo de manutenção, disponível com motores 1.0 e 1.6, ideal para o uso urbano."));
            carros.add(new Carro("Cruze",R.drawable.cruze, "O Chevrolet Cruze é um sedã médio, com design moderno, motores 1.4 turbo e 1.8, oferecendo bom desempenho, conforto e tecnologias como central multimídia e controle de estabilidade."));
            carros.add(new Carro( "Onix", R.drawable.onix, "O Chevrolet Onix é um hatch compacto, econômico e popular, disponível com motores 1.0 e 1.0 turbo. Oferece bom custo-benefício, conectividade e itens de segurança como controle de estabilidade."));
            carros.add(new Carro("Fiesta",R.drawable.fiesta, "O Ford Fiesta é um hatch compacto, ágil e econômico, disponível com motores 1.0 e 1.6. Oferece bom desempenho, design moderno e recursos como central multimídia e controle de estabilidade."));
            carros.add((new Carro("Fox",R.drawable.fox, "\n" +
                    "O Volkswagen Fox é um hatch compacto, prático e econômico, disponível com motores 1.0 e 1.6. Destaca-se pelo bom aproveitamento de espaço e pela facilidade de manobra.")));
    }
    public ArrayList<Carro> getAllCarros(){
        return  this.carros;
    }
}
