package app.chalo.productbooking.pickroutelocation;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/NoRoutesUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoRoutesUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoRoutesUiSpecs f8274a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;

    public NoRoutesUiState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState) {
        NoRoutesUiSpecs noRoutesUiSpecs = new NoRoutesUiSpecs();
        ImageUIState imageUIState = new ImageUIState(IconType.UNIVERSAL_NO_RESULTS_FOUND, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        Intrinsics.i(title, "title");
        this.f8274a = noRoutesUiSpecs;
        this.b = title;
        this.c = chaloTextUIState;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoRoutesUiState)) {
            return false;
        }
        NoRoutesUiState noRoutesUiState = (NoRoutesUiState) obj;
        return Intrinsics.d(this.f8274a, noRoutesUiState.f8274a) && Intrinsics.d(this.b, noRoutesUiState.b) && Intrinsics.d(this.c, noRoutesUiState.c) && Intrinsics.d(this.d, noRoutesUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f8274a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "NoRoutesUiState(specs=" + this.f8274a + ", title=" + this.b + ", message=" + this.c + ", image=" + this.d + ")";
    }
}
