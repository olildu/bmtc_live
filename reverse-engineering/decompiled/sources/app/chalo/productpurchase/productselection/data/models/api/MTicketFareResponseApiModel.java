package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketFareDataResponseApiModel f8571a;
    public final MTicketFareRouteStageResponseApiModel b;
    public final Integer c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketFareResponseApiModel> serializer() {
            return MTicketFareResponseApiModel$$serializer.f8572a;
        }
    }

    public /* synthetic */ MTicketFareResponseApiModel(int i, MTicketFareDataResponseApiModel mTicketFareDataResponseApiModel, MTicketFareRouteStageResponseApiModel mTicketFareRouteStageResponseApiModel, Integer num) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MTicketFareResponseApiModel$$serializer.f8572a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8571a = mTicketFareDataResponseApiModel;
        this.b = mTicketFareRouteStageResponseApiModel;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareResponseApiModel)) {
            return false;
        }
        MTicketFareResponseApiModel mTicketFareResponseApiModel = (MTicketFareResponseApiModel) obj;
        return Intrinsics.d(this.f8571a, mTicketFareResponseApiModel.f8571a) && Intrinsics.d(this.b, mTicketFareResponseApiModel.b) && Intrinsics.d(this.c, mTicketFareResponseApiModel.c);
    }

    public final int hashCode() {
        MTicketFareDataResponseApiModel mTicketFareDataResponseApiModel = this.f8571a;
        int iHashCode = (mTicketFareDataResponseApiModel == null ? 0 : mTicketFareDataResponseApiModel.hashCode()) * 31;
        MTicketFareRouteStageResponseApiModel mTicketFareRouteStageResponseApiModel = this.b;
        int iHashCode2 = (iHashCode + (mTicketFareRouteStageResponseApiModel == null ? 0 : mTicketFareRouteStageResponseApiModel.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTicketFareResponseApiModel(fares=");
        sb.append(this.f8571a);
        sb.append(", routeDetails=");
        sb.append(this.b);
        sb.append(", stagePricingLogic=");
        return pk0.k(sb, this.c, ")");
    }
}
