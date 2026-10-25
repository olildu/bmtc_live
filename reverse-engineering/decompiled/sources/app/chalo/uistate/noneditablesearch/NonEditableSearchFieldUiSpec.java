package app.chalo.uistate.noneditablesearch;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/noneditablesearch/NonEditableSearchFieldUiSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NonEditableSearchFieldUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10060a;
    public final UIShape b;
    public final ChaloPadding c;
    public final float d;

    public NonEditableSearchFieldUiSpec() {
        UIShape.Rectangle shape = UIShape.i;
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().g;
        Intrinsics.i(shape, "shape");
        this.f10060a = ChaloColorToken.SectionDividerColor.f9849a;
        this.b = shape;
        this.c = chaloPadding;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonEditableSearchFieldUiSpec)) {
            return false;
        }
        NonEditableSearchFieldUiSpec nonEditableSearchFieldUiSpec = (NonEditableSearchFieldUiSpec) obj;
        return Intrinsics.d(this.f10060a, nonEditableSearchFieldUiSpec.f10060a) && Intrinsics.d(this.b, nonEditableSearchFieldUiSpec.b) && Intrinsics.d(this.c, nonEditableSearchFieldUiSpec.c) && Dp.m7283equalsimpl0(this.d, nonEditableSearchFieldUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + r30.c(this.c, pk0.b(this.b, this.f10060a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "NonEditableSearchFieldUiSpec(backgroundColor=" + this.f10060a + ", shape=" + this.b + ", contentPadding=" + this.c + ", searchIconAndTextSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
