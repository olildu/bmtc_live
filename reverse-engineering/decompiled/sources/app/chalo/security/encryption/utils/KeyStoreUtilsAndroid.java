package app.chalo.security.encryption.utils;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import app.chalo.security.encryption.exception.CryptoException;
import app.chalo.security.encryption.exception.CryptoOperationResult;
import app.chalo.security.encryption.exception.IncompatibleDeviceException;
import app.chalo.security.encryption.exception.UnknownCryptoException;
import defpackage.vc0;
import defpackage.xx;
import in.juspay.hypersdk.core.Constants;
import io.ktor.utils.io.core.StringsKt;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/utils/KeyStoreUtilsAndroid;", "Lapp/chalo/security/encryption/utils/KeyStoreUtils;", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyStoreUtilsAndroid implements KeyStoreUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9363a;
    public final Function0 b;
    public final Lazy c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/chalo/security/encryption/utils/KeyStoreUtilsAndroid$Companion;", "", "", "RSA_TRANSFORMATION", "Ljava/lang/String;", "ANDROID_KEY_STORE", "ALGORITHM_RSA", "", "RSA_KEY_SIZE", "I", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public KeyStoreUtilsAndroid(Context context) {
        vc0 vc0Var = new vc0(11);
        this.f9363a = context;
        this.b = vc0Var;
        this.c = LazyKt.b(new xx(this, 29));
    }

    public static KeyStore.PrivateKeyEntry c(String str, KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        if (Build.VERSION.SDK_INT < 28) {
            KeyStore.Entry entry = keyStore.getEntry(str, null);
            Intrinsics.g(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            return (KeyStore.PrivateKeyEntry) entry;
        }
        Key key = keyStore.getKey(str, null);
        PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
        if (privateKey == null) {
            KeyStore.Entry entry2 = keyStore.getEntry(str, null);
            if (entry2 instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry2;
            }
        } else {
            Certificate certificate = keyStore.getCertificate(str);
            if (certificate != null) {
                return new KeyStore.PrivateKeyEntry(privateKey, new Certificate[]{certificate});
            }
        }
        return null;
    }

    @Override // app.chalo.security.encryption.utils.KeyStoreUtils
    public final CryptoOperationResult a(String encryptedInput) {
        Intrinsics.i(encryptedInput, "encryptedInput");
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryD = d();
            if (privateKeyEntryD == null) {
                return new CryptoOperationResult.UnknownError("RSA key entry missing from keystore");
            }
            PrivateKey privateKey = privateKeyEntryD.getPrivateKey();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKey);
            return new CryptoOperationResult.Success(Base64.encodeToString(cipher.doFinal(Base64.decode(StringsKt.b(encryptedInput, Charsets.f17672a), 0)), 2));
        } catch (Throwable th) {
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                return new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            }
            if ((th instanceof IllegalArgumentException) || (th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                return new CryptoOperationResult.CryptoError("The RSA encrypted input is corrupted and cannot be recovered. Please discard it.");
            }
            String message2 = th.getMessage();
            return new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
        }
    }

    @Override // app.chalo.security.encryption.utils.KeyStoreUtils
    public final CryptoOperationResult b(String decryptedInput) {
        Intrinsics.i(decryptedInput, "decryptedInput");
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryD = d();
            if (privateKeyEntryD == null) {
                return new CryptoOperationResult.UnknownError("RSA key entry missing from keystore");
            }
            Certificate certificate = privateKeyEntryD.getCertificate();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, certificate);
            return new CryptoOperationResult.Success(Base64.encodeToString(cipher.doFinal(Base64.decode(StringsKt.b(decryptedInput, Charsets.f17672a), 0)), 2));
        } catch (Throwable th) {
            if ((th instanceof NoSuchAlgorithmException) || (th instanceof NoSuchPaddingException) || (th instanceof InvalidKeyException)) {
                String message = th.getMessage();
                return new CryptoOperationResult.IncompatibleDeviceError(message != null ? message : "");
            }
            if ((th instanceof IllegalBlockSizeException) || (th instanceof BadPaddingException)) {
                return new CryptoOperationResult.CryptoError("The RSA decrypted input is invalid.");
            }
            String message2 = th.getMessage();
            return new CryptoOperationResult.UnknownError(message2 != null ? message2 : "");
        }
    }

    public final KeyStore.PrivateKeyEntry d() throws CryptoException, UnknownCryptoException, IncompatibleDeviceException {
        KeyStore.PrivateKeyEntry privateKeyEntryC;
        Lazy lazy = this.c;
        Function0 function0 = this.b;
        boolean z = true;
        try {
            KeyStore keyStore = (KeyStore) function0.invoke();
            keyStore.load(null);
            if (keyStore.containsAlias((String) lazy.getValue()) && (privateKeyEntryC = c((String) lazy.getValue(), keyStore)) != null) {
                return privateKeyEntryC;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 75);
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder((String) lazy.getValue(), 3).setCertificateSubject(new X500Principal("CN=chalo,O=zophop")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).setKeySize(2048).setEncryptionPaddings("PKCS1Padding").setBlockModes("ECB").build();
            Intrinsics.f(keyGenParameterSpecBuild);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(Constants.ALG_RSA, "AndroidKeyStore");
            keyPairGenerator.initialize(keyGenParameterSpecBuild);
            keyPairGenerator.generateKeyPair();
            return c((String) lazy.getValue(), keyStore);
        } catch (Throwable th) {
            if ((th instanceof CertificateException) || (th instanceof InvalidAlgorithmParameterException) || (th instanceof NoSuchProviderException) || (th instanceof NoSuchAlgorithmException) || (th instanceof KeyStoreException) || (th instanceof ProviderException)) {
                throw new IncompatibleDeviceException("", th);
            }
            if (!(th instanceof IOException) && !(th instanceof UnrecoverableEntryException)) {
                throw new UnknownCryptoException(th.getMessage(), th);
            }
            try {
                KeyStore keyStore2 = (KeyStore) function0.invoke();
                keyStore2.load(null);
                keyStore2.deleteEntry((String) lazy.getValue());
            } catch (Throwable unused) {
                z = false;
            }
            throw new CryptoException(z ? "The existing RSA key pair could not be recovered and has been deleted. You can safely retry this operation." : "The existing RSA key pair could not be recovered, and deleting it also failed. Retry may keep failing.", th);
        }
    }
}
