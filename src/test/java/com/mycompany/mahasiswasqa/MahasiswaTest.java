/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mahasiswasqa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author YUDDZAYAS
 */
public class MahasiswaTest {
    
    public MahasiswaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isLulus method, of class Mahasiswa.
     */
    @Test
    public void testNilaiLulus_75() {
        Mahasiswa mhs = new Mahasiswa("Budi", 75);
        assertTrue(mhs.isLulus());
    }
    
    @Test
    public void testNilaiLulus_60() {
        Mahasiswa mhs = new Mahasiswa("Ani", 60);
        assertTrue(mhs.isLulus());
    }
    
    @Test
    public void testNilaiLulus_100() {
        Mahasiswa mhs = new Mahasiswa("Citra", 100);
        assertTrue(mhs.isLulus());
    }
    
    // Test nilai tidak lulus
    @Test
    public void testNilaiTidakLulus_59() {
        Mahasiswa mhs = new Mahasiswa("Deni", 59);
        assertFalse(mhs.isLulus());
    }
    
    @Test
    public void testNilaiTidakLulus_50() {
        Mahasiswa mhs = new Mahasiswa("Eka", 50);
        assertFalse(mhs.isLulus());
    }
    
    @Test
    public void testNilaiTidakLulus_0() {
        Mahasiswa mhs = new Mahasiswa("Fajar", 0);
        assertFalse(mhs.isLulus());
    }
    
}
