package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
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
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wv0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19964a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wv0(LazyListState lazyListState, float f, Function4 function4) {
        this.c = lazyListState;
        this.b = f;
        this.d = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f19964a;
        Unit unit = Unit.f17538a;
        float fM7278constructorimpl = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                LazyListState lazyListState = (LazyListState) obj6;
                Function4 function4 = (Function4) obj5;
                LazyItemScope items = (LazyItemScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                int i2 = (iIntValue2 & 6) == 0 ? (composer.changed(items) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116576124, i2, -1, "app.chalo.premiumbus.ui.slotselection.AMPMPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1832)");
                    }
                    float fD = 1.0f - (RangesKt.d(Math.abs((iIntValue - lazyListState.getFirstVisibleItemIndex()) - 1) / 2.0f, 0.0f, 1.0f) * 0.7f);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, fM7278constructorimpl), 0.0f, 1, null), fD);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (iIntValue == 0) {
                        composer.startReplaceGroup(928093122);
                        BoxKt.Box(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM7278constructorimpl), composer, 0);
                        composer.endReplaceGroup();
                    } else if (iIntValue == 1) {
                        composer.startReplaceGroup(307041780);
                        function4.invoke(items, 0, composer, Integer.valueOf((i2 & 14) | 48));
                        composer.endReplaceGroup();
                    } else if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            composer.startReplaceGroup(859889464);
                        } else {
                            composer.startReplaceGroup(928447266);
                            BoxKt.Box(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM7278constructorimpl), composer, 0);
                        }
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(307043060);
                        function4.invoke(items, 1, composer, Integer.valueOf((i2 & 14) | 48));
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                IconType iconType = (IconType) obj6;
                Modifier modifier = (Modifier) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Set set = ProfileDrawerCardAvatarKt.f3591a;
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (!composer2.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134109204, iIntValue3, -1, "app.chalo.home.ui.profile.ProfileAvatarImage.<anonymous> (ProfileDrawerCardAvatar.kt:124)");
                    }
                    Painter painterA = PainterResourceHelperKt.a(iconType, composer2, 0);
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(modifier, ChaloTheme.a(composer2, 0).t, RoundedCornerShapeKt.getCircleShape());
                    if (ProfileDrawerCardAvatarKt.f3591a.contains(iconType)) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    ImageKt.Image(painterA, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU, 0.0f, fM7278constructorimpl, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ wv0(IconType iconType, Modifier modifier, float f) {
        this.c = iconType;
        this.d = modifier;
        this.b = f;
    }
}
