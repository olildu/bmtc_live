package app.chalo.security.encryption.utils;

import android.util.Base64;
import app.chalo.security.encryption.exception.CryptoOperationResult;
import app.chalo.security.encryption.exception.IncompatibleDeviceException;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/utils/AESCryptoUtilsAndroid;", "Lapp/chalo/security/encryption/utils/AESCryptoUtils;", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AESCryptoUtilsAndroid implements AESCryptoUtils {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/chalo/security/encryption/utils/AESCryptoUtilsAndroid$Companion;", "", "", "TRANSFORMATION_CBC", "Ljava/lang/String;", "TRANSFORMATION_ECB", "AES_ALGO", "", "AES_KEY_LENGTH", "I", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // app.chalo.security.encryption.utils.AESCryptoUtils
    public final CryptoOperationResult a(String strToEncrypt, String secret) {
        Intrinsics.i(strToEncrypt, "strToEncrypt");
        Intrinsics.i(secret, "secret");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(secret, 2), CLConstants.AES_KEY_VAULT_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return new CryptoOperationResult.Success(Base64.encodeToString(cipher.doFinal(Base64.decode(strToEncrypt, 2)), 2));
        } catch (Throwable th) {
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                return new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            }
            if ((th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                return new CryptoOperationResult.CryptoError("The AES decrypted input is invalid.");
            }
            String message2 = th.getMessage();
            return new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
        }
    }

    @Override // app.chalo.security.encryption.utils.AESCryptoUtils
    public final CryptoOperationResult b(String strToDecrypt, String secret) {
        Intrinsics.i(strToDecrypt, "strToDecrypt");
        Intrinsics.i(secret, "secret");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(secret, 2), CLConstants.AES_KEY_VAULT_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(strToDecrypt, 2));
            Intrinsics.h(bArrDoFinal, "doFinal(...)");
            return new CryptoOperationResult.Success(new String(bArrDoFinal, Charsets.f17672a));
        } catch (Throwable th) {
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidAlgorithmParameterException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                return new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            }
            if ((th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                return new CryptoOperationResult.CryptoError("The AES encrypted input is corrupted and cannot be recovered. Please discard it");
            }
            String message2 = th.getMessage();
            return new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
        }
    }

    @Override // app.chalo.security.encryption.utils.AESCryptoUtils
    public final String c(String aesKey) {
        Intrinsics.i(aesKey, "aesKey");
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        Intrinsics.h(charsetForName, "forName(...)");
        byte[] bytes = aesKey.getBytes(charsetForName);
        Intrinsics.h(bytes, "getBytes(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bytes, 16);
        Intrinsics.h(bArrCopyOf, "copyOf(...)");
        String strEncodeToString = Base64.encodeToString(bArrCopyOf, 2);
        Intrinsics.h(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // app.chalo.security.encryption.utils.AESCryptoUtils
    public final CryptoOperationResult d(String key, String encrypted, String str) {
        Intrinsics.i(key, "key");
        Intrinsics.i(encrypted, "encrypted");
        byte[] bytes = encrypted.getBytes(Charsets.f17672a);
        Intrinsics.h(bytes, "getBytes(...)");
        try {
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            Intrinsics.h(charsetForName, "forName(...)");
            byte[] bytes2 = key.getBytes(charsetForName);
            Intrinsics.h(bytes2, "getBytes(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, CLConstants.AES_KEY_VAULT_KEY);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            if (str != null) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(Base64.decode(str, 2)));
            } else {
                cipher.init(2, secretKeySpec);
            }
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(bytes, 2));
            Intrinsics.h(bArrDoFinal, "doFinal(...)");
            return new CryptoOperationResult.Success(StringsKt.p(bArrDoFinal));
        } catch (Throwable th) {
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidAlgorithmParameterException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                return new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            }
            if ((th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                return new CryptoOperationResult.CryptoError("The AES encrypted input is corrupted and cannot be recovered. Please discard it");
            }
            String message2 = th.getMessage();
            return new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
        }
    }

    @Override // app.chalo.security.encryption.utils.AESCryptoUtils
    public final String e() throws IncompatibleDeviceException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(CLConstants.AES_KEY_VAULT_KEY);
            keyGenerator.init(128);
            String strEncodeToString = Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 2);
            Intrinsics.h(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        } catch (NoSuchAlgorithmException e) {
            throw new IncompatibleDeviceException("", e);
        }
    }
}
