package app.chalo.ncmc.ui.cardrechargeamount.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BottomSheetContentWithIconTitleSubTextKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.GenericScreenWithCtaKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringArrayEnum;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.bj;
import defpackage.d0;
import defpackage.dj;
import defpackage.ej;
import defpackage.f;
import defpackage.g2;
import defpackage.ii;
import defpackage.pk0;
import defpackage.s4;
import defpackage.u6;
import defpackage.xs;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardRechargeAmountScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6309a;

        static {
            int[] iArr = new int[CardRechargeDataFetchErrorReason.values().length];
            try {
                iArr[CardRechargeDataFetchErrorReason.RECHARGE_CONFIG_FETCH_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_DETAILS_FETCH_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.NO_LINKED_CARD_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_RECHARGE_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.NO_ACTIVE_RECHARGE_CONFIG_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6309a = iArr;
        }
    }

    public static final void a(String maskedCardNumber, String sampleTitle, String sampleSubtitle, String sampleReceiptUrl, CardRechargeDataFetchErrorReason errorReason, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(maskedCardNumber, "maskedCardNumber");
        Intrinsics.i(sampleTitle, "sampleTitle");
        Intrinsics.i(sampleSubtitle, "sampleSubtitle");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        Intrinsics.i(errorReason, "errorReason");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(320693436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(maskedCardNumber) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleTitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleSubtitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleReceiptUrl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(errorReason.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320693436, i2, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountErrorScreen (ChaloCardRechargeAmountScreen.kt:204)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            ChaloToolBarKt.g(ChaloToolBarKt.l(companion, composerStartRestartGroup), "", 0L, null, composerStartRestartGroup, 48, 12);
            switch (WhenMappings.f6309a[errorReason.ordinal()]) {
                case 1:
                case 2:
                    composerStartRestartGroup.startReplaceGroup(2082346842);
                    boolean z = ((i2 & 458752) == 131072) | ((57344 & i2) == 16384);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new f(27, sendIntent, errorReason);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    c(maskedCardNumber, (Function1) objRememberedValue, errorReason, composerStartRestartGroup, (i2 & 14) | ((i2 >> 6) & 896));
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(2082850282);
                    boolean z2 = (i2 & 458752) == 131072;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ii(sendIntent, 16);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ChaloCardComposablesKt.b(sampleTitle, sampleSubtitle, sampleReceiptUrl, (Function0) objRememberedValue2, composerStartRestartGroup, (i2 >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                case 5:
                case 6:
                    composerStartRestartGroup.startReplaceGroup(2083439127);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, 1452641272);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(maskedCardNumber, sampleTitle, sampleSubtitle, sampleReceiptUrl, errorReason, sendIntent, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r21v0 */
    public static final void b(ChaloCardRechargeAmountViewState viewState, Function1 sendIntent, SoftwareKeyboardController softwareKeyboardController, SheetState bottomSheetState, Composer composer, int i) {
        int i2;
        SoftwareKeyboardController softwareKeyboardController2;
        SheetState sheetState;
        Composer composer2;
        int i3;
        ?? r0;
        char c;
        Intrinsics.i(viewState, "viewState");
        CardRechargeAmountLayoutType cardRechargeAmountLayoutType = viewState.j;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1361958697);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            softwareKeyboardController2 = softwareKeyboardController;
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController2) ? 256 : 128;
        } else {
            softwareKeyboardController2 = softwareKeyboardController;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetState) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361958697, i2, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreen (ChaloCardRechargeAmountScreen.kt:70)");
            }
            if (cardRechargeAmountLayoutType instanceof CardRechargeAmountLayoutType.ErrorLayout) {
                switch (WhenMappings.f6309a[((CardRechargeAmountLayoutType.ErrorLayout) cardRechargeAmountLayoutType).f6286a.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        composer2 = composerStartRestartGroup;
                        i3 = 441161931;
                        composer2.startReplaceGroup(441161931);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        composerStartRestartGroup.startReplaceGroup(444814351);
                        boolean z = (i2 & 112) == 32;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ii(sendIntent, 15);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composer2 = composerStartRestartGroup;
                        i3 = 441161931;
                        ChaloRoundedBottomSheetKt.a(bottomSheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1086661706, true, new d0(9, viewState, sendIntent), composerStartRestartGroup, 54), composer2, ((i2 >> 9) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                composer2 = composerStartRestartGroup;
                i3 = 441161931;
                composer2.startReplaceGroup(441161931);
            }
            composer2.endReplaceGroup();
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = xs.f(composer2);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            if (viewState.s) {
                composer2.startReplaceGroup(445456175);
                composer2.startReplaceGroup(1122749591);
                List listD0 = viewState.t;
                if (listD0.isEmpty()) {
                    listD0 = CollectionsKt.D0(StringResourcesHelperKt.b(StringArrayEnum.GEN_INSTRUCTIONS_ARR, composer2));
                }
                List list = listD0;
                composer2.endReplaceGroup();
                String strC = StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS_CAPS_C, new Object[0], composer2, 6);
                String strC2 = StringResourcesHelperKt.c(StringEnum.ACCEPT_CAPS, new Object[0], composer2, 6);
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (z2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ii(sendIntent, 19);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                String strC3 = StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composer2, 6);
                boolean z3 = i4 == 32;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (z3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ii(sendIntent, 20);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                c = ' ';
                Composer composer3 = composer2;
                r0 = 0;
                TncDialogUIKt.c(null, list, strC, strC2, function0, strC3, (Function0) objRememberedValue4, composer3, 0);
                composer2 = composer3;
            } else {
                int i5 = i3;
                r0 = 0;
                c = ' ';
                composer2.startReplaceGroup(i5);
            }
            composer2.endReplaceGroup();
            if (viewState.m) {
                composer2.startReplaceGroup(446143879);
                ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
            } else {
                composer2.startReplaceGroup(441161931);
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CardRechargeAmountLayoutType cardRechargeAmountLayoutType2 = viewState.j;
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new bj(8);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            sheetState = bottomSheetState;
            composerStartRestartGroup = composer2;
            AnimatedContentKt.AnimatedContent(cardRechargeAmountLayoutType2, null, (Function1) objRememberedValue5, null, null, null, ComposableLambdaKt.rememberComposableLambda(2018826949, true, new ej(viewState, focusRequester, softwareKeyboardController2, sendIntent, 0), composer2, 54), composerStartRestartGroup, 1573248, 58);
            composerStartRestartGroup.endNode();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | ((i2 & 7168) == 2048);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1(viewState, sheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(cardRechargeAmountLayoutType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState = bottomSheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 9, viewState, sendIntent, softwareKeyboardController, sheetState));
        }
    }

    public static final void c(String str, Function1 function1, CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, Composer composer, int i) {
        int i2;
        ColumnScopeInstance columnScopeInstance;
        int i3;
        ChaloCardRechargeScreenErrorContent chaloCardRechargeScreenErrorContent;
        Object obj;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2115470605);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(cardRechargeDataFetchErrorReason.ordinal()) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2115470605, i2, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.EnterAmountErrorScreen (ChaloCardRechargeAmountScreen.kt:256)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m784padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(1699224970);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                i3 = 1688221861;
                columnScopeInstance = columnScopeInstance2;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i2 & 14, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                columnScopeInstance = columnScopeInstance2;
                i3 = 1688221861;
                composerStartRestartGroup.startReplaceGroup(1688221861);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.j(composerStartRestartGroup, 0);
            ChaloCardRechargeScreenErrorContent chaloCardRechargeScreenErrorContentE = e(cardRechargeDataFetchErrorReason, composerStartRestartGroup, (i2 >> 6) & 14);
            IconType iconType = chaloCardRechargeScreenErrorContentE.f6310a;
            if (iconType != null) {
                composerStartRestartGroup.startReplaceGroup(1699601124);
                Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
                ImageKt.Image(painterA, "No card transactions", columnScopeInstance.align(AspectRatioKt.aspectRatio$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).u), Float.intBitsToFloat((int) (painterA.getB() >> 32)) / Float.intBitsToFloat((int) (painterA.getB() & BodyPartID.bodyIdMax)), false, 2, null), companion2.getCenterHorizontally()), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                composerStartRestartGroup.endReplaceGroup();
                chaloCardRechargeScreenErrorContent = chaloCardRechargeScreenErrorContentE;
                obj = null;
                i5 = 32;
                i4 = 0;
            } else {
                chaloCardRechargeScreenErrorContent = chaloCardRechargeScreenErrorContentE;
                obj = null;
                i4 = 0;
                i5 = 32;
                composerStartRestartGroup.startReplaceGroup(i3);
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.p(composerStartRestartGroup, i4);
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion, 0.8f);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
            int i7 = 1;
            String str2 = chaloCardRechargeScreenErrorContent.b;
            String str3 = chaloCardRechargeScreenErrorContent.c;
            String str4 = chaloCardRechargeScreenErrorContent.d;
            boolean z = chaloCardRechargeScreenErrorContent.e;
            int i8 = (i2 & 112) == i5 ? 1 : i4;
            if ((i2 & 896) != 256) {
                i7 = i4;
            }
            int i9 = i8 | i7;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dj(function1, cardRechargeDataFetchErrorReason, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Composer composer2 = composerStartRestartGroup;
            GenericScreenWithCtaKt.a(modifierFillMaxHeight, modifierFillMaxWidth$default, null, str2, str3, str4, z, (Function0) objRememberedValue, composer2, 54, 4);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 17, str, function1, cardRechargeDataFetchErrorReason));
        }
    }

    public static final void d(ColumnScope columnScope, CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(598486790);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cardRechargeDataFetchErrorReason.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(598486790, i2, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ErrorBottomsheet (ChaloCardRechargeAmountScreen.kt:308)");
            }
            switch (WhenMappings.f6309a[cardRechargeDataFetchErrorReason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(1111088684);
                    composer2.endReplaceGroup();
                    break;
                case 4:
                case 5:
                case 6:
                    composerStartRestartGroup.startReplaceGroup(1111368924);
                    ChaloCardRechargeScreenErrorContent chaloCardRechargeScreenErrorContentE = e(cardRechargeDataFetchErrorReason, composerStartRestartGroup, (i2 >> 3) & 14);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).k);
                    IconType iconType = chaloCardRechargeScreenErrorContentE.f6310a;
                    Modifier modifierAlign = columnScope.align(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).u), Alignment.INSTANCE.getCenterHorizontally());
                    String str = chaloCardRechargeScreenErrorContentE.b;
                    String str2 = chaloCardRechargeScreenErrorContentE.c;
                    composerStartRestartGroup.startReplaceGroup(-379770896);
                    String strC = chaloCardRechargeScreenErrorContentE.d;
                    if (strC.length() == 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
                    }
                    String str3 = strC;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new dj(function1, cardRechargeDataFetchErrorReason, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    BottomSheetContentWithIconTitleSubTextKt.a(modifierM785paddingVpY3zN4, iconType, modifierAlign, str, null, 0L, str2, null, 0L, str3, (Function0) objRememberedValue, null, null, composerStartRestartGroup, 0, 0, 6576);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, -379806105);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 16, columnScope, cardRechargeDataFetchErrorReason, function1));
        }
    }

    public static final ChaloCardRechargeScreenErrorContent e(CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, Composer composer, int i) {
        ChaloCardRechargeScreenErrorContent chaloCardRechargeScreenErrorContent;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(752405353, i, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.getErrorContent (ChaloCardRechargeAmountScreen.kt:353)");
        }
        switch (WhenMappings.f6309a[cardRechargeDataFetchErrorReason.ordinal()]) {
            case 1:
            case 2:
                composer.startReplaceGroup(-526124385);
                IconType iconType = IconType.NO_INTERNET_ERROR;
                String strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composer, 6);
                String upperCase = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN, new Object[0], composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                chaloCardRechargeScreenErrorContent = new ChaloCardRechargeScreenErrorContent(20, iconType, strC, (String) null, upperCase);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-525363428);
                composer.endReplaceGroup();
                chaloCardRechargeScreenErrorContent = new ChaloCardRechargeScreenErrorContent(31, (IconType) null, (String) null, (String) null, (String) null);
                break;
            case 4:
                composer.startReplaceGroup(-525231275);
                IconType iconType2 = IconType.IC_BLOCKED_CARD;
                String strC2 = StringResourcesHelperKt.c(StringEnum.CHALO_CARD_BLOCKED_ERROR_TITLE, new Object[0], composer, 6);
                String strC3 = StringResourcesHelperKt.c(StringEnum.CHALO_CARD_BLOCKED_ERROR_COPY, new Object[0], composer, 6);
                String upperCase2 = StringResourcesHelperKt.c(StringEnum.CHALO_CARD_BLOCKED_ERROR_CTA, new Object[0], composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase2, "toUpperCase(...)");
                chaloCardRechargeScreenErrorContent = new ChaloCardRechargeScreenErrorContent(iconType2, strC2, strC3, upperCase2, false);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-524684094);
                IconType iconType3 = IconType.IC_CHALO_CARD_ERROR;
                String strC4 = StringResourcesHelperKt.c(StringEnum.CHALO_CARD_RECHARGE_DISABLED_ERROR_TITLE, new Object[0], composer, 6);
                String strC5 = StringResourcesHelperKt.c(StringEnum.CHALO_CARD_RECHARGE_DISABLED_ERROR_COPY, new Object[0], composer, 6);
                String upperCase3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase3, "toUpperCase(...)");
                chaloCardRechargeScreenErrorContent = new ChaloCardRechargeScreenErrorContent(16, iconType3, strC4, strC5, upperCase3);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-525731615);
                IconType iconType4 = IconType.IC_CHALO_CARD_ERROR;
                String strC6 = StringResourcesHelperKt.c(StringEnum.CARD_RECHARGE_NOT_AVL, new Object[0], composer, 6);
                String upperCase4 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase4, "toUpperCase(...)");
                chaloCardRechargeScreenErrorContent = new ChaloCardRechargeScreenErrorContent(20, iconType4, strC6, (String) null, upperCase4);
                composer.endReplaceGroup();
                break;
            default:
                throw pk0.p(composer, 1507044991);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chaloCardRechargeScreenErrorContent;
    }
}
