package app.chalo.network.utils;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0086 J\t\u0010\u0006\u001a\u00020\u0005H\u0086 J\t\u0010\u0007\u001a\u00020\u0005H\u0086 J\t\u0010\b\u001a\u00020\u0005H\u0086 J\t\u0010\t\u001a\u00020\u0005H\u0086 J\t\u0010\n\u001a\u00020\u0005H\u0086 J\t\u0010\u000b\u001a\u00020\u0005H\u0086 ¨\u0006\f"}, d2 = {"Lapp/chalo/network/utils/SecureJNI;", "", "<init>", "()V", "getPKP1c", "", "getPKP2c", "getPKP3c", "getPKP1z", "getc", "getz", "getVaultKey", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecureJNI {
    public static final SecureJNI INSTANCE = new SecureJNI();

    static {
        System.loadLibrary("secure-keys-android");
    }

    private SecureJNI() {
    }

    public final native String getPKP1c();

    public final native String getPKP1z();

    public final native String getPKP2c();

    public final native String getPKP3c();

    public final native String getVaultKey();

    public final native String getc();

    public final native String getz();
}
