package app.chalo.security.encryption.utils;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.crashlytics.CrashlyticsLogger;
import defpackage.yh1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/utils/VaultEncryptionKeyUtils;", "", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VaultEncryptionKeyUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9365a;
    public final Lazy b;
    public final KeyEncrypter c;
    public final DataStore d;
    public final CrashlyticsLogger e;
    public final Lazy f;
    public boolean g;
    public boolean h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/security/encryption/utils/VaultEncryptionKeyUtils$Companion;", "", "", "DEFAULT", "Ljava/lang/String;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public VaultEncryptionKeyUtils(String alias, Lazy lazy, KeyEncrypter keyEncrypter, DataStore dataStore, CrashlyticsLogger crashlyticsLogger) {
        Intrinsics.i(alias, "alias");
        this.f9365a = alias;
        this.b = lazy;
        this.c = keyEncrypter;
        this.d = dataStore;
        this.e = crashlyticsLogger;
        this.f = LazyKt.b(new yh1(this, 10));
    }

    public final String a() {
        String strB;
        Lazy lazy = this.f;
        VaultEncryptionKeyUtils$isFallbackUsed$1 vaultEncryptionKeyUtils$isFallbackUsed$1 = new VaultEncryptionKeyUtils$isFallbackUsed$1(this, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17583a;
        try {
            if (((Boolean) BuildersKt.e(emptyCoroutineContext, vaultEncryptionKeyUtils$isFallbackUsed$1)).booleanValue()) {
                strB = b();
            } else {
                boolean zBooleanValue = ((Boolean) BuildersKt.e(emptyCoroutineContext, new VaultEncryptionKeyUtils$containsKey$1(this, (Preferences.Key) lazy.getValue(), null))).booleanValue();
                this.h = !zBooleanValue;
                String str = this.f9365a;
                KeyEncrypter keyEncrypter = this.c;
                if (!zBooleanValue) {
                    boolean z = true;
                    if (keyEncrypter.d(str)) {
                        KeyEncryptResult keyEncryptResultA = keyEncrypter.a(keyEncrypter.c(), str);
                        if (keyEncryptResultA.f9361a) {
                            BuildersKt.e(EmptyCoroutineContext.f17583a, new VaultEncryptionKeyUtils$editStore$1(this, (Preferences.Key) lazy.getValue(), keyEncryptResultA.b, null));
                            z = false;
                        }
                    }
                    this.g = z;
                }
                strB = this.g ? b() : keyEncrypter.b((String) BuildersKt.e(emptyCoroutineContext, new VaultEncryptionKeyUtils$getPersistedKeyOrDefault$1(this, null)), str);
            }
            this.h = false;
            return strB;
        } catch (Throwable th) {
            try {
                CrashlyticsLogger crashlyticsLogger = this.e;
                String message = "vault key retrieval failed, falling back (firstTime=" + this.h + ")";
                Intrinsics.i(message, "message");
                crashlyticsLogger.i(new VaultKeyRetrievalException(message, th));
            } catch (Throwable unused) {
            }
            try {
                return this.h ? b() : "NA";
            } finally {
                this.h = false;
            }
        }
    }

    public final String b() {
        return (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new VaultEncryptionKeyUtils$readFallBack$1(this, null));
    }
}
