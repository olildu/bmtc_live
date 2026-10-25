package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/SlotDelayTextUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotDelayTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7897a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final ChaloPadding d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SlotDelayTextUIState(TextUIState.ChaloTextUIState chaloTextUIState, int i) {
        ChaloColorToken chaloColorToken = (i & 2) != 0 ? ChaloColorToken.White.f9870a : ChaloColorToken.GreyColor.f9806a;
        UIShape shape = ChaloThemeHelper.d.b;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().e, ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().e);
        Intrinsics.i(shape, "shape");
        this.f7897a = chaloTextUIState;
        this.b = chaloColorToken;
        this.c = shape;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDelayTextUIState)) {
            return false;
        }
        SlotDelayTextUIState slotDelayTextUIState = (SlotDelayTextUIState) obj;
        return Intrinsics.d(this.f7897a, slotDelayTextUIState.f7897a) && Intrinsics.d(this.b, slotDelayTextUIState.b) && Intrinsics.d(this.c, slotDelayTextUIState.c) && Intrinsics.d(this.d, slotDelayTextUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f7897a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SlotDelayTextUIState(delayText=" + this.f7897a + ", backgroundColorToken=" + this.b + ", shape=" + this.c + ", contentPadding=" + this.d + ")";
    }
}
