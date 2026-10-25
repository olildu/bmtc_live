package app.chalo.premiumbus.ui.bulkbookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/SlotAndSeatInfoUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotAndSeatInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7505a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final List e;
    public final TextUIState.ChaloTextUIState f;
    public final float g;

    public SlotAndSeatInfoUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState timeHeader, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2, List slotDatePillsUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().g;
        Intrinsics.i(timeHeader, "timeHeader");
        Intrinsics.i(slotDatePillsUIState, "slotDatePillsUIState");
        this.f7505a = imageUIState;
        this.b = timeHeader;
        this.c = chaloTextUIState;
        this.d = imageUIState2;
        this.e = slotDatePillsUIState;
        this.f = chaloTextUIState2;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotAndSeatInfoUIState)) {
            return false;
        }
        SlotAndSeatInfoUIState slotAndSeatInfoUIState = (SlotAndSeatInfoUIState) obj;
        return Intrinsics.d(this.f7505a, slotAndSeatInfoUIState.f7505a) && Intrinsics.d(this.b, slotAndSeatInfoUIState.b) && Intrinsics.d(this.c, slotAndSeatInfoUIState.c) && Intrinsics.d(this.d, slotAndSeatInfoUIState.d) && Intrinsics.d(this.e, slotAndSeatInfoUIState.e) && Intrinsics.d(this.f, slotAndSeatInfoUIState.f) && Dp.m7283equalsimpl0(this.g, slotAndSeatInfoUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7505a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iB = r30.b(r30.e(this.d, (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31, this.e);
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.f;
        return Dp.m7284hashCodeimpl(this.g) + ((iB + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        StringBuilder sbN = pk0.n("SlotAndSeatInfoUIState(timeIconUIState=", this.f7505a, ", timeHeader=", this.b, ", seatUIState=");
        sbN.append(this.c);
        sbN.append(", seatIconUIState=");
        sbN.append(this.d);
        sbN.append(", slotDatePillsUIState=");
        sbN.append(this.e);
        sbN.append(", emptySlotsTextUIState=");
        sbN.append(this.f);
        sbN.append(", spaceBtwTimeAndSeatUIState=");
        return vo1.p(sbN, strM7289toStringimpl, ")");
    }
}
