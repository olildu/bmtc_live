package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/DetailsStepProgressIndicatorUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DetailsStepProgressIndicatorUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4117a = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
    public final UiAlignment.Vertical b = UiAlignment.Vertical.Center.f9888a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsStepProgressIndicatorUISpecs)) {
            return false;
        }
        DetailsStepProgressIndicatorUISpecs detailsStepProgressIndicatorUISpecs = (DetailsStepProgressIndicatorUISpecs) obj;
        return Intrinsics.d(this.f4117a, detailsStepProgressIndicatorUISpecs.f4117a) && Intrinsics.d(this.b, detailsStepProgressIndicatorUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4117a.hashCode() * 31);
    }

    public final String toString() {
        return "DetailsStepProgressIndicatorUISpecs(horizontalPadding=" + this.f4117a + ", verticalAlignment=" + this.b + ")";
    }
}
