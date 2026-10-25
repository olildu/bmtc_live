package app.chalo.features.chaloconfig.data.model;

import defpackage.ji;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/chaloconfig/data/model/ChaloConfigResponse;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloConfigResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigMetadata f2642a;
    public final Map b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/chaloconfig/data/model/ChaloConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/chaloconfig/data/model/ChaloConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloConfigResponse> serializer() {
            return ChaloConfigResponse$$serializer.f2643a;
        }
    }

    public /* synthetic */ ChaloConfigResponse(int i, ChaloConfigMetadata chaloConfigMetadata, Map map) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ChaloConfigResponse$$serializer.f2643a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2642a = chaloConfigMetadata;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloConfigResponse)) {
            return false;
        }
        ChaloConfigResponse chaloConfigResponse = (ChaloConfigResponse) obj;
        return Intrinsics.d(this.f2642a, chaloConfigResponse.f2642a) && Intrinsics.d(this.b, chaloConfigResponse.b);
    }

    public final int hashCode() {
        ChaloConfigMetadata chaloConfigMetadata = this.f2642a;
        int iHashCode = (chaloConfigMetadata == null ? 0 : chaloConfigMetadata.hashCode()) * 31;
        Map map = this.b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloConfigResponse(metadata=" + this.f2642a + ", data=" + this.b + ")";
    }
}
