package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ay0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11152a;
    public final /* synthetic */ IconType b;
    public final /* synthetic */ Modifier c;

    public /* synthetic */ ay0(IconType iconType, Modifier modifier, int i) {
        this.f11152a = i;
        this.b = iconType;
        this.c = modifier;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f11152a;
        Modifier modifier = this.c;
        Unit unit = Unit.f17538a;
        IconType iconType = this.b;
        switch (i) {
            case 0:
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Set set = ProfileDrawerCardAvatarKt.f3591a;
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (!composer.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-792653558, iIntValue, -1, "app.chalo.home.ui.profile.ProfileAvatarImage.<anonymous> (ProfileDrawerCardAvatar.kt:116)");
                    }
                    ImageKt.Image(PainterResourceHelperKt.a(iconType, composer, 0), (String) null, this.c, (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer, Painter.$stable | 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
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
                        ComposerKt.traceEventStart(224886280, iIntValue2, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductVerticalCard.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1036)");
                    }
                    if (iconType == null) {
                        composer2.startReplaceGroup(-561751721);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-561751720);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer2, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 108);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                SubcomposeAsyncImageScope SubcomposeAsyncImage3 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it3 = (AsyncImagePainter.State.Error) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it3, "it");
                if (!composer3.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1104928512, iIntValue3, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductHorizontalCard.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1097)");
                    }
                    if (iconType == null) {
                        composer3.startReplaceGroup(296007007);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(296007008);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifier);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer3, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 24624, 108);
                        composer3.endNode();
                        composer3.endReplaceGroup();
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
