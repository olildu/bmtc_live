package app.chalo.premiumbus.data.models.api.request;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.to0;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketCreateOrderApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBTicketCreateOrderApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6996a;
    public final String b;
    public final long c;
    public final PBTicketSelectedTripDetailsApiRequestModel d;
    public final List e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketCreateOrderApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PBTicketCreateOrderApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBTicketCreateOrderApiRequestModel> serializer() {
            return PBTicketCreateOrderApiRequestModel$$serializer.f6997a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new to0(4)), LazyKt.a(lazyThreadSafetyMode, new to0(5)), LazyKt.a(lazyThreadSafetyMode, new to0(6)), null, null};
    }

    public /* synthetic */ PBTicketCreateOrderApiRequestModel(int i, String str, String str2, long j2, PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, List list, List list2, List list3, String str3, String str4) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(PBTicketCreateOrderApiRequestModel$$serializer.f6997a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f6996a = str;
        this.b = str2;
        this.c = j2;
        this.d = pBTicketSelectedTripDetailsApiRequestModel;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBTicketCreateOrderApiRequestModel)) {
            return false;
        }
        PBTicketCreateOrderApiRequestModel pBTicketCreateOrderApiRequestModel = (PBTicketCreateOrderApiRequestModel) obj;
        return Intrinsics.d(this.f6996a, pBTicketCreateOrderApiRequestModel.f6996a) && Intrinsics.d(this.b, pBTicketCreateOrderApiRequestModel.b) && this.c == pBTicketCreateOrderApiRequestModel.c && Intrinsics.d(this.d, pBTicketCreateOrderApiRequestModel.d) && Intrinsics.d(this.e, pBTicketCreateOrderApiRequestModel.e) && Intrinsics.d(this.f, pBTicketCreateOrderApiRequestModel.f) && Intrinsics.d(this.g, pBTicketCreateOrderApiRequestModel.g) && Intrinsics.d(this.h, pBTicketCreateOrderApiRequestModel.h) && Intrinsics.d(this.i, pBTicketCreateOrderApiRequestModel.i);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6996a.hashCode() * 31, 31, this.b);
        long j2 = this.c;
        int iB = r30.b((this.d.hashCode() + ((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.e);
        List list = this.f;
        int iB2 = r30.b((iB + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBTicketCreateOrderApiRequestModel(tripId=", this.f6996a, ", configId=", this.b, ", amount=");
        sbE.append(this.c);
        sbE.append(", tripDetail=");
        sbE.append(this.d);
        sbE.append(", passengerDetails=");
        sbE.append(this.e);
        sbE.append(", appliedRules=");
        sbE.append(this.f);
        sbE.append(", seats=");
        sbE.append(this.g);
        sbE.append(", userAcquisitionChannel=");
        sbE.append(this.h);
        return z40.h(sbE, ", userCampaign=", this.i, ")");
    }

    public PBTicketCreateOrderApiRequestModel(String tripId, String configId, long j2, PBTicketSelectedTripDetailsApiRequestModel tripDetail, List passengerDetails, ArrayList arrayList, ArrayList arrayList2, String str, String str2) {
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(tripDetail, "tripDetail");
        Intrinsics.i(passengerDetails, "passengerDetails");
        this.f6996a = tripId;
        this.b = configId;
        this.c = j2;
        this.d = tripDetail;
        this.e = passengerDetails;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str;
        this.i = str2;
    }
}
