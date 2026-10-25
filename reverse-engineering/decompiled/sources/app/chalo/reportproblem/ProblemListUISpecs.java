package app.chalo.reportproblem;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ProblemListUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProblemListUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9014a;
    public final ChaloPadding b;
    public final ChaloColorToken c;

    public ProblemListUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        this.f9014a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.NewActivityColor.f9827a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProblemListUISpecs)) {
            return false;
        }
        ProblemListUISpecs problemListUISpecs = (ProblemListUISpecs) obj;
        return Intrinsics.d(this.f9014a, problemListUISpecs.f9014a) && Intrinsics.d(this.b, problemListUISpecs.b) && Intrinsics.d(this.c, problemListUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f9014a.hashCode() * 31, 31);
    }

    public final String toString() {
        return pk0.j(pk0.m("ProblemListUISpecs(titlePadding=", this.f9014a, ", descPadding=", this.b, ", titleBackground="), this.c, ")");
    }
}
