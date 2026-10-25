package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.hf0;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareDataResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketFareDataResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8569a;
    public final Integer b;
    public final Map c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareDataResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareDataResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketFareDataResponseApiModel> serializer() {
            return MTicketFareDataResponseApiModel$$serializer.f8570a;
        }
    }

    public /* synthetic */ MTicketFareDataResponseApiModel(int i, Double d2, Integer num, Map map) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MTicketFareDataResponseApiModel$$serializer.f8570a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8569a = d2;
        this.b = num;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareDataResponseApiModel)) {
            return false;
        }
        MTicketFareDataResponseApiModel mTicketFareDataResponseApiModel = (MTicketFareDataResponseApiModel) obj;
        return Intrinsics.d(this.f8569a, mTicketFareDataResponseApiModel.f8569a) && Intrinsics.d(this.b, mTicketFareDataResponseApiModel.b) && Intrinsics.d(this.c, mTicketFareDataResponseApiModel.c);
    }

    public final int hashCode() {
        Double d2 = this.f8569a;
        int iHashCode = (d2 == null ? 0 : d2.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketFareDataResponseApiModel(discountPercentage=" + this.f8569a + ", roundingLogic=" + this.b + ", passengerDetails=" + this.c + ")";
    }
}
