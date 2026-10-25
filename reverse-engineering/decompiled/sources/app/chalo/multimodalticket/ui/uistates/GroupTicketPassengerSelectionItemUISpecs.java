package app.chalo.multimodalticket.ui.uistates;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketPassengerSelectionItemUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerSelectionItemUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5966a;
    public final UIShape b;
    public final ChaloPadding c;
    public final float d;
    public final UiAlignment.Vertical e;
    public final UiArrangement.HorizontalOrVertical f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public GroupTicketPassengerSelectionItemUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle backgroundShape = UIShape.e;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        float f2 = ChaloThemeHelper.a().f;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f5966a = chaloPadding;
        this.b = backgroundShape;
        this.c = chaloPadding2;
        this.d = f2;
        this.e = UiAlignment.Vertical.Center.f9888a;
        this.f = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerSelectionItemUISpecs)) {
            return false;
        }
        GroupTicketPassengerSelectionItemUISpecs groupTicketPassengerSelectionItemUISpecs = (GroupTicketPassengerSelectionItemUISpecs) obj;
        return Intrinsics.d(this.f5966a, groupTicketPassengerSelectionItemUISpecs.f5966a) && Intrinsics.d(this.b, groupTicketPassengerSelectionItemUISpecs.b) && Intrinsics.d(this.c, groupTicketPassengerSelectionItemUISpecs.c) && Dp.m7283equalsimpl0(this.d, groupTicketPassengerSelectionItemUISpecs.d) && Intrinsics.d(this.e, groupTicketPassengerSelectionItemUISpecs.e) && Intrinsics.d(this.f, groupTicketPassengerSelectionItemUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.e(this.e, uf0.a(this.d, r30.c(this.c, pk0.b(this.b, this.f5966a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("GroupTicketPassengerSelectionItemUISpecs(contentPadding=");
        sb.append(this.f5966a);
        sb.append(", backgroundShape=");
        sb.append(this.b);
        sb.append(", fareTopPadding=");
        py.u(sb, this.c, ", fareAndInfoIconSpacing=", strM7289toStringimpl, ", rowVerticalAlignment=");
        sb.append(this.e);
        sb.append(", rowHorizontalArrangement=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
