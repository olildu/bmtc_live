package app.chalo.uistate.bottomsheet;

import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetEventHandler;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9901a;
    public final UIModalBottomSheetValue b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final BottomSheetRequestHandler g;

    public BottomSheetEventHandler(boolean z, boolean z2, BottomSheetRequestHandler$Companion$fromLambda$2 bottomSheetRequestHandler$Companion$fromLambda$2, int i) {
        UIModalBottomSheetValue initialValue = UIModalBottomSheetValue.Hidden;
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 8) != 0 ? true : z2;
        boolean z3 = (i & 16) != 0;
        BottomSheetRequestHandler bottomSheetRequestHandler = (i & 64) != 0 ? BottomSheetRequestHandler.Companion.f9902a : bottomSheetRequestHandler$Companion$fromLambda$2;
        Intrinsics.i(initialValue, "initialValue");
        this.f9901a = true;
        this.b = initialValue;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = true;
        this.g = bottomSheetRequestHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetEventHandler)) {
            return false;
        }
        BottomSheetEventHandler bottomSheetEventHandler = (BottomSheetEventHandler) obj;
        return this.f9901a == bottomSheetEventHandler.f9901a && this.b == bottomSheetEventHandler.b && this.c == bottomSheetEventHandler.c && this.d == bottomSheetEventHandler.d && this.e == bottomSheetEventHandler.e && this.f == bottomSheetEventHandler.f && Intrinsics.d(this.g, bottomSheetEventHandler.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((((((((((this.b.hashCode() + ((this.f9901a ? 1231 : 1237) * 31)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetEventHandler(isFocusable=");
        sb.append(this.f9901a);
        sb.append(", initialValue=");
        sb.append(this.b);
        sb.append(", shouldDismissOnBackPress=");
        z40.r(sb, this.c, ", shouldDismissOnOutsideClick=", this.d, ", areSheetGesturesEnabled=");
        z40.r(sb, this.e, ", skipPartiallyExpanded=", this.f, ", requestHandler=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
