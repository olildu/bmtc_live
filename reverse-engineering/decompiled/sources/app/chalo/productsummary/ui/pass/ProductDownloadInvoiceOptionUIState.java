package app.chalo.productsummary.ui.pass;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.history.uistate.ImageWithTextUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/ProductDownloadInvoiceOptionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDownloadInvoiceOptionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDownloadInvoiceOptionUISpec f8785a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageWithTextUiState c;
    public final float d;
    public final ChaloPadding e;

    public ProductDownloadInvoiceOptionUIState(ProductDownloadInvoiceOptionUISpec productDownloadInvoiceOptionUISpec, TextUIState.ChaloTextUIState chaloTextUIState, ImageWithTextUiState imageWithTextUiState) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        this.f8785a = productDownloadInvoiceOptionUISpec;
        this.b = chaloTextUIState;
        this.c = imageWithTextUiState;
        this.d = f;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDownloadInvoiceOptionUIState)) {
            return false;
        }
        ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState = (ProductDownloadInvoiceOptionUIState) obj;
        return Intrinsics.d(this.f8785a, productDownloadInvoiceOptionUIState.f8785a) && Intrinsics.d(this.b, productDownloadInvoiceOptionUIState.b) && Intrinsics.d(this.c, productDownloadInvoiceOptionUIState.c) && Dp.m7283equalsimpl0(this.d, productDownloadInvoiceOptionUIState.d) && Intrinsics.d(this.e, productDownloadInvoiceOptionUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8785a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ImageWithTextUiState imageWithTextUiState = this.c;
        return this.e.hashCode() + uf0.a(this.d, (iHashCode2 + (imageWithTextUiState != null ? imageWithTextUiState.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("ProductDownloadInvoiceOptionUIState(specs=");
        sb.append(this.f8785a);
        sb.append(", messageTextUIState=");
        sb.append(this.b);
        sb.append(", downloadInvoiceButtonTextUIState=");
        sb.append(this.c);
        sb.append(", spaceBtwMessageAndBtn=");
        sb.append(strM7289toStringimpl);
        sb.append(", contentPadding=");
        return py.e(sb, this.e, ")");
    }
}
