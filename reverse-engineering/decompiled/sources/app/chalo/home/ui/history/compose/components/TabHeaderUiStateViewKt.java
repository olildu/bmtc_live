package app.chalo.home.ui.history.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerSpec;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerSpec;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.HeaderTextUiState;
import app.chalo.home.ui.history.uistate.tabheader.ProfileAndCityContainerSpec;
import app.chalo.home.ui.history.uistate.tabheader.ProfileAndCityContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiSpec;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$NO_OP$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import defpackage.b3;
import defpackage.cg1;
import defpackage.fb1;
import defpackage.g61;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TabHeaderUiStateViewKt {
    public static final void a(Modifier modifier, ChaloCitySelectedContainerUiState uiState, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3464a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1842362993);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1842362993, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloLocationHeaderItem (TabHeaderUiStateView.kt:162)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloCitySelectedContainerSpec chaloCitySelectedContainerSpec = (ChaloCitySelectedContainerSpec) obj;
            Modifier modifierA = PlotlineComposeWidgetKt.a(modifier2, "PL_Location_Item");
            ChaloColorToken chaloColorToken = chaloCitySelectedContainerSpec.b;
            UIShape uIShape = chaloCitySelectedContainerSpec.c;
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(modifierA, ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(uIShape)), ChaloThemeKt.d(uIShape));
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            UiEventHandler$Companion$NO_OP$1 uiEventHandler$Companion$NO_OP$1 = UiEventHandler.Companion.f9897a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$NO_OP$1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TabHeaderUiStateViewKt$ChaloLocationHeaderItem$1$1(0, uiEventHandler$Companion$NO_OP$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(ClickableKt.m295clickableO2vRcR0$default(modifierClip, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) ((KFunction) objRememberedValue2), 28, null), chaloCitySelectedContainerSpec.f3463a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = uiState.b;
            composerStartRestartGroup.startReplaceGroup(-2147419429);
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.a(chaloCitySelectedContainerSpec.d, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(rowScopeInstance.weight(modifier2, 1.0f, false), uiState.c, null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            ImageUIState imageUIState2 = uiState.d;
            composerStartRestartGroup.startReplaceGroup(-2147157479);
            ChaloSpacersKt.a(chaloCitySelectedContainerSpec.e, composerStartRestartGroup, 0);
            CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 7, modifier2, uiState));
        }
    }

    public static final void b(HeaderAndIconContainerUiState headerAndIconContainerUiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-824690766);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(headerAndIconContainerUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-824690766, i2, -1, "app.chalo.home.ui.history.compose.components.HeadingAndIconTemplate (TabHeaderUiStateView.kt:269)");
            }
            boolean zChanged = composerStartRestartGroup.changed(headerAndIconContainerUiState.f3525a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = headerAndIconContainerUiState.f3525a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ((HeaderAndIconContainerSpec) objRememberedValue).f3524a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            HeaderTextUiState headerTextUiState = headerAndIconContainerUiState.b;
            Modifier modifierAlign = rowScopeInstance.align(SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, headerTextUiState.f3527a.b, 1, null), companion2.getCenterVertically());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, headerTextUiState.b, null, null, composer2, 0, 13);
            composer2.endNode();
            ImageUIState imageUIState = headerAndIconContainerUiState.c;
            if (imageUIState == null) {
                composer2.startReplaceGroup(790016944);
            } else {
                composer2.startReplaceGroup(790016945);
                Modifier modifierClip = ClipKt.clip(PlotlineComposeWidgetKt.a(companion, "PL_Page_Help_Icon"), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(50)));
                boolean zChangedInstance = composer2.changedInstance(headerAndIconContainerUiState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new g61(headerAndIconContainerUiState, 26);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                CommonImageKt.a(imageUIState, ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue2, 15, null), false, composer2, 0, 4);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(headerAndIconContainerUiState, i, 24));
        }
    }

    public static final void c(final ProfileAndCityContainerUiState profileAndCityContainerUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-125258035);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(profileAndCityContainerUiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125258035, i2, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem (TabHeaderUiStateView.kt:103)");
            }
            ProfileAndCityContainerSpec profileAndCityContainerSpec = profileAndCityContainerUiState.f3529a;
            ImageUrlUIState imageUrlUIState = profileAndCityContainerUiState.b;
            boolean zChanged = composerStartRestartGroup.changed(profileAndCityContainerSpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = profileAndCityContainerUiState.f3529a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ProfileAndCityContainerSpec profileAndCityContainerSpec2 = (ProfileAndCityContainerSpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), profileAndCityContainerSpec2.f3528a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            composerStartRestartGroup.startReplaceGroup(2013949168);
            PlotlineComposeWidgetKt.a(companion, "PL_Profile_Icon");
            ImageUISize imageUISize = imageUrlUIState.c;
            if (imageUISize != null) {
                ImageUIStateKt.b(companion, imageUISize);
            }
            ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape());
            UiEventHandler$Companion$NO_OP$1 uiEventHandler$Companion$NO_OP$1 = profileAndCityContainerUiState.f;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$NO_OP$1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TabHeaderUiStateViewKt$ProfileIconAndLocationItem$1$1$imgModifier$1$2$1(0, uiEventHandler$Companion$NO_OP$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null);
            composerStartRestartGroup.endReplaceGroup();
            SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, companion, ComposableLambdaKt.rememberComposableLambda(1669851870, true, new Function4() { // from class: ah1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1669851870, iIntValue, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:134)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(681259716, iIntValue2, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:127)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(profileAndCityContainerUiState.b.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1251299560, iIntValue3, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:137)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(681259716, true, new Function4() { // from class: ah1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1669851870, iIntValue, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:134)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(681259716, iIntValue2, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:127)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(profileAndCityContainerUiState.b.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1251299560, iIntValue3, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:137)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1251299560, true, new Function4() { // from class: ah1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1669851870, iIntValue, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:134)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(681259716, iIntValue2, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:127)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(profileAndCityContainerUiState.b.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1251299560, iIntValue3, -1, "app.chalo.home.ui.history.compose.components.ProfileIconAndLocationItem.<anonymous>.<anonymous>.<anonymous> (TabHeaderUiStateView.kt:137)");
                                }
                                CommonImageKt.a(profileAndCityContainerUiState.c, null, false, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), null, null, null, null, composerStartRestartGroup, 1794096, 0, 65416);
            ChaloSpacersKt.a(profileAndCityContainerSpec2.b, composerStartRestartGroup, 0);
            ImageUIState imageUIState = profileAndCityContainerUiState.d;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1991039477);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1991039476);
                CommonImageKt.a(imageUIState, companion, false, composerStartRestartGroup, 48, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            a(null, profileAndCityContainerUiState.e, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(profileAndCityContainerUiState, i, 25));
        }
    }

    public static final void d(Modifier modifier, TabHeaderUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        ProfileAndCityContainerUiState profileAndCityContainerUiState = uiState.b;
        Object obj = uiState.f3531a;
        HeaderAndIconContainerUiState headerAndIconContainerUiState = uiState.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1552368605);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552368605, i2, -1, "app.chalo.home.ui.history.compose.components.TabHeader (TabHeaderUiStateView.kt:57)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            TabHeaderUiSpec tabHeaderUiSpec = (TabHeaderUiSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), tabHeaderUiSpec.f3530a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (profileAndCityContainerUiState != null) {
                composerStartRestartGroup.startReplaceGroup(1393007511);
                c(profileAndCityContainerUiState, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1393145460);
                composerStartRestartGroup.endReplaceGroup();
                ChaloSpacersKt.a(tabHeaderUiSpec.c, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (headerAndIconContainerUiState != null) {
                    composerStartRestartGroup.startReplaceGroup(1393470744);
                    b(headerAndIconContainerUiState, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1389953205);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (headerAndIconContainerUiState != null) {
                composerStartRestartGroup.startReplaceGroup(1393633091);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1389953205);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1393732755);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1393850617);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 6, modifier, uiState));
        }
    }
}
