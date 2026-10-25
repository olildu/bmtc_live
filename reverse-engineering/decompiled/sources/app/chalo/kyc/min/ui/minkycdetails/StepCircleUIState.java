package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/StepCircleUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepCircleUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepCircleUISpecs f4135a;
    public final TextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public StepCircleUIState(StepCircleUISpecs specs, TextUIState stepNumberTextUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(stepNumberTextUIState, "stepNumberTextUIState");
        this.f4135a = specs;
        this.b = stepNumberTextUIState;
        this.c = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepCircleUIState)) {
            return false;
        }
        StepCircleUIState stepCircleUIState = (StepCircleUIState) obj;
        return Intrinsics.d(this.f4135a, stepCircleUIState.f4135a) && Intrinsics.d(this.b, stepCircleUIState.b) && this.c.equals(stepCircleUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.c(this.b, this.f4135a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepCircleUIState(specs=");
        sb.append(this.f4135a);
        sb.append(", stepNumberTextUIState=");
        sb.append(this.b);
        sb.append(", titleTextUIState=");
        return py.f(sb, this.c, ")");
    }
}
