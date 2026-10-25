package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ut0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19777a;
    public final /* synthetic */ ImageUrlUIState b;

    public /* synthetic */ ut0(ImageUrlUIState imageUrlUIState, int i) {
        this.f19777a = i;
        this.b = imageUrlUIState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Modifier modifierB;
        int i = this.f19777a;
        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
        AsyncImagePainter.State.Success result = (AsyncImagePainter.State.Success) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(result, "result");
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? composer.changed(result) : composer.changedInstance(result) ? 32 : 16;
                }
                if (composer.shouldExecute((iIntValue & 145) != 144, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-25026073, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellOfferCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusFareDetailsCommonViews.kt:83)");
                    }
                    Painter painter = result.f11481a;
                    ImageUrlUIState imageUrlUIState = this.b;
                    ImageKt.Image(painter, imageUrlUIState.b, (Modifier) null, (Alignment) null, ImageUIStateKt.c(imageUrlUIState.d), 0.0f, (ColorFilter) null, composer, Painter.$stable, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(result, "it");
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? composer.changed(result) : composer.changedInstance(result) ? 32 : 16;
                }
                if (composer.shouldExecute((iIntValue & 145) != 144, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-176527010, iIntValue, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptProfileImage.<anonymous> (TripSummaryMainScreen.kt:345)");
                    }
                    Painter painter2 = result.f11481a;
                    ImageUrlUIState imageUrlUIState2 = this.b;
                    String str = imageUrlUIState2.b;
                    ContentScale contentScaleC = ImageUIStateKt.c(imageUrlUIState2.d);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ImageUISize imageUISize = imageUrlUIState2.c;
                    ImageKt.Image(painter2, str, (imageUISize == null || (modifierB = ImageUIStateKt.b(companion, imageUISize)) == null) ? companion : modifierB, (Alignment) null, contentScaleC, 0.0f, (ColorFilter) null, composer, Painter.$stable, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
