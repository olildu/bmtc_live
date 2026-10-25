package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/ExpressSlotIndicatorUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExpressSlotIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7797a;
    public final TextUIState.ChaloTextUIState b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final ChaloPadding e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ExpressSlotIndicatorUIState(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, int i) {
        ImageUIState imageUIState = new ImageUIState(IconType.IC_EXPRESS_INDICATOR, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        TextUIState.ChaloTextUIState chaloTextUIState2 = (i & 2) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.BodySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, UIFontStyle.Italic, (String) null, 6072) : chaloTextUIState;
        ChaloColorToken chaloColorToken2 = (i & 4) != 0 ? ChaloColorToken.SectionDividerColor.f9849a : chaloColorToken;
        UIShape shape = ChaloThemeHelper.d.j;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        Intrinsics.i(shape, "shape");
        this.f7797a = imageUIState;
        this.b = chaloTextUIState2;
        this.c = chaloColorToken2;
        this.d = shape;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressSlotIndicatorUIState)) {
            return false;
        }
        ExpressSlotIndicatorUIState expressSlotIndicatorUIState = (ExpressSlotIndicatorUIState) obj;
        return Intrinsics.d(this.f7797a, expressSlotIndicatorUIState.f7797a) && Intrinsics.d(this.b, expressSlotIndicatorUIState.b) && Intrinsics.d(this.c, expressSlotIndicatorUIState.c) && Intrinsics.d(this.d, expressSlotIndicatorUIState.d) && Intrinsics.d(this.e, expressSlotIndicatorUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + pk0.b(this.d, z40.b(this.c, r30.f(this.b, this.f7797a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("ExpressSlotIndicatorUIState(icon=", this.f7797a, ", text=", this.b, ", backgroundColorToken=");
        sbN.append(this.c);
        sbN.append(", shape=");
        sbN.append(this.d);
        sbN.append(", contentPadding=");
        return py.e(sbN, this.e, ")");
    }
}
