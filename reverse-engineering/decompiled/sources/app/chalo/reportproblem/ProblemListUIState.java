package app.chalo.reportproblem;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ProblemListUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProblemListUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProblemListUISpecs f9015a;
    public final TextUIState.ChaloTextUIState b;
    public final ArrayList c;
    public final DividerUIState d;

    public ProblemListUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList) {
        ProblemListUISpecs problemListUISpecs = new ProblemListUISpecs();
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        this.f9015a = problemListUISpecs;
        this.b = chaloTextUIState;
        this.c = arrayList;
        this.d = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProblemListUIState)) {
            return false;
        }
        ProblemListUIState problemListUIState = (ProblemListUIState) obj;
        return Intrinsics.d(this.f9015a, problemListUIState.f9015a) && Intrinsics.d(this.b, problemListUIState.b) && Intrinsics.d(this.c, problemListUIState.c) && Intrinsics.d(this.d, problemListUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xs.e(this.c, r30.f(this.b, this.f9015a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProblemListUIState(specs=" + this.f9015a + ", categoryTitle=" + this.b + ", problemList=" + this.c + ", itemDivider=" + this.d + ")";
    }
}
