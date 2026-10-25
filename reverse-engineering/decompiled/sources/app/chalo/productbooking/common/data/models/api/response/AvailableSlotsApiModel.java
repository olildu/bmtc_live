package app.chalo.productbooking.common.data.models.api.response;

import defpackage.p7;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/AvailableSlotsApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AvailableSlotsApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8112a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/AvailableSlotsApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/AvailableSlotsApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AvailableSlotsApiModel> serializer() {
            return AvailableSlotsApiModel$$serializer.f8113a;
        }
    }

    public /* synthetic */ AvailableSlotsApiModel(int i, Long l, String str, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(AvailableSlotsApiModel$$serializer.f8113a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8112a = l;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSlotsApiModel)) {
            return false;
        }
        AvailableSlotsApiModel availableSlotsApiModel = (AvailableSlotsApiModel) obj;
        return Intrinsics.d(this.f8112a, availableSlotsApiModel.f8112a) && Intrinsics.d(this.b, availableSlotsApiModel.b) && Intrinsics.d(this.c, availableSlotsApiModel.c);
    }

    public final int hashCode() {
        Long l = this.f8112a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableSlotsApiModel(date=");
        sb.append(this.f8112a);
        sb.append(", remark=");
        sb.append(this.b);
        sb.append(", slots=");
        return xs.l(sb, this.c, ")");
    }
}
