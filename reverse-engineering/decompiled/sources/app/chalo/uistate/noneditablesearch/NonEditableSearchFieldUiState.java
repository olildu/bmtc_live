package app.chalo.uistate.noneditablesearch;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/noneditablesearch/NonEditableSearchFieldUiState;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NonEditableSearchFieldUiState {
    public static final Companion e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NonEditableSearchFieldUiSpec f10061a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/noneditablesearch/NonEditableSearchFieldUiState$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static NonEditableSearchFieldUiState a(String placeHolderText, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            Intrinsics.i(placeHolderText, "placeHolderText");
            return new NonEditableSearchFieldUiState(new TextUIState.ChaloTextUIState(placeHolderText, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), uiEventHandler$Companion$fromLambda$1);
        }
    }

    public NonEditableSearchFieldUiState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        NonEditableSearchFieldUiSpec nonEditableSearchFieldUiSpec = new NonEditableSearchFieldUiSpec();
        ImageUIState imageUIState = new ImageUIState(IconType.SEARCH, (String) null, ChaloColorToken.ShadyGray.f9851a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        this.f10061a = nonEditableSearchFieldUiSpec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonEditableSearchFieldUiState)) {
            return false;
        }
        NonEditableSearchFieldUiState nonEditableSearchFieldUiState = (NonEditableSearchFieldUiState) obj;
        return Intrinsics.d(this.f10061a, nonEditableSearchFieldUiState.f10061a) && Intrinsics.d(this.b, nonEditableSearchFieldUiState.b) && Intrinsics.d(this.c, nonEditableSearchFieldUiState.c) && Intrinsics.d(this.d, nonEditableSearchFieldUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f10061a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "NonEditableSearchFieldUiState(spec=" + this.f10061a + ", searchIcon=" + this.b + ", placeholderText=" + this.c + ", clickHandler=" + this.d + ")";
    }
}
