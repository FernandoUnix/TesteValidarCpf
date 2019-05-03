package br.com.gilmarioarantes.validacpf.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidaCPFTeste {
    ValidaCPF app;

    @Before
    public void setup(){
        app = new ValidaCPF();
    }
    

    @Test
    public void testaCPFMaiorOnzeDigitos(){
        Assert.assertFalse(app.isCPF("334624611689"));
    }

    @Test
    public void testaCPFNumerosIguais(){
        Assert.assertFalse(app.isCPF("11111111111"));
    }

    @Test
    public void testaCPFValido(){
        Assert.assertTrue(app.isCPF("191"));
    }

    @Test
    public void testaCPFValido1(){
        Assert.assertTrue(app.isCPF("01234567890"));
    }

    @Test
    public void testaCPFValido2(){
        Assert.assertTrue(app.isCPF("33462461168"));
    }
}
