package app.chalo.home.ui.history.uistate.bottomsheet;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.history.uistate.EmptyScreenProductBookingOptionsUiState;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState;", "", "ProductPurchaseBottomSheetUiState", "TicketsPageInfoBottomSheet", "MultiModalTicketSelectionBottomSheetUiState", "None", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$MultiModalTicketSelectionBottomSheetUiState;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$None;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$ProductPurchaseBottomSheetUiState;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$TicketsPageInfoBottomSheet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MyTicketBottomSheetUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f3492a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$MultiModalTicketSelectionBottomSheetUiState;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalTicketSelectionBottomSheetUiState extends MyTicketBottomSheetUiState {
        public final BottomSheetUiState b;
        public final TextUIState.ChaloTextUIState c;
        public final List d;
        public final DividerUIState e;
        public final ChaloPadding f;

        public MultiModalTicketSelectionBottomSheetUiState(BottomSheetUiState sheetUiState, TextUIState.ChaloTextUIState chaloTextUIState, List childTickets) {
            DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
            Intrinsics.i(sheetUiState, "sheetUiState");
            Intrinsics.i(childTickets, "childTickets");
            super(sheetUiState);
            this.b = sheetUiState;
            this.c = chaloTextUIState;
            this.d = childTickets;
            this.e = dividerUIState;
            this.f = chaloPadding;
        }

        @Override // app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF3492a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiModalTicketSelectionBottomSheetUiState)) {
                return false;
            }
            MultiModalTicketSelectionBottomSheetUiState multiModalTicketSelectionBottomSheetUiState = (MultiModalTicketSelectionBottomSheetUiState) obj;
            return Intrinsics.d(this.b, multiModalTicketSelectionBottomSheetUiState.b) && Intrinsics.d(this.c, multiModalTicketSelectionBottomSheetUiState.c) && Intrinsics.d(this.d, multiModalTicketSelectionBottomSheetUiState.d) && Intrinsics.d(this.e, multiModalTicketSelectionBottomSheetUiState.e) && Intrinsics.d(this.f, multiModalTicketSelectionBottomSheetUiState.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + py.c(this.e, r30.b(r30.f(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiModalTicketSelectionBottomSheetUiState(sheetUiState=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", childTickets=");
            sb.append(this.d);
            sb.append(", divider=");
            sb.append(this.e);
            sb.append(", paddingAroundSheet=");
            return py.e(sb, this.f, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$None;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends MyTicketBottomSheetUiState {
        public static final None b = new None(new BottomSheetUiState(new BottomSheetUiSpec(null, 15), new BottomSheetEventHandler(false, false, null, 127)));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1836670681;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$ProductPurchaseBottomSheetUiState;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPurchaseBottomSheetUiState extends MyTicketBottomSheetUiState {
        public final BottomSheetUiState b;
        public final ProductPurchaseBottomSheetSpec c;
        public final TextUIState.ChaloTextUIState d;
        public final EmptyScreenProductBookingOptionsUiState.ProductGridContainer e;

        public ProductPurchaseBottomSheetUiState(BottomSheetUiState sheetUiState, TextUIState.ChaloTextUIState chaloTextUIState, EmptyScreenProductBookingOptionsUiState.ProductGridContainer productGridContainer) {
            ProductPurchaseBottomSheetSpec productPurchaseBottomSheetSpec = new ProductPurchaseBottomSheetSpec();
            Intrinsics.i(sheetUiState, "sheetUiState");
            super(sheetUiState);
            this.b = sheetUiState;
            this.c = productPurchaseBottomSheetSpec;
            this.d = chaloTextUIState;
            this.e = productGridContainer;
        }

        @Override // app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF3492a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductPurchaseBottomSheetUiState)) {
                return false;
            }
            ProductPurchaseBottomSheetUiState productPurchaseBottomSheetUiState = (ProductPurchaseBottomSheetUiState) obj;
            return Intrinsics.d(this.b, productPurchaseBottomSheetUiState.b) && Intrinsics.d(this.c, productPurchaseBottomSheetUiState.c) && Intrinsics.d(this.d, productPurchaseBottomSheetUiState.d) && Intrinsics.d(this.e, productPurchaseBottomSheetUiState.e);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            TextUIState.ChaloTextUIState chaloTextUIState = this.d;
            return this.e.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
        }

        public final String toString() {
            return "ProductPurchaseBottomSheetUiState(sheetUiState=" + this.b + ", spec=" + this.c + ", headerText=" + this.d + ", productGridUiState=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState$TicketsPageInfoBottomSheet;", "Lapp/chalo/home/ui/history/uistate/bottomsheet/MyTicketBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketsPageInfoBottomSheet extends MyTicketBottomSheetUiState {
        public final BottomSheetUiState b;
        public final BottomSheetStandardContentUiState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketsPageInfoBottomSheet(BottomSheetUiState sheetUiState, BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            super(sheetUiState);
            Intrinsics.i(sheetUiState, "sheetUiState");
            this.b = sheetUiState;
            this.c = bottomSheetStandardContentUiState;
        }

        @Override // app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF3492a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketsPageInfoBottomSheet)) {
                return false;
            }
            TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet = (TicketsPageInfoBottomSheet) obj;
            return Intrinsics.d(this.b, ticketsPageInfoBottomSheet.b) && Intrinsics.d(this.c, ticketsPageInfoBottomSheet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "TicketsPageInfoBottomSheet(sheetUiState=" + this.b + ", uiState=" + this.c + ")";
        }
    }

    public MyTicketBottomSheetUiState(BottomSheetUiState bottomSheetUiState) {
        this.f3492a = bottomSheetUiState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public BottomSheetUiState getF3492a() {
        return this.f3492a;
    }
}
