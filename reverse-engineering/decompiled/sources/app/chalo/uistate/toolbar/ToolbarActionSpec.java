package app.chalo.uistate.toolbar;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarActionSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarActionSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10115a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final BorderUISpec d;

    public ToolbarActionSpec(ChaloPadding paddingInsideBorder, ChaloColorToken chaloColorToken, UIShape backgroundShape, BorderUISpec border) {
        Intrinsics.i(paddingInsideBorder, "paddingInsideBorder");
        Intrinsics.i(backgroundShape, "backgroundShape");
        Intrinsics.i(border, "border");
        this.f10115a = paddingInsideBorder;
        this.b = chaloColorToken;
        this.c = backgroundShape;
        this.d = border;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarActionSpec)) {
            return false;
        }
        ToolbarActionSpec toolbarActionSpec = (ToolbarActionSpec) obj;
        return Intrinsics.d(this.f10115a, toolbarActionSpec.f10115a) && Intrinsics.d(this.b, toolbarActionSpec.b) && Intrinsics.d(this.c, toolbarActionSpec.c) && Intrinsics.d(this.d, toolbarActionSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f10115a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f10115a, this.b, "ToolbarActionSpec(paddingInsideBorder=", ", backgroundColor=", ", backgroundShape=");
        sbL.append(this.c);
        sbL.append(", border=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }

    public ToolbarActionSpec(ChaloPadding chaloPadding, UIShape uIShape, BorderUISpec borderUISpec, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().f1916a;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        uIShape = (i & 4) != 0 ? UIShape.f1926a : uIShape;
        int i2 = i & 8;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        this(chaloPadding, transparent, uIShape, i2 != 0 ? new BorderUISpec(ChaloThemeHelper.a().f1916a, transparent, UIShape.f1926a) : borderUISpec);
    }
}
