package app.chalo.instantticket.data.model.api.request;

import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import defpackage.ea0;
import defpackage.t10;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ea0(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3853a;
    public final long b;
    public final InstantTicketTripDetails c;
    public final List d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketOrderRequestApiModel> serializer() {
            return InstantTicketOrderRequestApiModel$$serializer.f3854a;
        }
    }

    public /* synthetic */ InstantTicketOrderRequestApiModel(int i, String str, long j, InstantTicketTripDetails instantTicketTripDetails, List list, String str2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(InstantTicketOrderRequestApiModel$$serializer.f3854a.getDescriptor(), i, 31);
            throw null;
        }
        this.f3853a = str;
        this.b = j;
        this.c = instantTicketTripDetails;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketOrderRequestApiModel)) {
            return false;
        }
        InstantTicketOrderRequestApiModel instantTicketOrderRequestApiModel = (InstantTicketOrderRequestApiModel) obj;
        return Intrinsics.d(this.f3853a, instantTicketOrderRequestApiModel.f3853a) && this.b == instantTicketOrderRequestApiModel.b && Intrinsics.d(this.c, instantTicketOrderRequestApiModel.c) && Intrinsics.d(this.d, instantTicketOrderRequestApiModel.d) && Intrinsics.d(this.e, instantTicketOrderRequestApiModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3853a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        InstantTicketTripDetails instantTicketTripDetails = this.c;
        int iHashCode2 = (i + (instantTicketTripDetails == null ? 0 : instantTicketTripDetails.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "InstantTicketOrderRequestApiModel(configId=", this.f3853a, ", amount=");
        sbM.append(", tripDetail=");
        sbM.append(this.c);
        sbM.append(", passengerDetails=");
        sbM.append(this.d);
        return z40.h(sbM, ", city=", this.e, ")");
    }

    public InstantTicketOrderRequestApiModel(String configId, long j, InstantTicketTripDetails instantTicketTripDetails, ArrayList arrayList, String str) {
        Intrinsics.i(configId, "configId");
        this.f3853a = configId;
        this.b = j;
        this.c = instantTicketTripDetails;
        this.d = arrayList;
        this.e = str;
    }
}
