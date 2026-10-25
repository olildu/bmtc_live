package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ImageWithTextUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageWithTextUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageWithTextSpec f3472a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public ImageWithTextUiState(ImageWithTextSpec imageWithTextSpec, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f3472a = imageWithTextSpec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithTextUiState)) {
            return false;
        }
        ImageWithTextUiState imageWithTextUiState = (ImageWithTextUiState) obj;
        return this.f3472a.equals(imageWithTextUiState.f3472a) && Intrinsics.d(this.b, imageWithTextUiState.b) && this.c.equals(imageWithTextUiState.c) && this.d.equals(imageWithTextUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3472a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        return this.d.hashCode() + r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ImageWithTextUiState(spec=" + this.f3472a + ", image=" + this.b + ", text=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
