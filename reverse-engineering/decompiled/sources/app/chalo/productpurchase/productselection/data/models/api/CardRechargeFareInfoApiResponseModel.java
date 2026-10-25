package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.xe;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/CardRechargeFareInfoApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeFareInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8559a;
    public final Long b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/CardRechargeFareInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/CardRechargeFareInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeFareInfoApiResponseModel> serializer() {
            return CardRechargeFareInfoApiResponseModel$$serializer.f8560a;
        }
    }

    public /* synthetic */ CardRechargeFareInfoApiResponseModel(int i, Long l, Long l2, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CardRechargeFareInfoApiResponseModel$$serializer.f8560a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8559a = l;
        this.b = l2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeFareInfoApiResponseModel)) {
            return false;
        }
        CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel = (CardRechargeFareInfoApiResponseModel) obj;
        return Intrinsics.d(this.f8559a, cardRechargeFareInfoApiResponseModel.f8559a) && Intrinsics.d(this.b, cardRechargeFareInfoApiResponseModel.b) && Intrinsics.d(this.c, cardRechargeFareInfoApiResponseModel.c);
    }

    public final int hashCode() {
        Long l = this.f8559a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardRechargeFareInfoApiResponseModel(minAmount=");
        sb.append(this.f8559a);
        sb.append(", multiplesAllowed=");
        sb.append(this.b);
        sb.append(", suggestedAmounts=");
        return xs.l(sb, this.c, ")");
    }
}
