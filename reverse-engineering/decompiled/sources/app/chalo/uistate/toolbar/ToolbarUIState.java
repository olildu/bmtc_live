package app.chalo.uistate.toolbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
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
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarUIState;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarUIState {
    public static final Companion i = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUiSpecs f10119a;
    public final TextUIState b;
    public final ImageUIState c;
    public final UiEventHandler d;
    public final List e;
    public final float f;
    public final DividerUIState g;
    public final ChaloColorToken h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarUIState$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static TextUIState.ChaloTextUIState a(Companion companion, String title) {
            companion.getClass();
            Intrinsics.i(title, "title");
            return new TextUIState.ChaloTextUIState(title, UITextStyle.DisplaySmall, (ChaloColorToken) null, Integer.MAX_VALUE, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8180);
        }
    }

    public ToolbarUIState(ToolbarUiSpecs specs, TextUIState textUIState, ImageUIState imageUIState, UiEventHandler uiEventHandler, List list, float f, DividerUIState dividerUIState, ChaloColorToken chaloColorToken, int i2) {
        specs = (i2 & 1) != 0 ? new ToolbarUiSpecs(null, null, 0.0f, 31) : specs;
        TextUIState textUIState2 = (i2 & 2) != 0 ? null : textUIState;
        ImageUIState imageUIState2 = (i2 & 4) != 0 ? new ImageUIState(IconType.IC_ARROW_BACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : imageUIState;
        UiEventHandler uiEventHandler2 = (i2 & 8) != 0 ? null : uiEventHandler;
        List actions = (i2 & 16) != 0 ? EmptyList.f17557a : list;
        float f2 = (i2 & 32) != 0 ? ChaloThemeHelper.b().c : f;
        DividerUIState dividerUIState2 = (i2 & 64) == 0 ? dividerUIState : null;
        ChaloColorToken backgroundColor = (i2 & 128) != 0 ? ChaloColorToken.White.f9870a : chaloColorToken;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(actions, "actions");
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f10119a = specs;
        this.b = textUIState2;
        this.c = imageUIState2;
        this.d = uiEventHandler2;
        this.e = actions;
        this.f = f2;
        this.g = dividerUIState2;
        this.h = backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarUIState)) {
            return false;
        }
        ToolbarUIState toolbarUIState = (ToolbarUIState) obj;
        return Intrinsics.d(this.f10119a, toolbarUIState.f10119a) && Intrinsics.d(this.b, toolbarUIState.b) && Intrinsics.d(this.c, toolbarUIState.c) && Intrinsics.d(this.d, toolbarUIState.d) && Intrinsics.d(this.e, toolbarUIState.e) && Dp.m7283equalsimpl0(this.f, toolbarUIState.f) && Intrinsics.d(this.g, toolbarUIState.g) && Intrinsics.d(this.h, toolbarUIState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f10119a.hashCode() * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.c;
        int iHashCode3 = (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.d;
        int iA = uf0.a(this.f, r30.b((iHashCode3 + (uiEventHandler == null ? 0 : uiEventHandler.hashCode())) * 31, 31, this.e), 31);
        DividerUIState dividerUIState = this.g;
        return this.h.hashCode() + ((iA + (dividerUIState != null ? dividerUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("ToolbarUIState(specs=");
        sb.append(this.f10119a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", navigationIcon=");
        sb.append(this.c);
        sb.append(", navIconEventHandler=");
        sb.append(this.d);
        sb.append(", actions=");
        cb0.s(", elevation=", strM7289toStringimpl, ", dividerState=", sb, this.e);
        sb.append(this.g);
        sb.append(", backgroundColor=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
