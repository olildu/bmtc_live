package app.chalo.home.ui.history;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType;", "", "PurchaseProductBottomSheet", "TicketsPageInfoBottomSheet", "MultiModalTicketSelectionBottomSheet", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$MultiModalTicketSelectionBottomSheet;", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$PurchaseProductBottomSheet;", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$TicketsPageInfoBottomSheet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TicketsScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$MultiModalTicketSelectionBottomSheet;", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalTicketSelectionBottomSheet extends TicketsScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiModalGroupTicketAppModel f3446a;

        public MultiModalTicketSelectionBottomSheet(MultiModalGroupTicketAppModel groupTicket) {
            Intrinsics.i(groupTicket, "groupTicket");
            this.f3446a = groupTicket;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MultiModalGroupTicketAppModel getF3446a() {
            return this.f3446a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalTicketSelectionBottomSheet) && Intrinsics.d(this.f3446a, ((MultiModalTicketSelectionBottomSheet) obj).f3446a);
        }

        public final int hashCode() {
            return this.f3446a.hashCode();
        }

        public final String toString() {
            return "MultiModalTicketSelectionBottomSheet(groupTicket=" + this.f3446a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$PurchaseProductBottomSheet;", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PurchaseProductBottomSheet extends TicketsScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PurchaseProductBottomSheet f3447a = new PurchaseProductBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PurchaseProductBottomSheet);
        }

        public final int hashCode() {
            return 1277489528;
        }

        public final String toString() {
            return "PurchaseProductBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType$TicketsPageInfoBottomSheet;", "Lapp/chalo/home/ui/history/TicketsScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketsPageInfoBottomSheet extends TicketsScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsPageInfoBottomSheetData f3448a;
        public final BookableSuperPassConfiguration b;
        public final SuperPass c;
        public final ChaloUserBookingType d;
        public final TicketsPageInfoBottomSheetPositiveCtaType e;
        public final TicketsPageInfoBottomSheetNegativeCtaType f;

        public TicketsPageInfoBottomSheet(TicketsPageInfoBottomSheetData ticketsPageInfoBottomSheetData, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPass superPass, ChaloUserBookingType chaloUserBookingType, TicketsPageInfoBottomSheetPositiveCtaType positiveCtaActionType, TicketsPageInfoBottomSheetNegativeCtaType ticketsPageInfoBottomSheetNegativeCtaType, int i) {
            bookableSuperPassConfiguration = (i & 2) != 0 ? null : bookableSuperPassConfiguration;
            superPass = (i & 4) != 0 ? null : superPass;
            ticketsPageInfoBottomSheetNegativeCtaType = (i & 32) != 0 ? null : ticketsPageInfoBottomSheetNegativeCtaType;
            Intrinsics.i(chaloUserBookingType, "chaloUserBookingType");
            Intrinsics.i(positiveCtaActionType, "positiveCtaActionType");
            this.f3448a = ticketsPageInfoBottomSheetData;
            this.b = bookableSuperPassConfiguration;
            this.c = superPass;
            this.d = chaloUserBookingType;
            this.e = positiveCtaActionType;
            this.f = ticketsPageInfoBottomSheetNegativeCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketsPageInfoBottomSheet)) {
                return false;
            }
            TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet = (TicketsPageInfoBottomSheet) obj;
            return Intrinsics.d(this.f3448a, ticketsPageInfoBottomSheet.f3448a) && Intrinsics.d(this.b, ticketsPageInfoBottomSheet.b) && Intrinsics.d(this.c, ticketsPageInfoBottomSheet.c) && Intrinsics.d(this.d, ticketsPageInfoBottomSheet.d) && this.e == ticketsPageInfoBottomSheet.e && this.f == ticketsPageInfoBottomSheet.f;
        }

        public final int hashCode() {
            int iHashCode = this.f3448a.hashCode() * 31;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = this.b;
            int iHashCode2 = (iHashCode + (bookableSuperPassConfiguration == null ? 0 : bookableSuperPassConfiguration.hashCode())) * 31;
            SuperPass superPass = this.c;
            int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (superPass == null ? 0 : superPass.hashCode())) * 31)) * 31)) * 31;
            TicketsPageInfoBottomSheetNegativeCtaType ticketsPageInfoBottomSheetNegativeCtaType = this.f;
            return iHashCode3 + (ticketsPageInfoBottomSheetNegativeCtaType != null ? ticketsPageInfoBottomSheetNegativeCtaType.hashCode() : 0);
        }

        public final String toString() {
            return "TicketsPageInfoBottomSheet(bottomSheetData=" + this.f3448a + ", bookableSuperPassConfiguration=" + this.b + ", superPass=" + this.c + ", chaloUserBookingType=" + this.d + ", positiveCtaActionType=" + this.e + ", negativeCtaActionType=" + this.f + ")";
        }
    }
}
