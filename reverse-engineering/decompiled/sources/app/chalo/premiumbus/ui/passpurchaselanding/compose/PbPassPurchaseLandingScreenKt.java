package app.chalo.premiumbus.ui.passpurchaselanding.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextWithFilledLeadingIconKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.passpurchaselanding.PBConnectingRoutesUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.PBPassPurchaseLandingScreenBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.PassInfoCardUISpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.PassInfoCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenType;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenUiSpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenViewState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldWithSwapButtonCardUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.cardwithtextleftandrighticon.ChaloCardWithTextLeftAndRightIconViewKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.fk0;
import defpackage.fq0;
import defpackage.gf;
import defpackage.la0;
import defpackage.mr0;
import defpackage.pk0;
import defpackage.t8;
import defpackage.u50;
import defpackage.wm0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PbPassPurchaseLandingScreenKt {
    public static final void a(PassInfoCardUIState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        List list = uiState.c;
        Object obj = uiState.f7650a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1442857102);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442857102, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PassDetailListComposable (PbPassPurchaseLandingScreen.kt:320)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PassInfoCardUISpecs passInfoCardUISpecs = (PassInfoCardUISpecs) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = passInfoCardUISpecs.f7649a;
            float f = passInfoCardUISpecs.e;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, chaloPadding), 0.0f, 1, null), ChaloColorTokenKt.c(passInfoCardUISpecs.f), ChaloThemeKt.d(passInfoCardUISpecs.g)), passInfoCardUISpecs.f7649a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            composerStartRestartGroup.startReplaceGroup(704578944);
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TextWithLeftAndTrailingRightIconComponentKt.a(null, (TextWithLeftAndRightIconUIState) obj2, composerStartRestartGroup, 0, 1);
                if (i4 != list.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(1457164526);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, f), composerStartRestartGroup, 0);
                    DividerUIStateKt.a(null, passInfoCardUISpecs.b, composerStartRestartGroup, 0, 1);
                    gf.r(companion3, f, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1444396060);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i4 = i5;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(uiState, i, 20));
        }
    }

    public static final void b(PbPassPurchaseLandingScreenUiSpecs spec, PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1284635778);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(spec) : composerStartRestartGroup.changedInstance(spec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284635778, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PassLandingScreenMainScreen (PbPassPurchaseLandingScreen.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            f(spec, state, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            ButtonUIState buttonUIState = state.j;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1781868548);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1781868547);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter());
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
                int i4 = CardDefaults.$stable;
                CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14);
                CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                CardKt.Card(modifierAlign, ChaloTheme.d(composerStartRestartGroup, 0).f1919a, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-1169578884, true, new u50(24, spec, buttonUIState), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mr0(spec, state, i, 1));
        }
    }

    public static final void c(PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1088151652);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pBPassPurchaseLandingScreenBottomSheetTypeUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088151652, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassLandingScreenSheet (PbPassPurchaseLandingScreen.kt:163)");
            }
            if (pBPassPurchaseLandingScreenBottomSheetTypeUIState instanceof PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection) {
                composerStartRestartGroup.startReplaceGroup(1287494573);
                MultipleOriginDestinationSelectionScreenKt.c(null, ((PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection) pBPassPurchaseLandingScreenBottomSheetTypeUIState).f7644a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (pBPassPurchaseLandingScreenBottomSheetTypeUIState instanceof PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion) {
                composerStartRestartGroup.startReplaceGroup(1287666995);
                PremiumBusNewRouteSuggestionScreenKt.a(null, ((PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion) pBPassPurchaseLandingScreenBottomSheetTypeUIState).f7645a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (pBPassPurchaseLandingScreenBottomSheetTypeUIState instanceof PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess) {
                composerStartRestartGroup.startReplaceGroup(1287846020);
                StandardErrorScreenKt.c(((PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess) pBPassPurchaseLandingScreenBottomSheetTypeUIState).f7646a, null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (pBPassPurchaseLandingScreenBottomSheetTypeUIState instanceof PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable) {
                composerStartRestartGroup.startReplaceGroup(1288010692);
                StandardErrorScreenKt.c(((PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable) pBPassPurchaseLandingScreenBottomSheetTypeUIState).f7647a, null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (pBPassPurchaseLandingScreenBottomSheetTypeUIState instanceof PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet) {
                composerStartRestartGroup.startReplaceGroup(1288167428);
                StandardErrorScreenKt.c(((PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet) pBPassPurchaseLandingScreenBottomSheetTypeUIState).f7648a, null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (pBPassPurchaseLandingScreenBottomSheetTypeUIState != null) {
                    throw pk0.p(composerStartRestartGroup, -2036680716);
                }
                composerStartRestartGroup.startReplaceGroup(1288249857);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pBPassPurchaseLandingScreenBottomSheetTypeUIState, i, 22));
        }
    }

    public static final void d(PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState screenType, SheetState modalBottomSheetState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(screenType, "screenType");
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState = screenType.h;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1263474361);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(screenType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1263474361, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassLandingScreenSheetHandling (PbPassPurchaseLandingScreen.kt:138)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(screenType) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PbPassPurchaseLandingScreenKt$PbPassLandingScreenSheetHandling$1$1(screenType, modalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(pBPassPurchaseLandingScreenBottomSheetTypeUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (pBPassPurchaseLandingScreenBottomSheetTypeUIState != null) {
                composerStartRestartGroup.startReplaceGroup(929295243);
                boolean z = (i2 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new fq0(sendIntent, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) objRememberedValue2, false, false, false, ComposableLambdaKt.rememberComposableLambda(114480870, true, new la0(screenType, 14), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            } else {
                composerStartRestartGroup.startReplaceGroup(923157243);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 11, screenType, modalBottomSheetState, sendIntent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        final PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent2 = pbPassPurchaseLandingScreenComponent;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1775857158);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pbPassPurchaseLandingScreenComponent2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1775857158, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreen (PbPassPurchaseLandingScreen.kt:57)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(pbPassPurchaseLandingScreenComponent2.t0(), composerStartRestartGroup);
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(((PbPassPurchaseLandingScreenViewState) mutableStateA.getValue()).f7674a);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = ((PbPassPurchaseLandingScreenViewState) mutableStateA.getValue()).f7674a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            PbPassPurchaseLandingScreenUiSpecs pbPassPurchaseLandingScreenUiSpecs = (PbPassPurchaseLandingScreenUiSpecs) objRememberedValue3;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            PbPassPurchaseLandingScreenType pbPassPurchaseLandingScreenType = ((PbPassPurchaseLandingScreenViewState) mutableStateA.getValue()).b;
            if (Intrinsics.d(pbPassPurchaseLandingScreenType, PbPassPurchaseLandingScreenType.Loading.f7670a)) {
                composerStartRestartGroup.startReplaceGroup(773265049);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (pbPassPurchaseLandingScreenType instanceof PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenErrorUIState) {
                    composerStartRestartGroup.startReplaceGroup(773269338);
                    StandardErrorScreenKt.c(((PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenErrorUIState) pbPassPurchaseLandingScreenType).f7671a, null, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(pbPassPurchaseLandingScreenType instanceof PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState)) {
                        throw pk0.p(composerStartRestartGroup, 773262051);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1798289376);
                    PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState pbPassPurchaseLandingScreenSuccessUIState = (PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState) pbPassPurchaseLandingScreenType;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(pbPassPurchaseLandingScreenComponent2);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        PbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$1$1$1 pbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$1$1$1 = new PbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$1$1$1(1, pbPassPurchaseLandingScreenComponent2, PbPassPurchaseLandingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;)V", 0);
                        composerStartRestartGroup.updateRememberedValue(pbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$1$1$1);
                        objRememberedValue4 = pbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$1$1$1;
                    }
                    d(pbPassPurchaseLandingScreenSuccessUIState, sheetStateRememberModalBottomSheetState, (Function1) ((KFunction) objRememberedValue4), composerStartRestartGroup, 0);
                    b(pbPassPurchaseLandingScreenUiSpecs, pbPassPurchaseLandingScreenSuccessUIState, composerStartRestartGroup, 0);
                    LoadingDialogUIState loadingDialogUIState = pbPassPurchaseLandingScreenSuccessUIState.e;
                    if (loadingDialogUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(-1797880425);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        t8.m(composerStartRestartGroup, -1797880424, loadingDialogUIState, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pbPassPurchaseLandingScreenComponent2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: app.chalo.premiumbus.ui.passpurchaselanding.compose.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            SheetState sheetState = sheetStateRememberModalBottomSheetState;
                            if (sheetState.isVisible()) {
                                BuildersKt.d(coroutineScope, null, null, new PbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$2$1$1(sheetState, null), 3);
                            } else {
                                pbPassPurchaseLandingScreenComponent2.O0(PbPassPurchaseLandingScreenIntent.OnBackPressed.f7660a);
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composer2, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            pbPassPurchaseLandingScreenComponent2 = pbPassPurchaseLandingScreenComponent2;
            composerStartRestartGroup.endNode();
            zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pbPassPurchaseLandingScreenComponent2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function0() { // from class: app.chalo.premiumbus.ui.passpurchaselanding.compose.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        if (sheetState.isVisible()) {
                            BuildersKt.d(coroutineScope, null, null, new PbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$2$1$1(sheetState, null), 3);
                        } else {
                            pbPassPurchaseLandingScreenComponent2.O0(PbPassPurchaseLandingScreenIntent.OnBackPressed.f7660a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function0() { // from class: app.chalo.premiumbus.ui.passpurchaselanding.compose.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        if (sheetState.isVisible()) {
                            BuildersKt.d(coroutineScope, null, null, new PbPassPurchaseLandingScreenKt$PbPassPurchaseLandingScreen$2$1$1(sheetState, null), 3);
                        } else {
                            pbPassPurchaseLandingScreenComponent2.O0(PbPassPurchaseLandingScreenIntent.OnBackPressed.f7660a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composer2, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pbPassPurchaseLandingScreenComponent2 = pbPassPurchaseLandingScreenComponent2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pbPassPurchaseLandingScreenComponent2, i, 21));
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x034d  */
    public static final void f(PbPassPurchaseLandingScreenUiSpecs spec, final PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState state, Composer composer, int i) {
        int i2;
        int i3;
        BoxScopeInstance boxScopeInstance;
        Modifier modifier;
        int i4;
        float f;
        int i5;
        Modifier.Companion companion;
        int i6;
        Intrinsics.i(spec, "spec");
        DividerUIState dividerUIState = spec.c;
        Intrinsics.i(state, "state");
        ImageUrlUIState imageUrlUIState = state.b;
        PassInfoCardUIState passInfoCardUIState = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(1634680127);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(spec) : composerStartRestartGroup.changedInstance(spec) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        final int i7 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634680127, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen (PbPassPurchaseLandingScreen.kt:195)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(spec.f), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (state.l) {
                composerStartRestartGroup.startReplaceGroup(-1562724213);
                PlotlineComposeWidgetKt.a(6, 2, composerStartRestartGroup, null, "passInfoPlotlineWidget");
                composerStartRestartGroup.endReplaceGroup();
                passInfoCardUIState = passInfoCardUIState;
                boxScopeInstance = boxScopeInstance2;
                modifier = null;
                i4 = 1;
                companion4 = companion4;
                f = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1562589456);
                if (imageUrlUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(-1562517164);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    String str = imageUrlUIState.f10037a;
                    ContentScale contentScaleC = ImageUIStateKt.c(imageUrlUIState.d);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-545378947, true, new Function4() { // from class: lr0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                            switch (i7) {
                                case 0:
                                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(949497991, iIntValue, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:226)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it2, "it");
                                    if (composer3.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-545378947, iIntValue2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:213)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer3, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    AsyncImagePainter.State.Success it3 = (AsyncImagePainter.State.Success) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it3, "it");
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= (iIntValue3 & 64) == 0 ? composer4.changed(it3) : composer4.changedInstance(it3) ? 32 : 16;
                                    }
                                    if (composer4.shouldExecute((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-525463453, iIntValue3, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:219)");
                                        }
                                        ImageKt.Image(it3.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(state.b.d), 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 108);
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
                    }, composerStartRestartGroup, 54);
                    final int i10 = 2;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-525463453, true, new Function4() { // from class: lr0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                            switch (i10) {
                                case 0:
                                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(949497991, iIntValue, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:226)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it2, "it");
                                    if (composer3.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-545378947, iIntValue2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:213)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer3, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    AsyncImagePainter.State.Success it3 = (AsyncImagePainter.State.Success) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it3, "it");
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= (iIntValue3 & 64) == 0 ? composer4.changed(it3) : composer4.changedInstance(it3) ? 32 : 16;
                                    }
                                    if (composer4.shouldExecute((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-525463453, iIntValue3, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:219)");
                                        }
                                        ImageKt.Image(it3.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(state.b.d), 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 108);
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
                    }, composerStartRestartGroup, 54);
                    final int i11 = 0;
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(949497991, true, new Function4() { // from class: lr0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                            switch (i11) {
                                case 0:
                                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(949497991, iIntValue, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:226)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it2, "it");
                                    if (composer3.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-545378947, iIntValue2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:213)");
                                        }
                                        CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer3, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    AsyncImagePainter.State.Success it3 = (AsyncImagePainter.State.Success) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it3, "it");
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= (iIntValue3 & 64) == 0 ? composer4.changed(it3) : composer4.changedInstance(it3) ? 32 : 16;
                                    }
                                    if (composer4.shouldExecute((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-525463453, iIntValue3, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:219)");
                                        }
                                        ImageKt.Image(it3.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(state.b.d), 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 108);
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
                    }, composerStartRestartGroup, 54);
                    i4 = 1;
                    f = 0.0f;
                    boxScopeInstance = boxScopeInstance2;
                    modifier = null;
                    SingletonSubcomposeAsyncImageKt.a(str, null, modifierFillMaxWidth$default2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, null, null, contentScaleC, composerStartRestartGroup, 1794480, 0, 63368);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    boxScopeInstance = boxScopeInstance2;
                    modifier = null;
                    i4 = 1;
                    f = 0.0f;
                    composerStartRestartGroup.startReplaceGroup(-1561287332);
                    CommonImageKt.a(state.c, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, composerStartRestartGroup, 48, 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            CommonImageKt.a(state.f7672a, boxScopeInstance.align(ChaloThemeKt.c(companion2, spec.f7673a), companion3.getTopStart()), false, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState = state.i;
            if (searchFieldWithSwapButtonCardUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-649127887);
                composerStartRestartGroup.endReplaceGroup();
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-649127886);
                i5 = 0;
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                PBRouteSearchComposableKt.a(modifierM784padding3ABfNKs, searchFieldWithSwapButtonCardUIState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            PBConnectingRoutesUIState pBConnectingRoutesUIState = state.k;
            composerStartRestartGroup.startReplaceGroup(-648907879);
            DividerUIStateKt.a(modifier, dividerUIState, composerStartRestartGroup, i5, i4);
            Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, f, i4, modifier), ChaloTheme.a(composerStartRestartGroup, i5).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, i5).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, i5);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
            int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if ((composerStartRestartGroup.getApplier() != null ? i4 : i5) == 0) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion5 = companion4;
            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
            Composer composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, pBConnectingRoutesUIState.b, null, null, composer2, 0, 13);
            composerStartRestartGroup = composer2;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, pBConnectingRoutesUIState.f7643a), composerStartRestartGroup, i5);
            TextWithFilledLeadingIconKt.a(modifier, pBConnectingRoutesUIState.c, composerStartRestartGroup, 64);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceGroup();
            DividerUIStateKt.a(modifier, dividerUIState, composerStartRestartGroup, i5, i4);
            ChaloSpacersKt.o(composerStartRestartGroup, i5);
            if (passInfoCardUIState != null) {
                PassInfoCardUIState passInfoCardUIState2 = passInfoCardUIState;
                if (passInfoCardUIState2.c.isEmpty()) {
                    int i13 = i5;
                    companion = companion2;
                    i3 = i13;
                    i6 = 2;
                    composerStartRestartGroup.startReplaceGroup(-659091751);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-648178449);
                    ChaloTextViewKt.a(PaddingKt.m786paddingVpY3zN4$default(companion2, spec.b.b, f, 2, modifier), passInfoCardUIState2.b, null, null, composerStartRestartGroup, 0, 12);
                    composerStartRestartGroup = composerStartRestartGroup;
                    a(passInfoCardUIState2, composerStartRestartGroup, i5);
                    long j = ChaloTheme.a(composerStartRestartGroup, i5).r0;
                    int i14 = i5;
                    companion = companion2;
                    i3 = i14;
                    i6 = 2;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, j, null, 2, null), f, i4, modifier), ChaloTheme.b(composerStartRestartGroup, i3).f), composerStartRestartGroup, i3);
                }
            } else {
                int i15 = i5;
                companion = companion2;
                i3 = i15;
                i6 = 2;
                composerStartRestartGroup.startReplaceGroup(-659091751);
            }
            composerStartRestartGroup.endReplaceGroup();
            ImageUIState imageUIState = state.d;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-647654798);
            } else {
                composerStartRestartGroup.startReplaceGroup(-647654797);
                CommonImageKt.a(imageUIState, SizeKt.fillMaxWidth$default(companion, f, i4, modifier), false, composerStartRestartGroup, 48, 4);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, i3).r0, null, 2, null), f, i4, modifier), ChaloTheme.b(composerStartRestartGroup, i3).f), composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.p(composerStartRestartGroup, i3);
            ChaloCardWithTextLeftAndRightIconViewKt.a(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, i3).h, f, i6, modifier), state.g, composerStartRestartGroup, i3);
            ChaloSpacersKt.p(composerStartRestartGroup, i3);
            DividerUIStateKt.a(modifier, spec.d, composerStartRestartGroup, i3, i4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mr0(spec, state, i, i3));
        }
    }
}
