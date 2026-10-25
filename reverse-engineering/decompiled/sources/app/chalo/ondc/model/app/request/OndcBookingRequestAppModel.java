package app.chalo.ondc.model.app.request;

import app.chalo.ondc.model.api.request.OndcTicketTripDetails;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/request/OndcBookingRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcBookingRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6777a;
    public final String b;
    public final List c;
    public final OndcTicketTripDetails d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public OndcBookingRequestAppModel(String configId, String cityName, List passengerDetails, OndcTicketTripDetails tripDetails, String userName, String mobileNumber, String str, String providerId, String transactionId) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(tripDetails, "tripDetails");
        Intrinsics.i(userName, "userName");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(providerId, "providerId");
        Intrinsics.i(transactionId, "transactionId");
        this.f6777a = configId;
        this.b = cityName;
        this.c = passengerDetails;
        this.d = tripDetails;
        this.e = userName;
        this.f = mobileNumber;
        this.g = str;
        this.h = providerId;
        this.i = transactionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcBookingRequestAppModel)) {
            return false;
        }
        OndcBookingRequestAppModel ondcBookingRequestAppModel = (OndcBookingRequestAppModel) obj;
        return Intrinsics.d(this.f6777a, ondcBookingRequestAppModel.f6777a) && Intrinsics.d(this.b, ondcBookingRequestAppModel.b) && Intrinsics.d(this.c, ondcBookingRequestAppModel.c) && Intrinsics.d(this.d, ondcBookingRequestAppModel.d) && Intrinsics.d(this.e, ondcBookingRequestAppModel.e) && Intrinsics.d(this.f, ondcBookingRequestAppModel.f) && Intrinsics.d(this.g, ondcBookingRequestAppModel.g) && Intrinsics.d(this.h, ondcBookingRequestAppModel.h) && Intrinsics.d(this.i, ondcBookingRequestAppModel.i);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((this.d.hashCode() + r30.b(nf1.e(this.f6777a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return this.i.hashCode() + nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcBookingRequestAppModel(configId=", this.f6777a, ", cityName=", this.b, ", passengerDetails=");
        sbE.append(this.c);
        sbE.append(", tripDetails=");
        sbE.append(this.d);
        sbE.append(", userName=");
        cb0.t(sbE, this.e, ", mobileNumber=", this.f, ", email=");
        cb0.t(sbE, this.g, ", providerId=", this.h, ", transactionId=");
        return vo1.p(sbE, this.i, ")");
    }
}
