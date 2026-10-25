package app.chalo.instantticket.data.model.api.request;

import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import defpackage.r30;
import defpackage.t10;
import defpackage.yn1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/ValidateInstantTicketFareRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ValidateInstantTicketFareRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3859a;
    public final long b;
    public final List c;
    public final InstantTicketTripDetails d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/ValidateInstantTicketFareRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/ValidateInstantTicketFareRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ValidateInstantTicketFareRequestApiModel> serializer() {
            return ValidateInstantTicketFareRequestApiModel$$serializer.f3860a;
        }
    }

    public /* synthetic */ ValidateInstantTicketFareRequestApiModel(int i, String str, long j, List list, InstantTicketTripDetails instantTicketTripDetails) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(ValidateInstantTicketFareRequestApiModel$$serializer.f3860a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3859a = str;
        this.b = j;
        this.c = list;
        this.d = instantTicketTripDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateInstantTicketFareRequestApiModel)) {
            return false;
        }
        ValidateInstantTicketFareRequestApiModel validateInstantTicketFareRequestApiModel = (ValidateInstantTicketFareRequestApiModel) obj;
        return Intrinsics.d(this.f3859a, validateInstantTicketFareRequestApiModel.f3859a) && this.b == validateInstantTicketFareRequestApiModel.b && Intrinsics.d(this.c, validateInstantTicketFareRequestApiModel.c) && Intrinsics.d(this.d, validateInstantTicketFareRequestApiModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3859a.hashCode() * 31;
        long j = this.b;
        return this.d.hashCode() + r30.b((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "ValidateInstantTicketFareRequestApiModel(city=", this.f3859a, ", finalFare=");
        sbM.append(", passengerDetails=");
        sbM.append(this.c);
        sbM.append(", tripDetail=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public ValidateInstantTicketFareRequestApiModel(String str, long j, ArrayList arrayList, InstantTicketTripDetails instantTicketTripDetails) {
        this.f3859a = str;
        this.b = j;
        this.c = arrayList;
        this.d = instantTicketTripDetails;
    }
}
