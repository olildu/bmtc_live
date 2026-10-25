package app.chalo.multimodalticket.ui.uistates;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/StepTicketSectionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepTicketSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5970a;
    public final UiAlignment.Vertical b;
    public final UiArrangement.HorizontalOrVertical c;
    public final ChaloPadding d;

    public StepTicketSectionUISpecs(ChaloPadding padding, int i) {
        padding = (i & 1) != 0 ? new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2) : padding;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        Intrinsics.i(padding, "padding");
        this.f5970a = padding;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepTicketSectionUISpecs)) {
            return false;
        }
        StepTicketSectionUISpecs stepTicketSectionUISpecs = (StepTicketSectionUISpecs) obj;
        return Intrinsics.d(this.f5970a, stepTicketSectionUISpecs.f5970a) && Intrinsics.d(this.b, stepTicketSectionUISpecs.b) && Intrinsics.d(this.c, stepTicketSectionUISpecs.c) && Intrinsics.d(this.d, stepTicketSectionUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + uf0.e(this.b, this.f5970a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "StepTicketSectionUISpecs(padding=" + this.f5970a + ", rowVerticalAlignment=" + this.b + ", rowHorizontalArrangement=" + this.c + ", stepNumberTextPadding=" + this.d + ")";
    }
}
