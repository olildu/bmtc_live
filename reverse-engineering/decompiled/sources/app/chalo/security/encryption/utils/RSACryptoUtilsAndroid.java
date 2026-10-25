package app.chalo.security.encryption.utils;

import android.util.Base64;
import app.chalo.security.encryption.exception.CryptoOperationResult;
import in.juspay.hypersdk.core.Constants;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/utils/RSACryptoUtilsAndroid;", "Lapp/chalo/security/encryption/utils/RSACryptoUtils;", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RSACryptoUtilsAndroid implements RSACryptoUtils {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/security/encryption/utils/RSACryptoUtilsAndroid$Companion;", "", "", "RSA_ECB_transformation", "Ljava/lang/String;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // app.chalo.security.encryption.utils.RSACryptoUtils
    public final CryptoOperationResult a(String str, String publicKey) {
        CryptoOperationResult incompatibleDeviceError;
        Intrinsics.i(publicKey, "publicKey");
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            Charset charset = Charsets.f17672a;
            byte[] bytes = publicKey.getBytes(charset);
            Intrinsics.h(bytes, "getBytes(...)");
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(bytes, 0)));
            Intrinsics.h(publicKeyGeneratePublic, "generatePublic(...)");
            cipher.init(1, publicKeyGeneratePublic);
            byte[] bytes2 = str.getBytes(charset);
            Intrinsics.h(bytes2, "getBytes(...)");
            return new CryptoOperationResult.Success(Base64.encodeToString(cipher.doFinal(bytes2), 2));
        } catch (Throwable th) {
            if (th instanceof InvalidKeySpecException) {
                return new CryptoOperationResult.CryptoError("Server public key is invalid.");
            }
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                incompatibleDeviceError = new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            } else {
                if ((th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                    return new CryptoOperationResult.CryptoError("The RSA decrypted input is invalid.");
                }
                String message2 = th.getMessage();
                incompatibleDeviceError = new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
            }
            return incompatibleDeviceError;
        }
    }
}
