package app.chalo.home.ui.chalobus;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.chalobus.ComposableSingletons$PremiumBusTutorialCardKt;
import app.chalo.home.ui.chalobus.PremiumBusTutorialCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTutorialCardKt {
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:152:0x0226  */
    /* JADX WARN: Code duplicated, block: B:154:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x0246  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128 A[ADDED_TO_REGION] */
    public static final void a(final String title, final String thumbnailUrl, final String timeStamp, final Function0 onClick, Modifier modifier, float f, float f2, final TextStyle textStyle, int i, TextStyle textStyle2, float f3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        float fM7278constructorimpl;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        int i11;
        final TextStyle textStyle3;
        final float f5;
        Composer composer2;
        final Modifier modifier3;
        final float f6;
        final int i12;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        TextStyle labelSmall;
        final float f8;
        final float f9;
        final float f10;
        final int i14;
        int i15;
        Modifier modifier4;
        final TextStyle textStyle4;
        int i16;
        int i17;
        Intrinsics.i(title, "title");
        Intrinsics.i(thumbnailUrl, "thumbnailUrl");
        Intrinsics.i(timeStamp, "timeStamp");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1768620913);
        if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(thumbnailUrl) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(timeStamp) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i18 = i4 & 16;
        if (i18 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i6 = i4 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    fM7278constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                if ((1572864 & i2) == 0) {
                    if ((i4 & 64) == 0) {
                        f4 = f2;
                        int i19 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                        i5 |= i19;
                    } else {
                        f4 = f2;
                    }
                    i5 |= i19;
                } else {
                    f4 = f2;
                }
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(textStyle)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i8 = i4 & 256;
                if (i8 != 0) {
                    i5 |= 100663296;
                    i9 = i;
                } else {
                    i9 = i;
                    if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(i9)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i5 |= i10;
                    }
                }
                if ((i2 & 805306368) != 0) {
                    i5 |= ((i4 & 512) == 0 || !composerStartRestartGroup.changed(textStyle2)) ? 268435456 : 536870912;
                }
                if ((i3 & 6) == 0) {
                    i11 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(f3)) ? 2 : 4);
                } else {
                    i11 = i3;
                }
                if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 3) != 2, i5 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            fM7278constructorimpl = Dp.m7278constructorimpl(220);
                        }
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                            f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                        }
                        if (i8 != 0) {
                            i13 = 2;
                        } else {
                            i13 = i9;
                        }
                        if ((i4 & 512) != 0) {
                            labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                            i5 = (-1879048193) & i5;
                        } else {
                            labelSmall = textStyle2;
                        }
                        if ((i4 & 1024) != 0) {
                            i11 &= -15;
                            f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                        } else {
                            f8 = f3;
                        }
                        f9 = fM7278constructorimpl;
                        f10 = f4;
                        i14 = i13;
                        i15 = i5;
                        modifier4 = modifier2;
                        textStyle4 = labelSmall;
                        i16 = i11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i4 & 512) != 0) {
                            i5 &= -1879048193;
                        }
                        if ((i4 & 1024) != 0) {
                            i11 &= -15;
                        }
                        i14 = i9;
                        f9 = fM7278constructorimpl;
                        f10 = f4;
                        i16 = i11;
                        f8 = f3;
                        i15 = i5;
                        modifier4 = modifier2;
                        textStyle4 = textStyle2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1768620913, i15, i16, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard (PremiumBusTutorialCard.kt:42)");
                    }
                    float f11 = f10;
                    int i20 = i14;
                    float f12 = f8;
                    Modifier modifier5 = modifier4;
                    ChaloRoundedCardKt.b(modifier5, ChaloTheme.d(composerStartRestartGroup, 0).g, ChaloTheme.c(composerStartRestartGroup, 0).b, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1182772302, true, new Function3() { // from class: kw0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1182772302, iIntValue, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous> (PremiumBusTutorialCard.kt:48)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Function0 function0 = onClick;
                                boolean zChanged = composer3.changed(function0);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new ar0(function0, 22);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer3, 0).t, null, 2, null);
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i21 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                                pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i21), composerM3915constructorimpl));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i22), composerM3915constructorimpl2));
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                                Alignment topCenter = companion2.getTopCenter();
                                final float f13 = f9;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1319886769, true, new Function4() { // from class: mw0
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj4;
                                        AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj5;
                                        Composer composer4 = (Composer) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                        Intrinsics.i(it, "it");
                                        if (composer4.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1319886769, iIntValue2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusTutorialCard.kt:72)");
                                            }
                                            ShimmerEffectKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f13, 0.0f, ChaloTheme.d(composer4, 0).g, 0L, 0L, composer4, 6, 52);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer3, 54);
                                String str = title;
                                SingletonSubcomposeAsyncImageKt.a(thumbnailUrl, str, null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(852198581, true, new o4(str, 11), composer3, 54), ComposableSingletons$PremiumBusTutorialCardKt.f3288a, null, null, topCenter, fillWidth, composer3, 1794048, 54, 62348);
                                ImageKt.Image(PainterResourceHelperKt.a(IconType.PLAY_CIRCLE, composer3, 6), (String) null, SizeKt.m828size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                                TextKt.m2623TextNvy7gAk(timeStamp, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion, companion2.getBottomEnd()), ChaloTheme.b(composer3, 0).d), Color.m4604copywmQWz5c$default(ChaloTheme.a(composer3, 0).v0, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer3, 0).c)), ChaloTheme.b(composer3, 0).f, ChaloTheme.b(composer3, 0).c), ChaloTheme.a(composer3, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131064);
                                composer3.endNode();
                                TextKt.m2623TextNvy7gAk(str, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, i14, 0, null, textStyle, composer3, 0, 384, 110584);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i15 >> 12) & 14) | 24576, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f7 = f11;
                    modifier3 = modifier5;
                    composer2 = composerStartRestartGroup;
                    f6 = f9;
                    f5 = f12;
                    textStyle3 = textStyle4;
                    i12 = i20;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    textStyle3 = textStyle2;
                    f5 = f3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    f6 = fM7278constructorimpl;
                    i12 = i9;
                    f7 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lw0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            PremiumBusTutorialCardKt.a(title, thumbnailUrl, timeStamp, onClick, modifier3, f6, f7, textStyle, i12, textStyle3, f5, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fM7278constructorimpl = f;
            if ((1572864 & i2) == 0) {
                if ((i4 & 64) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                    }
                    i5 |= i19;
                } else {
                    f4 = f2;
                }
                i5 |= i19;
            } else {
                f4 = f2;
            }
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(textStyle)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i8 = i4 & 256;
            if (i8 != 0) {
                i5 |= 100663296;
                i9 = i;
            } else {
                i9 = i;
                if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(i9)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & 512) == 0 || !composerStartRestartGroup.changed(textStyle2)) ? 268435456 : 536870912;
            }
            if ((i3 & 6) == 0) {
                i11 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(f3)) ? 2 : 4);
            } else {
                i11 = i3;
            }
            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 3) != 2, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(220);
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                    }
                    if (i8 != 0) {
                        i13 = 2;
                    } else {
                        i13 = i9;
                    }
                    if ((i4 & 512) != 0) {
                        labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                        i5 = (-1879048193) & i5;
                    } else {
                        labelSmall = textStyle2;
                    }
                    if ((i4 & 1024) != 0) {
                        i11 &= -15;
                        f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                    } else {
                        f8 = f3;
                    }
                    f9 = fM7278constructorimpl;
                    f10 = f4;
                    i14 = i13;
                    i15 = i5;
                    modifier4 = modifier2;
                    textStyle4 = labelSmall;
                    i16 = i11;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(220);
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                    }
                    if (i8 != 0) {
                        i13 = 2;
                    } else {
                        i13 = i9;
                    }
                    if ((i4 & 512) != 0) {
                        labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                        i5 = (-1879048193) & i5;
                    } else {
                        labelSmall = textStyle2;
                    }
                    if ((i4 & 1024) != 0) {
                        i11 &= -15;
                        f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                    } else {
                        f8 = f3;
                    }
                    f9 = fM7278constructorimpl;
                    f10 = f4;
                    i14 = i13;
                    i15 = i5;
                    modifier4 = modifier2;
                    textStyle4 = labelSmall;
                    i16 = i11;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1768620913, i15, i16, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard (PremiumBusTutorialCard.kt:42)");
                }
                float f13 = f10;
                int i21 = i14;
                float f14 = f8;
                Modifier modifier6 = modifier4;
                ChaloRoundedCardKt.b(modifier6, ChaloTheme.d(composerStartRestartGroup, 0).g, ChaloTheme.c(composerStartRestartGroup, 0).b, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1182772302, true, new Function3() { // from class: kw0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1182772302, iIntValue, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous> (PremiumBusTutorialCard.kt:48)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Function0 function0 = onClick;
                            boolean zChanged = composer3.changed(function0);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new ar0(function0, 22);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer3, 0).t, null, 2, null);
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i22 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i22), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i23 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i23), composerM3915constructorimpl2));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                            Alignment topCenter = companion2.getTopCenter();
                            final float f15 = f9;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1319886769, true, new Function4() { // from class: mw0
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj4;
                                    AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer4.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1319886769, iIntValue2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusTutorialCard.kt:72)");
                                        }
                                        ShimmerEffectKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f15, 0.0f, ChaloTheme.d(composer4, 0).g, 0L, 0L, composer4, 6, 52);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer3, 54);
                            String str = title;
                            SingletonSubcomposeAsyncImageKt.a(thumbnailUrl, str, null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(852198581, true, new o4(str, 11), composer3, 54), ComposableSingletons$PremiumBusTutorialCardKt.f3288a, null, null, topCenter, fillWidth, composer3, 1794048, 54, 62348);
                            ImageKt.Image(PainterResourceHelperKt.a(IconType.PLAY_CIRCLE, composer3, 6), (String) null, SizeKt.m828size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                            TextKt.m2623TextNvy7gAk(timeStamp, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion, companion2.getBottomEnd()), ChaloTheme.b(composer3, 0).d), Color.m4604copywmQWz5c$default(ChaloTheme.a(composer3, 0).v0, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer3, 0).c)), ChaloTheme.b(composer3, 0).f, ChaloTheme.b(composer3, 0).c), ChaloTheme.a(composer3, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131064);
                            composer3.endNode();
                            TextKt.m2623TextNvy7gAk(str, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, i14, 0, null, textStyle, composer3, 0, 384, 110584);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i15 >> 12) & 14) | 24576, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f7 = f13;
                modifier3 = modifier6;
                composer2 = composerStartRestartGroup;
                f6 = f9;
                f5 = f14;
                textStyle3 = textStyle4;
                i12 = i21;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                textStyle3 = textStyle2;
                f5 = f3;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                f6 = fM7278constructorimpl;
                i12 = i9;
                f7 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lw0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        PremiumBusTutorialCardKt.a(title, thumbnailUrl, timeStamp, onClick, modifier3, f6, f7, textStyle, i12, textStyle3, f5, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 |= 24576;
        modifier2 = modifier;
        i6 = i4 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                fM7278constructorimpl = f;
                if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            if ((1572864 & i2) == 0) {
                if ((i4 & 64) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                    }
                    i5 |= i19;
                } else {
                    f4 = f2;
                }
                i5 |= i19;
            } else {
                f4 = f2;
            }
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(textStyle)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i8 = i4 & 256;
            if (i8 != 0) {
                i5 |= 100663296;
                i9 = i;
            } else {
                i9 = i;
                if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(i9)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & 512) == 0 || !composerStartRestartGroup.changed(textStyle2)) ? 268435456 : 536870912;
            }
            if ((i3 & 6) == 0) {
                i11 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(f3)) ? 2 : 4);
            } else {
                i11 = i3;
            }
            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 3) != 2, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(220);
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                    }
                    if (i8 != 0) {
                        i13 = 2;
                    } else {
                        i13 = i9;
                    }
                    if ((i4 & 512) != 0) {
                        labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                        i5 = (-1879048193) & i5;
                    } else {
                        labelSmall = textStyle2;
                    }
                    if ((i4 & 1024) != 0) {
                        i11 &= -15;
                        f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                    } else {
                        f8 = f3;
                    }
                    f9 = fM7278constructorimpl;
                    f10 = f4;
                    i14 = i13;
                    i15 = i5;
                    modifier4 = modifier2;
                    textStyle4 = labelSmall;
                    i16 = i11;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(220);
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                    }
                    if (i8 != 0) {
                        i13 = 2;
                    } else {
                        i13 = i9;
                    }
                    if ((i4 & 512) != 0) {
                        labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                        i5 = (-1879048193) & i5;
                    } else {
                        labelSmall = textStyle2;
                    }
                    if ((i4 & 1024) != 0) {
                        i11 &= -15;
                        f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                    } else {
                        f8 = f3;
                    }
                    f9 = fM7278constructorimpl;
                    f10 = f4;
                    i14 = i13;
                    i15 = i5;
                    modifier4 = modifier2;
                    textStyle4 = labelSmall;
                    i16 = i11;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1768620913, i15, i16, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard (PremiumBusTutorialCard.kt:42)");
                }
                float f15 = f10;
                int i22 = i14;
                float f16 = f8;
                Modifier modifier7 = modifier4;
                ChaloRoundedCardKt.b(modifier7, ChaloTheme.d(composerStartRestartGroup, 0).g, ChaloTheme.c(composerStartRestartGroup, 0).b, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1182772302, true, new Function3() { // from class: kw0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1182772302, iIntValue, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous> (PremiumBusTutorialCard.kt:48)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Function0 function0 = onClick;
                            boolean zChanged = composer3.changed(function0);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new ar0(function0, 22);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer3, 0).t, null, 2, null);
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i23 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i23), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i24 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i24), composerM3915constructorimpl2));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                            Alignment topCenter = companion2.getTopCenter();
                            final float f17 = f9;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1319886769, true, new Function4() { // from class: mw0
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj4;
                                    AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer4.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1319886769, iIntValue2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusTutorialCard.kt:72)");
                                        }
                                        ShimmerEffectKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f17, 0.0f, ChaloTheme.d(composer4, 0).g, 0L, 0L, composer4, 6, 52);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer3, 54);
                            String str = title;
                            SingletonSubcomposeAsyncImageKt.a(thumbnailUrl, str, null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(852198581, true, new o4(str, 11), composer3, 54), ComposableSingletons$PremiumBusTutorialCardKt.f3288a, null, null, topCenter, fillWidth, composer3, 1794048, 54, 62348);
                            ImageKt.Image(PainterResourceHelperKt.a(IconType.PLAY_CIRCLE, composer3, 6), (String) null, SizeKt.m828size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                            TextKt.m2623TextNvy7gAk(timeStamp, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion, companion2.getBottomEnd()), ChaloTheme.b(composer3, 0).d), Color.m4604copywmQWz5c$default(ChaloTheme.a(composer3, 0).v0, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer3, 0).c)), ChaloTheme.b(composer3, 0).f, ChaloTheme.b(composer3, 0).c), ChaloTheme.a(composer3, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131064);
                            composer3.endNode();
                            TextKt.m2623TextNvy7gAk(str, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, i14, 0, null, textStyle, composer3, 0, 384, 110584);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i15 >> 12) & 14) | 24576, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f7 = f15;
                modifier3 = modifier7;
                composer2 = composerStartRestartGroup;
                f6 = f9;
                f5 = f16;
                textStyle3 = textStyle4;
                i12 = i22;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                textStyle3 = textStyle2;
                f5 = f3;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                f6 = fM7278constructorimpl;
                i12 = i9;
                f7 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lw0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        PremiumBusTutorialCardKt.a(title, thumbnailUrl, timeStamp, onClick, modifier3, f6, f7, textStyle, i12, textStyle3, f5, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        fM7278constructorimpl = f;
        if ((1572864 & i2) == 0) {
            if ((i4 & 64) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                }
                i5 |= i19;
            } else {
                f4 = f2;
            }
            i5 |= i19;
        } else {
            f4 = f2;
        }
        if ((i2 & 12582912) == 0) {
            if (composerStartRestartGroup.changed(textStyle)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i5 |= i17;
        }
        i8 = i4 & 256;
        if (i8 != 0) {
            i5 |= 100663296;
            i9 = i;
        } else {
            i9 = i;
            if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changed(i9)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
        }
        if ((i2 & 805306368) != 0) {
            i5 |= ((i4 & 512) == 0 || !composerStartRestartGroup.changed(textStyle2)) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i11 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(f3)) ? 2 : 4);
        } else {
            i11 = i3;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 3) != 2, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(220);
                }
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                    f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                }
                if (i8 != 0) {
                    i13 = 2;
                } else {
                    i13 = i9;
                }
                if ((i4 & 512) != 0) {
                    labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                    i5 = (-1879048193) & i5;
                } else {
                    labelSmall = textStyle2;
                }
                if ((i4 & 1024) != 0) {
                    i11 &= -15;
                    f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                } else {
                    f8 = f3;
                }
                f9 = fM7278constructorimpl;
                f10 = f4;
                i14 = i13;
                i15 = i5;
                modifier4 = modifier2;
                textStyle4 = labelSmall;
                i16 = i11;
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(220);
                }
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                    f4 = ChaloTheme.b(composerStartRestartGroup, 0).h;
                }
                if (i8 != 0) {
                    i13 = 2;
                } else {
                    i13 = i9;
                }
                if ((i4 & 512) != 0) {
                    labelSmall = ChaloTheme.e(composerStartRestartGroup, 0).getLabelSmall();
                    i5 = (-1879048193) & i5;
                } else {
                    labelSmall = textStyle2;
                }
                if ((i4 & 1024) != 0) {
                    i11 &= -15;
                    f8 = ChaloTheme.b(composerStartRestartGroup, 0).m;
                } else {
                    f8 = f3;
                }
                f9 = fM7278constructorimpl;
                f10 = f4;
                i14 = i13;
                i15 = i5;
                modifier4 = modifier2;
                textStyle4 = labelSmall;
                i16 = i11;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1768620913, i15, i16, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard (PremiumBusTutorialCard.kt:42)");
            }
            float f17 = f10;
            int i23 = i14;
            float f18 = f8;
            Modifier modifier8 = modifier4;
            ChaloRoundedCardKt.b(modifier8, ChaloTheme.d(composerStartRestartGroup, 0).g, ChaloTheme.c(composerStartRestartGroup, 0).b, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1182772302, true, new Function3() { // from class: kw0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1182772302, iIntValue, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous> (PremiumBusTutorialCard.kt:48)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Function0 function0 = onClick;
                        boolean zChanged = composer3.changed(function0);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ar0(function0, 22);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer3, 0).t, null, 2, null);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i24 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i24), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i25 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i25), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                        Alignment topCenter = companion2.getTopCenter();
                        final float f19 = f9;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1319886769, true, new Function4() { // from class: mw0
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj4;
                                AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj5;
                                Composer composer4 = (Composer) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                Intrinsics.i(it, "it");
                                if (composer4.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1319886769, iIntValue2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusTutorialCard.kt:72)");
                                    }
                                    ShimmerEffectKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f19, 0.0f, ChaloTheme.d(composer4, 0).g, 0L, 0L, composer4, 6, 52);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer3, 54);
                        String str = title;
                        SingletonSubcomposeAsyncImageKt.a(thumbnailUrl, str, null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(852198581, true, new o4(str, 11), composer3, 54), ComposableSingletons$PremiumBusTutorialCardKt.f3288a, null, null, topCenter, fillWidth, composer3, 1794048, 54, 62348);
                        ImageKt.Image(PainterResourceHelperKt.a(IconType.PLAY_CIRCLE, composer3, 6), (String) null, SizeKt.m828size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                        TextKt.m2623TextNvy7gAk(timeStamp, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion, companion2.getBottomEnd()), ChaloTheme.b(composer3, 0).d), Color.m4604copywmQWz5c$default(ChaloTheme.a(composer3, 0).v0, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer3, 0).c)), ChaloTheme.b(composer3, 0).f, ChaloTheme.b(composer3, 0).c), ChaloTheme.a(composer3, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131064);
                        composer3.endNode();
                        TextKt.m2623TextNvy7gAk(str, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, i14, 0, null, textStyle, composer3, 0, 384, 110584);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i15 >> 12) & 14) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f7 = f17;
            modifier3 = modifier8;
            composer2 = composerStartRestartGroup;
            f6 = f9;
            f5 = f18;
            textStyle3 = textStyle4;
            i12 = i23;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle3 = textStyle2;
            f5 = f3;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
            f6 = fM7278constructorimpl;
            i12 = i9;
            f7 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lw0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    PremiumBusTutorialCardKt.a(title, thumbnailUrl, timeStamp, onClick, modifier3, f6, f7, textStyle, i12, textStyle3, f5, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                    return Unit.f17538a;
                }
            });
        }
    }
}
