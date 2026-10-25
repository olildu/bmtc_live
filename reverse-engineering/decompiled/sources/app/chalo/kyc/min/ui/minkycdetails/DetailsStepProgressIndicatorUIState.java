package app.chalo.kyc.min.ui.minkycdetails;

import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/DetailsStepProgressIndicatorUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DetailsStepProgressIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DetailsStepProgressIndicatorUISpecs f4118a;
    public final List b;
    public final ProgressBarSpecs c;

    public DetailsStepProgressIndicatorUIState(List stepCircleUIStates) {
        DetailsStepProgressIndicatorUISpecs detailsStepProgressIndicatorUISpecs = new DetailsStepProgressIndicatorUISpecs();
        ProgressBarSpecs progressBarSpecs = new ProgressBarSpecs();
        Intrinsics.i(stepCircleUIStates, "stepCircleUIStates");
        this.f4118a = detailsStepProgressIndicatorUISpecs;
        this.b = stepCircleUIStates;
        this.c = progressBarSpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsStepProgressIndicatorUIState)) {
            return false;
        }
        DetailsStepProgressIndicatorUIState detailsStepProgressIndicatorUIState = (DetailsStepProgressIndicatorUIState) obj;
        return Intrinsics.d(this.f4118a, detailsStepProgressIndicatorUIState.f4118a) && Intrinsics.d(this.b, detailsStepProgressIndicatorUIState.b) && Intrinsics.d(this.c, detailsStepProgressIndicatorUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f4118a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DetailsStepProgressIndicatorUIState(specs=" + this.f4118a + ", stepCircleUIStates=" + this.b + ", progressBarSpecs=" + this.c + ")";
    }
}
