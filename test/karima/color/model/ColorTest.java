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
    public void test_constructor_RGB() {
        assertAll("Color object non conformes",
                ()-> assertEquals(53, color.getRouge(),"getRed() est incorrect"),
                ()-> assertEquals(213, color.getVert(),"getGreen() est incorrect"),
                ()-> assertEquals(141, color.getBleu(), "getBlue() est incorrect"),
                ()-> assertEquals("#35D58D", color.getHexValue(), "getHexValue() est incorrect"));
    }

    @Test
    public void test_constructor_HexValue() {
        color = new Color("#D58D35");
        assertAll("Color object non conformes",
                ()-> assertEquals(213, color.getRouge(),"getRed() est incorrect"),
                ()-> assertEquals(141, color.getVert(),"getGreen() est incorrect"),
                ()-> assertEquals(53, color.getBleu(), "getBlue() est incorrect"),
                ()-> assertEquals("#D58D35", color.getHexValue(), "getHexValue() est incorrect"));
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
    @Test
    public void test_rouge_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(-3, 141, 53));
    }

    @Test
    public void test_rouge_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(264, 141, 53));
    }

    @Test
    public void test_vert_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(213, -31, 53));
    }

    @Test
    public void test_vert_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(213, 421, 53));
    }

    @Test
    public void test_bleu_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(213, 141, -132));
    }

    @Test
    public void test_bleu_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () ->  color = new Color(213, 141, 533));
    }



    @Test
    public void test_HexValue_with_null_value_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color(null));
    }

    @Test
    public void test_HexValue_with_wrong_value_1_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color("A26F76"));
    }

    @Test
    public void test_HexValue_with_wrong_value_2_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color("#a26F76"));
    }

    @Test
    public void test_HexValue_with_wrong_value_3_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color("#G26F76"));
    }

    @Test
    public void test_HexValue_with_wrong_value_4_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color("#A26F7"));
    }

    @Test
    public void test_HexValue_with_wrong_value_5_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color = new Color("#A26F71E"));
    }

    @Test
    public void testToString_not_null() {
        assertNotNull(color.toString(), "toString() est null");
    }

    @Test
    public void testSetRouge_with_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color.setRouge(425));
    }

    @Test
    public void testSetRouge_with_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setRouge(-12));
    }

    @Test
    public void testSetVert_with_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setVert(615));
    }

    @Test
    public void testSetVert_with_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setVert(-132));
    }
    @Test
    public void testSetBleu_with_value_bigger_than_255_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setBleu(731));
    }

    @Test
    public void testSetBleu_with_value_smaller_than_0_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setBleu(-1));
    }

    @Test
    public void testSetHexValue_with_null_value_Exception() {
        assertThrows(IllegalArgumentException.class, () -> color.setHexValue(null));
    }

    @Test
    public void testSetHexValue_with_wrong_value_1_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setHexValue("A26F76"));
    }

    @Test
    public void testSetHexValue_with_wrong_value_2_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setHexValue("#a26F76"));
    }

    @Test
    public void testSetHexValue_with_wrong_value_3_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setHexValue("#G26F76"));
    }

    @Test
    public void testSetHexValue_with_wrong_value_4_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setHexValue("#A26F7"));
    }

    @Test
    public void testSetHexValue_with_wrong_value_5_Exception() {
        assertThrows(IllegalArgumentException.class, () ->color.setHexValue("#A26F71E"));
    }

}





