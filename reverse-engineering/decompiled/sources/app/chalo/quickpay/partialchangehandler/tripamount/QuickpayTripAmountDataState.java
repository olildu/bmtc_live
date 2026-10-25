package app.chalo.quickpay.partialchangehandler.tripamount;

import defpackage.n21;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountDataState;", "", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickpayTripAmountDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripAmountState f8872a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final QuickpayTripAmountScreenBottomSheetType g;
    public final long h;
    public final boolean i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountDataState$Companion;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public QuickpayTripAmountDataState(TripAmountState tripAmountState, String str, String str2, long j, boolean z, boolean z2, QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType, long j2, boolean z3, String str3) {
        Intrinsics.i(tripAmountState, "tripAmountState");
        this.f8872a = tripAmountState;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = quickpayTripAmountScreenBottomSheetType;
        this.h = j2;
        this.i = z3;
        this.j = str3;
    }

    public static QuickpayTripAmountDataState a(QuickpayTripAmountDataState quickpayTripAmountDataState, TripAmountState tripAmountState, String str, String str2, long j, boolean z, boolean z2, QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType, long j2, boolean z3, String str3, int i) {
        if ((i & 1) != 0) {
            tripAmountState = quickpayTripAmountDataState.f8872a;
        }
        TripAmountState tripAmountState2 = tripAmountState;
        if ((i & 2) != 0) {
            str = quickpayTripAmountDataState.b;
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? quickpayTripAmountDataState.c : str2;
        long j3 = (i & 8) != 0 ? quickpayTripAmountDataState.d : j;
        boolean z4 = (i & 16) != 0 ? quickpayTripAmountDataState.e : z;
        boolean z5 = (i & 32) != 0 ? quickpayTripAmountDataState.f : z2;
        QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType2 = (i & 64) != 0 ? quickpayTripAmountDataState.g : quickpayTripAmountScreenBottomSheetType;
        long j4 = (i & 128) != 0 ? quickpayTripAmountDataState.h : j2;
        boolean z6 = (i & 256) != 0 ? quickpayTripAmountDataState.i : z3;
        String str6 = (i & 512) != 0 ? quickpayTripAmountDataState.j : str3;
        quickpayTripAmountDataState.getClass();
        Intrinsics.i(tripAmountState2, "tripAmountState");
        return new QuickpayTripAmountDataState(tripAmountState2, str4, str5, j3, z4, z5, quickpayTripAmountScreenBottomSheetType2, j4, z6, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickpayTripAmountDataState)) {
            return false;
        }
        QuickpayTripAmountDataState quickpayTripAmountDataState = (QuickpayTripAmountDataState) obj;
        return this.f8872a == quickpayTripAmountDataState.f8872a && Intrinsics.d(this.b, quickpayTripAmountDataState.b) && Intrinsics.d(this.c, quickpayTripAmountDataState.c) && this.d == quickpayTripAmountDataState.d && this.e == quickpayTripAmountDataState.e && this.f == quickpayTripAmountDataState.f && Intrinsics.d(this.g, quickpayTripAmountDataState.g) && this.h == quickpayTripAmountDataState.h && this.i == quickpayTripAmountDataState.i && Intrinsics.d(this.j, quickpayTripAmountDataState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f8872a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        long j = this.d;
        int i = (((((iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType = this.g;
        int iHashCode4 = (i + (quickpayTripAmountScreenBottomSheetType != null ? quickpayTripAmountScreenBottomSheetType.hashCode() : 0)) * 31;
        long j2 = this.h;
        return this.j.hashCode() + ((((iHashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.i ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickpayTripAmountDataState(tripAmountState=");
        sb.append(this.f8872a);
        sb.append(", currentAmountString=");
        sb.append(this.b);
        sb.append(", disclaimerText=");
        n21.p(this.d, this.c, ", remainingCurrentBalance=", sb);
        sb.append(", showKeyboard=");
        sb.append(this.e);
        sb.append(", shouldShowLoading=");
        sb.append(this.f);
        sb.append(", bottomSheetType=");
        sb.append(this.g);
        sb.append(", maxQuickPayAmountAllowed=");
        sb.append(this.h);
        sb.append(", isWalletClosedLoopType=");
        sb.append(this.i);
        return z40.h(sb, ", appTncLink=", this.j, ")");
    }
}
