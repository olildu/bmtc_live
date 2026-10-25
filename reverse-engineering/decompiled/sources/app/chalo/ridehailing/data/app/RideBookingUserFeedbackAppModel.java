package app.chalo.ridehailing.data.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideBookingUserFeedbackAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideBookingUserFeedbackAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9106a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final List f;

    public RideBookingUserFeedbackAppModel(int i, String bookingId, String city, String str, String str2, List subtags) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(city, "city");
        Intrinsics.i(subtags, "subtags");
        this.f9106a = bookingId;
        this.b = city;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = subtags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideBookingUserFeedbackAppModel)) {
            return false;
        }
        RideBookingUserFeedbackAppModel rideBookingUserFeedbackAppModel = (RideBookingUserFeedbackAppModel) obj;
        return Intrinsics.d(this.f9106a, rideBookingUserFeedbackAppModel.f9106a) && Intrinsics.d(this.b, rideBookingUserFeedbackAppModel.b) && this.c == rideBookingUserFeedbackAppModel.c && Intrinsics.d(this.d, rideBookingUserFeedbackAppModel.d) && Intrinsics.d(this.e, rideBookingUserFeedbackAppModel.e) && Intrinsics.d(this.f, rideBookingUserFeedbackAppModel.f);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f9106a.hashCode() * 31, 31, this.b) + this.c) * 31;
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideBookingUserFeedbackAppModel(bookingId=", this.f9106a, ", city=", this.b, ", rating=");
        pk0.t(this.c, ", selectedReason=", this.d, ", comments=", sbE);
        return uf0.p(this.e, ", subtags=", ")", sbE, this.f);
    }

    public RideBookingUserFeedbackAppModel(int i, String str, String str2, String str3, String str4) {
        this(i, str, str2, str3, str4, EmptyList.f17557a);
    }
}
