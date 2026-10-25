package app.chalo.productsummary.ui.ticket;

import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.receipt.UserDetailsForProducts;
import defpackage.z40;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f8804a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final BookingsRequestType e;
    public final ChaloUserBookingType f;
    public final ProductReceiptData g;
    public final String h;
    public final UserDetailsForProducts i;
    public final String j;
    public final IconType k;
    public final boolean l;
    public final Set m;
    public final List n;
    public final TicketReceiptFormatConfig o;

    public TicketSummaryDataState(Source source, boolean z, boolean z2, boolean z3, BookingsRequestType bookingsRequestType, ChaloUserBookingType chaloUserBookingType, ProductReceiptData productReceiptData, String str, UserDetailsForProducts userDetailsForProducts, String str2, IconType iconType, boolean z4, Set expandedMultiModalFareLegSequences, List list, TicketReceiptFormatConfig receiptFormat) {
        Intrinsics.i(source, "source");
        Intrinsics.i(expandedMultiModalFareLegSequences, "expandedMultiModalFareLegSequences");
        Intrinsics.i(receiptFormat, "receiptFormat");
        this.f8804a = source;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = bookingsRequestType;
        this.f = chaloUserBookingType;
        this.g = productReceiptData;
        this.h = str;
        this.i = userDetailsForProducts;
        this.j = str2;
        this.k = iconType;
        this.l = z4;
        this.m = expandedMultiModalFareLegSequences;
        this.n = list;
        this.o = receiptFormat;
    }

    public static TicketSummaryDataState a(TicketSummaryDataState ticketSummaryDataState, Source source, boolean z, boolean z2, boolean z3, BookingsRequestType bookingsRequestType, ChaloUserBookingType chaloUserBookingType, ProductReceiptData productReceiptData, String str, UserDetailsForProducts userDetailsForProducts, String str2, IconType iconType, boolean z4, LinkedHashSet linkedHashSet, List list, TicketReceiptFormatConfig ticketReceiptFormatConfig, int i) {
        Source source2 = (i & 1) != 0 ? ticketSummaryDataState.f8804a : source;
        boolean z5 = (i & 2) != 0 ? ticketSummaryDataState.b : z;
        boolean z6 = (i & 4) != 0 ? ticketSummaryDataState.c : z2;
        boolean z7 = (i & 8) != 0 ? ticketSummaryDataState.d : z3;
        BookingsRequestType bookingsRequestType2 = (i & 16) != 0 ? ticketSummaryDataState.e : bookingsRequestType;
        ChaloUserBookingType chaloUserBookingType2 = (i & 32) != 0 ? ticketSummaryDataState.f : chaloUserBookingType;
        ProductReceiptData productReceiptData2 = (i & 64) != 0 ? ticketSummaryDataState.g : productReceiptData;
        String str3 = (i & 128) != 0 ? ticketSummaryDataState.h : str;
        UserDetailsForProducts userDetailsForProducts2 = (i & 256) != 0 ? ticketSummaryDataState.i : userDetailsForProducts;
        String str4 = (i & 512) != 0 ? ticketSummaryDataState.j : str2;
        IconType iconType2 = (i & 1024) != 0 ? ticketSummaryDataState.k : iconType;
        boolean z8 = (i & 2048) != 0 ? ticketSummaryDataState.l : z4;
        Set expandedMultiModalFareLegSequences = (i & 4096) != 0 ? ticketSummaryDataState.m : linkedHashSet;
        List list2 = (i & 8192) != 0 ? ticketSummaryDataState.n : list;
        TicketReceiptFormatConfig receiptFormat = (i & 16384) != 0 ? ticketSummaryDataState.o : ticketReceiptFormatConfig;
        ticketSummaryDataState.getClass();
        Intrinsics.i(source2, "source");
        Intrinsics.i(expandedMultiModalFareLegSequences, "expandedMultiModalFareLegSequences");
        Intrinsics.i(receiptFormat, "receiptFormat");
        return new TicketSummaryDataState(source2, z5, z6, z7, bookingsRequestType2, chaloUserBookingType2, productReceiptData2, str3, userDetailsForProducts2, str4, iconType2, z8, expandedMultiModalFareLegSequences, list2, receiptFormat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryDataState)) {
            return false;
        }
        TicketSummaryDataState ticketSummaryDataState = (TicketSummaryDataState) obj;
        return this.f8804a == ticketSummaryDataState.f8804a && this.b == ticketSummaryDataState.b && this.c == ticketSummaryDataState.c && this.d == ticketSummaryDataState.d && Intrinsics.d(this.e, ticketSummaryDataState.e) && Intrinsics.d(this.f, ticketSummaryDataState.f) && Intrinsics.d(this.g, ticketSummaryDataState.g) && Intrinsics.d(this.h, ticketSummaryDataState.h) && Intrinsics.d(this.i, ticketSummaryDataState.i) && Intrinsics.d(this.j, ticketSummaryDataState.j) && this.k == ticketSummaryDataState.k && this.l == ticketSummaryDataState.l && Intrinsics.d(this.m, ticketSummaryDataState.m) && Intrinsics.d(this.n, ticketSummaryDataState.n) && this.o == ticketSummaryDataState.o;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f8804a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
        BookingsRequestType bookingsRequestType = this.e;
        int iHashCode2 = (iHashCode + (bookingsRequestType == null ? 0 : bookingsRequestType.hashCode())) * 31;
        ChaloUserBookingType chaloUserBookingType = this.f;
        int iHashCode3 = (iHashCode2 + (chaloUserBookingType == null ? 0 : chaloUserBookingType.hashCode())) * 31;
        ProductReceiptData productReceiptData = this.g;
        int iHashCode4 = (iHashCode3 + (productReceiptData == null ? 0 : productReceiptData.hashCode())) * 31;
        String str = this.h;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        UserDetailsForProducts userDetailsForProducts = this.i;
        int iHashCode6 = (iHashCode5 + (userDetailsForProducts == null ? 0 : userDetailsForProducts.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconType iconType = this.k;
        int iHashCode8 = (this.m.hashCode() + ((((iHashCode7 + (iconType == null ? 0 : iconType.hashCode())) * 31) + (this.l ? 1231 : 1237)) * 31)) * 31;
        List list = this.n;
        return this.o.hashCode() + ((iHashCode8 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketSummaryDataState(source=");
        sb.append(this.f8804a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", showLoadingDialog=");
        z40.r(sb, this.c, ", isError=", this.d, ", bookingsRequestType=");
        sb.append(this.e);
        sb.append(", chaloUserBookingType=");
        sb.append(this.f);
        sb.append(", receiptData=");
        sb.append(this.g);
        sb.append(", imageUrlToShowFullScreen=");
        sb.append(this.h);
        sb.append(", userProfile=");
        sb.append(this.i);
        sb.append(", brandingUrl=");
        sb.append(this.j);
        sb.append(", brandingIcon=");
        sb.append(this.k);
        sb.append(", showBranding=");
        sb.append(this.l);
        sb.append(", expandedMultiModalFareLegSequences=");
        sb.append(this.m);
        sb.append(", bookingHelpFaqList=");
        sb.append(this.n);
        sb.append(", receiptFormat=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
