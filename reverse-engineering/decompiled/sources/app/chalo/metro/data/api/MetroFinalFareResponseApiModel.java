package app.chalo.metro.data.api;

import defpackage.sg0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/MetroFinalFareResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroFinalFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5406a;
    public final Integer b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/MetroFinalFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/MetroFinalFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroFinalFareResponseApiModel> serializer() {
            return MetroFinalFareResponseApiModel$$serializer.f5407a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new sg0(19)), null, LazyKt.a(lazyThreadSafetyMode, new sg0(20))};
    }

    public /* synthetic */ MetroFinalFareResponseApiModel(int i, List list, Integer num, List list2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(MetroFinalFareResponseApiModel$$serializer.f5407a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5406a = list;
        this.b = num;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroFinalFareResponseApiModel)) {
            return false;
        }
        MetroFinalFareResponseApiModel metroFinalFareResponseApiModel = (MetroFinalFareResponseApiModel) obj;
        return Intrinsics.d(this.f5406a, metroFinalFareResponseApiModel.f5406a) && Intrinsics.d(this.b, metroFinalFareResponseApiModel.b) && Intrinsics.d(this.c, metroFinalFareResponseApiModel.c);
    }

    public final int hashCode() {
        List list = this.f5406a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroFinalFareResponseApiModel(fareBreakup=");
        sb.append(this.f5406a);
        sb.append(", finalFare=");
        sb.append(this.b);
        sb.append(", terms=");
        return xs.l(sb, this.c, ")");
    }
}
