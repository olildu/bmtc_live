package app.chalo.premiumbus.data.models.api.response;

import defpackage.nt0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusSeatSelectionLayoutResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusSeatSelectionLayoutResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7052a;
    public final Integer b;
    public final Integer c;
    public final List d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusSeatSelectionLayoutResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusSeatSelectionLayoutResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusSeatSelectionLayoutResponseApiModel> serializer() {
            return PremiumBusSeatSelectionLayoutResponseApiModel$$serializer.f7053a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new nt0(23)), LazyKt.a(lazyThreadSafetyMode, new nt0(24))};
    }

    public /* synthetic */ PremiumBusSeatSelectionLayoutResponseApiModel(int i, String str, Integer num, Integer num2, List list, List list2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PremiumBusSeatSelectionLayoutResponseApiModel$$serializer.f7053a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7052a = str;
        this.b = num;
        this.c = num2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionLayoutResponseApiModel)) {
            return false;
        }
        PremiumBusSeatSelectionLayoutResponseApiModel premiumBusSeatSelectionLayoutResponseApiModel = (PremiumBusSeatSelectionLayoutResponseApiModel) obj;
        return Intrinsics.d(this.f7052a, premiumBusSeatSelectionLayoutResponseApiModel.f7052a) && Intrinsics.d(this.b, premiumBusSeatSelectionLayoutResponseApiModel.b) && Intrinsics.d(this.c, premiumBusSeatSelectionLayoutResponseApiModel.c) && Intrinsics.d(this.d, premiumBusSeatSelectionLayoutResponseApiModel.d) && Intrinsics.d(this.e, premiumBusSeatSelectionLayoutResponseApiModel.e);
    }

    public final int hashCode() {
        String str = this.f7052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusSeatSelectionLayoutResponseApiModel(tripId=");
        sb.append(this.f7052a);
        sb.append(", capacity=");
        sb.append(this.b);
        sb.append(", availableSeats=");
        sb.append(this.c);
        sb.append(", availableSeatIds=");
        sb.append(this.d);
        sb.append(", layout=");
        return xs.l(sb, this.e, ")");
    }
}
