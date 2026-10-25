package app.chalo.onboarding.languageselection;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageGridUiState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageGridUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6645a;
    public final LanguageGridSpec b;

    public LanguageGridUiState(int i, ArrayList arrayList) {
        List gridItemUiState = arrayList;
        gridItemUiState = (i & 1) != 0 ? EmptyList.f17557a : gridItemUiState;
        LanguageGridSpec languageGridSpec = new LanguageGridSpec();
        Intrinsics.i(gridItemUiState, "gridItemUiState");
        this.f6645a = gridItemUiState;
        this.b = languageGridSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageGridUiState)) {
            return false;
        }
        LanguageGridUiState languageGridUiState = (LanguageGridUiState) obj;
        return Intrinsics.d(this.f6645a, languageGridUiState.f6645a) && Intrinsics.d(this.b, languageGridUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6645a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageGridUiState(gridItemUiState=" + this.f6645a + ", gridUiSpec=" + this.b + ")";
    }
}
