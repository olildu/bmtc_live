package defpackage;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.chalobus.ComposableSingletons$ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ComposableSingletons$PremiumBusTutorialCardKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposablesKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.ComposableSingletons$NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.ComposableSingletons$SuperPassProofOverviewScreenKt;
import app.chalo.productsummary.ui.compose.ComposableSingletons$TripSummaryMainScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.userprofile.ui.compose.ComposableSingletons$UserProfileFormScreenKt;
import app.chalo.userprofile.ui.compose.UserProfileComposeUtilsKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedNumber;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedTextDocument;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVectorN;
import io.github.alexzhirkevich.compottie.internal.animation.TextDocumentKeyframe;
import io.github.alexzhirkevich.compottie.internal.animation.ValueKeyframe;
import io.github.alexzhirkevich.compottie.internal.animation.VectorKeyframe;
import io.github.alexzhirkevich.compottie.internal.helpers.text.TextDocument;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o5 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18569a;

    public /* synthetic */ o5(int i) {
        this.f18569a = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f18569a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                ValueKeyframe BaseKeyframeAnimation = (ValueKeyframe) obj;
                List s = (List) obj2;
                List e = (List) obj3;
                float fFloatValue = ((Float) obj4).floatValue();
                AnimatedNumber.Animated.Companion companion = AnimatedNumber.Animated.INSTANCE;
                Intrinsics.i(BaseKeyframeAnimation, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s, "s");
                Intrinsics.i(e, "e");
                return Float.valueOf(MathHelpersKt.lerp(((Number) s.get(0)).floatValue(), ((Number) e.get(0)).floatValue(), BaseKeyframeAnimation.f16166a.e.transform(fFloatValue)));
            case 1:
                ValueKeyframe BaseKeyframeAnimation2 = (ValueKeyframe) obj;
                List s2 = (List) obj2;
                List e2 = (List) obj3;
                float fFloatValue2 = ((Float) obj4).floatValue();
                AnimatedNumber.Animated.Companion companion2 = AnimatedNumber.Animated.INSTANCE;
                Intrinsics.i(BaseKeyframeAnimation2, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s2, "s");
                Intrinsics.i(e2, "e");
                return Float.valueOf(MathHelpersKt.lerp(((Number) s2.get(0)).floatValue(), ((Number) e2.get(0)).floatValue(), BaseKeyframeAnimation2.f16166a.e.transform(fFloatValue2)));
            case 2:
                TextDocument s3 = (TextDocument) obj2;
                TextDocument e3 = (TextDocument) obj3;
                float fFloatValue3 = ((Float) obj4).floatValue();
                AnimatedTextDocument.Companion companion3 = AnimatedTextDocument.INSTANCE;
                Intrinsics.i((TextDocumentKeyframe) obj, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s3, "s");
                Intrinsics.i(e3, "e");
                return fFloatValue3 == 1.0f ? e3 : s3;
            case 3:
                TextDocument s4 = (TextDocument) obj2;
                TextDocument e4 = (TextDocument) obj3;
                float fFloatValue4 = ((Float) obj4).floatValue();
                AnimatedTextDocument.Companion companion4 = AnimatedTextDocument.INSTANCE;
                Intrinsics.i((TextDocumentKeyframe) obj, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s4, "s");
                Intrinsics.i(e4, "e");
                return fFloatValue4 == 1.0f ? e4 : s4;
            case 4:
                VectorKeyframe BaseKeyframeAnimation3 = (VectorKeyframe) obj;
                List s5 = (List) obj2;
                List e5 = (List) obj3;
                float fFloatValue5 = ((Float) obj4).floatValue();
                AnimatedVectorN.Animated.Companion companion5 = AnimatedVectorN.Animated.INSTANCE;
                Intrinsics.i(BaseKeyframeAnimation3, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s5, "s");
                Intrinsics.i(e5, "e");
                float fTransform = BaseKeyframeAnimation3.f16168a.e.transform(fFloatValue5);
                int iMin = Math.min(s5.size(), e5.size());
                ArrayList arrayList = new ArrayList(iMin);
                for (int i2 = 0; i2 < iMin; i2++) {
                    arrayList.add(Float.valueOf(MathHelpersKt.lerp(((Number) s5.get(i2)).floatValue(), ((Number) e5.get(i2)).floatValue(), fTransform)));
                }
                return arrayList;
            case 5:
                VectorKeyframe BaseKeyframeAnimation4 = (VectorKeyframe) obj;
                List s6 = (List) obj2;
                List e6 = (List) obj3;
                float fFloatValue6 = ((Float) obj4).floatValue();
                AnimatedVectorN.Animated.Companion companion6 = AnimatedVectorN.Animated.INSTANCE;
                Intrinsics.i(BaseKeyframeAnimation4, "$this$BaseKeyframeAnimation");
                Intrinsics.i(s6, "s");
                Intrinsics.i(e6, "e");
                float fTransform2 = BaseKeyframeAnimation4.f16168a.e.transform(fFloatValue6);
                int iMin2 = Math.min(s6.size(), e6.size());
                ArrayList arrayList2 = new ArrayList(iMin2);
                for (int i3 = 0; i3 < iMin2; i3++) {
                    arrayList2.add(Float.valueOf(MathHelpersKt.lerp(((Number) s6.get(i3)).floatValue(), ((Number) e6.get(i3)).floatValue(), fTransform2)));
                }
                return arrayList2;
            case 6:
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ComposableLambda composableLambda = ComposableSingletons$ChaloBusScreenUIKt.f3287a;
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                if (composer.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(643313580, iIntValue, -1, "app.chalo.home.ui.chalobus.ComposableSingletons$ChaloBusScreenUIKt.lambda$643313580.<anonymous> (ChaloBusScreenUI.kt:813)");
                    }
                    ShimmerEffectKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer, 0).n0, 0.0f, ChaloTheme.d(composer, 0).g, 0L, 0L, composer, 6, 52);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 7:
                SubcomposeAsyncImageScope SubcomposeAsyncImage2 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$ChaloBusScreenUIKt.f3287a;
                Intrinsics.i(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? composer2.changed(it) : composer2.changedInstance(it) ? 32 : 16;
                }
                if (composer2.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-472418554, iIntValue2, -1, "app.chalo.home.ui.chalobus.ComposableSingletons$ChaloBusScreenUIKt.lambda$-472418554.<anonymous> (ChaloBusScreenUI.kt:804)");
                    }
                    ImageKt.Image(it.f11481a, "", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 28080, 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 8:
                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                String text = (String) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$ChaloBusScreenUIKt.f3287a;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.i(text, "text");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1528364474, iIntValue3, -1, "app.chalo.home.ui.chalobus.ComposableSingletons$ChaloBusScreenUIKt.lambda$-1528364474.<anonymous> (ChaloBusScreenUI.kt:1036)");
                }
                TextKt.m2623TextNvy7gAk(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composer3, 0).getDisplaySmall(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, (iIntValue3 >> 3) & 14, 24960, 110590);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 9:
                SubcomposeAsyncImageScope SubcomposeAsyncImage3 = (SubcomposeAsyncImageScope) obj;
                Composer composer4 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$ChaloCardComposablesKt.f6382a;
                Intrinsics.i(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                if (composer4.shouldExecute((iIntValue4 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(527089548, iIntValue4, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposablesKt.lambda$527089548.<anonymous> (ChaloCardComposables.kt:51)");
                    }
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.SAMPLE_CARD_RECEIPT, composer4, 6), "Loading sample receipt", Modifier.INSTANCE, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer4, Painter.$stable | 25008, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 10:
                SubcomposeAsyncImageScope SubcomposeAsyncImage4 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Success it2 = (AsyncImagePainter.State.Success) obj2;
                Composer composer5 = (Composer) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$ChaloCardComposablesKt.f6382a;
                Intrinsics.i(SubcomposeAsyncImage4, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it2, "it");
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= (iIntValue5 & 64) == 0 ? composer5.changed(it2) : composer5.changedInstance(it2) ? 32 : 16;
                }
                if (composer5.shouldExecute((iIntValue5 & 145) != 144, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1921993702, iIntValue5, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposablesKt.lambda$1921993702.<anonymous> (ChaloCardComposables.kt:44)");
                    }
                    ImageKt.Image(it2.f11481a, (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer5, Painter.$stable | 24624, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 11:
                SubcomposeAsyncImageScope SubcomposeAsyncImage5 = (SubcomposeAsyncImageScope) obj;
                Composer composer6 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$ChaloCardComposablesKt.f6382a;
                Intrinsics.i(SubcomposeAsyncImage5, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if (composer6.shouldExecute((iIntValue6 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1665363778, iIntValue6, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposablesKt.lambda$1665363778.<anonymous> (ChaloCardComposables.kt:59)");
                    }
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.SAMPLE_CARD_RECEIPT, composer6, 6), "Error loading sample receipt", Modifier.INSTANCE, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer6, Painter.$stable | 25008, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 12:
                SubcomposeAsyncImageScope SubcomposeAsyncImage6 = (SubcomposeAsyncImageScope) obj;
                Composer composer7 = (Composer) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$NewPremiumBusActivationBottomSheetContentKt.f7322a;
                Intrinsics.i(SubcomposeAsyncImage6, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if (composer7.shouldExecute((iIntValue7 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1483099770, iIntValue7, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.ComposableSingletons$NewPremiumBusActivationBottomSheetContentKt.lambda$1483099770.<anonymous> (NewPremiumBusActivationBottomSheetContent.kt:867)");
                    }
                    Modifier modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer7, 0).p), ChaloTheme.b(composer7, 0).t);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM833width3ABfNKs);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion7.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion7, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHALO_BUS_IMAGE_WITH_SHADOW_WITHOUT_PADDING, composer7, 6), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer7, Painter.$stable | 24624, 108);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 13:
                LazyItemScope items = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer8 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                Intrinsics.i(items, "$this$items");
                if (composer8.shouldExecute((iIntValue8 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1553479770, iIntValue8, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$1553479770.<anonymous> (PbBulkBookingRideDetailsScreen.kt:339)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer8, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer8, companion8);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion9.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor2);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion9, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    PbBulkBookingRideDetailsScreenKt.n(composer8, 0);
                    ChaloSpacersKt.m(composer8, 0);
                    PbBulkBookingRideDetailsScreenKt.n(composer8, 0);
                    ChaloSpacersKt.m(composer8, 0);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 14:
                SubcomposeAsyncImageScope SubcomposeAsyncImage7 = (SubcomposeAsyncImageScope) obj;
                Composer composer9 = (Composer) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$PremiumBusTutorialCardKt.f3288a;
                Intrinsics.i(SubcomposeAsyncImage7, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if (composer9.shouldExecute((iIntValue9 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2051497433, iIntValue9, -1, "app.chalo.home.ui.chalobus.ComposableSingletons$PremiumBusTutorialCardKt.lambda$2051497433.<anonymous> (PremiumBusTutorialCard.kt:79)");
                    }
                    BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer9, 0).H0, null, 2, null), composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 15:
                SubcomposeAsyncImageScope SubcomposeAsyncImage8 = (SubcomposeAsyncImageScope) obj;
                Composer composer10 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$SuperPassProofOverviewScreenKt.f8454a;
                Intrinsics.i(SubcomposeAsyncImage8, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                if (composer10.shouldExecute((iIntValue10 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(429891733, iIntValue10, -1, "app.chalo.productpurchase.passpurchase.ui.proofoverview.ComposableSingletons$SuperPassProofOverviewScreenKt.lambda$429891733.<anonymous> (SuperPassProofOverviewScreen.kt:431)");
                    }
                    ChaloCircularProgressIndicatorKt.b(null, 0.0f, composer10, 0, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 16:
                SubcomposeAsyncImageScope SubcomposeAsyncImage9 = (SubcomposeAsyncImageScope) obj;
                Composer composer11 = (Composer) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$TripSummaryMainScreenKt.f8747a;
                Intrinsics.i(SubcomposeAsyncImage9, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                if (composer11.shouldExecute((iIntValue11 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(959182456, iIntValue11, -1, "app.chalo.productsummary.ui.compose.ComposableSingletons$TripSummaryMainScreenKt.lambda$959182456.<anonymous> (TripSummaryMainScreen.kt:332)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer11, companion10);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion11.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor3);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion11, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CommonImageKt.a(new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composer11, 0).r0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, false, composer11, 0, 6);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 17:
                SubcomposeAsyncImageScope SubcomposeAsyncImage10 = (SubcomposeAsyncImageScope) obj;
                Composer composer12 = (Composer) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$TripSummaryMainScreenKt.f8747a;
                Intrinsics.i(SubcomposeAsyncImage10, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if (composer12.shouldExecute((iIntValue12 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1717704318, iIntValue12, -1, "app.chalo.productsummary.ui.compose.ComposableSingletons$TripSummaryMainScreenKt.lambda$-1717704318.<anonymous> (TripSummaryMainScreen.kt:357)");
                    }
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer12, companion12);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion13.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor4);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion13, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    CommonImageKt.a(new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composer12, 0).r0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, false, composer12, 0, 6);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 18:
                SubcomposeAsyncImageScope SubcomposeAsyncImage11 = (SubcomposeAsyncImageScope) obj;
                Composer composer13 = (Composer) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$UserProfileFormScreenKt.f10375a;
                Intrinsics.i(SubcomposeAsyncImage11, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if (composer13.shouldExecute((iIntValue13 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2098569164, iIntValue13, -1, "app.chalo.userprofile.ui.compose.ComposableSingletons$UserProfileFormScreenKt.lambda$-2098569164.<anonymous> (UserProfileFormScreen.kt:294)");
                    }
                    UserProfileComposeUtilsKt.a(composer13, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            default:
                return PlatformSelectionBehaviors_androidKt.PlatformSelectionBehaviorsFactory$lambda$0((CoroutineContext) obj, (Context) obj2, (SelectedTextType) obj3, (LocaleList) obj4);
        }
    }
}
