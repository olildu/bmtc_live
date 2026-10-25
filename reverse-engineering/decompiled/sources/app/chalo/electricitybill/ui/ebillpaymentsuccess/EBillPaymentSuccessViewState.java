package app.chalo.electricitybill.ui.ebillpaymentsuccess;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentSuccessViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillPaymentSuccessUISpecs f2587a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ButtonUIState e;
    public final ButtonUIState f;

    public EBillPaymentSuccessViewState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState message, ButtonUIState okayButton, ButtonUIState buttonUIState) {
        EBillPaymentSuccessUISpecs eBillPaymentSuccessUISpecs = new EBillPaymentSuccessUISpecs();
        ImageUIState imageUIState = new ImageUIState(IconType.ACKNOWLEDGEMENT_PASS_TICKET, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().o), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        Intrinsics.i(title, "title");
        Intrinsics.i(message, "message");
        Intrinsics.i(okayButton, "okayButton");
        this.f2587a = eBillPaymentSuccessUISpecs;
        this.b = imageUIState;
        this.c = title;
        this.d = message;
        this.e = okayButton;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentSuccessViewState)) {
            return false;
        }
        EBillPaymentSuccessViewState eBillPaymentSuccessViewState = (EBillPaymentSuccessViewState) obj;
        return Intrinsics.d(this.f2587a, eBillPaymentSuccessViewState.f2587a) && Intrinsics.d(this.b, eBillPaymentSuccessViewState.b) && Intrinsics.d(this.c, eBillPaymentSuccessViewState.c) && Intrinsics.d(this.d, eBillPaymentSuccessViewState.d) && Intrinsics.d(this.e, eBillPaymentSuccessViewState.e) && Intrinsics.d(this.f, eBillPaymentSuccessViewState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.d(this.e, r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f2587a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EBillPaymentSuccessViewState(specs=");
        sb.append(this.f2587a);
        sb.append(", successImg=");
        sb.append(this.b);
        sb.append(", title=");
        r30.p(sb, this.c, ", message=", this.d, ", okayButton=");
        sb.append(this.e);
        sb.append(", viewInvoiceButton=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
