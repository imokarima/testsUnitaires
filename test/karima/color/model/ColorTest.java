package karima.color.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    private Color color;


    @Test
    void testGetRouge() {
        assertEquals(213,color.getRouge());
    }
    @Test
    void testGetVert() {
        assertEquals(141,color.getVert());
    }
    @Test
    void testGetBleue() {
        assertEquals(53,color.getBleu());
    }
    @Test
    void testGetHexValue() {
        assertEquals("#D58D35",color.getHexValue());
    }



    @Test
    public void testSetRouge() {
        color.setRouge(213);
        assertEquals( 25, color.getRouge(),"Incorrect Value");
    }

    @Test
    public void testSetBleue() {
        color.setBleu(141);
        assertEquals( 25, color.getBleu(),"Incorrect Value");
    }
    @Test
    public void testSetVert() {
        color.setVert(53);
        assertEquals( 25, color.getVert(),"Incorrect Value");
    }
    @Test
    public void testSetHexValue() {
        color.setHexValue("#D58D35");
        assertEquals( "#D58D90", color.getHexValue(),"Incorrect Value");
    }
    @Test
    public void testToString() {
        assertEquals("value:#D58D90, rouge:53, vert:213,bleu:141", color.toString());
    }


    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        color=new Color(213, 141, 53);
    }

    @AfterEach
    void tearDown() {
        color=null;
    }
}