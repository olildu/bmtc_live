package app.chalo.uistate.text;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/SpecialFeaturesTagTextUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpecialFeaturesTagTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10084a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final ChaloPadding d;

    public SpecialFeaturesTagTextUIState(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, UIShape shape, ChaloPadding chaloPadding) {
        Intrinsics.i(shape, "shape");
        this.f10084a = chaloTextUIState;
        this.b = chaloColorToken;
        this.c = shape;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialFeaturesTagTextUIState)) {
            return false;
        }
        SpecialFeaturesTagTextUIState specialFeaturesTagTextUIState = (SpecialFeaturesTagTextUIState) obj;
        return Intrinsics.d(this.f10084a, specialFeaturesTagTextUIState.f10084a) && Intrinsics.d(this.b, specialFeaturesTagTextUIState.b) && Intrinsics.d(this.c, specialFeaturesTagTextUIState.c) && Intrinsics.d(this.d, specialFeaturesTagTextUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f10084a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SpecialFeaturesTagTextUIState(text=" + this.f10084a + ", background=" + this.b + ", shape=" + this.c + ", padding=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpecialFeaturesTagTextUIState(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, UIShape uIShape, int i) {
        uIShape = (i & 4) != 0 ? UIShape.f1926a : uIShape;
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().c;
        this(chaloTextUIState, chaloColorToken, uIShape, new ChaloPadding(f2, f, f, f2));
    }
}
