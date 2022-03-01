package karima.color.model;

public class Color {
    private int rouge;
    private int vert;
    private int bleu;
    private String hexValue;

    public Color(int rouge, int vert, int bleu)throws IllegalArgumentException{
        if((rouge<0 || rouge>255) ||(vert<0 || vert>255)||(bleu<0 || bleu>255) ){
            throw new IllegalArgumentException();
        }else{
            this.rouge = rouge;
            this.vert = vert;
            this.bleu = bleu;
        }
    }

    public Color(String hexValue) throws IllegalArgumentException{
        if(hexValue.length()>0 && hexValue.length()<7 && hexValue.startsWith("#")){
            this.hexValue=hexValue;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getRouge() {
        return rouge;
    }

    public int getVert() {
        return vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setRouge(int rouge) throws IllegalArgumentException{
        if(rouge>=0 || rouge<=255){
            this.rouge = rouge;
        }else{
            throw  new IllegalArgumentException();
        }

    }
    public void setVert(int vert) throws IllegalArgumentException{
        if(vert>=0 || vert<=255){
            this.vert = vert;
        }else{
            throw  new IllegalArgumentException();
        }

    }
    public void setBleu(int bleu)throws IllegalArgumentException {
        if(bleu>=0 || bleu<=255){
            this.bleu = bleu;
        }else{
            throw  new IllegalArgumentException();
        }
    }

    public String toString(){
        //this.setRouge(Integer.parseInt(this.hexValue.substring(1,3)));
        //this.setRouge(Integer.parseInt(this.hexValue.substring(,3)));
        //this.setRouge(Integer.parseInt(this.hexValue.substring(1,3)));
        return "[ value: "+this.hexValue+" rouge : "+this.getRouge()+" vert : "+this.getVert()+" bleu : "+this.getBleu();
    }
}
