package app.chalo.checkout.ui.screen.checkout.customurl;

import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomUrlCheckoutDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1455a;
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public CustomUrlCheckoutDataState(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1455a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = z3;
        this.f = z4;
    }

    public static CustomUrlCheckoutDataState a(CustomUrlCheckoutDataState customUrlCheckoutDataState, boolean z, String str, int i, boolean z2, int i2) {
        boolean z3 = (i2 & 1) != 0 ? customUrlCheckoutDataState.f1455a : true;
        if ((i2 & 2) != 0) {
            z = customUrlCheckoutDataState.b;
        }
        boolean z4 = z;
        customUrlCheckoutDataState.getClass();
        if ((i2 & 8) != 0) {
            str = customUrlCheckoutDataState.c;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            i = customUrlCheckoutDataState.d;
        }
        int i3 = i;
        boolean z5 = (i2 & 32) != 0 ? customUrlCheckoutDataState.e : true;
        if ((i2 & 64) != 0) {
            z2 = customUrlCheckoutDataState.f;
        }
        customUrlCheckoutDataState.getClass();
        return new CustomUrlCheckoutDataState(i3, str2, z3, z4, z5, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUrlCheckoutDataState)) {
            return false;
        }
        CustomUrlCheckoutDataState customUrlCheckoutDataState = (CustomUrlCheckoutDataState) obj;
        return this.f1455a == customUrlCheckoutDataState.f1455a && this.b == customUrlCheckoutDataState.b && Intrinsics.d(this.c, customUrlCheckoutDataState.c) && this.d == customUrlCheckoutDataState.d && this.e == customUrlCheckoutDataState.e && this.f == customUrlCheckoutDataState.f;
    }

    public final int hashCode() {
        int i = (((((this.f1455a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + 1237) * 31;
        String str = this.c;
        return ((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("CustomUrlCheckoutDataState(showToolbar=", ", showLoadingDialog=", ", showWebView=false, url=", this.f1455a, this.b);
        cb0.o(this.d, this.c, ", progressPercent=", ", isWebViewLoaded=", sbR);
        return n21.h(sbR, this.e, ", showCancelConfirmationDialog=", this.f, ")");
    }
}
