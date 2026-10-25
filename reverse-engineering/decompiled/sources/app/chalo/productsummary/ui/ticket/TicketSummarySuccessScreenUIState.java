package app.chalo.productsummary.ui.ticket;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiState;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummarySuccessScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummarySuccessScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSummarySuccessScreenUISpec f8826a;
    public final ToolBarWithRightComponentUIState b;
    public final List c;
    public final TicketInfoUIState d;
    public final BookingDetailsUIState e;
    public final ProductSummaryStatusUiData f;
    public final PriceDetailsUIState g;
    public final GroupTicketPriceDetailsUiState h;
    public final DividerUIState i;
    public final DividerUIState j;
    public final ProductDownloadInvoiceOptionUIState k;
    public final TicketSupportUIState l;

    public TicketSummarySuccessScreenUIState(ToolBarWithRightComponentUIState toolBarWithRightComponentUIState, List productBannerUIStateList, TicketInfoUIState ticketInfoUIState, BookingDetailsUIState bookingDetailsUIState, ProductSummaryStatusUiData productSummaryStatusUiData, PriceDetailsUIState priceDetailsUIState, GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState, ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState, TicketSupportUIState ticketSupportUIState, int i) {
        ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = new ProductSummarySuccessScreenUISpec();
        ProductSummaryStatusUiData productSummaryStatusUiData2 = (i & 32) != 0 ? null : productSummaryStatusUiData;
        GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState2 = (i & 128) != 0 ? null : groupTicketPriceDetailsUiState;
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.ShadyGray.f9851a, null, 4);
        DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.SectionDividerColor.f9849a, null, 4);
        ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState2 = (i & 1024) != 0 ? null : productDownloadInvoiceOptionUIState;
        TicketSupportUIState ticketSupportUIState2 = (i & 2048) == 0 ? ticketSupportUIState : null;
        Intrinsics.i(productBannerUIStateList, "productBannerUIStateList");
        this.f8826a = productSummarySuccessScreenUISpec;
        this.b = toolBarWithRightComponentUIState;
        this.c = productBannerUIStateList;
        this.d = ticketInfoUIState;
        this.e = bookingDetailsUIState;
        this.f = productSummaryStatusUiData2;
        this.g = priceDetailsUIState;
        this.h = groupTicketPriceDetailsUiState2;
        this.i = dividerUIState;
        this.j = dividerUIState2;
        this.k = productDownloadInvoiceOptionUIState2;
        this.l = ticketSupportUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummarySuccessScreenUIState)) {
            return false;
        }
        TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState = (TicketSummarySuccessScreenUIState) obj;
        return Intrinsics.d(this.f8826a, ticketSummarySuccessScreenUIState.f8826a) && Intrinsics.d(this.b, ticketSummarySuccessScreenUIState.b) && Intrinsics.d(this.c, ticketSummarySuccessScreenUIState.c) && Intrinsics.d(this.d, ticketSummarySuccessScreenUIState.d) && Intrinsics.d(this.e, ticketSummarySuccessScreenUIState.e) && Intrinsics.d(this.f, ticketSummarySuccessScreenUIState.f) && Intrinsics.d(this.g, ticketSummarySuccessScreenUIState.g) && Intrinsics.d(this.h, ticketSummarySuccessScreenUIState.h) && Intrinsics.d(this.i, ticketSummarySuccessScreenUIState.i) && Intrinsics.d(this.j, ticketSummarySuccessScreenUIState.j) && Intrinsics.d(this.k, ticketSummarySuccessScreenUIState.k) && Intrinsics.d(this.l, ticketSummarySuccessScreenUIState.l);
    }

    public final int hashCode() {
        int iHashCode = this.f8826a.hashCode() * 31;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState = this.b;
        int iB = r30.b((iHashCode + (toolBarWithRightComponentUIState == null ? 0 : toolBarWithRightComponentUIState.hashCode())) * 31, 31, this.c);
        TicketInfoUIState ticketInfoUIState = this.d;
        int iHashCode2 = (iB + (ticketInfoUIState == null ? 0 : ticketInfoUIState.hashCode())) * 31;
        BookingDetailsUIState bookingDetailsUIState = this.e;
        int iHashCode3 = (iHashCode2 + (bookingDetailsUIState == null ? 0 : bookingDetailsUIState.hashCode())) * 31;
        ProductSummaryStatusUiData productSummaryStatusUiData = this.f;
        int iHashCode4 = (iHashCode3 + (productSummaryStatusUiData == null ? 0 : productSummaryStatusUiData.hashCode())) * 31;
        PriceDetailsUIState priceDetailsUIState = this.g;
        int iHashCode5 = (iHashCode4 + (priceDetailsUIState == null ? 0 : priceDetailsUIState.hashCode())) * 31;
        GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState = this.h;
        int iC = py.c(this.j, py.c(this.i, (iHashCode5 + (groupTicketPriceDetailsUiState == null ? 0 : groupTicketPriceDetailsUiState.hashCode())) * 31, 31), 31);
        ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState = this.k;
        int iHashCode6 = (iC + (productDownloadInvoiceOptionUIState == null ? 0 : productDownloadInvoiceOptionUIState.hashCode())) * 31;
        TicketSupportUIState ticketSupportUIState = this.l;
        return iHashCode6 + (ticketSupportUIState != null ? ticketSupportUIState.hashCode() : 0);
    }

    public final String toString() {
        return "TicketSummarySuccessScreenUIState(productSummarySuccessScreenUISpec=" + this.f8826a + ", toolBarWithRightComponentUIState=" + this.b + ", productBannerUIStateList=" + this.c + ", ticketInfoUIState=" + this.d + ", bookingDetailsUIState=" + this.e + ", waitingForMoreDetailsUIState=" + this.f + ", priceDetailsUIState=" + this.g + ", groupPriceDetailsUIState=" + this.h + ", dividerUiState=" + this.i + ", componentSeparatorDividerUIState=" + this.j + ", productDownloadInvoiceOptionUIState=" + this.k + ", ticketSupportUIState=" + this.l + ")";
    }
}
