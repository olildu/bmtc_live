package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class en implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15570a;
    public final /* synthetic */ IconType b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ en(IconType iconType, Modifier modifier, MutableState mutableState, int i) {
        this.f15570a = i;
        this.b = iconType;
        this.c = modifier;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f15570a;
        Unit unit = Unit.f17538a;
        MutableState mutableState = this.d;
        Modifier modifier = this.c;
        IconType iconType = this.b;
        switch (i) {
            case 0:
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (!composer.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1398061494, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloWidgetCard.kt:128)");
                    }
                    if (iconType == null) {
                        composer.startReplaceGroup(1352157343);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1352157344);
                        mutableState.setValue(Boolean.TRUE);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                        pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, Painter.$stable | 24624, 108);
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                SubcomposeAsyncImageScope SubcomposeAsyncImage2 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it2 = (AsyncImagePainter.State.Error) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it2, "it");
                if (!composer2.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1309651808, iIntValue2, -1, "app.chalo.compose.components.ChaloHorizontalWidgetCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloWidgetCard.kt:348)");
                    }
                    if (iconType == null) {
                        composer2.startReplaceGroup(-354036363);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-354036362);
                        mutableState.setValue(Boolean.TRUE);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer2, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 108);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
