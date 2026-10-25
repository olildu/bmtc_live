package app.chalo.productbooking.pickstop;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/StopItemUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopItemUiSpecs f8312a = new StopItemUiSpecs();
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final UiEventHandler e;
    public final ImageUIState f;
    public final DividerUIState g;

    public StopItemUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState2, DividerUIState dividerUIState) {
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = uiEventHandler$Companion$fromLambda$1;
        this.f = imageUIState2;
        this.g = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopItemUiState)) {
            return false;
        }
        StopItemUiState stopItemUiState = (StopItemUiState) obj;
        return Intrinsics.d(this.f8312a, stopItemUiState.f8312a) && Intrinsics.d(this.b, stopItemUiState.b) && Intrinsics.d(this.c, stopItemUiState.c) && Intrinsics.d(this.d, stopItemUiState.d) && Intrinsics.d(this.e, stopItemUiState.e) && Intrinsics.d(this.f, stopItemUiState.f) && Intrinsics.d(this.g, stopItemUiState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.e(this.b, this.f8312a.hashCode() * 31, 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode = (this.e.hashCode() + ((iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
        ImageUIState imageUIState = this.f;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.g;
        return iHashCode2 + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopItemUiState(specs=");
        sb.append(this.f8312a);
        sb.append(", img=");
        sb.append(this.b);
        sb.append(", stopName=");
        r30.p(sb, this.c, ", stopAddress=", this.d, ", eventHandler=");
        sb.append(this.e);
        sb.append(", trailingIcon=");
        sb.append(this.f);
        sb.append(", dividerUiState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
