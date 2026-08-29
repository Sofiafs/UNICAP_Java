package Atv46;

public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho = new Produto[10];

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getVip(){
        return vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    public Produto[] getCarrinho(){
        return carrinho;
    }
    public void setCarrinho(Produto[] carrinho){
        this.carrinho = carrinho;
    }

    public Cliente(String nome, boolean vip){
        this.nome = nome;
        this.vip = vip;
    }

    public void adicionarProduto(Produto produto){
        boolean adicionou = false;
        for(int i = 0; i < carrinho.length; i++){
            if(carrinho[i] == null){
                carrinho[i] = produto;
                adicionou = true;
                break;
            }
        }
        if(adicionou == true){
            System.out.println("Não é possível adicionar mais produtos, carrinho cheio");
        }
    }

    public void removerProduto(int posicao){
        for(int i = posicao; i < carrinho.length; i++){
            carrinho[i] = carrinho[i + 1];
        }
        carrinho[carrinho.length - 1] = null;
    }

    public void comprar(){
        double total = 0;
        for(int i = 0; i < carrinho.length; i++){
            if(carrinho[i] != null){
                total = total + carrinho[i].getValor();
            }
        }
        if(this.vip == true){
            total = total - (total * 0.1);
        }
        System.out.println("Total de compra de" + this.nome + ": " + total);
    }
}