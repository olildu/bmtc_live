package app.chalo.home.ui.chalobus;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ProceedButtonShineOverlayKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.CommonFromAndToSelectionKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.chalobus.ChaloBusSearchFieldWithSwapButtonCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.fromto.StopBasedFromToSelectionContainerUISpec;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.fh;
import defpackage.hb;
import defpackage.kb;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shimmerTriggerSignal", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusSearchFieldWithSwapButtonCardKt {
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-60980111);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-60980111, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusExploreRoutesFooter (ChaloBusSearchFieldWithSwapButtonCard.kt:217)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 3, function0));
        }
    }

    public static final void b(final Modifier modifier, final String str, final String str2, final boolean z, final String str3, final int i, long j, final Function1 onStopsFieldClicked, final Function0 swapSearchFieldsClicked, final Function0 proceedBtnClicked, final Function0 function0, final Function0 function1, Composer composer, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        Composer composer2;
        final long j2;
        long j3;
        Intrinsics.i(onStopsFieldClicked, "onStopsFieldClicked");
        Intrinsics.i(swapSearchFieldsClicked, "swapSearchFieldsClicked");
        Intrinsics.i(proceedBtnClicked, "proceedBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-902409318);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str;
            i4 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        int i6 = i4 | 1572864;
        if ((i2 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onStopsFieldClicked) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(swapSearchFieldsClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(proceedBtnClicked) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i5;
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                j3 = 1000;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j3 = j;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-902409318, i6, i7, "app.chalo.home.ui.chalobus.ChaloBusSearchFieldWithSwapButtonCard (ChaloBusSearchFieldWithSwapButtonCard.kt:69)");
            }
            Modifier modifierA = PlotlineComposeWidgetKt.a(modifier, "PL_Search_Card");
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.c(composerStartRestartGroup, 0).b;
            int i8 = CardDefaults.$stable;
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i8 << 18, 62);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).i;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, composerStartRestartGroup, i8 << 12, 10);
            final String str5 = str4;
            final long j4 = j3;
            CardKt.Card(modifierA, shape, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1240339176, true, new Function3() { // from class: app.chalo.home.ui.chalobus.a
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ChaloColorToken.ShadyGray shadyGray;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240339176, iIntValue, -1, "app.chalo.home.ui.chalobus.ChaloBusSearchFieldWithSwapButtonCard.<anonymous> (ChaloBusSearchFieldWithSwapButtonCard.kt:79)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierAnimateContentSize$default);
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
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 0).h), composer3, 0);
                        String str6 = str5;
                        boolean z2 = str6 == null || str6.length() == 0;
                        String strC = StringResourcesHelperKt.c(StringEnum.FROM, new Object[0], composer3, 6);
                        String strC2 = StringResourcesHelperKt.c(StringEnum.CURRENT_LOCATION_SMALL, new Object[0], composer3, 6);
                        boolean z3 = z;
                        boolean zChanged = composer3.changed(z3) | composer3.changed(z2) | composer3.changed(strC) | composer3.changed(strC2);
                        Object objRememberedValue = composer3.rememberedValue();
                        ChaloColorToken.ShadyGray shadyGray2 = ChaloColorToken.ShadyGray.f9851a;
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            if (z3) {
                                objRememberedValue = new TextUIState.StyledTextUIState(CollectionsKt.S(new StyledTextDataUIState(vo1.A(strC, " "), shadyGray2, null, z2 ? UITextStyle.BodyLarge : UITextStyle.BodySmall, null, null, null, 1012), new StyledTextDataUIState(vo1.B("(", strC2, ")"), ChaloColorToken.Orange2.f9830a, null, z2 ? UITextStyle.BodyLarge : UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                                shadyGray = shadyGray2;
                            } else {
                                TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(strC, z2 ? UITextStyle.BodyLarge : UITextStyle.BodySmall, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                shadyGray = shadyGray2;
                                objRememberedValue = chaloTextUIState;
                            }
                            composer3.updateRememberedValue(objRememberedValue);
                        } else {
                            shadyGray = shadyGray2;
                        }
                        TextUIState textUIState = (TextUIState) objRememberedValue;
                        Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null);
                        ChaloColorToken.ShadyGray shadyGray3 = shadyGray;
                        StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = new StopBasedFromToSelectionContainerUISpec();
                        TextUIState.StyledTextUIState styledTextUIState = str6 != null ? new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str6, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18) : null;
                        Function1 function2 = onStopsFieldClicked;
                        boolean zChanged2 = composer3.changed(function2);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new fh(function2, 28);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        StopSelectionUIState stopSelectionUIState = new StopSelectionUIState(null, textUIState, styledTextUIState, null, null, UiEventHandler.Companion.a((Function0) objRememberedValue2), 25);
                        String strC3 = StringResourcesHelperKt.c(StringEnum.TO_SMALL, new Object[0], composer3, 6);
                        String str7 = str2;
                        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(strC3, (str7 == null || str7.length() == 0) ? UITextStyle.BodyLarge : UITextStyle.BodySmall, shadyGray3, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        TextUIState.StyledTextUIState styledTextUIState2 = str7 != null ? new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str7, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18) : null;
                        boolean zChanged3 = composer3.changed(function2);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new fh(function2, 29);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        CommonFromAndToSelectionKt.a(modifierM786paddingVpY3zN4$default, stopBasedFromToSelectionContainerUISpec, stopSelectionUIState, new StopSelectionUIState(null, chaloTextUIState2, styledTextUIState2, null, null, UiEventHandler.Companion.a((Function0) objRememberedValue3), 25), new FromToStopIconUIState(), new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composer3, 0).m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(swapSearchFieldsClicked), 102), composer3, 4608, 0);
                        ChaloSpacersKt.o(composer3, 0);
                        Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 0).n), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue4 == companion4.getEmpty()) {
                            objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(0);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
                        int i10 = i;
                        Integer numValueOf = Integer.valueOf(i10);
                        boolean zChanged4 = composer3.changed(i10);
                        Function0 function3 = function0;
                        boolean zChanged5 = zChanged4 | composer3.changed(function3);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == companion4.getEmpty()) {
                            objRememberedValue5 = new ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1(i10, function3, mutableIntState, null);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 0);
                        Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 0).n);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM814height3ABfNKs);
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
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default2, str3, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composer3, 0).getBodyMedium(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 0L, ChaloTheme.d(composer3, 0).g, false, ChaloTheme.b(composer3, 0).n, null, 0L, proceedBtnClicked, composer3, 0, TypedValues.CycleType.TYPE_WAVE_OFFSET);
                        ProceedButtonShineOverlayKt.b(mutableIntState.getIntValue(), ClipKt.clip(modifierM786paddingVpY3zN4$default2, ChaloTheme.d(composer3, 0).g), j4, 0.0f, 0.0f, 0.0f, 0, composer3, 48);
                        composer3.endNode();
                        Function0 function4 = function1;
                        if (function4 == null) {
                            composer3.startReplaceGroup(1464809229);
                        } else {
                            composer3.startReplaceGroup(1464809230);
                            ChaloSpacersKt.m(composer3, 0);
                            boolean zChanged6 = composer3.changed(function4);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged6 || objRememberedValue6 == companion4.getEmpty()) {
                                objRememberedValue6 = new hb(function4, 20);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            ChaloBusSearchFieldWithSwapButtonCardKt.a((Function0) objRememberedValue6, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 0).h), composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j2 = j4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    ChaloBusSearchFieldWithSwapButtonCardKt.b(modifier, str, str2, z, str3, i, j2, onStopsFieldClicked, swapSearchFieldsClicked, proceedBtnClicked, function0, function1, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
