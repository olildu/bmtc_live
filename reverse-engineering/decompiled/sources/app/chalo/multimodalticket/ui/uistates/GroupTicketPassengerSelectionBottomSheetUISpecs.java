package app.chalo.multimodalticket.ui.uistates;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketPassengerSelectionBottomSheetUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerSelectionBottomSheetUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5964a;
    public final float b;
    public final UiAlignment.Vertical c;
    public final UiArrangement.HorizontalOrVertical d;

    public GroupTicketPassengerSelectionBottomSheetUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().c;
        this.f5964a = chaloPadding;
        this.b = f2;
        this.c = UiAlignment.Vertical.Top.f9889a;
        this.d = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerSelectionBottomSheetUISpecs)) {
            return false;
        }
        GroupTicketPassengerSelectionBottomSheetUISpecs groupTicketPassengerSelectionBottomSheetUISpecs = (GroupTicketPassengerSelectionBottomSheetUISpecs) obj;
        return Intrinsics.d(this.f5964a, groupTicketPassengerSelectionBottomSheetUISpecs.f5964a) && Dp.m7283equalsimpl0(this.b, groupTicketPassengerSelectionBottomSheetUISpecs.b) && Intrinsics.d(this.c, groupTicketPassengerSelectionBottomSheetUISpecs.c) && Intrinsics.d(this.d, groupTicketPassengerSelectionBottomSheetUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.e(this.c, uf0.a(this.b, this.f5964a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("GroupTicketPassengerSelectionBottomSheetUISpecs(contentPadding=", this.f5964a, ", titleAndSubTitleSpacing=", Dp.m7289toStringimpl(this.b), ", rowHeaderVerticalAlignment=");
        sbN.append(this.c);
        sbN.append(", rowHeaderHorizontalArrangement=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
