package app.chalo.productsummary.ui.pass;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummarySuccessScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSummarySuccessScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSummarySuccessScreenUISpec f8780a;
    public final ToolBarWithRightComponentUIState b;
    public final List c;
    public final PassDetailUIState d;
    public final BookingDetailsUIState e;
    public final PriceDetailsUIState f;
    public final DividerUIState g;
    public final DividerUIState h;
    public final ProductDownloadInvoiceOptionUIState i;

    public PassSummarySuccessScreenUIState(ToolBarWithRightComponentUIState toolBarWithRightComponentUIState, List productBannerUIStateList, PassDetailUIState passDetailUIState, BookingDetailsUIState bookingDetailsUIState, PriceDetailsUIState priceDetailsUIState, ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState, int i) {
        ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = new ProductSummarySuccessScreenUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.ShadyGray.f9851a, null, 4);
        DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.SectionDividerColor.f9849a, null, 4);
        productDownloadInvoiceOptionUIState = (i & 256) != 0 ? null : productDownloadInvoiceOptionUIState;
        Intrinsics.i(productBannerUIStateList, "productBannerUIStateList");
        this.f8780a = productSummarySuccessScreenUISpec;
        this.b = toolBarWithRightComponentUIState;
        this.c = productBannerUIStateList;
        this.d = passDetailUIState;
        this.e = bookingDetailsUIState;
        this.f = priceDetailsUIState;
        this.g = dividerUIState;
        this.h = dividerUIState2;
        this.i = productDownloadInvoiceOptionUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSummarySuccessScreenUIState)) {
            return false;
        }
        PassSummarySuccessScreenUIState passSummarySuccessScreenUIState = (PassSummarySuccessScreenUIState) obj;
        return Intrinsics.d(this.f8780a, passSummarySuccessScreenUIState.f8780a) && Intrinsics.d(this.b, passSummarySuccessScreenUIState.b) && Intrinsics.d(this.c, passSummarySuccessScreenUIState.c) && Intrinsics.d(this.d, passSummarySuccessScreenUIState.d) && Intrinsics.d(this.e, passSummarySuccessScreenUIState.e) && Intrinsics.d(this.f, passSummarySuccessScreenUIState.f) && Intrinsics.d(this.g, passSummarySuccessScreenUIState.g) && Intrinsics.d(this.h, passSummarySuccessScreenUIState.h) && Intrinsics.d(this.i, passSummarySuccessScreenUIState.i);
    }

    public final int hashCode() {
        int iHashCode = this.f8780a.hashCode() * 31;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState = this.b;
        int iB = r30.b((iHashCode + (toolBarWithRightComponentUIState == null ? 0 : toolBarWithRightComponentUIState.hashCode())) * 31, 31, this.c);
        PassDetailUIState passDetailUIState = this.d;
        int iHashCode2 = (iB + (passDetailUIState == null ? 0 : passDetailUIState.hashCode())) * 31;
        BookingDetailsUIState bookingDetailsUIState = this.e;
        int iHashCode3 = (iHashCode2 + (bookingDetailsUIState == null ? 0 : bookingDetailsUIState.hashCode())) * 31;
        PriceDetailsUIState priceDetailsUIState = this.f;
        int iC = py.c(this.h, py.c(this.g, (iHashCode3 + (priceDetailsUIState == null ? 0 : priceDetailsUIState.hashCode())) * 31, 31), 31);
        ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState = this.i;
        return iC + (productDownloadInvoiceOptionUIState != null ? productDownloadInvoiceOptionUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PassSummarySuccessScreenUIState(passSummarySuccessScreenUISpec=" + this.f8780a + ", toolBarWithRightComponentUIState=" + this.b + ", productBannerUIStateList=" + this.c + ", passInfoUIState=" + this.d + ", bookingDetailsUIState=" + this.e + ", priceDetailsUIState=" + this.f + ", dividerUiState=" + this.g + ", componentSeparatorDividerUIState=" + this.h + ", productDownloadInvoiceOptionUIState=" + this.i + ")";
    }
}
