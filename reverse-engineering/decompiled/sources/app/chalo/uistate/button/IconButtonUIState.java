package app.chalo.uistate.button;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/button/IconButtonUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IconButtonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f9923a;
    public final UiEventHandler b;
    public final UIShape c;
    public final ChaloColorToken d;
    public final float e;

    public IconButtonUIState(ImageUIState img, UiEventHandler eventHandler, UIShape shape, ChaloColorToken backgroundColor, float f) {
        Intrinsics.i(img, "img");
        Intrinsics.i(eventHandler, "eventHandler");
        Intrinsics.i(shape, "shape");
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f9923a = img;
        this.b = eventHandler;
        this.c = shape;
        this.d = backgroundColor;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconButtonUIState)) {
            return false;
        }
        IconButtonUIState iconButtonUIState = (IconButtonUIState) obj;
        return Intrinsics.d(this.f9923a, iconButtonUIState.f9923a) && Intrinsics.d(this.b, iconButtonUIState.b) && Intrinsics.d(this.c, iconButtonUIState.c) && Intrinsics.d(this.d, iconButtonUIState.d) && Dp.m7283equalsimpl0(this.e, iconButtonUIState.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + z40.b(this.d, pk0.b(this.c, (this.b.hashCode() + (this.f9923a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("IconButtonUIState(img=");
        sb.append(this.f9923a);
        sb.append(", eventHandler=");
        sb.append(this.b);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", elevation=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }

    public IconButtonUIState(ImageUIState imageUIState, UiEventHandler uiEventHandler, ChaloColorToken chaloColorToken, float f, int i) {
        this(imageUIState, uiEventHandler, UIShape.Circle.p, (i & 8) != 0 ? ChaloColorToken.White.f9870a : chaloColorToken, (i & 16) != 0 ? ChaloThemeHelper.a().c : f);
    }
}
