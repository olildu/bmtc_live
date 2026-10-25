package app.chalo.metro.ui.landing.uistate;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroTicketBenefitUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketBenefitUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroTicketBenefitSpec f5528a = new MetroTicketBenefitSpec();
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final DividerUIState d;

    public MetroTicketBenefitUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, DividerUIState dividerUIState) {
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketBenefitUiState)) {
            return false;
        }
        MetroTicketBenefitUiState metroTicketBenefitUiState = (MetroTicketBenefitUiState) obj;
        return Intrinsics.d(this.f5528a, metroTicketBenefitUiState.f5528a) && Intrinsics.d(this.b, metroTicketBenefitUiState.b) && Intrinsics.d(this.c, metroTicketBenefitUiState.c) && Intrinsics.d(this.d, metroTicketBenefitUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5528a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iF = r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
        DividerUIState dividerUIState = this.d;
        return iF + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "MetroTicketBenefitUiState(spec=" + this.f5528a + ", image=" + this.b + ", benefit=" + this.c + ", dividerUiState=" + this.d + ")";
    }
}
