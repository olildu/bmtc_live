package app.chalo.premiumbus.data.models.api.request;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketCancellationRequestApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBTicketCancellationRequestApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6992a;
    public final String b;
    public final String c;
    public final PBTicketCancellationReasonApiRequestModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketCancellationRequestApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PBTicketCancellationRequestApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBTicketCancellationRequestApiRequestModel> serializer() {
            return PBTicketCancellationRequestApiRequestModel$$serializer.f6993a;
        }
    }

    public /* synthetic */ PBTicketCancellationRequestApiRequestModel(int i, String str, String str2, String str3, PBTicketCancellationReasonApiRequestModel pBTicketCancellationReasonApiRequestModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PBTicketCancellationRequestApiRequestModel$$serializer.f6993a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6992a = str;
        this.b = str2;
        this.c = str3;
        this.d = pBTicketCancellationReasonApiRequestModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBTicketCancellationRequestApiRequestModel)) {
            return false;
        }
        PBTicketCancellationRequestApiRequestModel pBTicketCancellationRequestApiRequestModel = (PBTicketCancellationRequestApiRequestModel) obj;
        return Intrinsics.d(this.f6992a, pBTicketCancellationRequestApiRequestModel.f6992a) && Intrinsics.d(this.b, pBTicketCancellationRequestApiRequestModel.b) && Intrinsics.d(this.c, pBTicketCancellationRequestApiRequestModel.c) && Intrinsics.d(this.d, pBTicketCancellationRequestApiRequestModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f6992a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBTicketCancellationRequestApiRequestModel(bookingId=", this.f6992a, ", productType=", this.b, ", productSubType=");
        sbE.append(this.c);
        sbE.append(", cancelInfo=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public PBTicketCancellationRequestApiRequestModel(String bookingId, String productType, String productSubType, PBTicketCancellationReasonApiRequestModel pBTicketCancellationReasonApiRequestModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f6992a = bookingId;
        this.b = productType;
        this.c = productSubType;
        this.d = pBTicketCancellationReasonApiRequestModel;
    }
}
