package com.mahfujshaan.cse486.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static android.media.MediaCodec.MetricsConstants.MODE;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String ALGORITHM = "AES";
    private static final String MODE = "AES/CBC/PKCS7Padding";
    private static final String IV = "abcd1234";
    private static String KEY;
    EditText alphanumeric_key, text;
    String encrypted_text;
    String AES = "AES";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alphanumeric_key = (EditText)findViewById(R.id.keyBox);
        text = (EditText)findViewById(R.id.textBox);
    }

            public void send_button(View v) throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException{
                String text_message = text.getText().toString();
                String alpha_key = alphanumeric_key.getText().toString();
                KEY = alpha_key;
                encrypted_text = encrypt(text_message);

                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("textMessage",text_message);
                intent.putExtra("alpha_key",alpha_key);
                startActivity(intent);
            }

    public static  String encrypt(String value) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(MODE);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(IV.getBytes()));
        byte[] values = cipher.doFinal(value.getBytes());
        return Base64.encodeToString(values, Base64.DEFAULT);
    }
}