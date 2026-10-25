package app.chalo.ncmc.data.apiresponsemodel;

import defpackage.ji;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/ChaloCardRechargeFareInfoApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardRechargeFareInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6081a;
    public final Long b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/ChaloCardRechargeFareInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/ChaloCardRechargeFareInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardRechargeFareInfoApiResponseModel> serializer() {
            return ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a;
        }
    }

    public /* synthetic */ ChaloCardRechargeFareInfoApiResponseModel(int i, Long l, Long l2, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6081a = l;
        this.b = l2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardRechargeFareInfoApiResponseModel)) {
            return false;
        }
        ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel = (ChaloCardRechargeFareInfoApiResponseModel) obj;
        return Intrinsics.d(this.f6081a, chaloCardRechargeFareInfoApiResponseModel.f6081a) && Intrinsics.d(this.b, chaloCardRechargeFareInfoApiResponseModel.b) && Intrinsics.d(this.c, chaloCardRechargeFareInfoApiResponseModel.c);
    }

    public final int hashCode() {
        Long l = this.f6081a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardRechargeFareInfoApiResponseModel(minAmount=");
        sb.append(this.f6081a);
        sb.append(", multiplesAllowed=");
        sb.append(this.b);
        sb.append(", suggestedAmounts=");
        return xs.l(sb, this.c, ")");
    }
}
