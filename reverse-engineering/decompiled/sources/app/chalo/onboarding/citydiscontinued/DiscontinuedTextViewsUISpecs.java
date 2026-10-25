package app.chalo.onboarding.citydiscontinued;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/DiscontinuedTextViewsUISpecs;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DiscontinuedTextViewsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f6560a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public DiscontinuedTextViewsUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().j, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        this.f6560a = UiAlignment.Horizontal.Center.f9884a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscontinuedTextViewsUISpecs)) {
            return false;
        }
        DiscontinuedTextViewsUISpecs discontinuedTextViewsUISpecs = (DiscontinuedTextViewsUISpecs) obj;
        return Intrinsics.d(this.f6560a, discontinuedTextViewsUISpecs.f6560a) && Intrinsics.d(this.b, discontinuedTextViewsUISpecs.b) && Intrinsics.d(this.c, discontinuedTextViewsUISpecs.c) && Intrinsics.d(this.d, discontinuedTextViewsUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f6560a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DiscontinuedTextViewsUISpecs(horizontalAlignment=" + this.f6560a + ", paddingAboveTitle=" + this.b + ", paddingAboveDescription=" + this.c + ", paddingAboveSupportingText=" + this.d + ")";
    }
}
