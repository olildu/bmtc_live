package app.chalo.quickpay.ui.tripamount;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickPayTripAmountUIState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPayTripAmountUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPatTripAmountUISpec f8894a;
    public final ToolbarUIState b;
    public final ImageUIState c;
    public final TextUIState d;
    public final TextUIState e;
    public final QuickpayDisclaimerUIState f;
    public final BaseTextFieldUIState g;
    public final TextUIState h;
    public final TextUIState i;
    public final DividerUIState j;
    public final ButtonUIState k;
    public final LoadingDialogUIState l;
    public final QuickpayBottomSheetUIState m;

    public QuickPayTripAmountUIState(ToolbarUIState toolbar, TextUIState.ChaloTextUIState heading, TextUIState.ChaloTextUIState title, QuickpayDisclaimerUIState quickpayDisclaimerUIState, BaseTextFieldUIState enterAmountTextField, TextUIState textUIState, TextUIState.ChaloTextUIState viewQuickPayHistory, DividerUIState endDivider, ButtonUIState nextBtn, LoadingDialogUIState loadingDialogUIState, QuickpayBottomSheetUIState quickpayBottomSheetUIState) {
        QuickPatTripAmountUISpec quickPatTripAmountUISpec = new QuickPatTripAmountUISpec();
        ImageUIState imageUIState = new ImageUIState(IconType.PAY_FOR_TICKET_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(heading, "heading");
        Intrinsics.i(title, "title");
        Intrinsics.i(enterAmountTextField, "enterAmountTextField");
        Intrinsics.i(viewQuickPayHistory, "viewQuickPayHistory");
        Intrinsics.i(endDivider, "endDivider");
        Intrinsics.i(nextBtn, "nextBtn");
        this.f8894a = quickPatTripAmountUISpec;
        this.b = toolbar;
        this.c = imageUIState;
        this.d = heading;
        this.e = title;
        this.f = quickpayDisclaimerUIState;
        this.g = enterAmountTextField;
        this.h = textUIState;
        this.i = viewQuickPayHistory;
        this.j = endDivider;
        this.k = nextBtn;
        this.l = loadingDialogUIState;
        this.m = quickpayBottomSheetUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayTripAmountUIState)) {
            return false;
        }
        QuickPayTripAmountUIState quickPayTripAmountUIState = (QuickPayTripAmountUIState) obj;
        return Intrinsics.d(this.f8894a, quickPayTripAmountUIState.f8894a) && Intrinsics.d(this.b, quickPayTripAmountUIState.b) && Intrinsics.d(this.c, quickPayTripAmountUIState.c) && Intrinsics.d(this.d, quickPayTripAmountUIState.d) && Intrinsics.d(this.e, quickPayTripAmountUIState.e) && Intrinsics.d(this.f, quickPayTripAmountUIState.f) && Intrinsics.d(this.g, quickPayTripAmountUIState.g) && Intrinsics.d(this.h, quickPayTripAmountUIState.h) && Intrinsics.d(this.i, quickPayTripAmountUIState.i) && Intrinsics.d(this.j, quickPayTripAmountUIState.j) && Intrinsics.d(this.k, quickPayTripAmountUIState.k) && Intrinsics.d(this.l, quickPayTripAmountUIState.l) && Intrinsics.d(this.m, quickPayTripAmountUIState.m);
    }

    public final int hashCode() {
        int iC = pk0.c(this.e, pk0.c(this.d, r30.e(this.c, t8.d(this.b, this.f8894a.hashCode() * 31, 31), 31), 31), 31);
        QuickpayDisclaimerUIState quickpayDisclaimerUIState = this.f;
        int iHashCode = (this.g.hashCode() + ((iC + (quickpayDisclaimerUIState == null ? 0 : quickpayDisclaimerUIState.hashCode())) * 31)) * 31;
        TextUIState textUIState = this.h;
        int iD = r30.d(this.k, py.c(this.j, pk0.c(this.i, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31), 31);
        LoadingDialogUIState loadingDialogUIState = this.l;
        int iHashCode2 = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        QuickpayBottomSheetUIState quickpayBottomSheetUIState = this.m;
        return iHashCode2 + (quickpayBottomSheetUIState != null ? quickpayBottomSheetUIState.hashCode() : 0);
    }

    public final String toString() {
        return "QuickPayTripAmountUIState(specs=" + this.f8894a + ", toolbar=" + this.b + ", payForTicketIcon=" + this.c + ", heading=" + this.d + ", title=" + this.e + ", disclaimer=" + this.f + ", enterAmountTextField=" + this.g + ", errorText=" + this.h + ", viewQuickPayHistory=" + this.i + ", endDivider=" + this.j + ", nextBtn=" + this.k + ", loadingDialog=" + this.l + ", bottomSheetUIState=" + this.m + ")";
    }
}
