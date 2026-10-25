package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.UISize;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/SeeMoreIconUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeeMoreIconUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f3481a;
    public final UIShape b;
    public final UISize c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SeeMoreIconUISpec() {
        UIShape.Circle circle = UIShape.Circle.p;
        UISize uISize = new UISize(ChaloThemeHelper.a().h);
        this.f3481a = ChaloColorToken.Orange2.f9830a;
        this.b = circle;
        this.c = uISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeeMoreIconUISpec)) {
            return false;
        }
        SeeMoreIconUISpec seeMoreIconUISpec = (SeeMoreIconUISpec) obj;
        return Intrinsics.d(this.f3481a, seeMoreIconUISpec.f3481a) && Intrinsics.d(this.b, seeMoreIconUISpec.b) && Intrinsics.d(this.c, seeMoreIconUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, this.f3481a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SeeMoreIconUISpec(backgroundColor=" + this.f3481a + ", shape=" + this.b + ", size=" + this.c + ")";
    }
}
