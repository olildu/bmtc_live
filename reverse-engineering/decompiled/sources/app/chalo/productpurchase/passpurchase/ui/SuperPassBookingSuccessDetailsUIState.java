package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassBookingSuccessDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassBookingSuccessDetailsUISpec f8343a = new SuperPassBookingSuccessDetailsUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final ArrayList c;
    public final ButtonUIState d;
    public final ButtonUIState e;

    public SuperPassBookingSuccessDetailsUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList, ButtonUIState buttonUIState, ButtonUIState buttonUIState2) {
        this.b = chaloTextUIState;
        this.c = arrayList;
        this.d = buttonUIState;
        this.e = buttonUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessDetailsUIState)) {
            return false;
        }
        SuperPassBookingSuccessDetailsUIState superPassBookingSuccessDetailsUIState = (SuperPassBookingSuccessDetailsUIState) obj;
        return Intrinsics.d(this.f8343a, superPassBookingSuccessDetailsUIState.f8343a) && Intrinsics.d(this.b, superPassBookingSuccessDetailsUIState.b) && Intrinsics.d(this.c, superPassBookingSuccessDetailsUIState.c) && Intrinsics.d(this.d, superPassBookingSuccessDetailsUIState.d) && Intrinsics.d(this.e, superPassBookingSuccessDetailsUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.d(this.d, xs.e(this.c, r30.f(this.b, this.f8343a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassBookingSuccessDetailsUIState(specs=");
        sb.append(this.f8343a);
        sb.append(", nextStepTitle=");
        sb.append(this.b);
        sb.append(", nextSteps=");
        sb.append(this.c);
        sb.append(", positiveBtn=");
        sb.append(this.d);
        sb.append(", negativeBtn=");
        return hq0.j(sb, this.e, ")");
    }
}
