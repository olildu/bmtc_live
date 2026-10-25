package app.chalo.kyc.min.ui.minkycdetails;

import defpackage.b3;
import defpackage.hq0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsDataState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycDetailsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4119a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public MinKycDetailsDataState(String fullName, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(fullName, "fullName");
        this.f4119a = fullName;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static MinKycDetailsDataState a(MinKycDetailsDataState minKycDetailsDataState, String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = minKycDetailsDataState.f4119a;
        }
        String fullName = str;
        if ((i & 2) != 0) {
            z = minKycDetailsDataState.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = minKycDetailsDataState.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = minKycDetailsDataState.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = minKycDetailsDataState.e;
        }
        minKycDetailsDataState.getClass();
        Intrinsics.i(fullName, "fullName");
        return new MinKycDetailsDataState(fullName, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycDetailsDataState)) {
            return false;
        }
        MinKycDetailsDataState minKycDetailsDataState = (MinKycDetailsDataState) obj;
        return Intrinsics.d(this.f4119a, minKycDetailsDataState.f4119a) && this.b == minKycDetailsDataState.b && this.c == minKycDetailsDataState.c && this.d == minKycDetailsDataState.d && this.e == minKycDetailsDataState.e;
    }

    public final int hashCode() {
        return (((((((this.f4119a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("MinKycDetailsDataState(fullName=", this.f4119a, ", isProceedBtnEnabled=", ", isLoading=", this.b);
        z40.r(sbM, this.c, ", isTextFieldFocused=", this.d, ", shouldShowEmptyStateTitle=");
        return b3.g(")", sbM, this.e);
    }

    public /* synthetic */ MinKycDetailsDataState(String str, int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false, true, (i & 16) != 0 ? false : z2);
    }
}
