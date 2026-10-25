package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerLayoutUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerLayoutUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f5739a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public MTicketPassengerLayoutUISpec(ChaloPadding chaloPadding) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f, f, f, f);
        this.f5739a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding2;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerLayoutUISpec)) {
            return false;
        }
        MTicketPassengerLayoutUISpec mTicketPassengerLayoutUISpec = (MTicketPassengerLayoutUISpec) obj;
        return Intrinsics.d(this.f5739a, mTicketPassengerLayoutUISpec.f5739a) && Intrinsics.d(this.b, mTicketPassengerLayoutUISpec.b) && Intrinsics.d(this.c, mTicketPassengerLayoutUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f5739a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.e(py.i(this.b, this.f5739a, "MTicketPassengerLayoutUISpec(background=", ", paddingAroundTitle=", ", paddingAroundFareBreakup="), this.c, ")");
    }
}
