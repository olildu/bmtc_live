package app.chalo.instantticket.data.model.app.response;

import defpackage.d;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/response/PassengerDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3892a;
    public final String b;
    public final List c;
    public final String d;
    public final boolean e;
    public final Integer f;
    public final String g;
    public final long h;
    public final SeatLimitAppModel i;

    public PassengerDetailAppModel(long j, String str, List fareBreakup, String str2, boolean z, Integer num, String str3, long j2, SeatLimitAppModel seatLimitAppModel) {
        Intrinsics.i(fareBreakup, "fareBreakup");
        this.f3892a = j;
        this.b = str;
        this.c = fareBreakup;
        this.d = str2;
        this.e = z;
        this.f = num;
        this.g = str3;
        this.h = j2;
        this.i = seatLimitAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerDetailAppModel)) {
            return false;
        }
        PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) obj;
        return this.f3892a == passengerDetailAppModel.f3892a && Intrinsics.d(this.b, passengerDetailAppModel.b) && Intrinsics.d(this.c, passengerDetailAppModel.c) && Intrinsics.d(this.d, passengerDetailAppModel.d) && this.e == passengerDetailAppModel.e && Intrinsics.d(this.f, passengerDetailAppModel.f) && Intrinsics.d(this.g, passengerDetailAppModel.g) && this.h == passengerDetailAppModel.h && Intrinsics.d(this.i, passengerDetailAppModel.i);
    }

    public final int hashCode() {
        long j = this.f3892a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int iE = (nf1.e(r30.b((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31;
        Integer num = this.f;
        int iE2 = nf1.e((iE + (num != null ? num.hashCode() : 0)) * 31, 31, this.g);
        long j2 = this.h;
        return this.i.hashCode() + ((iE2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassengerDetailAppModel(actualFare=");
        sb.append(this.f3892a);
        sb.append(", discountCopy=");
        sb.append(this.b);
        sb.append(", fareBreakup=");
        sb.append(this.c);
        sb.append(", passengerId=");
        sb.append(this.d);
        sb.append(", isDiscountApplicable=");
        sb.append(this.e);
        sb.append(", discountPercentage=");
        sb.append(this.f);
        d.t(sb, ", name=", this.g, ", payableFare=");
        sb.append(this.h);
        sb.append(", seatLimit=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
