package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DashedDividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareSplitSectionUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareSplitSectionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7616a;
    public final List b;
    public final PremiumBusFareSplitRowUiState c;
    public final DashedDividerUIState d;
    public final PremiumBusFareSplitUISpecs e;

    public PremiumBusFareSplitSectionUiState(TextUIState.ChaloTextUIState titleTextUIState, List rows, PremiumBusFareSplitRowUiState premiumBusFareSplitRowUiState) {
        DashedDividerUIState dashedDividerUIState = new DashedDividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Gray85.f9798a, ChaloThemeHelper.a().f, ChaloThemeHelper.a().e);
        PremiumBusFareSplitUISpecs premiumBusFareSplitUISpecs = new PremiumBusFareSplitUISpecs();
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(rows, "rows");
        this.f7616a = titleTextUIState;
        this.b = rows;
        this.c = premiumBusFareSplitRowUiState;
        this.d = dashedDividerUIState;
        this.e = premiumBusFareSplitUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareSplitSectionUiState)) {
            return false;
        }
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) obj;
        return Intrinsics.d(this.f7616a, premiumBusFareSplitSectionUiState.f7616a) && Intrinsics.d(this.b, premiumBusFareSplitSectionUiState.b) && Intrinsics.d(this.c, premiumBusFareSplitSectionUiState.c) && Intrinsics.d(this.d, premiumBusFareSplitSectionUiState.d) && Intrinsics.d(this.e, premiumBusFareSplitSectionUiState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + r30.b(this.f7616a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "PremiumBusFareSplitSectionUiState(titleTextUIState=" + this.f7616a + ", rows=" + this.b + ", totalRow=" + this.c + ", dividerUIState=" + this.d + ", specs=" + this.e + ")";
    }
}
