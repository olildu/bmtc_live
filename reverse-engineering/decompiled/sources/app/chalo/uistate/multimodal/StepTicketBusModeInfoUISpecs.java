package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketBusModeInfoUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepTicketBusModeInfoUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10054a;
    public final ChaloPadding b;
    public final UiAlignment.Vertical c;

    public StepTicketBusModeInfoUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().e, 0.0f, 11);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        this.f10054a = chaloPadding;
        this.b = chaloPadding2;
        this.c = UiAlignment.Vertical.Center.f9888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepTicketBusModeInfoUISpecs)) {
            return false;
        }
        StepTicketBusModeInfoUISpecs stepTicketBusModeInfoUISpecs = (StepTicketBusModeInfoUISpecs) obj;
        return Intrinsics.d(this.f10054a, stepTicketBusModeInfoUISpecs.f10054a) && Intrinsics.d(this.b, stepTicketBusModeInfoUISpecs.b) && Intrinsics.d(this.c, stepTicketBusModeInfoUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f10054a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("StepTicketBusModeInfoUISpecs(modeIconPadding=", this.f10054a, ", stopsContentSectionPadding=", this.b, ", verticalAlignment=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
