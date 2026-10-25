package app.chalo.onboarding.citydiscontinued;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedUISpecs;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityDiscontinuedUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f6557a;
    public final UiArrangement.HorizontalOrVertical b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public CityDiscontinuedUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().l, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        this.f6557a = UiAlignment.Horizontal.Center.f9884a;
        this.b = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.c = chaloPadding;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityDiscontinuedUISpecs)) {
            return false;
        }
        CityDiscontinuedUISpecs cityDiscontinuedUISpecs = (CityDiscontinuedUISpecs) obj;
        return Intrinsics.d(this.f6557a, cityDiscontinuedUISpecs.f6557a) && Intrinsics.d(this.b, cityDiscontinuedUISpecs.b) && Intrinsics.d(this.c, cityDiscontinuedUISpecs.c) && Intrinsics.d(this.d, cityDiscontinuedUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, (this.b.hashCode() + (this.f6557a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CityDiscontinuedUISpecs(horizontalAlignment=" + this.f6557a + ", verticalArrangement=" + this.b + ", horizontalPadding=" + this.c + ", paddingAboveBtn=" + this.d + ")";
    }
}
