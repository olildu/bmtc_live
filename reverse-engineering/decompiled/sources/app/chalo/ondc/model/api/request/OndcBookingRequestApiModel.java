package app.chalo.ondc.model.api.request;

import defpackage.dd;
import defpackage.jk0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcBookingRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcBookingRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(29)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6738a;
    public final String b;
    public final List c;
    public final OndcTicketTripDetails d;
    public final OndcCustomerInfoApiModel e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcBookingRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/request/OndcBookingRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcBookingRequestApiModel> serializer() {
            return OndcBookingRequestApiModel$$serializer.f6739a;
        }
    }

    public /* synthetic */ OndcBookingRequestApiModel(int i, String str, String str2, List list, OndcTicketTripDetails ondcTicketTripDetails, OndcCustomerInfoApiModel ondcCustomerInfoApiModel, String str3, String str4) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(OndcBookingRequestApiModel$$serializer.f6739a.getDescriptor(), i, 127);
            throw null;
        }
        this.f6738a = str;
        this.b = str2;
        this.c = list;
        this.d = ondcTicketTripDetails;
        this.e = ondcCustomerInfoApiModel;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcBookingRequestApiModel)) {
            return false;
        }
        OndcBookingRequestApiModel ondcBookingRequestApiModel = (OndcBookingRequestApiModel) obj;
        return Intrinsics.d(this.f6738a, ondcBookingRequestApiModel.f6738a) && Intrinsics.d(this.b, ondcBookingRequestApiModel.b) && Intrinsics.d(this.c, ondcBookingRequestApiModel.c) && Intrinsics.d(this.d, ondcBookingRequestApiModel.d) && Intrinsics.d(this.e, ondcBookingRequestApiModel.e) && Intrinsics.d(this.f, ondcBookingRequestApiModel.f) && Intrinsics.d(this.g, ondcBookingRequestApiModel.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + nf1.e((this.e.hashCode() + ((this.d.hashCode() + r30.b(nf1.e(this.f6738a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcBookingRequestApiModel(configurationId=", this.f6738a, ", city=", this.b, ", passengerDetails=");
        sbE.append(this.c);
        sbE.append(", tripDetail=");
        sbE.append(this.d);
        sbE.append(", customerInfo=");
        sbE.append(this.e);
        sbE.append(", providerId=");
        sbE.append(this.f);
        sbE.append(", transactionId=");
        return vo1.p(sbE, this.g, ")");
    }

    public OndcBookingRequestApiModel(String configurationId, String city, ArrayList arrayList, OndcTicketTripDetails tripDetail, OndcCustomerInfoApiModel ondcCustomerInfoApiModel, String providerId, String transactionId) {
        Intrinsics.i(configurationId, "configurationId");
        Intrinsics.i(city, "city");
        Intrinsics.i(tripDetail, "tripDetail");
        Intrinsics.i(providerId, "providerId");
        Intrinsics.i(transactionId, "transactionId");
        this.f6738a = configurationId;
        this.b = city;
        this.c = arrayList;
        this.d = tripDetail;
        this.e = ondcCustomerInfoApiModel;
        this.f = providerId;
        this.g = transactionId;
    }
}
