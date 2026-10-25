package app.chalo.productsummary.ui.pass;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.history.uistate.ImageWithTextSpec;
import app.chalo.home.ui.history.uistate.ImageWithTextUiState;
import app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import defpackage.p80;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassSummaryUIStateFactoryKt {
    public static final ProductDownloadInvoiceOptionUIState a(DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState, Function0 onDownloadInvoice, String messageText, String btnText) {
        Intrinsics.i(downloadInvoiceOptionVisibilityState, "downloadInvoiceOptionVisibilityState");
        boolean z = downloadInvoiceOptionVisibilityState.f8715a;
        Intrinsics.i(onDownloadInvoice, "onDownloadInvoice");
        Intrinsics.i(messageText, "messageText");
        Intrinsics.i(btnText, "btnText");
        if (!downloadInvoiceOptionVisibilityState.b) {
            return null;
        }
        ProductDownloadInvoiceOptionUISpec productDownloadInvoiceOptionUISpec = new ProductDownloadInvoiceOptionUISpec(z ? 1.0f : 0.5f, z, ChaloColorToken.White.f9870a);
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        TextUIState.ChaloTextUIState chaloTextUIStateC = z ? null : ChaloTextStyleHelper.c(chaloTextStyleHelper, messageText, null, UITextAlign.Center, null, null, null, 118);
        IconType iconType = IconType.IC_DOWNLOAD_ICON;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ImageUIState imageUIState = new ImageUIState(iconType, "", orangePrimary, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 248);
        float f = ChaloThemeHelper.a().h;
        return new ProductDownloadInvoiceOptionUIState(productDownloadInvoiceOptionUISpec, chaloTextUIStateC, new ImageWithTextUiState(new ImageWithTextSpec(new ChaloPadding(f, f, f, f), 6), imageUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, btnText, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new p80(onDownloadInvoice, 20))));
    }
}
