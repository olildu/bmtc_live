package app.chalo.security.encryption.utils;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import app.chalo.crashlytics.CrashlyticsLogger;
import com.google.android.gms.stats.CodePackage;
import defpackage.vc0;
import in.juspay.hypersdk.core.Constants;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.security.auth.x500.X500Principal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/utils/KeyEncrypterAndroid;", "Lapp/chalo/security/encryption/utils/KeyEncrypter;", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyEncrypterAndroid implements KeyEncrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9362a;
    public final CrashlyticsLogger b;
    public final Lazy c = LazyKt.b(new vc0(9));
    public final Lazy d = LazyKt.b(new vc0(10));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/security/encryption/utils/KeyEncrypterAndroid$Companion;", "", "", "KEYSTORE_ANDROID", "Ljava/lang/String;", "AES_MODE", "", "TAG_LENGTH_BITS", "I", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public KeyEncrypterAndroid(Context context, CrashlyticsLogger crashlyticsLogger) {
        this.f9362a = context;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.security.encryption.utils.KeyEncrypter
    public final KeyEncryptResult a(String dataToEncrypt, String alias) {
        Intrinsics.i(dataToEncrypt, "dataToEncrypt");
        Intrinsics.i(alias, "alias");
        try {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = new byte[12];
            ((SecureRandom) this.d.getValue()).nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, i(alias), new GCMParameterSpec(128, bArr));
            Intrinsics.f(charset);
            byte[] bytes = dataToEncrypt.getBytes(charset);
            Intrinsics.h(bytes, "getBytes(...)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16 + bArrDoFinal.length);
            byteBufferAllocate.putInt(12);
            byteBufferAllocate.put(bArr);
            byteBufferAllocate.put(bArrDoFinal);
            String strEncodeToString = Base64.encodeToString(byteBufferAllocate.array(), 0);
            Intrinsics.f(strEncodeToString);
            return new KeyEncryptResult(true, strEncodeToString);
        } catch (Throwable unused) {
            return new KeyEncryptResult(false, "");
        }
    }

    @Override // app.chalo.security.encryption.utils.KeyEncrypter
    public final String b(String encryptedData, String alias) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.i(encryptedData, "encryptedData");
        Intrinsics.i(alias, "alias");
        Charset charset = StandardCharsets.UTF_8;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(Base64.decode(encryptedData, 2));
        byte[] bArr = new byte[byteBufferWrap.getInt()];
        byteBufferWrap.get(bArr);
        byte[] bArr2 = new byte[byteBufferWrap.remaining()];
        byteBufferWrap.get(bArr2);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, i(alias), new GCMParameterSpec(128, bArr));
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        Intrinsics.f(bArrDoFinal);
        Intrinsics.f(charset);
        return new String(bArrDoFinal, charset);
    }

    @Override // app.chalo.security.encryption.utils.KeyEncrypter
    public final String c() {
        String string = UUID.randomUUID().toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }

    @Override // app.chalo.security.encryption.utils.KeyEncrypter
    public final boolean d(String alias) {
        boolean zContainsAlias;
        Intrinsics.i(alias, "alias");
        try {
            try {
                zContainsAlias = h().containsAlias(alias);
            } catch (Throwable th) {
                String message = "isSigning catch: " + th;
                Intrinsics.i(message, "message");
                zContainsAlias = false;
            }
            if (!zContainsAlias) {
                try {
                    if (Build.VERSION.SDK_INT > 23) {
                        f(alias);
                    } else {
                        g(this.f9362a, alias);
                    }
                } catch (Exception e) {
                    this.b.i(e);
                }
            }
            i(alias);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void e(String alias) {
        Intrinsics.i(alias, "alias");
        try {
            if (h().containsAlias(alias)) {
                h().deleteEntry(alias);
            }
        } catch (Exception e) {
            this.b.i(e);
        }
    }

    public final void f(String alias) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.i(alias, "alias");
        e(alias);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(CLConstants.AES_KEY_VAULT_KEY, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(alias, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
        keyGenerator.generateKey();
    }

    public final void g(Context context, String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        e(str);
        Locale locale = Locale.ENGLISH;
        Calendar calendar = Calendar.getInstance(locale);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.add(1, 3000);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal("CN=".concat(str))).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setSerialNumber(BigInteger.TEN).build();
        Intrinsics.h(keyPairGeneratorSpecBuild, "build(...)");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(Constants.ALG_RSA, "AndroidKeyStore");
        keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        keyPairGenerator.generateKeyPair();
    }

    public final KeyStore h() {
        Object value = this.c.getValue();
        Intrinsics.h(value, "getValue(...)");
        return (KeyStore) value;
    }

    public final Key i(String str) {
        try {
            Key key = h().getKey(str, null);
            Intrinsics.f(key);
            return key;
        } catch (Throwable unused) {
            PublicKey publicKey = h().getCertificate(str).getPublicKey();
            Intrinsics.f(publicKey);
            return publicKey;
        }
    }
}
