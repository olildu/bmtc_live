package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/TextWithBackgroundUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextWithBackgroundUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextWithBackgroundSpec f3488a;
    public final ImageUIState b;
    public final TextWithSpecialFeaturesTagsUIState c;
    public final ImageUIState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TextWithBackgroundUiState(TextWithBackgroundSpec textWithBackgroundSpec, ImageUIState imageUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, ImageUIState imageUIState2) {
        this.f3488a = textWithBackgroundSpec;
        this.b = imageUIState;
        this.c = textWithSpecialFeaturesTagsUIState;
        this.d = imageUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithBackgroundUiState)) {
            return false;
        }
        TextWithBackgroundUiState textWithBackgroundUiState = (TextWithBackgroundUiState) obj;
        return Intrinsics.d(this.f3488a, textWithBackgroundUiState.f3488a) && Intrinsics.d(this.b, textWithBackgroundUiState.b) && Intrinsics.d(this.c, textWithBackgroundUiState.c) && Intrinsics.d(this.d, textWithBackgroundUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3488a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31;
        ImageUIState imageUIState2 = this.d;
        return iHashCode2 + (imageUIState2 != null ? imageUIState2.hashCode() : 0);
    }

    public final String toString() {
        return "TextWithBackgroundUiState(spec=" + this.f3488a + ", leadingImage=" + this.b + ", text=" + this.c + ", trailingImage=" + this.d + ")";
    }
}
