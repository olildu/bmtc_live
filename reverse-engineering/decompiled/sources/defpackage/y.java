package defpackage;

import androidx.core.flagging.AconfigPackageCompat;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class y {
    static {
        AconfigPackageCompat.Companion companion = AconfigPackageCompat.INSTANCE;
    }

    public static AconfigPackageCompat a(String str) {
        return AconfigPackageCompat.INSTANCE.load(str);
    }
}
