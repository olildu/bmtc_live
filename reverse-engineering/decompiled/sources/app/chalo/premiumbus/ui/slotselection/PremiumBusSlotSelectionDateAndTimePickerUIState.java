package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionDateAndTimePickerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionDateAndTimePickerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7861a;
    public final int b;
    public final String c;
    public final PremiumBusSlotSelectionDateAndTimePickerUISpecs d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final TextUIState.ChaloTextUIState g;
    public final ButtonUIState h;
    public final ButtonUIState i;
    public final ImageUIState j;

    public PremiumBusSlotSelectionDateAndTimePickerUIState(int i, int i2, String amOrPM, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState selectDateText, TextUIState.ChaloTextUIState selectTimeText, ButtonUIState continueBtnUIState, ButtonUIState cancelBtnUIState, ImageUIState imageUIState, int i3) {
        ImageUIState imageUIState2;
        PremiumBusSlotSelectionDateAndTimePickerUISpecs premiumBusSlotSelectionDateAndTimePickerUISpecs = new PremiumBusSlotSelectionDateAndTimePickerUISpecs();
        if ((i3 & 512) != 0) {
            imageUIState2 = new ImageUIState(IconType.IC_RED_CROSS, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.f9897a, 114);
        } else {
            imageUIState2 = imageUIState;
        }
        Intrinsics.i(amOrPM, "amOrPM");
        Intrinsics.i(title, "title");
        Intrinsics.i(selectDateText, "selectDateText");
        Intrinsics.i(selectTimeText, "selectTimeText");
        Intrinsics.i(continueBtnUIState, "continueBtnUIState");
        Intrinsics.i(cancelBtnUIState, "cancelBtnUIState");
        this.f7861a = i;
        this.b = i2;
        this.c = amOrPM;
        this.d = premiumBusSlotSelectionDateAndTimePickerUISpecs;
        this.e = title;
        this.f = selectDateText;
        this.g = selectTimeText;
        this.h = continueBtnUIState;
        this.i = cancelBtnUIState;
        this.j = imageUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionDateAndTimePickerUIState)) {
            return false;
        }
        PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = (PremiumBusSlotSelectionDateAndTimePickerUIState) obj;
        return this.f7861a == premiumBusSlotSelectionDateAndTimePickerUIState.f7861a && this.b == premiumBusSlotSelectionDateAndTimePickerUIState.b && Intrinsics.d(this.c, premiumBusSlotSelectionDateAndTimePickerUIState.c) && Intrinsics.d(this.d, premiumBusSlotSelectionDateAndTimePickerUIState.d) && Intrinsics.d(this.e, premiumBusSlotSelectionDateAndTimePickerUIState.e) && Intrinsics.d(this.f, premiumBusSlotSelectionDateAndTimePickerUIState.f) && Intrinsics.d(this.g, premiumBusSlotSelectionDateAndTimePickerUIState.g) && Intrinsics.d(this.h, premiumBusSlotSelectionDateAndTimePickerUIState.h) && Intrinsics.d(this.i, premiumBusSlotSelectionDateAndTimePickerUIState.i) && Intrinsics.d(this.j, premiumBusSlotSelectionDateAndTimePickerUIState.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + r30.d(this.i, r30.d(this.h, r30.f(this.g, r30.f(this.f, r30.f(this.e, (this.d.hashCode() + nf1.e(((this.f7861a * 31) + this.b) * 31, 31, this.c)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f7861a, this.b, "PremiumBusSlotSelectionDateAndTimePickerUIState(hour=", ", minute=", ", amOrPM=");
        sbS.append(this.c);
        sbS.append(", specs=");
        sbS.append(this.d);
        sbS.append(", title=");
        r30.p(sbS, this.e, ", selectDateText=", this.f, ", selectTimeText=");
        sbS.append(this.g);
        sbS.append(", continueBtnUIState=");
        sbS.append(this.h);
        sbS.append(", cancelBtnUIState=");
        sbS.append(this.i);
        sbS.append(", cancelIcon=");
        sbS.append(this.j);
        sbS.append(")");
        return sbS.toString();
    }
}
