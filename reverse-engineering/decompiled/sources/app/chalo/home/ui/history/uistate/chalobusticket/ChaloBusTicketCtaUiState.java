package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.compose.theme.ChaloThemeHelper;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusTicketCtaUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusTicketCtaUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketCtaSpec f3503a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final Function0 d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloBusTicketCtaUiState(ChaloTicketCtaSpec chaloTicketCtaSpec, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, Function0 function0) {
        this.f3503a = chaloTicketCtaSpec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusTicketCtaUiState)) {
            return false;
        }
        ChaloBusTicketCtaUiState chaloBusTicketCtaUiState = (ChaloBusTicketCtaUiState) obj;
        return Intrinsics.d(this.f3503a, chaloBusTicketCtaUiState.f3503a) && Intrinsics.d(this.b, chaloBusTicketCtaUiState.b) && Intrinsics.d(this.c, chaloBusTicketCtaUiState.c) && Intrinsics.d(this.d, chaloBusTicketCtaUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3503a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "ChaloBusTicketCtaUiState(spec=" + this.f3503a + ", ctaText=" + this.b + ", ctaIcon=" + this.c + ", ctaClickHandler=" + this.d + ")";
    }

    public ChaloBusTicketCtaUiState(TextUIState.ChaloTextUIState chaloTextUIState, Function0 function0) {
        this(new ChaloTicketCtaSpec(null, null, 15), chaloTextUIState, new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, ChaloColorToken.Orange2.f9830a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), function0);
    }
}
