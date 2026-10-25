package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionTimePickerUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSuggestionTimePickerUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f3372a;
    public final UIShape b;
    public final ChaloPadding c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RouteSuggestionTimePickerUISpec() {
        UIShape.Rectangle shape = UIShape.e;
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(shape, "shape");
        this.f3372a = ChaloColorToken.White.f9870a;
        this.b = shape;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSuggestionTimePickerUISpec)) {
            return false;
        }
        RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec = (RouteSuggestionTimePickerUISpec) obj;
        return Intrinsics.d(this.f3372a, routeSuggestionTimePickerUISpec.f3372a) && Intrinsics.d(this.b, routeSuggestionTimePickerUISpec.b) && Intrinsics.d(this.c, routeSuggestionTimePickerUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, this.f3372a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteSuggestionTimePickerUISpec(backgroundColor=");
        sb.append(this.f3372a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", contentPadding=");
        return py.e(sb, this.c, ")");
    }
}
