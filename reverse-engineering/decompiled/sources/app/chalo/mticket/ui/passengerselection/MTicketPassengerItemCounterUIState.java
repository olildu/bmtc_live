package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItemCounterUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerItemCounterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f5736a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public MTicketPassengerItemCounterUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2) {
        float f = ChaloThemeHelper.a().f1916a;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 2);
        this.f5736a = imageUIState;
        this.b = chaloTextUIState;
        this.c = imageUIState2;
        this.d = chaloPadding;
        this.e = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerItemCounterUIState)) {
            return false;
        }
        MTicketPassengerItemCounterUIState mTicketPassengerItemCounterUIState = (MTicketPassengerItemCounterUIState) obj;
        return Intrinsics.d(this.f5736a, mTicketPassengerItemCounterUIState.f5736a) && Intrinsics.d(this.b, mTicketPassengerItemCounterUIState.b) && Intrinsics.d(this.c, mTicketPassengerItemCounterUIState.c) && Intrinsics.d(this.d, mTicketPassengerItemCounterUIState.d) && Intrinsics.d(this.e, mTicketPassengerItemCounterUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, r30.e(this.c, r30.f(this.b, this.f5736a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("MTicketPassengerItemCounterUIState(minus=", this.f5736a, ", counter=", this.b, ", plus=");
        sbN.append(this.c);
        sbN.append(", paddingAroundBtns=");
        sbN.append(this.d);
        sbN.append(", paddingAroundCounter=");
        return py.e(sbN, this.e, ")");
    }
}
