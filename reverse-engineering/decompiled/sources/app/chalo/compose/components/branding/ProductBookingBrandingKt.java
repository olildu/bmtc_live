package app.chalo.compose.components.branding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.data.ProductBookingBranding;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.branding.ImageResourceBrandingUISpecs;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import coil3.compose.SingletonAsyncImageKt;
import defpackage.pk0;
import defpackage.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingBrandingKt {
    public static final void a(Modifier modifier, ProductBookingBrandingUIState brandingUIState, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier modifierAlign;
        long jM4615unboximpl;
        Intrinsics.i(brandingUIState, "brandingUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(909619792);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brandingUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909619792, i3, -1, "app.chalo.compose.components.branding.ProductBookingBranding (ProductBookingBranding.kt:28)");
            }
            if (brandingUIState.equals(ProductBookingBranding.None.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(1534714768);
                composerStartRestartGroup.endReplaceGroup();
            } else if (brandingUIState instanceof ProductBookingBrandingUIState.AgencyBrandingUIState) {
                composerStartRestartGroup.startReplaceGroup(1534800886);
                ProductBookingBrandingUIState.AgencyBrandingUIState agencyBrandingUIState = (ProductBookingBrandingUIState.AgencyBrandingUIState) brandingUIState;
                TextUIState.ChaloTextUIState chaloTextUIState = agencyBrandingUIState.d;
                ImageUrlUIState imageUrlUIState = agencyBrandingUIState.b;
                Modifier modifierC = ChaloThemeKt.c(agencyBrandingUIState.f9915a.b ? SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null) : modifier4, agencyBrandingUIState.c.f9913a);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(63706987);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(63706988);
                    String str = chaloTextUIState.b;
                    TextStyle textStyleF = ChaloThemeKt.f(chaloTextUIState.c, composerStartRestartGroup, 0);
                    ChaloColorToken chaloColorToken = chaloTextUIState.d;
                    Color colorM4595boximpl = chaloColorToken != null ? Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)) : null;
                    if (colorM4595boximpl == null) {
                        composerStartRestartGroup.startReplaceGroup(247024178);
                        jM4615unboximpl = ChaloTheme.a(composerStartRestartGroup, 6).v0;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(247022349);
                        composerStartRestartGroup.endReplaceGroup();
                        jM4615unboximpl = colorM4595boximpl.m4615unboximpl();
                    }
                    TextKt.m2623TextNvy7gAk(str, null, jM4615unboximpl, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ChaloSpacersKt.u(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str2 = imageUrlUIState.f10037a;
                composerStartRestartGroup.startReplaceGroup(2080280987);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ImageUISize imageUISize = imageUrlUIState.c;
                Modifier modifierB = imageUISize != null ? ImageUIStateKt.b(companion2, imageUISize) : null;
                if (modifierB == null) {
                    composerStartRestartGroup.startReplaceGroup(989852146);
                    modifierB = ImageUIStateKt.b(companion2, new ImageUISize(Dp.m7276boximpl(ChaloTheme.b(composerStartRestartGroup, 6).k), Dp.m7276boximpl(ChaloTheme.b(composerStartRestartGroup, 6).u)));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(989848705);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifier5 = modifierB;
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                SingletonAsyncImageKt.a(str2, null, modifier5, ImageUIStateKt.c(imageUrlUIState.d), composer2, 48, 1976);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(brandingUIState instanceof ProductBookingBrandingUIState.ImageResourceBrandingUIState)) {
                    throw pk0.p(composerStartRestartGroup, -2028702231);
                }
                composerStartRestartGroup.startReplaceGroup(1536302681);
                ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState = (ProductBookingBrandingUIState.ImageResourceBrandingUIState) brandingUIState;
                ImageResourceBrandingUISpecs imageResourceBrandingUISpecs = imageResourceBrandingUIState.f9916a;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImageUIState imageUIState = imageResourceBrandingUIState.b;
                Modifier modifierC2 = ChaloThemeKt.c(Modifier.INSTANCE, imageResourceBrandingUISpecs.f9914a);
                Alignment alignment = imageResourceBrandingUISpecs.b;
                CommonImageKt.a(imageUIState, (alignment == null || (modifierAlign = boxScopeInstance.align(modifierC2, alignment)) == null) ? modifierC2 : modifierAlign, false, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 26, modifier3, brandingUIState));
        }
    }
}
