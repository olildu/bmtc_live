package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/SwitchToBLECalloutUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchToBLECalloutUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchToBLECalloutUISpecs f10656a;
    public final ImageUIState b;
    public final TextUIState c;
    public final TextWithLeftAndRightIconUIState d;
    public final UiEventHandler$Companion$fromLambda$1 e;

    public SwitchToBLECalloutUIState(TextUIState textUIState, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        SwitchToBLECalloutUISpecs switchToBLECalloutUISpecs = new SwitchToBLECalloutUISpecs();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_BUS, (String) null, ChaloColorToken.AlmostBlackColor.f9756a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        Intrinsics.i(textUIState, "textUIState");
        this.f10656a = switchToBLECalloutUISpecs;
        this.b = imageUIState;
        this.c = textUIState;
        this.d = textWithLeftAndRightIconUIState;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchToBLECalloutUIState)) {
            return false;
        }
        SwitchToBLECalloutUIState switchToBLECalloutUIState = (SwitchToBLECalloutUIState) obj;
        return Intrinsics.d(this.f10656a, switchToBLECalloutUIState.f10656a) && Intrinsics.d(this.b, switchToBLECalloutUIState.b) && Intrinsics.d(this.c, switchToBLECalloutUIState.c) && Intrinsics.d(this.d, switchToBLECalloutUIState.d) && Intrinsics.d(this.e, switchToBLECalloutUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + pk0.c(this.c, r30.e(this.b, this.f10656a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchToBLECalloutUIState(specs=");
        sb.append(this.f10656a);
        sb.append(", busIcon=");
        sb.append(this.b);
        sb.append(", textUIState=");
        sb.append(this.c);
        sb.append(", tapHereTextWithIconUIState=");
        sb.append(this.d);
        sb.append(", tapHereTextUIEventHandler=");
        return nf1.n(sb, this.e, ")");
    }
}
