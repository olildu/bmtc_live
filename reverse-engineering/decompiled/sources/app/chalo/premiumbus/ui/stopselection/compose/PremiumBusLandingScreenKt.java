package app.chalo.premiumbus.ui.stopselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.bu0;
import defpackage.f0;
import defpackage.gf;
import defpackage.h0;
import defpackage.mh;
import defpackage.pk0;
import defpackage.pn0;
import defpackage.sn0;
import defpackage.ue;
import defpackage.wl;
import defpackage.wm0;
import defpackage.xq0;
import defpackage.yt0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005¨\u0006\b²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "contentHtInDp", "toolBarHtInDp", "", "offersSectionVisible", "infoSectionVisible", "showOffersHeader", "showInfoSection", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusLandingScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.SnapshotMutationPolicy, androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static final void a(PremiumBusStopSelectionViewState viewState, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        MutableState mutableState;
        MutableState mutableState2;
        int i3;
        ?? r13;
        int i4;
        Composer composer3;
        MutableState mutableState3;
        MutableState mutableState4;
        int i5;
        Function1 sendIntent = function1;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-893097810);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i6 = i2;
        if (composerStartRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893097810, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.NewPremiumBusLandingScreen (PremiumBusLandingScreen.kt:60)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue2;
            if (viewState.b) {
                composerStartRestartGroup.startReplaceGroup(1045934991);
                composer3 = composerStartRestartGroup;
                mutableState2 = mutableState6;
                mutableState = mutableState5;
                r13 = 0;
                i3 = 0;
                i4 = 32;
                ChaloLoadingDialogKt.b(StringResourcesHelperKt.c(StringEnum.PLEASE_WAIT, new Object[0], composerStartRestartGroup, 6), false, null, composer3, 0, 6);
            } else {
                mutableState = mutableState5;
                mutableState2 = mutableState6;
                i3 = 0;
                r13 = 0;
                i4 = 32;
                composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(1043028276);
            }
            composer3.endReplaceGroup();
            Object objRememberedValue3 = composer3.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r13, 2, r13);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composer3.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r13, 2, r13);
                composer3.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue4;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier, ScrollKt.rememberScrollState(i3, composer3, i3, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, i3);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i3);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i4));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, r13);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> i4));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, r13), Dp.m7278constructorimpl(Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() + ((Dp) mutableState2.getValue()).m7292unboximpl()) - ChaloTheme.b(composer3, 0).l)), Brush.Companion.m4566verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composer3, 0).z0), Color.m4595boximpl(ChaloTheme.a(composer3, 0).Z)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer3, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> i4));
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion4);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
            boolean zChanged = composer3.changed(density);
            Object objRememberedValue5 = composer3.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new f0(density, mutableState2, 25);
                composer3.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (Function1) objRememberedValue5);
            boolean z = viewState.h;
            long j = ChaloTheme.a(composer3, 0).Z;
            String str = viewState.l;
            if (str == null) {
                str = "";
            }
            int i10 = i6 & 112;
            Composer composer4 = composer3;
            d(modifierOnGloballyPositioned, function1, z, true, str, j, composer4, i10 | 3072, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, r13);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
            int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> i4));
            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor4);
            } else {
                composer4.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
            Object objRememberedValue6 = composer4.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new xq0(mutableState, 2);
                composer4.updateRememberedValue(objRememberedValue6);
            }
            Function1 function2 = (Function1) objRememberedValue6;
            int i12 = i6 << 3;
            int i13 = (i12 & 896) | (i12 & 112) | 24576;
            sendIntent = function1;
            b(null, viewState, sendIntent, density, function2, composer4, i13);
            composer2 = composer4;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, 0).h), composer2, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion4, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, 1, r13), ChaloTheme.b(composer2, 0).h), composer2, 0);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                mutableState3 = mutableState7;
                objRememberedValue7 = new xq0(mutableState3, 3);
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                mutableState3 = mutableState7;
            }
            Function1 function3 = (Function1) objRememberedValue7;
            boolean z2 = i10 == i4;
            Object objRememberedValue8 = composer2.rememberedValue();
            if (z2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new yt0(sendIntent, 14);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            f((Function0) objRememberedValue8, function3, r13, composer2, 48);
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composer2.startReplaceGroup(2004623376);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, 0).h), composer2, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion4, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, 1, r13), ChaloTheme.b(composer2, 0).h), composer2, 0);
            } else {
                composer2.startReplaceGroup(1998980012);
            }
            composer2.endReplaceGroup();
            Object objRememberedValue9 = composer2.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                mutableState4 = mutableState8;
                objRememberedValue9 = new xq0(mutableState4, 4);
                composer2.updateRememberedValue(objRememberedValue9);
            } else {
                mutableState4 = mutableState8;
            }
            e(r13, (Function1) objRememberedValue9, composer2, 48);
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                composer2.startReplaceGroup(2005275120);
                i5 = 0;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, 0).h), composer2, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion4, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, 1, r13), ChaloTheme.b(composer2, 0).h), composer2, 0);
            } else {
                i5 = 0;
                composer2.startReplaceGroup(1998980012);
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, i5).h), composer2, i5);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(viewState, sendIntent, modifier, i, 19));
        }
    }

    public static final void b(Modifier modifier, PremiumBusStopSelectionViewState viewState, Function1 sendIntent, Density localDensity, Function1 onSearchFieldRendered, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(localDensity, "localDensity");
        Intrinsics.i(onSearchFieldRendered, "onSearchFieldRendered");
        Composer composerStartRestartGroup = composer.startRestartGroup(1019575578);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(localDensity) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSearchFieldRendered) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019575578, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.NewPremiumBusLandingScreenContent (PremiumBusLandingScreen.kt:255)");
            }
            boolean z = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mh(localDensity, onSearchFieldRendered, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            g(composerStartRestartGroup, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            String str = viewState.d;
            composerStartRestartGroup.startReplaceGroup(796850506);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(796850959);
            int iPushStyle = builder.pushStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).v0, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResourcesHelperKt.c(StringEnum.FROM, new Object[0], composerStartRestartGroup, 6));
                builder.pop(iPushStyle);
                composerStartRestartGroup.endReplaceGroup();
                if (viewState.j) {
                    composerStartRestartGroup.startReplaceGroup(-830581073);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" ");
                        builder.pop(iPushStyle2);
                        int iPushStyle3 = builder.pushStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).B, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.a(ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0))).getFontWeight(), (FontStyle) null, (FontSynthesis) null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                        try {
                            builder.append("(" + StringResourcesHelperKt.c(StringEnum.CURRENT_LOCATION_SMALL, new Object[0], composerStartRestartGroup, 6) + ")");
                            builder.pop(iPushStyle3);
                        } catch (Throwable th) {
                            builder.pop(iPushStyle3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        builder.pop(iPushStyle2);
                        throw th2;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-840795046);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                String strC = StringResourcesHelperKt.c(StringEnum.TRAVELLING_FROM, new Object[0], composerStartRestartGroup, 6);
                String str2 = viewState.e;
                composerStartRestartGroup.startReplaceGroup(796893442);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(796894637);
                int iPushStyle4 = builder2.pushStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).v0, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
                try {
                    builder2.append(StringResourcesHelperKt.c(StringEnum.TO, new Object[0], composerStartRestartGroup, 6));
                    builder2.pop(iPushStyle4);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    String strC2 = StringResourcesHelperKt.c(StringEnum.TRAVELLING_TO, new Object[0], composerStartRestartGroup, 6);
                    TextStyle textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0));
                    String strC3 = StringResourcesHelperKt.c(StringEnum.SEARCH_FOR_BUS, new Object[0], composerStartRestartGroup, 6);
                    boolean z2 = viewState.c;
                    int i4 = i2 & 896;
                    boolean z3 = i4 == 256;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new sn0(sendIntent, 15);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    boolean z4 = i4 == 256;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new yt0(sendIntent, 11);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    boolean z5 = i4 == 256;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new yt0(sendIntent, 12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function2 = (Function0) objRememberedValue4;
                    boolean z6 = i4 == 256;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new yt0(sendIntent, 13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composer2 = composerStartRestartGroup;
                    PbLandingScreenRouteSearchKt.c(modifierM786paddingVpY3zN4$default, str, annotatedString, strC, str2, annotatedString2, strC2, textStyleC, strC3, z2, function1, function0, function2, (Function0) objRememberedValue5, composer2, 0, 0, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } catch (Throwable th3) {
                    builder2.pop(iPushStyle4);
                    throw th3;
                }
            } catch (Throwable th4) {
                builder.pop(iPushStyle);
                throw th4;
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier2, viewState, sendIntent, localDensity, onSearchFieldRendered, i, 23));
        }
    }

    public static final void c(Modifier modifier, ContentScale contentScale, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2017593827);
        int i2 = i | 54;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            ContentScale fit = ContentScale.INSTANCE.getFit();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017593827, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenImage (PremiumBusLandingScreen.kt:348)");
            }
            ImageKt.Image(PainterResourceHelperKt.a(IconType.PB_LANDING_IMAGE_NEW, composerStartRestartGroup, 6), "", SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i2 << 9) & 57344), 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contentScale = fit;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 1, modifier, contentScale));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0196  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x013a  */
    /* JADX WARN: Code duplicated, block: B:96:0x013e  */
    /* JADX WARN: Code duplicated, block: B:99:0x018e  */
    public static final void d(Modifier modifier, final Function1 sendIntent, boolean z, boolean z2, final String str, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        long j2;
        boolean z5;
        Composer composer2;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        int i6;
        Function0<ComposeUiNode> constructor;
        int i7;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(546752913);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j2 = j;
                        int i10 = composerStartRestartGroup.changed(j2) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        j2 = j;
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                if ((74899 & i3) != 74898) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                            i3 &= -458753;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier4 = modifier2;
                    }
                    i6 = i3;
                    boolean z8 = z3;
                    boolean z9 = z4;
                    long j4 = j2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(546752913, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenToolbar (PremiumBusLandingScreen.kt:365)");
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
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
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    ChaloToolBarKt.a(null, null, null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, j4, ComposableLambdaKt.rememberComposableLambda(1685542798, true, new pn0(z8, sendIntent, z9, str), composerStartRestartGroup, 54), null, false, null, composer2, (458752 & i6) | 1572864, 0, 1935);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z6 = z8;
                    z7 = z9;
                    j3 = j4;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    z6 = z3;
                    z7 = z4;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cu0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            PremiumBusLandingScreenKt.d(modifier3, sendIntent, z6, z7, str, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z2;
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                        i3 &= -458753;
                    }
                }
                i6 = i3;
                boolean z10 = z3;
                boolean z11 = z4;
                long j5 = j2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(546752913, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenToolbar (PremiumBusLandingScreen.kt:365)");
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i12), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2 = composerStartRestartGroup;
                ChaloToolBarKt.a(null, null, null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, j5, ComposableLambdaKt.rememberComposableLambda(1685542798, true, new pn0(z10, sendIntent, z11, str), composerStartRestartGroup, 54), null, false, null, composer2, (458752 & i6) | 1572864, 0, 1935);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z6 = z10;
                z7 = z11;
                j3 = j5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                z6 = z3;
                z7 = z4;
                j3 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cu0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        PremiumBusLandingScreenKt.d(modifier3, sendIntent, z6, z7, str, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        z3 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                        i3 &= -458753;
                    }
                }
                i6 = i3;
                boolean z12 = z3;
                boolean z13 = z4;
                long j6 = j2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(546752913, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenToolbar (PremiumBusLandingScreen.kt:365)");
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i13), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composer2 = composerStartRestartGroup;
                ChaloToolBarKt.a(null, null, null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, j6, ComposableLambdaKt.rememberComposableLambda(1685542798, true, new pn0(z12, sendIntent, z13, str), composerStartRestartGroup, 54), null, false, null, composer2, (458752 & i6) | 1572864, 0, 1935);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z6 = z12;
                z7 = z13;
                j3 = j6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                z6 = z3;
                z7 = z4;
                j3 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cu0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        PremiumBusLandingScreenKt.d(modifier3, sendIntent, z6, z7, str, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 3072;
        z4 = z2;
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            i3 |= i10;
        } else {
            j2 = j;
        }
        if ((74899 & i3) != 74898) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i9 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if ((i2 & 32) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                    i3 &= -458753;
                }
            } else {
                if (i8 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i9 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if ((i2 & 32) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 0).u;
                    i3 &= -458753;
                }
            }
            i6 = i3;
            boolean z14 = z3;
            boolean z15 = z4;
            long j7 = j2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546752913, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenToolbar (PremiumBusLandingScreen.kt:365)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i14), composerM3915constructorimpl4));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ChaloToolBarKt.a(null, null, null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, j7, ComposableLambdaKt.rememberComposableLambda(1685542798, true, new pn0(z14, sendIntent, z15, str), composerStartRestartGroup, 54), null, false, null, composer2, (458752 & i6) | 1572864, 0, 1935);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z6 = z14;
            z7 = z15;
            j3 = j7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            z6 = z3;
            z7 = z4;
            j3 = j2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cu0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PremiumBusLandingScreenKt.d(modifier3, sendIntent, z6, z7, str, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1034488796);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1034488796, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingInfoSection (PremiumBusLandingScreen.kt:227)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new f0(density, mutableState, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            PlotlineComposeWidgetKt.a(6, 0, composerStartRestartGroup, OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) objRememberedValue2), "pbLandingScreenInfo");
            Boolean bool = (Boolean) mutableState.getValue();
            bool.booleanValue();
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new PremiumBusLandingScreenKt$PremiumBusLandingInfoSection$3$1(function1, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ue(modifier, function1, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Function0 onViewAllClick, Function1 function1, Modifier modifier, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        int i2;
        Density density;
        int i3;
        boolean z;
        Intrinsics.i(onViewAllClick, "onViewAllClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1211266730);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211266730, i4, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingOfferSection (PremiumBusLandingScreen.kt:185)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1809549296);
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h);
                String strC = StringResourcesHelperKt.c(StringEnum.OFFERS_AND_PASSES, new Object[0], composerStartRestartGroup, 6);
                TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
                z = true;
                density = density2;
                i3 = 6;
                i2 = i4;
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(strC, modifierM784padding3ABfNKs, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 131068);
                composer2 = composerStartRestartGroup;
            } else {
                i2 = i4;
                density = density2;
                i3 = 6;
                z = true;
                composer2 = composerStartRestartGroup;
                modifier2 = companion;
                composer2.startReplaceGroup(1802151518);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            boolean zChanged = composer2.changed(density);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new f0(density, mutableState, 24);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            PlotlineComposeWidgetKt.a(i3, 0, composer2, OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) objRememberedValue2), "pbLandingOffersAndPasses");
            Boolean bool = (Boolean) mutableState.getValue();
            bool.getClass();
            boolean z2 = (i2 & 112) == 32 ? z : false;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new PremiumBusLandingScreenKt$PremiumBusLandingOfferSection$2$3$1(function1, mutableState, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier2, function1, onViewAllClick, i, 18));
        }
    }

    public static final void g(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2068279541);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2068279541, i, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusScreenHeaderLayout (PremiumBusLandingScreen.kt:412)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            c(null, null, composerStartRestartGroup, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            PlotlineComposeWidgetKt.a(6, 0, composerStartRestartGroup, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), "chaloBusCouponOfferBanner");
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 12));
        }
    }
}
