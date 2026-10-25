package app.chalo.home.ui.history.uistate.pass;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/pass/BusPassDetailsContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusPassDetailsContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBusPassDetailsContainerSpec f3512a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.StyledTextUIState d;
    public final ImageUIState e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BusPassDetailsContainerUiState(TextUIState.ChaloTextUIState passTitle, TextUIState.ChaloTextUIState passDescription, TextUIState.StyledTextUIState styledTextUIState) {
        ChaloBusPassDetailsContainerSpec chaloBusPassDetailsContainerSpec = new ChaloBusPassDetailsContainerSpec();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_PASS_BACKGROUND_BRUSH, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(75)), Dp.m7276boximpl(Dp.m7278constructorimpl(140))), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        Intrinsics.i(passTitle, "passTitle");
        Intrinsics.i(passDescription, "passDescription");
        this.f3512a = chaloBusPassDetailsContainerSpec;
        this.b = passTitle;
        this.c = passDescription;
        this.d = styledTextUIState;
        this.e = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusPassDetailsContainerUiState)) {
            return false;
        }
        BusPassDetailsContainerUiState busPassDetailsContainerUiState = (BusPassDetailsContainerUiState) obj;
        return Intrinsics.d(this.f3512a, busPassDetailsContainerUiState.f3512a) && Intrinsics.d(this.b, busPassDetailsContainerUiState.b) && Intrinsics.d(this.c, busPassDetailsContainerUiState.c) && Intrinsics.d(this.d, busPassDetailsContainerUiState.d) && Intrinsics.d(this.e, busPassDetailsContainerUiState.e);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f3512a.hashCode() * 31, 31), 31);
        TextUIState.StyledTextUIState styledTextUIState = this.d;
        int iHashCode = (iF + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        return iHashCode + (imageUIState != null ? imageUIState.hashCode() : 0);
    }

    public final String toString() {
        return "BusPassDetailsContainerUiState(spec=" + this.f3512a + ", passTitle=" + this.b + ", passDescription=" + this.c + ", tripsLeftText=" + this.d + ", passBackgroundBrushImageUIState=" + this.e + ")";
    }
}
