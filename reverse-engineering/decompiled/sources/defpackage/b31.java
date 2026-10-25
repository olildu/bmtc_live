package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.uistate.image.ImageUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b31 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11165a;
    public final /* synthetic */ ImageUIState b;

    public /* synthetic */ b31(ImageUIState imageUIState, int i) {
        this.f11165a = i;
        this.b = imageUIState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f11165a;
        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
        AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (composer.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1223904331, iIntValue, -1, "app.chalo.ridehailing.feedback.VehicleComponentUI.<anonymous> (RideUserFeedbackScreen.kt:457)");
                    }
                    CommonImageKt.a(this.b, null, false, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (composer.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1591568413, iIntValue, -1, "app.chalo.ridehailing.feedback.DriverComponentUI.<anonymous> (RideUserFeedbackScreen.kt:475)");
                    }
                    CommonImageKt.a(this.b, null, false, composer, 0, 6);
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
