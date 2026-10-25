package app.chalo.premiumbus.ui.slotselection;

import defpackage.b3;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/SelectedPassInfo;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectedPassInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7896a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;

    public SelectedPassInfo(String passId, long j, long j2, int i, int i2, int i3, String passSubType, boolean z) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(passSubType, "passSubType");
        this.f7896a = passId;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = passSubType;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedPassInfo)) {
            return false;
        }
        SelectedPassInfo selectedPassInfo = (SelectedPassInfo) obj;
        return Intrinsics.d(this.f7896a, selectedPassInfo.f7896a) && this.b == selectedPassInfo.b && this.c == selectedPassInfo.c && this.d == selectedPassInfo.d && this.e == selectedPassInfo.e && this.f == selectedPassInfo.f && Intrinsics.d(this.g, selectedPassInfo.g) && this.h == selectedPassInfo.h;
    }

    public final int hashCode() {
        int iHashCode = this.f7896a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return nf1.e((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31, 31, this.g) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "SelectedPassInfo(passId=", this.f7896a, ", passStartTime=");
        xs.r(this.c, ", expiryTime=", ", remainingTrips=", sbM);
        hq0.p(this.d, this.e, ", totalTrips=", ", allowedNumberOfDaysForBulkBooking=", sbM);
        pk0.t(this.f, ", passSubType=", this.g, ", markPassRidesAsUnlimited=", sbM);
        return b3.g(")", sbM, this.h);
    }
}
