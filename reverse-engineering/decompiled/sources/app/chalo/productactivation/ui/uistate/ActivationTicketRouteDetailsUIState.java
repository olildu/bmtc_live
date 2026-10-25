package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketRouteDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationTicketRouteDetailsUISpecs f8064a;
    public final ActivationTicketRouteDetailsHeader b;
    public final ShapedContentUIState c;
    public final ShapedContentUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final StepBasedRouteDetailsSectionUIState g;
    public final TextUIState.ChaloTextUIState h;

    public ActivationTicketRouteDetailsUIState(ActivationTicketRouteDetailsUISpecs activationTicketRouteDetailsUISpecs, ActivationTicketRouteDetailsHeader activationTicketRouteDetailsHeader, ShapedContentUIState shapedContentUIState, ShapedContentUIState shapedContentUIState2, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState, TextUIState.ChaloTextUIState chaloTextUIState3) {
        Intrinsics.i(activationTicketRouteDetailsHeader, "activationTicketRouteDetailsHeader");
        this.f8064a = activationTicketRouteDetailsUISpecs;
        this.b = activationTicketRouteDetailsHeader;
        this.c = shapedContentUIState;
        this.d = shapedContentUIState2;
        this.e = chaloTextUIState;
        this.f = chaloTextUIState2;
        this.g = stepBasedRouteDetailsSectionUIState;
        this.h = chaloTextUIState3;
    }

    public static ActivationTicketRouteDetailsUIState a(ActivationTicketRouteDetailsUIState activationTicketRouteDetailsUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        ActivationTicketRouteDetailsUISpecs specs = activationTicketRouteDetailsUIState.f8064a;
        ActivationTicketRouteDetailsHeader activationTicketRouteDetailsHeader = activationTicketRouteDetailsUIState.b;
        ShapedContentUIState fromStopIndicator = activationTicketRouteDetailsUIState.c;
        ShapedContentUIState toStopIndicator = activationTicketRouteDetailsUIState.d;
        TextUIState.ChaloTextUIState chaloTextUIState2 = activationTicketRouteDetailsUIState.e;
        TextUIState.ChaloTextUIState chaloTextUIState3 = activationTicketRouteDetailsUIState.f;
        StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState = activationTicketRouteDetailsUIState.g;
        activationTicketRouteDetailsUIState.getClass();
        Intrinsics.i(specs, "specs");
        Intrinsics.i(activationTicketRouteDetailsHeader, "activationTicketRouteDetailsHeader");
        Intrinsics.i(fromStopIndicator, "fromStopIndicator");
        Intrinsics.i(toStopIndicator, "toStopIndicator");
        return new ActivationTicketRouteDetailsUIState(specs, activationTicketRouteDetailsHeader, fromStopIndicator, toStopIndicator, chaloTextUIState2, chaloTextUIState3, stepBasedRouteDetailsSectionUIState, chaloTextUIState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketRouteDetailsUIState)) {
            return false;
        }
        ActivationTicketRouteDetailsUIState activationTicketRouteDetailsUIState = (ActivationTicketRouteDetailsUIState) obj;
        return Intrinsics.d(this.f8064a, activationTicketRouteDetailsUIState.f8064a) && Intrinsics.d(this.b, activationTicketRouteDetailsUIState.b) && Intrinsics.d(this.c, activationTicketRouteDetailsUIState.c) && Intrinsics.d(this.d, activationTicketRouteDetailsUIState.d) && Intrinsics.d(this.e, activationTicketRouteDetailsUIState.e) && Intrinsics.d(this.f, activationTicketRouteDetailsUIState.f) && Intrinsics.d(this.g, activationTicketRouteDetailsUIState.g) && Intrinsics.d(this.h, activationTicketRouteDetailsUIState.h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8064a.hashCode() * 31)) * 31)) * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.f;
        int iHashCode3 = (iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState = this.g;
        int iHashCode4 = (iHashCode3 + (stepBasedRouteDetailsSectionUIState == null ? 0 : stepBasedRouteDetailsSectionUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState3 = this.h;
        return iHashCode4 + (chaloTextUIState3 != null ? chaloTextUIState3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationTicketRouteDetailsUIState(specs=");
        sb.append(this.f8064a);
        sb.append(", activationTicketRouteDetailsHeader=");
        sb.append(this.b);
        sb.append(", fromStopIndicator=");
        sb.append(this.c);
        sb.append(", toStopIndicator=");
        sb.append(this.d);
        sb.append(", fromStopName=");
        r30.p(sb, this.e, ", toStopName=", this.f, ", stepBasedRouteDetailsSectionUIState=");
        sb.append(this.g);
        sb.append(", categoryText=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public ActivationTicketRouteDetailsUIState(ActivationTicketRouteDetailsHeader activationTicketRouteDetailsHeader, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState, TextUIState.ChaloTextUIState chaloTextUIState3, int i) {
        ActivationTicketRouteDetailsUISpecs activationTicketRouteDetailsUISpecs = new ActivationTicketRouteDetailsUISpecs();
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().b;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        this(activationTicketRouteDetailsUISpecs, activationTicketRouteDetailsHeader, ShapedContentUIStateFactory.a(f, f2, transparent, shadyGray), ShapedContentUIStateFactory.a(ChaloThemeHelper.a().e, ChaloThemeHelper.a().b, shadyGray, shadyGray), chaloTextUIState, chaloTextUIState2, (i & 64) != 0 ? null : stepBasedRouteDetailsSectionUIState, chaloTextUIState3);
    }
}
