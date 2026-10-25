package app.chalo.premiumbus.ui.bulkbookingsuccess;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBulkBookingConfirmationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7495a;
    public final String b;
    public final List c;
    public final List d;
    public final Map e;
    public final Long f;
    public final PassInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final boolean n;
    public final boolean o;

    public PremiumBusBulkBookingConfirmationDataState(boolean z, String str, List list, List list2, Map map, Long l, PassInfo passInfo, String str2, String str3, String str4, String str5, String str6, List list3, boolean z2, boolean z3) {
        this.f7495a = z;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = map;
        this.f = l;
        this.g = passInfo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = list3;
        this.n = z2;
        this.o = z3;
    }

    public static PremiumBusBulkBookingConfirmationDataState a(PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState, boolean z, String str, List list, List list2, Map map, Long l, PassInfo passInfo, String str2, String str3, String str4, String str5, String str6, List list3, boolean z2, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? premiumBusBulkBookingConfirmationDataState.f7495a : z;
        String passId = (i & 2) != 0 ? premiumBusBulkBookingConfirmationDataState.b : str;
        List list4 = (i & 4) != 0 ? premiumBusBulkBookingConfirmationDataState.c : list;
        List list5 = (i & 8) != 0 ? premiumBusBulkBookingConfirmationDataState.d : list2;
        Map map2 = (i & 16) != 0 ? premiumBusBulkBookingConfirmationDataState.e : map;
        Long l2 = (i & 32) != 0 ? premiumBusBulkBookingConfirmationDataState.f : l;
        PassInfo passInfo2 = (i & 64) != 0 ? premiumBusBulkBookingConfirmationDataState.g : passInfo;
        String btnText = (i & 128) != 0 ? premiumBusBulkBookingConfirmationDataState.h : str2;
        String str7 = (i & 256) != 0 ? premiumBusBulkBookingConfirmationDataState.i : str3;
        String str8 = (i & 512) != 0 ? premiumBusBulkBookingConfirmationDataState.j : str4;
        String str9 = (i & 1024) != 0 ? premiumBusBulkBookingConfirmationDataState.k : str5;
        String str10 = (i & 2048) != 0 ? premiumBusBulkBookingConfirmationDataState.l : str6;
        List list6 = (i & 4096) != 0 ? premiumBusBulkBookingConfirmationDataState.m : list3;
        boolean z5 = (i & 8192) != 0 ? premiumBusBulkBookingConfirmationDataState.n : z2;
        boolean z6 = (i & 16384) != 0 ? premiumBusBulkBookingConfirmationDataState.o : z3;
        premiumBusBulkBookingConfirmationDataState.getClass();
        Intrinsics.i(passId, "passId");
        Intrinsics.i(btnText, "btnText");
        return new PremiumBusBulkBookingConfirmationDataState(z4, passId, list4, list5, map2, l2, passInfo2, btnText, str7, str8, str9, str10, list6, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBulkBookingConfirmationDataState)) {
            return false;
        }
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState = (PremiumBusBulkBookingConfirmationDataState) obj;
        return this.f7495a == premiumBusBulkBookingConfirmationDataState.f7495a && Intrinsics.d(this.b, premiumBusBulkBookingConfirmationDataState.b) && Intrinsics.d(this.c, premiumBusBulkBookingConfirmationDataState.c) && Intrinsics.d(this.d, premiumBusBulkBookingConfirmationDataState.d) && Intrinsics.d(this.e, premiumBusBulkBookingConfirmationDataState.e) && Intrinsics.d(this.f, premiumBusBulkBookingConfirmationDataState.f) && Intrinsics.d(this.g, premiumBusBulkBookingConfirmationDataState.g) && Intrinsics.d(this.h, premiumBusBulkBookingConfirmationDataState.h) && Intrinsics.d(this.i, premiumBusBulkBookingConfirmationDataState.i) && Intrinsics.d(this.j, premiumBusBulkBookingConfirmationDataState.j) && Intrinsics.d(this.k, premiumBusBulkBookingConfirmationDataState.k) && Intrinsics.d(this.l, premiumBusBulkBookingConfirmationDataState.l) && Intrinsics.d(this.m, premiumBusBulkBookingConfirmationDataState.m) && this.n == premiumBusBulkBookingConfirmationDataState.n && this.o == premiumBusBulkBookingConfirmationDataState.o;
    }

    public final int hashCode() {
        int iE = nf1.e((this.f7495a ? 1231 : 1237) * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.e;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.f;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        PassInfo passInfo = this.g;
        int iE2 = nf1.e((iHashCode4 + (passInfo == null ? 0 : passInfo.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int iHashCode5 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list3 = this.m;
        return ((((iHashCode8 + (list3 != null ? list3.hashCode() : 0)) * 31) + (this.n ? 1231 : 1237)) * 31) + (this.o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusBulkBookingConfirmationDataState(isLoading=");
        sb.append(this.f7495a);
        sb.append(", passId=");
        sb.append(this.b);
        sb.append(", selectedSeats=");
        dd.o(sb, this.c, ", selectedSlots=", this.d, ", tripDataAndSlotsMap=");
        sb.append(this.e);
        sb.append(", lastSelectedTimeSinceMidnight=");
        sb.append(this.f);
        sb.append(", passInfo=");
        sb.append(this.g);
        sb.append(", btnText=");
        sb.append(this.h);
        sb.append(", fromStopId=");
        cb0.t(sb, this.i, ", toStopId=", this.j, ", fromStopName=");
        cb0.t(sb, this.k, ", toStopName=", this.l, ", termsAndConditions=");
        sb.append(this.m);
        sb.append(", showTncBottomSheet=");
        sb.append(this.n);
        sb.append(", autoAssignForWomenReservation=");
        return b3.g(")", sb, this.o);
    }
}
