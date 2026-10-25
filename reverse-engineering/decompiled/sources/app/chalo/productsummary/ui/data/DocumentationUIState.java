package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUrlUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/DocumentationUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f8750a;
    public final BorderUISpec b;

    public DocumentationUIState(ImageUrlUIState imageUrlUIState) {
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().c, ChaloColorToken.SectionDividerColor.f9849a, UIShape.d);
        this.f8750a = imageUrlUIState;
        this.b = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentationUIState)) {
            return false;
        }
        DocumentationUIState documentationUIState = (DocumentationUIState) obj;
        return Intrinsics.d(this.f8750a, documentationUIState.f8750a) && Intrinsics.d(this.b, documentationUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8750a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentationUIState(documentImage=" + this.f8750a + ", documentBorderUISpec=" + this.b + ")";
    }
}
