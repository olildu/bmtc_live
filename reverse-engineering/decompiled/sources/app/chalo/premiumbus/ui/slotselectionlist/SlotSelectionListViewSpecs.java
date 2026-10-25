package app.chalo.premiumbus.ui.slotselectionlist;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotSelectionListViewSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7927a;
    public final float b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloColorToken e;

    public SlotSelectionListViewSpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f3, f3, f3);
        this.f7927a = f;
        this.b = f2;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotSelectionListViewSpecs)) {
            return false;
        }
        SlotSelectionListViewSpecs slotSelectionListViewSpecs = (SlotSelectionListViewSpecs) obj;
        return Dp.m7283equalsimpl0(this.f7927a, slotSelectionListViewSpecs.f7927a) && Dp.m7283equalsimpl0(this.b, slotSelectionListViewSpecs.b) && Intrinsics.d(this.c, slotSelectionListViewSpecs.c) && Intrinsics.d(this.d, slotSelectionListViewSpecs.d) && Intrinsics.d(this.e, slotSelectionListViewSpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, r30.c(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7927a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SlotSelectionListViewSpecs(topSpacerHeight=", Dp.m7289toStringimpl(this.f7927a), ", spaceBtwCards=", Dp.m7289toStringimpl(this.b), ", contentPadding=");
        r30.o(sbE, this.c, ", buttonContentPadding=", this.d, ", buttonBackgroundColor=");
        return pk0.j(sbE, this.e, ")");
    }
}
