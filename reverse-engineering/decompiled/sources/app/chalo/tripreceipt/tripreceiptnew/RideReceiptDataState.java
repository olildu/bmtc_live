package app.chalo.tripreceipt.tripreceiptnew;

import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideReceiptDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9740a;
    public final String b;
    public final List c;

    public RideReceiptDataState(String str, List ticketList, boolean z) {
        Intrinsics.i(ticketList, "ticketList");
        this.f9740a = z;
        this.b = str;
        this.c = ticketList;
    }

    public static RideReceiptDataState a(RideReceiptDataState rideReceiptDataState, boolean z, String passId, ArrayList arrayList, int i) {
        if ((i & 2) != 0) {
            passId = rideReceiptDataState.b;
        }
        List ticketList = arrayList;
        if ((i & 4) != 0) {
            ticketList = rideReceiptDataState.c;
        }
        rideReceiptDataState.getClass();
        Intrinsics.i(passId, "passId");
        Intrinsics.i(ticketList, "ticketList");
        return new RideReceiptDataState(passId, ticketList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideReceiptDataState)) {
            return false;
        }
        RideReceiptDataState rideReceiptDataState = (RideReceiptDataState) obj;
        return this.f9740a == rideReceiptDataState.f9740a && this.b.equals(rideReceiptDataState.b) && Intrinsics.d(this.c, rideReceiptDataState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e((this.f9740a ? 1231 : 1237) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideReceiptDataState(isLoading=");
        sb.append(this.f9740a);
        sb.append(", passId=");
        sb.append(this.b);
        sb.append(", ticketList=");
        return xs.l(sb, this.c, ")");
    }
}
