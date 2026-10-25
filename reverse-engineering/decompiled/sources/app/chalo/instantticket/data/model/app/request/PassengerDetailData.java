package app.chalo.instantticket.data.model.app.request;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/request/PassengerDetailData;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerDetailData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3888a;
    public final String b;
    public final String c;

    public PassengerDetailData(int i, String passengerId, String str) {
        Intrinsics.i(passengerId, "passengerId");
        this.f3888a = i;
        this.b = passengerId;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerDetailData)) {
            return false;
        }
        PassengerDetailData passengerDetailData = (PassengerDetailData) obj;
        return this.f3888a == passengerDetailData.f3888a && Intrinsics.d(this.b, passengerDetailData.b) && Intrinsics.d(this.c, passengerDetailData.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f3888a * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(nf1.p(this.f3888a, "PassengerDetailData(passengerCount=", ", passengerId=", this.b, ", name="), this.c, ")");
    }
}
