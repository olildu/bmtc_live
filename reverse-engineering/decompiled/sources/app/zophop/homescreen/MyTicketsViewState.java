package app.zophop.homescreen;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.history.TicketsPageLayoutType;
import app.chalo.home.ui.history.uistate.EmptyScreenUiState;
import app.chalo.home.ui.history.uistate.MyTicketsHeaderUiState;
import app.chalo.home.ui.history.uistate.MyTicketsLoginNudgeUIState;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.home.ui.history.uistate.ProductsTabUiState;
import app.chalo.home.ui.history.uistate.TicketsFloatingButtonContainerUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import defpackage.dd;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/zophop/homescreen/MyTicketsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketsViewState {
    public final HomeTabScreensRetainedData.MyTicketsScreen A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyTicketsViewStateSpec f11133a;
    public final TicketsPageLayoutType b;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry c;
    public final boolean d;
    public final TabHeaderUiState e;
    public final MyTicketsHeaderUiState f;
    public final MyTicketsHeaderUiState g;
    public final ProductsTabUiState h;
    public final EmptyScreenUiState i;
    public final EmptyScreenUiState j;
    public final MyTicketBottomSheetUiState k;
    public final ProductReclaimUiState l;
    public final ConfirmationDialogUiState m;
    public final boolean n;
    public final LoadingDialogUIState o;
    public final ConfirmationDialogUiState p;
    public final TicketsFloatingButtonContainerUiState q;
    public final MyTicketsLoginNudgeUIState r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final DividerUIState w;
    public final DividerUIState x;
    public final DividerUIState y;
    public final ContactSupportUIState z;

    /* JADX WARN: Multi-variable type inference failed */
    public MyTicketsViewState(MyTicketsViewStateSpec myTicketsViewStateSpec, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, boolean z, TabHeaderUiState tabHeaderUiState, MyTicketsHeaderUiState myTicketsHeaderUiState, MyTicketsHeaderUiState myTicketsHeaderUiState2, ProductsTabUiState productsTabUiState, EmptyScreenUiState emptyScreenUiState, EmptyScreenUiState emptyScreenUiState2, MyTicketBottomSheetUiState myTicketBottomSheetUiState, ProductReclaimUiState productReclaimUiState, ConfirmationDialogUiState confirmationDialogUiState, boolean z2, LoadingDialogUIState loadingDialogUIState, ConfirmationDialogUiState confirmationDialogUiState2, TicketsFloatingButtonContainerUiState ticketsFloatingButtonContainerUiState, MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState, List list, List list2, List list3, List list4, DividerUIState dividerUIState, DividerUIState dividerUIState2, ContactSupportUIState contactSupportUIState, HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen, int i) {
        DividerOrientation dividerOrientation;
        int i2;
        DividerUIState dividerUIState3;
        MyTicketsViewStateSpec spec = (i & 1) != 0 ? new MyTicketsViewStateSpec(null, null, 1023) : myTicketsViewStateSpec;
        TicketsPageLayoutType layoutType = TicketsPageLayoutType.TICKETS_PASSES_SECTION;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry2 = (i & 4) != 0 ? null : errorWithMsgAndRetry;
        boolean z3 = (i & 8) != 0 ? true : z;
        TabHeaderUiState tabHeaderUiState2 = (i & 16) != 0 ? null : tabHeaderUiState;
        MyTicketsHeaderUiState myTicketsHeaderUiState3 = (i & 32) != 0 ? null : myTicketsHeaderUiState;
        MyTicketsHeaderUiState myTicketsHeaderUiState4 = (i & 64) != 0 ? null : myTicketsHeaderUiState2;
        ProductsTabUiState productTabUiState = (i & 128) != 0 ? new ProductsTabUiState(null, 0, 7) : productsTabUiState;
        EmptyScreenUiState emptyScreenUiState3 = (i & 256) != 0 ? null : emptyScreenUiState;
        EmptyScreenUiState emptyScreenUiState4 = (i & 512) != 0 ? null : emptyScreenUiState2;
        MyTicketBottomSheetUiState bottomSheetUiStateType = (i & 1024) != 0 ? MyTicketBottomSheetUiState.None.b : myTicketBottomSheetUiState;
        ProductReclaimUiState productReclaimUiState2 = (i & 2048) != 0 ? null : productReclaimUiState;
        ConfirmationDialogUiState confirmationDialogUiState3 = (i & 4096) != 0 ? null : confirmationDialogUiState;
        boolean z4 = (i & 8192) != 0 ? false : z2;
        LoadingDialogUIState loadingDialogUIState2 = (i & 16384) != 0 ? null : loadingDialogUIState;
        ConfirmationDialogUiState confirmationDialogUiState4 = (i & 32768) != 0 ? null : confirmationDialogUiState2;
        TicketsFloatingButtonContainerUiState ticketsFloatingButtonContainerUiState2 = (i & 65536) != 0 ? null : ticketsFloatingButtonContainerUiState;
        MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState2 = (i & 131072) != 0 ? null : myTicketsLoginNudgeUIState;
        List list5 = (i & 262144) != 0 ? null : list;
        List list6 = (i & 524288) != 0 ? null : list2;
        List list7 = (i & 1048576) != 0 ? null : list3;
        List list8 = (i & 2097152) != 0 ? null : list4;
        int i3 = i & 4194304;
        ConfirmationDialogUiState confirmationDialogUiState5 = confirmationDialogUiState4;
        ChaloColorToken.SectionDividerColor sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
        if (i3 != 0) {
            dividerOrientation = null;
            i2 = 4;
            dividerUIState3 = new DividerUIState(ChaloThemeHelper.a().h, sectionDividerColor, null, 4);
        } else {
            dividerOrientation = null;
            i2 = 4;
            dividerUIState3 = dividerUIState;
        }
        DividerUIState dividerUIState4 = (i & 8388608) != 0 ? new DividerUIState(ChaloThemeHelper.a().h, sectionDividerColor, dividerOrientation, i2) : dividerUIState2;
        DividerUIState dividerUIState5 = new DividerUIState(ChaloThemeHelper.a().s, ChaloColorToken.Transparent.f9864a, dividerOrientation, i2);
        ContactSupportUIState contactSupportUIState2 = (i & 33554432) == 0 ? contactSupportUIState : dividerOrientation;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(productTabUiState, "productTabUiState");
        Intrinsics.i(bottomSheetUiStateType, "bottomSheetUiStateType");
        this.f11133a = spec;
        this.b = layoutType;
        this.c = errorWithMsgAndRetry2;
        this.d = z3;
        this.e = tabHeaderUiState2;
        this.f = myTicketsHeaderUiState3;
        this.g = myTicketsHeaderUiState4;
        this.h = productTabUiState;
        this.i = emptyScreenUiState3;
        this.j = emptyScreenUiState4;
        this.k = bottomSheetUiStateType;
        this.l = productReclaimUiState2;
        this.m = confirmationDialogUiState3;
        this.n = z4;
        this.o = loadingDialogUIState2;
        this.p = confirmationDialogUiState5;
        this.q = ticketsFloatingButtonContainerUiState2;
        this.r = myTicketsLoginNudgeUIState2;
        this.s = list5;
        this.t = list6;
        this.u = list7;
        this.v = list8;
        this.w = dividerUIState3;
        this.x = dividerUIState4;
        this.y = dividerUIState5;
        this.z = contactSupportUIState2;
        this.A = myTicketsScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketsViewState)) {
            return false;
        }
        MyTicketsViewState myTicketsViewState = (MyTicketsViewState) obj;
        return Intrinsics.d(this.f11133a, myTicketsViewState.f11133a) && this.b == myTicketsViewState.b && Intrinsics.d(this.c, myTicketsViewState.c) && this.d == myTicketsViewState.d && Intrinsics.d(this.e, myTicketsViewState.e) && Intrinsics.d(this.f, myTicketsViewState.f) && Intrinsics.d(this.g, myTicketsViewState.g) && Intrinsics.d(this.h, myTicketsViewState.h) && Intrinsics.d(this.i, myTicketsViewState.i) && Intrinsics.d(this.j, myTicketsViewState.j) && Intrinsics.d(this.k, myTicketsViewState.k) && Intrinsics.d(this.l, myTicketsViewState.l) && Intrinsics.d(this.m, myTicketsViewState.m) && this.n == myTicketsViewState.n && Intrinsics.d(this.o, myTicketsViewState.o) && Intrinsics.d(this.p, myTicketsViewState.p) && Intrinsics.d(this.q, myTicketsViewState.q) && Intrinsics.d(this.r, myTicketsViewState.r) && Intrinsics.d(this.s, myTicketsViewState.s) && Intrinsics.d(this.t, myTicketsViewState.t) && Intrinsics.d(this.u, myTicketsViewState.u) && Intrinsics.d(this.v, myTicketsViewState.v) && Intrinsics.d(this.w, myTicketsViewState.w) && Intrinsics.d(this.x, myTicketsViewState.x) && Intrinsics.d(this.y, myTicketsViewState.y) && Intrinsics.d(this.z, myTicketsViewState.z) && Intrinsics.d(this.A, myTicketsViewState.A);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f11133a.hashCode() * 31)) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.c;
        int iHashCode2 = (((iHashCode + (errorWithMsgAndRetry == null ? 0 : errorWithMsgAndRetry.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        TabHeaderUiState tabHeaderUiState = this.e;
        int iHashCode3 = (iHashCode2 + (tabHeaderUiState == null ? 0 : tabHeaderUiState.hashCode())) * 31;
        MyTicketsHeaderUiState myTicketsHeaderUiState = this.f;
        int iHashCode4 = (iHashCode3 + (myTicketsHeaderUiState == null ? 0 : myTicketsHeaderUiState.hashCode())) * 31;
        MyTicketsHeaderUiState myTicketsHeaderUiState2 = this.g;
        int iHashCode5 = (this.h.hashCode() + ((iHashCode4 + (myTicketsHeaderUiState2 == null ? 0 : myTicketsHeaderUiState2.hashCode())) * 31)) * 31;
        EmptyScreenUiState emptyScreenUiState = this.i;
        int iHashCode6 = (iHashCode5 + (emptyScreenUiState == null ? 0 : emptyScreenUiState.hashCode())) * 31;
        EmptyScreenUiState emptyScreenUiState2 = this.j;
        int iHashCode7 = (this.k.hashCode() + ((iHashCode6 + (emptyScreenUiState2 == null ? 0 : emptyScreenUiState2.hashCode())) * 31)) * 31;
        ProductReclaimUiState productReclaimUiState = this.l;
        int iHashCode8 = (iHashCode7 + (productReclaimUiState == null ? 0 : productReclaimUiState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.m;
        int iHashCode9 = (((iHashCode8 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.o;
        int iHashCode10 = (iHashCode9 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState2 = this.p;
        int iHashCode11 = (iHashCode10 + (confirmationDialogUiState2 == null ? 0 : confirmationDialogUiState2.hashCode())) * 31;
        TicketsFloatingButtonContainerUiState ticketsFloatingButtonContainerUiState = this.q;
        int iHashCode12 = (iHashCode11 + (ticketsFloatingButtonContainerUiState == null ? 0 : ticketsFloatingButtonContainerUiState.hashCode())) * 31;
        MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState = this.r;
        int iHashCode13 = (iHashCode12 + (myTicketsLoginNudgeUIState == null ? 0 : myTicketsLoginNudgeUIState.hashCode())) * 31;
        List list = this.s;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.t;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.u;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.v;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        DividerUIState dividerUIState = this.w;
        int iHashCode18 = (iHashCode17 + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        DividerUIState dividerUIState2 = this.x;
        int iHashCode19 = (iHashCode18 + (dividerUIState2 == null ? 0 : dividerUIState2.hashCode())) * 31;
        DividerUIState dividerUIState3 = this.y;
        int iHashCode20 = (iHashCode19 + (dividerUIState3 == null ? 0 : dividerUIState3.hashCode())) * 31;
        ContactSupportUIState contactSupportUIState = this.z;
        int iHashCode21 = (iHashCode20 + (contactSupportUIState == null ? 0 : contactSupportUIState.hashCode())) * 31;
        HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen = this.A;
        return iHashCode21 + (myTicketsScreen != null ? myTicketsScreen.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTicketsViewState(spec=");
        sb.append(this.f11133a);
        sb.append(", layoutType=");
        sb.append(this.b);
        sb.append(", notificationTurnOnExplainer=");
        sb.append(this.c);
        sb.append(", isActiveTabSelected=");
        sb.append(this.d);
        sb.append(", tabHeaderUiState=");
        sb.append(this.e);
        sb.append(", ticketsHeaderUiState=");
        sb.append(this.f);
        sb.append(", passesHeaderUiState=");
        sb.append(this.g);
        sb.append(", productTabUiState=");
        sb.append(this.h);
        sb.append(", fullEmptyScreenUiState=");
        sb.append(this.i);
        sb.append(", tabEmptyScreenUiState=");
        sb.append(this.j);
        sb.append(", bottomSheetUiStateType=");
        sb.append(this.k);
        sb.append(", productReclaimUiState=");
        sb.append(this.l);
        sb.append(", confirmationDialogUiState=");
        sb.append(this.m);
        sb.append(", showLoadingShimmer=");
        sb.append(this.n);
        sb.append(", loadingDialogState=");
        sb.append(this.o);
        sb.append(", contactSupportDialogState=");
        sb.append(this.p);
        sb.append(", myTicketFloatingButtonContainerUiState=");
        sb.append(this.q);
        sb.append(", loginNudgeUIState=");
        sb.append(this.r);
        sb.append(", activeTicketUiStateList=");
        dd.o(sb, this.s, ", activePassUiStateList=", this.t, ", expiredTicketUiStateList=");
        dd.o(sb, this.u, ", expiredPassUiStateList=", this.v, ", ticketsSectionDividerState=");
        sb.append(this.w);
        sb.append(", passesSectionDividerState=");
        sb.append(this.x);
        sb.append(", postPassesSectionDividerState=");
        sb.append(this.y);
        sb.append(", contactSupportUIState=");
        sb.append(this.z);
        sb.append(", retainedState=");
        sb.append(this.A);
        sb.append(")");
        return sb.toString();
    }
}
