package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/ViewAllSlotsBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewAllSlotsBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewAllSlotsBottomSheetUISpec f7905a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final ButtonUIState d;
    public final ButtonUIState e;

    public ViewAllSlotsBottomSheetUIState(TextUIState.ChaloTextUIState title, List slotsUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
        ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec = new ViewAllSlotsBottomSheetUISpec();
        buttonUIState2 = (i & 16) != 0 ? null : buttonUIState2;
        Intrinsics.i(title, "title");
        Intrinsics.i(slotsUIState, "slotsUIState");
        this.f7905a = viewAllSlotsBottomSheetUISpec;
        this.b = title;
        this.c = slotsUIState;
        this.d = buttonUIState;
        this.e = buttonUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAllSlotsBottomSheetUIState)) {
            return false;
        }
        ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState = (ViewAllSlotsBottomSheetUIState) obj;
        return Intrinsics.d(this.f7905a, viewAllSlotsBottomSheetUIState.f7905a) && Intrinsics.d(this.b, viewAllSlotsBottomSheetUIState.b) && Intrinsics.d(this.c, viewAllSlotsBottomSheetUIState.c) && Intrinsics.d(this.d, viewAllSlotsBottomSheetUIState.d) && Intrinsics.d(this.e, viewAllSlotsBottomSheetUIState.e);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.b, this.f7905a.hashCode() * 31, 31), 31, this.c);
        ButtonUIState buttonUIState = this.d;
        int iHashCode = (iB + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.e;
        return iHashCode + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewAllSlotsBottomSheetUIState(spec=");
        sb.append(this.f7905a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", slotsUIState=");
        sb.append(this.c);
        sb.append(", bookThisRideBtnUIState=");
        sb.append(this.d);
        sb.append(", bookForMultipleRideBtnUIState=");
        return hq0.j(sb, this.e, ")");
    }
}
