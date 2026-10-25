package app.chalo.home.ui.history.uistate;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ProductReclaimUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductReclaimUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductReclaimSpec f3478a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ButtonUIState e;

    public ProductReclaimUiState(ButtonUIState buttonUIState, TextUIState.ChaloTextUIState headerText, TextUIState.ChaloTextUIState descriptionText) {
        ProductReclaimSpec productReclaimSpec = new ProductReclaimSpec();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_DAILY_LIMIT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        Intrinsics.i(headerText, "headerText");
        Intrinsics.i(descriptionText, "descriptionText");
        this.f3478a = productReclaimSpec;
        this.b = imageUIState;
        this.c = headerText;
        this.d = descriptionText;
        this.e = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReclaimUiState)) {
            return false;
        }
        ProductReclaimUiState productReclaimUiState = (ProductReclaimUiState) obj;
        return Intrinsics.d(this.f3478a, productReclaimUiState.f3478a) && Intrinsics.d(this.b, productReclaimUiState.b) && Intrinsics.d(this.c, productReclaimUiState.c) && Intrinsics.d(this.d, productReclaimUiState.d) && Intrinsics.d(this.e, productReclaimUiState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f3478a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductReclaimUiState(spec=");
        sb.append(this.f3478a);
        sb.append(", imageUIState=");
        sb.append(this.b);
        sb.append(", headerText=");
        r30.p(sb, this.c, ", descriptionText=", this.d, ", buttonUiState=");
        return hq0.j(sb, this.e, ")");
    }
}
