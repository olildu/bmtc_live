package app.chalo.productpurchase.productselection.data.models.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketPassengerFareResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketPassengerFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8583a;
    public final Double b;
    public final Double c;
    public final MTicketPassengerFareBreakdownResponseApiModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketPassengerFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketPassengerFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketPassengerFareResponseApiModel> serializer() {
            return MTicketPassengerFareResponseApiModel$$serializer.f8584a;
        }
    }

    public /* synthetic */ MTicketPassengerFareResponseApiModel(int i, Double d, Double d2, Double d3, MTicketPassengerFareBreakdownResponseApiModel mTicketPassengerFareBreakdownResponseApiModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MTicketPassengerFareResponseApiModel$$serializer.f8584a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8583a = d;
        this.b = d2;
        this.c = d3;
        this.d = mTicketPassengerFareBreakdownResponseApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerFareResponseApiModel)) {
            return false;
        }
        MTicketPassengerFareResponseApiModel mTicketPassengerFareResponseApiModel = (MTicketPassengerFareResponseApiModel) obj;
        return Intrinsics.d(this.f8583a, mTicketPassengerFareResponseApiModel.f8583a) && Intrinsics.d(this.b, mTicketPassengerFareResponseApiModel.b) && Intrinsics.d(this.c, mTicketPassengerFareResponseApiModel.c) && Intrinsics.d(this.d, mTicketPassengerFareResponseApiModel.d);
    }

    public final int hashCode() {
        Double d = this.f8583a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        MTicketPassengerFareBreakdownResponseApiModel mTicketPassengerFareBreakdownResponseApiModel = this.d;
        return iHashCode3 + (mTicketPassengerFareBreakdownResponseApiModel != null ? mTicketPassengerFareBreakdownResponseApiModel.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketPassengerFareResponseApiModel(fare=" + this.f8583a + ", totalFare=" + this.b + ", discount=" + this.c + ", fareBreakdown=" + this.d + ")";
    }
}
