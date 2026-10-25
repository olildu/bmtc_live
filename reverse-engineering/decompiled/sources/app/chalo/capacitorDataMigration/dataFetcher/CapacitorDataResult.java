package app.chalo.capacitorDataMigration.dataFetcher;

import defpackage.xe;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/capacitorDataMigration/dataFetcher/CapacitorDataResult;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CapacitorDataResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1187a;
    public final Map b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/capacitorDataMigration/dataFetcher/CapacitorDataResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/capacitorDataMigration/dataFetcher/CapacitorDataResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CapacitorDataResult> serializer() {
            return CapacitorDataResult$$serializer.f1188a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new xe(0)), LazyKt.a(lazyThreadSafetyMode, new xe(1))};
    }

    public /* synthetic */ CapacitorDataResult(int i, Map map, Map map2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CapacitorDataResult$$serializer.f1188a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1187a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CapacitorDataResult)) {
            return false;
        }
        CapacitorDataResult capacitorDataResult = (CapacitorDataResult) obj;
        return Intrinsics.d(this.f1187a, capacitorDataResult.f1187a) && Intrinsics.d(this.b, capacitorDataResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1187a.hashCode() * 31);
    }

    public final String toString() {
        return "CapacitorDataResult(indexedDB=" + this.f1187a + ", localStorage=" + this.b + ")";
    }
}
