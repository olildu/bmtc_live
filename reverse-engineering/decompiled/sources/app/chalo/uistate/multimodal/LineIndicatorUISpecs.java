package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.UISize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/LineIndicatorUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineIndicatorUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f10041a;
    public final UISize b;

    public LineIndicatorUISpecs() {
        UIShape.Circle circle = UIShape.Circle.p;
        UISize uISize = new UISize(ChaloThemeHelper.a().f);
        this.f10041a = circle;
        this.b = uISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineIndicatorUISpecs)) {
            return false;
        }
        LineIndicatorUISpecs lineIndicatorUISpecs = (LineIndicatorUISpecs) obj;
        return Intrinsics.d(this.f10041a, lineIndicatorUISpecs.f10041a) && Intrinsics.d(this.b, lineIndicatorUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10041a.hashCode() * 31);
    }

    public final String toString() {
        return "LineIndicatorUISpecs(lineIndicatorShape=" + this.f10041a + ", lineIndicatorSize=" + this.b + ")";
    }
}
