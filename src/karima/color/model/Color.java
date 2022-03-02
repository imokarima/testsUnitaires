package karima.color.model;

import java.util.regex.Pattern;

public class Color {
    private int rouge;
    private int vert;
    private int bleu;
    private String hexValue;
    private static final short MIN = 0;
    private static final short MAX= 255;


    public Color(int rouge, int vert, int bleu){
        setRouge(rouge);
        setVert(vert);
        setBleu(bleu);
        this.hexValue=String.format("#%02X%02X%02X", this.rouge, this.vert,this.bleu);
    }

    public Color(String hexValue){
            setHexValue(hexValue);
            this.rouge=Integer.parseInt(hexValue.substring(1,3),16);
            this.vert=Integer.parseInt(hexValue.substring(3,5),16);
            this.bleu=Integer.parseInt(hexValue.substring(5,7),16);
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


    private boolean isCorrectHexValue(String hexValue) {
        return Pattern.matches("^#([0-9A-F]{6})$", hexValue);
    }

    private boolean isCorrectRGBValue(int RGBvalue) {
        return MIN<= RGBvalue && RGBvalue <= MAX;
    }

    public void setHexValue(String hexValue) {
        if (hexValue == null || !isCorrectHexValue(hexValue)) {
            throw new IllegalArgumentException("Hex color is incorrect");
        }else{
            this.hexValue=hexValue;
        }
    }

    public void setRouge(int rouge){
        if(isCorrectRGBValue(rouge)){
            this.rouge = rouge;
        }else{
            throw new IllegalArgumentException();
        }


    }
    public void setVert(int vert){
        if(isCorrectRGBValue(vert)){
            this.vert = vert;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public void setBleu(int bleu){
        if(isCorrectRGBValue(bleu)){
            this.bleu = bleu;
        }else{
            throw new IllegalArgumentException();
        }

    }
    public String toString(){
        return "[value:"+this.getHexValue() +", rouge:"+this.getRouge()+", vert:"+this.getVert()+", bleu:"+this.getBleu()+"]";
    }
}

