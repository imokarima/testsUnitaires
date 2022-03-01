package karima.color.model;

public class Color {
    private int rouge;
    private int vert;
    private int bleu;
    private String hexValue;

    public Color(int rouge, int vert, int bleu){
        if((rouge<0 && rouge>255) &&(vert<0 && vert>255)&&(bleu<0 && bleu>255)){
            throw new IllegalArgumentException();
        }else{
            this.rouge = rouge;
            this.vert = vert;
            this.bleu = bleu;
            this.hexValue=String.format("#%02X%02X%02X", this.rouge, this.vert,this.bleu);
        }
    }

    public Color(String hexValue){
        if(hexValue.length()>0 && hexValue.length()<7 && hexValue.startsWith("#")){
            this.hexValue=hexValue;
            this.rouge=Integer.parseInt(hexValue.substring(1,3),16);
            this.vert=Integer.parseInt(hexValue.substring(3,5),16);
            this.bleu=Integer.parseInt(hexValue.substring(5,7),16);
        }else if(hexValue==null) {
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

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public void setRouge(int rouge) throws IllegalArgumentException{
        if(rouge>=0 || rouge<=255)
            this.rouge = rouge;

    }
    public void setVert(int vert) throws IllegalArgumentException{
        if(vert>=0 || vert<=255)
            this.vert = vert;
    }
    public void setBleu(int bleu)throws IllegalArgumentException {
        if(bleu>=0 || bleu<=255)
            this.bleu = bleu;

    }
    public String toString(){
        return "[value:"+this.getHexValue() +", rouge:"+this.getRouge()+", vert:"+this.getVert()+", bleu:"+this.getBleu()+"]";
    }
}
