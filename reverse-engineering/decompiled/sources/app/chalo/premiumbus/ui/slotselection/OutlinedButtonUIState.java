package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloUIShape;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.gf;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/OutlinedButtonUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OutlinedButtonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7819a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler d;
    public final BorderUIState e;
    public final ChaloColorToken f;
    public final UIShape g;

    public OutlinedButtonUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        TextUIState.ChaloTextUIState chaloTextUIState2 = (i & 2) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : chaloTextUIState;
        ImageUIState imageUIState2 = (i & 4) != 0 ? null : imageUIState;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = (i & 8) == 0 ? uiEventHandler$Companion$fromLambda$1 : null;
        float f2 = ChaloThemeHelper.a().b;
        ChaloUIShape chaloUIShape = ChaloThemeHelper.d;
        BorderUIState borderUIState = new BorderUIState(f2, ChaloColorToken.LightGray.f9814a, chaloUIShape.b);
        UIShape shape = chaloUIShape.b;
        Intrinsics.i(shape, "shape");
        this.f7819a = chaloPadding;
        this.b = chaloTextUIState2;
        this.c = imageUIState2;
        this.d = uiEventHandler$Companion$fromLambda$2;
        this.e = borderUIState;
        this.f = ChaloColorToken.White.f9870a;
        this.g = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutlinedButtonUIState)) {
            return false;
        }
        OutlinedButtonUIState outlinedButtonUIState = (OutlinedButtonUIState) obj;
        return Intrinsics.d(this.f7819a, outlinedButtonUIState.f7819a) && Intrinsics.d(this.b, outlinedButtonUIState.b) && Intrinsics.d(this.c, outlinedButtonUIState.c) && Intrinsics.d(this.d, outlinedButtonUIState.d) && Intrinsics.d(this.e, outlinedButtonUIState.e) && Intrinsics.d(this.f, outlinedButtonUIState.f) && Intrinsics.d(this.g, outlinedButtonUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7819a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        int iHashCode = (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.d;
        return this.g.hashCode() + z40.b(this.f, (this.e.hashCode() + ((iHashCode + (uiEventHandler != null ? uiEventHandler.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutlinedButtonUIState(cardPadding=");
        sb.append(this.f7819a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", borderUIState=");
        sb.append(this.e);
        sb.append(", backgroundColor=");
        sb.append(this.f);
        sb.append(", shape=");
        return gf.j(sb, this.g, ")");
    }
}
