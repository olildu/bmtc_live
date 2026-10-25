package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/FullScreenImageUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FullScreenImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f8752a;
    public final ImageUIState b;
    public final ImageUIState c;
    public final ChaloPadding d;

    public FullScreenImageUIState(ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, ImageUIState imageUIState2) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        this.f8752a = imageUrlUIState;
        this.b = imageUIState;
        this.c = imageUIState2;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullScreenImageUIState)) {
            return false;
        }
        FullScreenImageUIState fullScreenImageUIState = (FullScreenImageUIState) obj;
        return Intrinsics.d(this.f8752a, fullScreenImageUIState.f8752a) && Intrinsics.d(this.b, fullScreenImageUIState.b) && Intrinsics.d(this.c, fullScreenImageUIState.c) && Intrinsics.d(this.d, fullScreenImageUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.e(this.c, r30.e(this.b, this.f8752a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FullScreenImageUIState(imageUrl=" + this.f8752a + ", dismissBtnUIState=" + this.b + ", placeHolderImageUIState=" + this.c + ", dismissBtnPadding=" + this.d + ")";
    }
}
