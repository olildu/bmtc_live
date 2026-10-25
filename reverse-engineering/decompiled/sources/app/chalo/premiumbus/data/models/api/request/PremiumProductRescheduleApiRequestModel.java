package app.chalo.premiumbus.data.models.api.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pw0;
import defpackage.xs;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumProductRescheduleApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumProductRescheduleApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7012a;
    public final String b;
    public final String c;
    public final PBTicketCancellationReasonApiRequestModel d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumProductRescheduleApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PremiumProductRescheduleApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumProductRescheduleApiRequestModel> serializer() {
            return PremiumProductRescheduleApiRequestModel$$serializer.f7013a;
        }
    }

    public /* synthetic */ PremiumProductRescheduleApiRequestModel(int i, String str, String str2, String str3, PBTicketCancellationReasonApiRequestModel pBTicketCancellationReasonApiRequestModel, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PremiumProductRescheduleApiRequestModel$$serializer.f7013a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7012a = str;
        this.b = str2;
        this.c = str3;
        this.d = pBTicketCancellationReasonApiRequestModel;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumProductRescheduleApiRequestModel)) {
            return false;
        }
        PremiumProductRescheduleApiRequestModel premiumProductRescheduleApiRequestModel = (PremiumProductRescheduleApiRequestModel) obj;
        return Intrinsics.d(this.f7012a, premiumProductRescheduleApiRequestModel.f7012a) && Intrinsics.d(this.b, premiumProductRescheduleApiRequestModel.b) && Intrinsics.d(this.c, premiumProductRescheduleApiRequestModel.c) && Intrinsics.d(this.d, premiumProductRescheduleApiRequestModel.d) && Intrinsics.d(this.e, premiumProductRescheduleApiRequestModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + nf1.e(nf1.e(this.f7012a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumProductRescheduleApiRequestModel(bookingId=", this.f7012a, ", rescheduleToTripId=", this.b, ", rescheduleToRouteId=");
        sbE.append(this.c);
        sbE.append(", rescheduleInfo=");
        sbE.append(this.d);
        sbE.append(", seats=");
        return xs.l(sbE, this.e, ")");
    }

    public PremiumProductRescheduleApiRequestModel(String bookingId, String rescheduleToTripId, String rescheduleToRouteId, PBTicketCancellationReasonApiRequestModel pBTicketCancellationReasonApiRequestModel, ArrayList arrayList) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(rescheduleToTripId, "rescheduleToTripId");
        Intrinsics.i(rescheduleToRouteId, "rescheduleToRouteId");
        this.f7012a = bookingId;
        this.b = rescheduleToTripId;
        this.c = rescheduleToRouteId;
        this.d = pBTicketCancellationReasonApiRequestModel;
        this.e = arrayList;
    }
}
