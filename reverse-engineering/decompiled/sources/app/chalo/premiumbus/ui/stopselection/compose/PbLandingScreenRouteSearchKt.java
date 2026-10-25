package app.chalo.premiumbus.ui.stopselection.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.ui.stopselection.compose.PbLandingScreenRouteSearchKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.br;
import defpackage.fq0;
import defpackage.g2;
import defpackage.i41;
import defpackage.kb;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PbLandingScreenRouteSearchKt {
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1711146772);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1711146772, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.ChaloBusExploreRoutesFooter (PbLandingScreenRouteSearch.kt:243)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, function0, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NOT_SURE_OF_ROUTES, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131066);
            ChaloSpacersKt.B(composer2, 0);
            long j = ChaloTheme.a(composer2, 0).v0;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.EXPLORE_ROUTES, new Object[0], composer2, 6), ComposeUtilsKt.d(companion, j), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 12, function0));
        }
    }

    public static final void b(Modifier modifier, String str, AnnotatedString annotatedString, String str2, String str3, AnnotatedString annotatedString2, String str4, Function1 function1, Function0 function0, TextStyle textStyle, Composer composer, int i) {
        int i2;
        AnnotatedString annotatedString3;
        TextStyle textStyle2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1457508986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(annotatedString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            annotatedString3 = annotatedString2;
            i2 |= composerStartRestartGroup.changed(annotatedString3) ? 131072 : 65536;
        } else {
            annotatedString3 = annotatedString2;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            textStyle2 = textStyle;
            i2 |= composerStartRestartGroup.changed(textStyle2) ? 536870912 : 268435456;
        } else {
            textStyle2 = textStyle;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457508986, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PbSearchFieldComponent (PbLandingScreenRouteSearch.kt:132)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierHeight = IntrinsicKt.height(modifier, IntrinsicSize.Min);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            FromAndToStopDetailViewKt.e(0.7f, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 6, 0);
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierA = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "PL_From_Stop_Text");
            int i6 = 29360128 & i2;
            boolean z = i6 == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fq0(function1, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function2 = (Function0) objRememberedValue;
            int i7 = (i2 >> 12) & 458752;
            d(modifierA, str, annotatedString, str2, function2, textStyle2, composerStartRestartGroup, (i2 & 8176) | i7);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            Modifier modifierA2 = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "PL_To_Stop_Text");
            boolean z2 = i6 == 8388608;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new fq0(function1, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            d(modifierA2, str3, annotatedString3, str4, (Function0) objRememberedValue2, textStyle, composerStartRestartGroup, ((i2 >> 9) & 8176) | i7);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ImageKt.Image(PainterResourceHelperKt.a(IconType.PB_SWAP_ICON, composerStartRestartGroup, 6), (String) null, ClickableKt.m295clickableO2vRcR0$default(ShadowKt.m4219shadows4CzXII$default(BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(SizeKt.m828size3ABfNKs(PlotlineComposeWidgetKt.a(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 11, null), "PL_Swap_Button"), ChaloTheme.b(composerStartRestartGroup, 0).m), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.c(composerStartRestartGroup, 0).f, RoundedCornerShapeKt.getCircleShape(), true, 0L, 0L, 24, null), RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, function0, 28, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new br(modifier, str, annotatedString, str2, str3, annotatedString2, str4, function1, function0, textStyle, i, 2));
        }
    }

    public static final void c(final Modifier modifier, final String str, AnnotatedString annotatedString, String str2, final String str3, AnnotatedString annotatedString2, String str4, TextStyle textStyle, String str5, final boolean z, final Function1 onStopsFieldClicked, final Function0 swapSearchFieldsClicked, final Function0 proceedBtnClicked, final Function0 function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        AnnotatedString annotatedString3;
        String str6;
        AnnotatedString annotatedString4;
        int i5;
        final String str7;
        final String str8;
        final TextStyle textStyle2;
        final String str9;
        final AnnotatedString annotatedString5;
        final AnnotatedString annotatedString6;
        int i6;
        int i7;
        String strC;
        AnnotatedString annotatedString7;
        String strC2;
        TextStyle textStyleB;
        String strC3;
        final String str10;
        final String str11;
        TextStyle textStyle3;
        final AnnotatedString annotatedString8;
        final AnnotatedString annotatedString9;
        int i8;
        final String str12;
        int i9;
        int i10;
        Intrinsics.i(onStopsFieldClicked, "onStopsFieldClicked");
        Intrinsics.i(swapSearchFieldsClicked, "swapSearchFieldsClicked");
        Intrinsics.i(proceedBtnClicked, "proceedBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2091150101);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                annotatedString3 = annotatedString;
                if (composerStartRestartGroup.changed(annotatedString3)) {
                    i10 = 256;
                }
                i4 |= i10;
            } else {
                annotatedString3 = annotatedString;
            }
            i10 = 128;
            i4 |= i10;
        } else {
            annotatedString3 = annotatedString;
        }
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                str6 = str2;
                if (composerStartRestartGroup.changed(str6)) {
                    i9 = 2048;
                }
                i4 |= i9;
            } else {
                str6 = str2;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            str6 = str2;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            annotatedString4 = annotatedString2;
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(annotatedString4)) ? 131072 : 65536;
        } else {
            annotatedString4 = annotatedString2;
        }
        if ((i & 1572864) == 0) {
            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(str4)) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(str5)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(onStopsFieldClicked) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(swapSearchFieldsClicked) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(proceedBtnClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i11 = i5;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i3 & 4) != 0) {
                    i6 = 0;
                    i4 &= -897;
                    annotatedString3 = new AnnotatedString(StringResourcesHelperKt.c(StringEnum.FROM, new Object[0], composerStartRestartGroup, 6), null, 2, null);
                } else {
                    i6 = 0;
                }
                if ((i3 & 8) != 0) {
                    i7 = 6;
                    strC = StringResourcesHelperKt.c(StringEnum.TRAVELLING_FROM, new Object[i6], composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    i7 = 6;
                    strC = str2;
                }
                if ((i3 & 32) != 0) {
                    annotatedString7 = new AnnotatedString(StringResourcesHelperKt.c(StringEnum.TO_SMALL, new Object[i6], composerStartRestartGroup, i7), null, 2, null);
                    i4 &= -458753;
                } else {
                    annotatedString7 = annotatedString4;
                }
                if ((i3 & 64) != 0) {
                    strC2 = StringResourcesHelperKt.c(StringEnum.TRAVELLING_TO, new Object[i6], composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    strC2 = str4;
                }
                if ((i3 & 128) != 0) {
                    textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, i6));
                    i4 &= -29360129;
                } else {
                    textStyleB = textStyle;
                }
                if ((i3 & 256) != 0) {
                    strC3 = StringResourcesHelperKt.c(StringEnum.SEARCH_FOR_BUS, new Object[i6], composerStartRestartGroup, 6);
                    i4 &= -234881025;
                } else {
                    strC3 = str5;
                }
                str10 = strC2;
                str11 = strC3;
                textStyle3 = textStyleB;
                annotatedString8 = annotatedString3;
                annotatedString9 = annotatedString7;
                i8 = i4;
                str12 = strC;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                }
                str10 = str4;
                textStyle3 = textStyle;
                str11 = str5;
                i8 = i4;
                str12 = str6;
                annotatedString9 = annotatedString4;
                annotatedString8 = annotatedString3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2091150101, i8, i11, "app.chalo.premiumbus.ui.stopselection.compose.PbSearchFieldWithSwapButtonCard (PbLandingScreenRouteSearch.kt:65)");
            }
            Modifier modifierA = PlotlineComposeWidgetKt.a(modifier, "PL_Search_Card");
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
            int i12 = CardDefaults.$stable;
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i12 << 18, 62);
            RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f);
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, composerStartRestartGroup, i12 << 12, 10);
            final TextStyle textStyle4 = textStyle3;
            String str13 = str12;
            AnnotatedString annotatedString10 = annotatedString9;
            String str14 = str10;
            String str15 = str11;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(786640903, true, new Function3() { // from class: cr0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(786640903, iIntValue, -1, "app.chalo.premiumbus.ui.stopselection.compose.PbSearchFieldWithSwapButtonCard.<anonymous> (PbLandingScreenRouteSearch.kt:75)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i13 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i13), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ChaloSpacersKt.o(composer2, 0);
                        PbLandingScreenRouteSearchKt.b(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), str, annotatedString8, str12, str3, annotatedString9, str10, onStopsFieldClicked, swapSearchFieldsClicked, textStyle4, composer2, 0);
                        ChaloSpacersKt.o(composer2, 0);
                        ChaloFilledButtonKt.g(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer2, 0).m), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), str11, null, 0L, null, z, 0.0f, null, 0L, proceedBtnClicked, composer2, 0, 476);
                        Function0 function1 = function0;
                        if (function1 == null) {
                            composer2.startReplaceGroup(295204440);
                        } else {
                            composer2.startReplaceGroup(295204441);
                            ChaloSpacersKt.o(composer2, 0);
                            boolean zChanged = composer2.changed(function1);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new ar0(function1, 2);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            PbLandingScreenRouteSearchKt.a((Function0) objRememberedValue, composer2, 0);
                            ChaloSpacersKt.s(null, 0, composer2, 1);
                        }
                        composer2.endReplaceGroup();
                        ChaloSpacersKt.o(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(modifierA, roundedCornerShapeM1074RoundedCornerShape0680j_4, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            annotatedString5 = annotatedString10;
            annotatedString6 = annotatedString8;
            str8 = str14;
            textStyle2 = textStyle4;
            str9 = str15;
            str7 = str13;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str7 = str2;
            str8 = str4;
            textStyle2 = textStyle;
            str9 = str5;
            annotatedString5 = annotatedString4;
            annotatedString6 = annotatedString3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: dr0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    PbLandingScreenRouteSearchKt.c(modifier, str, annotatedString6, str7, str3, annotatedString5, str8, textStyle2, str9, z, onStopsFieldClicked, swapSearchFieldsClicked, proceedBtnClicked, function0, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void d(Modifier modifier, String str, AnnotatedString annotatedString, String str2, Function0 function0, TextStyle textStyle, Composer composer, int i) {
        int i2;
        Function0 function1;
        TextStyle textStyle2;
        Composer composer2;
        TextStyle textStyle3;
        Composer composer3;
        int i3;
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(359792134);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(annotatedString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        if ((196608 & i) == 0) {
            textStyle2 = textStyle;
            i2 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(359792134, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PbSearchItem (PbLandingScreenRouteSearch.kt:208)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(-2132101173);
                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                textStyle3 = textStyleB;
            } else {
                composerStartRestartGroup.startReplaceGroup(-2132100458);
                composerStartRestartGroup.endReplaceGroup();
                textStyle3 = textStyle2;
            }
            int i4 = i2;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloTheme.a(composerStartRestartGroup, 0).r0, ChaloTheme.d(composerStartRestartGroup, 0).d), ChaloTheme.b(composerStartRestartGroup, 0).p), 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).d), false, null, null, null, function1, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str == null || annotatedString == null) {
                composer3 = composerStartRestartGroup;
                i3 = 0;
                composer3.startReplaceGroup(1963606726);
            } else {
                composerStartRestartGroup.startReplaceGroup(1972444857);
                i3 = 0;
                TextKt.m2624TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, (i4 >> 6) & 14, 0, 524286);
                composer3 = composerStartRestartGroup;
            }
            composer3.endReplaceGroup();
            String str3 = str == null ? str2 : str;
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.7f);
            if (str != null) {
                composer3.startReplaceGroup(-352007740);
                j = ChaloTheme.a(composer3, i3).g;
            } else {
                composer3.startReplaceGroup(-352006748);
                j = ChaloTheme.a(composer3, i3).k;
            }
            composer3.endReplaceGroup();
            Composer composer4 = composer3;
            TextKt.m2623TextNvy7gAk(str3, modifierFillMaxWidth, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle3, composer4, 48, 24960, 110584);
            composer2 = composer4;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(modifier, str, annotatedString, str2, function0, textStyle, i));
        }
    }
}
