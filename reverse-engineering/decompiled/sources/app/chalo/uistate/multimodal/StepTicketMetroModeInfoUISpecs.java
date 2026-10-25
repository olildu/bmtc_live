package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketMetroModeInfoUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepTicketMetroModeInfoUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10055a;
    public final ChaloPadding b;
    public final UiAlignment.Vertical c;
    public final UiArrangement.HorizontalOrVertical d;
    public final UiArrangement.HorizontalOrVertical e;
    public final UiAlignment.Vertical f;

    public StepTicketMetroModeInfoUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().e, 0.0f, 11);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        UiArrangement.HorizontalOrVertical.SpacedBy spacedBy = new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloThemeHelper.a().d);
        UiArrangement.HorizontalOrVertical.SpacedBy spacedBy2 = new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloThemeHelper.a().c);
        this.f10055a = chaloPadding;
        this.b = chaloPadding2;
        UiAlignment.Vertical.Center center = UiAlignment.Vertical.Center.f9888a;
        this.c = center;
        this.d = spacedBy;
        this.e = spacedBy2;
        this.f = center;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepTicketMetroModeInfoUISpecs)) {
            return false;
        }
        StepTicketMetroModeInfoUISpecs stepTicketMetroModeInfoUISpecs = (StepTicketMetroModeInfoUISpecs) obj;
        return Intrinsics.d(this.f10055a, stepTicketMetroModeInfoUISpecs.f10055a) && Intrinsics.d(this.b, stepTicketMetroModeInfoUISpecs.b) && Intrinsics.d(this.c, stepTicketMetroModeInfoUISpecs.c) && Intrinsics.d(this.d, stepTicketMetroModeInfoUISpecs.d) && Intrinsics.d(this.e, stepTicketMetroModeInfoUISpecs.e) && Intrinsics.d(this.f, stepTicketMetroModeInfoUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + uf0.e(this.c, r30.c(this.b, this.f10055a.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("StepTicketMetroModeInfoUISpecs(modeIconPadding=", this.f10055a, ", stopsContentSectionPadding=", this.b, ", verticalAlignment=");
        sbM.append(this.c);
        sbM.append(", horizontalArrangement=");
        sbM.append(this.d);
        sbM.append(", verticalArrangement=");
        sbM.append(this.e);
        sbM.append(", itemVerticalAlignment=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
