package app.chalo.security.sync.data;

import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vz;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiData;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EncryptionKeySyncApiData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9383a;
    public final int b;
    public final String c;
    public final List d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/data/EncryptionKeySyncApiData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EncryptionKeySyncApiData> serializer() {
            return EncryptionKeySyncApiData$$serializer.f9384a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new vz(18)), LazyKt.a(lazyThreadSafetyMode, new vz(19))};
    }

    public /* synthetic */ EncryptionKeySyncApiData(int i, String str, int i2, String str2, List list, List list2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(EncryptionKeySyncApiData$$serializer.f9384a.getDescriptor(), i, 31);
            throw null;
        }
        this.f9383a = str;
        this.b = i2;
        this.c = str2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionKeySyncApiData)) {
            return false;
        }
        EncryptionKeySyncApiData encryptionKeySyncApiData = (EncryptionKeySyncApiData) obj;
        return Intrinsics.d(this.f9383a, encryptionKeySyncApiData.f9383a) && this.b == encryptionKeySyncApiData.b && Intrinsics.d(this.c, encryptionKeySyncApiData.c) && Intrinsics.d(this.d, encryptionKeySyncApiData.d) && Intrinsics.d(this.e, encryptionKeySyncApiData.e);
    }

    public final int hashCode() {
        int iB = r30.b(nf1.e(((this.f9383a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "EncryptionKeySyncApiData(aesKey=", this.f9383a, ", noOfDays=", ", iv=");
        pk0.w(this.c, ", walletTypes=", ", agencies=", sbM, this.d);
        return xs.l(sbM, this.e, ")");
    }

    public EncryptionKeySyncApiData(int i, String str, String str2, List walletTypes, List list) {
        Intrinsics.i(walletTypes, "walletTypes");
        this.f9383a = str;
        this.b = i;
        this.c = str2;
        this.d = walletTypes;
        this.e = list;
    }
}
