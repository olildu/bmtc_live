package app.chalo.productbooking.pickstop;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/NoResultUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoResultUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8297a;
    public final ChaloPadding b;
    public final UiAlignment.Horizontal c;

    public NoResultUiState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().r;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        this.f8297a = chaloTextUIState;
        this.b = chaloPadding;
        this.c = UiAlignment.Horizontal.Center.f9884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoResultUiState)) {
            return false;
        }
        NoResultUiState noResultUiState = (NoResultUiState) obj;
        return Intrinsics.d(this.f8297a, noResultUiState.f8297a) && Intrinsics.d(this.b, noResultUiState.b) && Intrinsics.d(this.c, noResultUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f8297a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NoResultUiState(message=" + this.f8297a + ", screenPadding=" + this.b + ", alignment=" + this.c + ")";
    }
}
