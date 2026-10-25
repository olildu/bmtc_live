package app.chalo.metro.ui.confirmbooking.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingDetailsScreenUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmBookingDetailsScreenUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5474a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public ConfirmBookingDetailsScreenUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, 0.0f, 3);
        this.f5474a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBookingDetailsScreenUiSpec)) {
            return false;
        }
        ConfirmBookingDetailsScreenUiSpec confirmBookingDetailsScreenUiSpec = (ConfirmBookingDetailsScreenUiSpec) obj;
        return Intrinsics.d(this.f5474a, confirmBookingDetailsScreenUiSpec.f5474a) && Intrinsics.d(this.b, confirmBookingDetailsScreenUiSpec.b) && Intrinsics.d(this.c, confirmBookingDetailsScreenUiSpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f5474a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.e(pk0.m("ConfirmBookingDetailsScreenUiSpec(contentPadding=", this.f5474a, ", proceedButtonPadding=", this.b, ", snackBarContainerPadding="), this.c, ")");
    }
}
