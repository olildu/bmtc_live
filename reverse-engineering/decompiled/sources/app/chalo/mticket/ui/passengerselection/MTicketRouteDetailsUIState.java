package app.chalo.mticket.ui.passengerselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketRouteDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketRouteDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f5762a;
    public final ImageUIState b;
    public final ImageUIState c;
    public final TextWithSpecialFeaturesTagsUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final boolean g;
    public final MTicketRouteDetailsUISpec h;

    public MTicketRouteDetailsUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, boolean z) {
        ImageUIState imageUIState2 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        MTicketRouteDetailsUISpec mTicketRouteDetailsUISpec = new MTicketRouteDetailsUISpec();
        this.f5762a = chaloTextUIState;
        this.b = imageUIState2;
        this.c = imageUIState;
        this.d = textWithSpecialFeaturesTagsUIState;
        this.e = chaloTextUIState2;
        this.f = chaloTextUIState3;
        this.g = z;
        this.h = mTicketRouteDetailsUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketRouteDetailsUIState)) {
            return false;
        }
        MTicketRouteDetailsUIState mTicketRouteDetailsUIState = (MTicketRouteDetailsUIState) obj;
        return Intrinsics.d(this.f5762a, mTicketRouteDetailsUIState.f5762a) && Intrinsics.d(this.b, mTicketRouteDetailsUIState.b) && Intrinsics.d(this.c, mTicketRouteDetailsUIState.c) && Intrinsics.d(this.d, mTicketRouteDetailsUIState.d) && Intrinsics.d(this.e, mTicketRouteDetailsUIState.e) && Intrinsics.d(this.f, mTicketRouteDetailsUIState.f) && this.g == mTicketRouteDetailsUIState.g && Intrinsics.d(this.h, mTicketRouteDetailsUIState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((r30.f(this.f, r30.f(this.e, (this.d.hashCode() + r30.e(this.c, r30.e(this.b, this.f5762a.hashCode() * 31, 31), 31)) * 31, 31), 31) + (this.g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTicketRouteDetailsUIState(title=");
        sb.append(this.f5762a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", toggleIcon=");
        sb.append(this.c);
        sb.append(", route=");
        sb.append(this.d);
        sb.append(", fromStop=");
        r30.p(sb, this.e, ", toStop=", this.f, ", isExpanded=");
        sb.append(this.g);
        sb.append(", spec=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
