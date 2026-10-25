package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.lz0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/RegularBusTicketCtaUiState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketCtaUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketCtaSpec f10736a = new ChaloTicketCtaSpec();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final Function0 d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RegularBusTicketCtaUiState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, lz0 lz0Var) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = lz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketCtaUiState)) {
            return false;
        }
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = (RegularBusTicketCtaUiState) obj;
        return Intrinsics.d(this.f10736a, regularBusTicketCtaUiState.f10736a) && Intrinsics.d(this.b, regularBusTicketCtaUiState.b) && Intrinsics.d(this.c, regularBusTicketCtaUiState.c) && Intrinsics.d(this.d, regularBusTicketCtaUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f10736a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RegularBusTicketCtaUiState(spec=" + this.f10736a + ", ctaText=" + this.b + ", ctaIcon=" + this.c + ", ctaClickHandler=" + this.d + ")";
    }
}
