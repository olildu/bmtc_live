package app.chalo.security.sync.data;

import defpackage.vz;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeyListData;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EncryptionKeyListData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9381a;
    public final int b;
    public final List c;
    public final Map d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeyListData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/data/EncryptionKeyListData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EncryptionKeyListData> serializer() {
            return EncryptionKeyListData$$serializer.f9382a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new vz(16)), LazyKt.a(lazyThreadSafetyMode, new vz(17))};
    }

    public /* synthetic */ EncryptionKeyListData(int i, boolean z, int i2, List list, Map map) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(EncryptionKeyListData$$serializer.f9382a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9381a = z;
        this.b = i2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = MapsKt.d();
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionKeyListData)) {
            return false;
        }
        EncryptionKeyListData encryptionKeyListData = (EncryptionKeyListData) obj;
        return this.f9381a == encryptionKeyListData.f9381a && this.b == encryptionKeyListData.b && Intrinsics.d(this.c, encryptionKeyListData.c) && Intrinsics.d(this.d, encryptionKeyListData.d);
    }

    public final int hashCode() {
        int i = (((this.f9381a ? 1231 : 1237) * 31) + this.b) * 31;
        List list = this.c;
        return this.d.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "EncryptionKeyListData(success=" + this.f9381a + ", count=" + this.b + ", data=" + this.c + ", closedLoopKeys=" + this.d + ")";
    }
}
