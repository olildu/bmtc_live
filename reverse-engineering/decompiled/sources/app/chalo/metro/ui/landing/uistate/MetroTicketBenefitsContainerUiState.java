package app.chalo.metro.ui.landing.uistate;

import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroTicketBenefitsContainerUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketBenefitsContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroTicketBenefitsContainerSpec f5530a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final ProductBannerUIState d;

    public MetroTicketBenefitsContainerUiState(MetroTicketBenefitsContainerSpec metroTicketBenefitsContainerSpec, TextUIState.ChaloTextUIState title, List benefitsListUiState, ProductBannerUIState productBannerUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(benefitsListUiState, "benefitsListUiState");
        this.f5530a = metroTicketBenefitsContainerSpec;
        this.b = title;
        this.c = benefitsListUiState;
        this.d = productBannerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketBenefitsContainerUiState)) {
            return false;
        }
        MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState = (MetroTicketBenefitsContainerUiState) obj;
        return Intrinsics.d(this.f5530a, metroTicketBenefitsContainerUiState.f5530a) && Intrinsics.d(this.b, metroTicketBenefitsContainerUiState.b) && Intrinsics.d(this.c, metroTicketBenefitsContainerUiState.c) && Intrinsics.d(this.d, metroTicketBenefitsContainerUiState.d);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.b, this.f5530a.hashCode() * 31, 31), 31, this.c);
        ProductBannerUIState productBannerUIState = this.d;
        return iB + (productBannerUIState == null ? 0 : productBannerUIState.hashCode());
    }

    public final String toString() {
        return "MetroTicketBenefitsContainerUiState(spec=" + this.f5530a + ", title=" + this.b + ", benefitsListUiState=" + this.c + ", bannerUIState=" + this.d + ")";
    }
}
