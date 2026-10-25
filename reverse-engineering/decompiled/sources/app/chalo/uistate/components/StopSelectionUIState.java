package app.chalo.uistate.components;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/StopSelectionUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopSelectionUISpec f9954a;
    public final TextUIState b;
    public final TextUIState.StyledTextUIState c;
    public final ImageUIState d;
    public final ImageUIState e;
    public final UiEventHandler$Companion$fromLambda$1 f;

    public StopSelectionUIState(StopSelectionUISpec stopSelectionUISpec, TextUIState textUIState, TextUIState.StyledTextUIState styledTextUIState, ImageUIState imageUIState, ImageUIState imageUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        stopSelectionUISpec = (i & 1) != 0 ? new StopSelectionUISpec(null, 127) : stopSelectionUISpec;
        imageUIState = (i & 8) != 0 ? null : imageUIState;
        imageUIState2 = (i & 16) != 0 ? null : imageUIState2;
        this.f9954a = stopSelectionUISpec;
        this.b = textUIState;
        this.c = styledTextUIState;
        this.d = imageUIState;
        this.e = imageUIState2;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopSelectionUIState)) {
            return false;
        }
        StopSelectionUIState stopSelectionUIState = (StopSelectionUIState) obj;
        return Intrinsics.d(this.f9954a, stopSelectionUIState.f9954a) && Intrinsics.d(this.b, stopSelectionUIState.b) && Intrinsics.d(this.c, stopSelectionUIState.c) && Intrinsics.d(this.d, stopSelectionUIState.d) && Intrinsics.d(this.e, stopSelectionUIState.e) && Intrinsics.d(this.f, stopSelectionUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f9954a.hashCode() * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState.StyledTextUIState styledTextUIState = this.c;
        int iHashCode3 = (iHashCode2 + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.d;
        int iHashCode4 = (iHashCode3 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        ImageUIState imageUIState2 = this.e;
        int iHashCode5 = (iHashCode4 + (imageUIState2 == null ? 0 : imageUIState2.hashCode())) * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.f;
        return iHashCode5 + (uiEventHandler$Companion$fromLambda$1 != null ? uiEventHandler$Companion$fromLambda$1.hashCode() : 0);
    }

    public final String toString() {
        return "StopSelectionUIState(uiSpec=" + this.f9954a + ", placeholder=" + this.b + ", stopName=" + this.c + ", trailingImage=" + this.d + ", leadingImage=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
