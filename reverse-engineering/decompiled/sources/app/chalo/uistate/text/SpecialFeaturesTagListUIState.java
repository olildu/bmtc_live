package app.chalo.uistate.text;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/SpecialFeaturesTagListUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpecialFeaturesTagListUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10083a;
    public final float b;

    public SpecialFeaturesTagListUIState(List tags, float f) {
        Intrinsics.i(tags, "tags");
        this.f10083a = tags;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialFeaturesTagListUIState)) {
            return false;
        }
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState = (SpecialFeaturesTagListUIState) obj;
        return Intrinsics.d(this.f10083a, specialFeaturesTagListUIState.f10083a) && Dp.m7283equalsimpl0(this.b, specialFeaturesTagListUIState.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f10083a.hashCode() * 31);
    }

    public final String toString() {
        return "SpecialFeaturesTagListUIState(tags=" + this.f10083a + ", spaceAfterEachTag=" + Dp.m7289toStringimpl(this.b) + ")";
    }

    public SpecialFeaturesTagListUIState(List list) {
        this(list, ChaloThemeHelper.a().f);
    }
}
