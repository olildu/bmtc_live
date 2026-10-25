package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import defpackage.dd;
import defpackage.nf1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ChaloWidgetCardUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloWidgetCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloWidgetCardSpec f3466a;
    public final ImageUrlUIState b;
    public final ImageUIState c;
    public final TextWithBackgroundUiState d;
    public final List e;
    public final List f;
    public final UiEventHandler$Companion$fromLambda$1 g;

    public ChaloWidgetCardUiState(ChaloWidgetCardSpec chaloWidgetCardSpec, ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, TextWithBackgroundUiState textWithBackgroundUiState, ArrayList arrayList, ArrayList arrayList2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f3466a = chaloWidgetCardSpec;
        this.b = imageUrlUIState;
        this.c = imageUIState;
        this.d = textWithBackgroundUiState;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloWidgetCardUiState)) {
            return false;
        }
        ChaloWidgetCardUiState chaloWidgetCardUiState = (ChaloWidgetCardUiState) obj;
        return this.f3466a.equals(chaloWidgetCardUiState.f3466a) && Intrinsics.d(this.b, chaloWidgetCardUiState.b) && Intrinsics.d(this.c, chaloWidgetCardUiState.c) && Intrinsics.d(this.d, chaloWidgetCardUiState.d) && Intrinsics.d(this.e, chaloWidgetCardUiState.e) && Intrinsics.d(this.f, chaloWidgetCardUiState.f) && this.g.equals(chaloWidgetCardUiState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f3466a.hashCode() * 31;
        ImageUrlUIState imageUrlUIState = this.b;
        int iHashCode2 = (iHashCode + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.c;
        int iHashCode3 = (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextWithBackgroundUiState textWithBackgroundUiState = this.d;
        int iHashCode4 = (iHashCode3 + (textWithBackgroundUiState == null ? 0 : textWithBackgroundUiState.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return this.g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloWidgetCardUiState(spec=");
        sb.append(this.f3466a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", fallbackImageUIState=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", descriptionList=");
        dd.o(sb, this.e, ", tagList=", this.f, ", eventHandler=");
        return nf1.n(sb, this.g, ")");
    }
}
