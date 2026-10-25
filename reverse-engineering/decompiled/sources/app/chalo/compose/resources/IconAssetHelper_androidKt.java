package app.chalo.compose.resources;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import app.chalo.providers.iconassetprovider.IconAssetProvider;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IconAssetHelper_androidKt {
    public static final Painter a(IconType iconType, Composer composer, int i) {
        Integer numValueOf;
        Intrinsics.i(iconType, "iconType");
        composer.startReplaceGroup(4430434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4430434, i, -1, "app.chalo.compose.resources.painterResource (IconAssetHelper.android.kt:9)");
        }
        Painter painterA = null;
        try {
            numValueOf = Integer.valueOf(((IconAssetProvider) composer.consume(IconAssetHelperKt.f1906a)).a(iconType).f8859a);
        } catch (Exception e) {
            int i2 = i & 14;
            boolean zChangedInstance = (((i2 ^ 6) > 4 && composer.changed(iconType.ordinal())) || (i & 6) == 4) | composer.changedInstance(e);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new IconAssetHelper_androidKt$painterResource$platformDrawableResId$1$1(iconType, e, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(iconType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, i2);
            numValueOf = null;
        }
        if (numValueOf != null) {
            composer.startReplaceGroup(-1156378490);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(numValueOf.intValue(), composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painterPainterResource;
        }
        composer.startReplaceGroup(-1157223488);
        composer.endReplaceGroup();
        int i3 = i & 14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1119265729, i3, -1, "app.chalo.compose.resources.commonPainterIfValid (PainterResourceHelper.kt:40)");
        }
        DrawableResource drawableResourceB = PainterResourceHelperKt.b(iconType);
        if (drawableResourceB == null) {
            composer.startReplaceGroup(2080896199);
        } else {
            composer.startReplaceGroup(2080896200);
            painterA = ImageResourcesKt.a(drawableResourceB, composer);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if (painterA != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painterA;
        }
        throw new IllegalStateException(iconType + " icon missing in platform and common resources");
    }
}
