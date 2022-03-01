package karima.color.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    private Color color;


    @BeforeEach
    public void setUp() {
        color = new Color(53, 213, 141);
    }

    @AfterEach
    public void tearDown() {
        color = null;
    }
    @Test
    void testGetRouge() {
        assertEquals(53,color.getRouge());
    }
    @Test
    void testGetVert() {
        assertEquals(213,color.getVert());
    }
    @Test
    void testGetBleue() {
        assertEquals(141,color.getBleu());
    }
    @Test
    void testGetHexValue() {
        assertEquals("#35D58D",color.getHexValue());
    }

    @Test
    public void testSetRouge() {
        color.setRouge(53);
        assertAll("Color object non conformes",
                () -> assertEquals(53, color.getRouge(), "getRed() est incorrect"),
                () -> assertEquals(213, color.getVert(), "getGreen() est incorrect"),
                () -> assertEquals(141, color.getBleu(), "getBlue() est incorrect"),
                () -> assertEquals("#35D58D", color.getHexValue(), "getHexValue() est incorrect"));
    }

    @Test
    public void testSetBleue() {
        color.setBleu(141);
        assertAll("Color object non conformes",
                ()-> assertEquals(53, color.getRouge(),"getRed() est incorrect"),
                ()-> assertEquals(213, color.getVert(),"getGreen() est incorrect"),
                ()-> assertEquals(141, color.getBleu(), "getBlue() est incorrect"),
                ()-> assertEquals("#35D58D", color.getHexValue(), "getHexValue() est incorrect"));
    }
    @Test
    public void testSetVert() {
        color.setVert(213);
        assertAll("Color object non conformes",
                ()-> assertEquals(53, color.getRouge(),"getRed() est incorrect"),
                ()-> assertEquals(213, color.getVert(),"getGreen() est incorrect"),
                ()-> assertEquals(141, color.getBleu(), "getBlue() est incorrect"),
                ()-> assertEquals("#35D58D", color.getHexValue(), "getHexValue() est incorrect"));
    }
    @Test
    public void testSetHexValue() {
        color.setHexValue("#35D58D");
        assertEquals( "#35D58D", color.getHexValue(),"Incorrect Value");
    }
    @Test
    public void testToString() {
        assertEquals("[value:#35D58D, rouge:53, vert:213, bleu:141]", color.toString());
    }



}