package app.chalo.locationdisclaimer;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerHeaderUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f5166a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;

    public LocationDisclaimerHeaderUIState(TextUIState title, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().f;
        Intrinsics.i(title, "title");
        this.f5166a = title;
        this.b = chaloTextUIState;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerHeaderUIState)) {
            return false;
        }
        LocationDisclaimerHeaderUIState locationDisclaimerHeaderUIState = (LocationDisclaimerHeaderUIState) obj;
        return Intrinsics.d(this.f5166a, locationDisclaimerHeaderUIState.f5166a) && Intrinsics.d(this.b, locationDisclaimerHeaderUIState.b) && Dp.m7283equalsimpl0(this.c, locationDisclaimerHeaderUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5166a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return Dp.m7284hashCodeimpl(this.c) + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("LocationDisclaimerHeaderUIState(title=");
        sb.append(this.f5166a);
        sb.append(", subTitle=");
        sb.append(this.b);
        sb.append(", spaceBtnLocationAccessTitleAndSubtitle=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
