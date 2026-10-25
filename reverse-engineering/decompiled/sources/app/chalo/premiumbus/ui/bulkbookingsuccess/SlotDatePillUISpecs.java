package app.chalo.premiumbus.ui.bulkbookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/SlotDatePillUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotDatePillUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7506a;
    public final float b;
    public final BorderUISpec c;

    public SlotDatePillUISpecs() {
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().f;
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.d);
        this.f7506a = chaloPadding;
        this.b = f3;
        this.c = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDatePillUISpecs)) {
            return false;
        }
        SlotDatePillUISpecs slotDatePillUISpecs = (SlotDatePillUISpecs) obj;
        return Intrinsics.d(this.f7506a, slotDatePillUISpecs.f7506a) && Dp.m7283equalsimpl0(this.b, slotDatePillUISpecs.b) && Intrinsics.d(this.c, slotDatePillUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f7506a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("SlotDatePillUISpecs(contentPadding=", this.f7506a, ", spaceBtwTitleAndCloseBtn=", Dp.m7289toStringimpl(this.b), ", borderUISpec=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
