package app.chalo.titoridedetail.ui.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.ChaloAlertTextKt;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.ChaloUserReviewFormComposableKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.buttons.ChaloSwipeToProceedButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoRouteData;
import app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import app.chalo.titoridedetail.ui.TITORideDetailBottomsheetType;
import app.chalo.titoridedetail.ui.TITORideDetailScreenType;
import app.chalo.titoridedetail.ui.TitoRideDetailContractKt;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.usecase.FeedbackData;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ag1;
import defpackage.b3;
import defpackage.dq;
import defpackage.fb1;
import defpackage.g2;
import defpackage.h01;
import defpackage.hw0;
import defpackage.i41;
import defpackage.l61;
import defpackage.lj1;
import defpackage.nj1;
import defpackage.oj1;
import defpackage.pb1;
import defpackage.pj1;
import defpackage.pk0;
import defpackage.qg;
import defpackage.r1;
import defpackage.rj1;
import defpackage.sh1;
import defpackage.sj1;
import defpackage.w31;
import defpackage.wc;
import defpackage.wl;
import defpackage.zt0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsViewState;", "viewState", "", "isBuffering", "", "stopErrorMessage", "userFeedbackTextString", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TitoRideDataScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9729a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TITORideDetailScreenType.values().length];
            try {
                iArr[TITORideDetailScreenType.MAP_WITH_ETA_BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TITORideDetailScreenType.MISSED_TAP_OUT_FEEDBACK_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TITORideDetailScreenType.TITO_ONBOARDING_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TITORideDetailScreenType.TITO_ONBOARDING_FINISH_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9729a = iArr;
            int[] iArr2 = new int[TITORideDetailBottomsheetType.values().length];
            try {
                iArr2[TITORideDetailBottomsheetType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TITORideDetailBottomsheetType.MISSED_TAP_OUT_DONE_BOTTOMSHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final void a(SheetState modalBottomSheetState, TitoRideDetailsViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(viewState, "viewState");
        TITORideDetailBottomsheetType tITORideDetailBottomsheetType = viewState.c;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1592916449);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modalBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1592916449, i4, -1, "app.chalo.titoridedetail.ui.compose.MissedTapOutFeedbackScreen (TitoRideDataScreen.kt:839)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue2;
            SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(modalBottomSheetState.getCurrentValue(), null, false, composerStartRestartGroup, 384, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(sheetStateRememberStandardBottomSheetState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new TitoRideDataScreenKt$MissedTapOutFeedbackScreen$1$1(viewState, sheetStateRememberStandardBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(tITORideDetailBottomsheetType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            Intrinsics.i(tITORideDetailBottomsheetType, "<this>");
            int i5 = TitoRideDetailContractKt.WhenMappings.f9704a[tITORideDetailBottomsheetType.ordinal()];
            if (i5 == 1) {
                i3 = 1;
                composerStartRestartGroup.startReplaceGroup(488883043);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(520718989);
                i3 = 1;
                ChaloRoundedBottomSheetKt.a(sheetStateRememberStandardBottomSheetState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1325183554, true, new nj1(viewState, sendIntent, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 26);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).m, 0.0f, 0.0f, 13, null);
            IconType iconType = IconType.MISSED_TAP_OUT;
            String strC = StringResourcesHelperKt.c(StringEnum.OOPS_YOU_MISSED_TAPPING_OUT, new Object[0], composerStartRestartGroup, 6);
            String strC2 = StringResourcesHelperKt.c(StringEnum.YOU_MIGHT_BE_FINED_NEXT_TIME_IF_YOU_DO_NOT_TAP_OUT, new Object[0], composerStartRestartGroup, 6);
            String strC3 = StringResourcesHelperKt.c(StringEnum.TELL_US_WHY, new Object[0], composerStartRestartGroup, 6);
            FeedbackData feedbackData = new FeedbackData(new Pair(0, Integer.valueOf(i3)), StringResourcesHelperKt.c(StringEnum.WHAT_WENT_WRONG, new Object[0], composerStartRestartGroup, 6), viewState.h, false);
            String strC4 = StringResourcesHelperKt.c(StringEnum.SUBMIT, new Object[0], composerStartRestartGroup, 6);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new zt0(12, snapshotStateList, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            int i6 = (i4 & 896) == 256 ? i3 : 0;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i6 != 0 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new w31(8, sendIntent, snapshotStateList, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Composer composer2 = composerStartRestartGroup;
            ChaloUserReviewFormComposableKt.a(modifierM788paddingqDBjuR0$default, iconType, strC, strC2, strC3, feedbackData, strC4, function2, (Function0) objRememberedValue5, composer2, 12845104);
            composerStartRestartGroup = composer2;
            if (viewState.d) {
                composerStartRestartGroup.startReplaceGroup(522680607);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(488883043);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 23, modalBottomSheetState, viewState, sendIntent));
        }
    }

    public static final void b(final Modifier modifier, final double d, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-564793318);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564793318, i2, -1, "app.chalo.titoridedetail.ui.compose.ReadyToDeboardComposable (TitoRideDataScreen.kt:766)");
            }
            long j = ChaloTheme.a(composerStartRestartGroup, 0).m0;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).c;
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloDividerComposableKt.a(f, 0, j, composerStartRestartGroup, PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 7, null));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.READY_TO_DEBOARD, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup.startReplaceGroup(-1200089829);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DONT_FORGET_TO_TAP_OUT, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).M, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 1, null);
            StringEnum stringEnum = StringEnum.SLIDE_TO_TAP_OUT;
            IconType iconType = IconType.SWIPE_RIGHT;
            IconType iconType2 = IconType.ORANGE_TICK;
            int i4 = i2 & 7168;
            boolean z = i4 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new pb1(sendIntent, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloSwipeToProceedButtonKt.a(modifierM786paddingVpY3zN4$default, stringEnum, iconType, iconType2, d, (Function0) objRememberedValue, composerStartRestartGroup, ((i2 << 6) & 57344) | 3504);
            String strC = StringResourcesHelperKt.c(StringEnum.MISSED_TAPPING_OUT_CAPS, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).m);
            boolean z2 = i4 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new pb1(sendIntent, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.f(strC, false, modifierM814height3ABfNKs, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 122);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qj1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TitoRideDataScreenKt.b(modifier, d, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(String str, String str2, TITOStopInfoEtaState tITOStopInfoEtaState, Composer composer, int i) {
        int i2;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(151813131);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(tITOStopInfoEtaState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(151813131, i2, -1, "app.chalo.titoridedetail.ui.compose.StopNameWithLiveEta (TitoRideDataScreen.kt:704)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i2 & 14, 0, 131066);
            TextKt.m2623TextNvy7gAk(str3, SizeKt.fillMaxWidth(companion, 0.6f), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, ((i2 >> 3) & 14) | 48, 24960, 110584);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getEnd(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            if (tITOStopInfoEtaState instanceof TITOStopInfoEtaState.Fetching) {
                composerStartRestartGroup.startReplaceGroup(-1370127131);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.REACHING, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                ShimmerEffectKt.a(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), ChaloTheme.b(composerStartRestartGroup, 0).g, 0.3f, null, 0L, 0L, composerStartRestartGroup, 384, 56);
                composerStartRestartGroup.endReplaceGroup();
            } else if (tITOStopInfoEtaState instanceof TITOStopInfoEtaState.LiveEta) {
                composerStartRestartGroup.startReplaceGroup(-1369568201);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.REACHING, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                TITOStopInfoEtaState.LiveEta liveEta = (TITOStopInfoEtaState.LiveEta) tITOStopInfoEtaState;
                if (liveEta.b == null) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1369284304);
                } else {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1369284303);
                    ChaloEtaComponentKt.a(liveEta.b, null, null, composerStartRestartGroup, 0, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (tITOStopInfoEtaState instanceof TITOStopInfoEtaState.Error) {
                composerStartRestartGroup.startReplaceGroup(-1369162938);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(tITOStopInfoEtaState instanceof TITOStopInfoEtaState.VehicleDataNotAvailable)) {
                    throw pk0.p(composerStartRestartGroup, -1706767214);
                }
                composerStartRestartGroup.startReplaceGroup(-1369092506);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 24, str, str2, tITOStopInfoEtaState));
        }
    }

    public static final void d(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-46987531);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-46987531, i, -1, "app.chalo.titoridedetail.ui.compose.StopNameWithLiveEtaShimmer (TitoRideDataScreen.kt:815)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShimmerEffectKt.a(null, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.3f, null, 0L, 0L, composerStartRestartGroup, 384, 57);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            ShimmerEffectKt.a(null, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.6f, null, 0L, 0L, composerStartRestartGroup, 384, 57);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getEnd(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
            ShimmerEffectKt.a(null, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.3f, null, 0L, 0L, composerStartRestartGroup, 384, 57);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            ShimmerEffectKt.a(null, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.3f, null, 0L, 0L, composerStartRestartGroup, 384, 57);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 23));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(Modifier modifier, StopAppModel stopAppModel, String str, String str2, TITOStopInfoEtaState tITOStopInfoEtaState, TITOStopInfoEtaState tITOStopInfoEtaState2, Composer composer, int i) {
        int i2;
        String strC;
        int i3;
        int i4;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1814583159);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(stopAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(tITOStopInfoEtaState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(tITOStopInfoEtaState2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(false) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814583159, i2, -1, "app.chalo.titoridedetail.ui.compose.TapInCardDetail (TitoRideDataScreen.kt:506)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            TITOStopInfoEtaState.Fetching fetching = TITOStopInfoEtaState.Fetching.f9689a;
            boolean zEquals = tITOStopInfoEtaState2.equals(fetching);
            TITOStopInfoEtaState.VehicleDataNotAvailable vehicleDataNotAvailable = TITOStopInfoEtaState.VehicleDataNotAvailable.f9691a;
            if (zEquals || (tITOStopInfoEtaState2 instanceof TITOStopInfoEtaState.LiveEta)) {
                composerStartRestartGroup.startReplaceGroup(1788989697);
                if (tITOStopInfoEtaState.equals(fetching) || (tITOStopInfoEtaState instanceof TITOStopInfoEtaState.LiveEta)) {
                    composerStartRestartGroup.startReplaceGroup(1789096646);
                    composerStartRestartGroup.endReplaceGroup();
                    strC = null;
                } else if (tITOStopInfoEtaState instanceof TITOStopInfoEtaState.Error) {
                    composerStartRestartGroup.startReplaceGroup(1789152168);
                    composerStartRestartGroup.endReplaceGroup();
                    strC = ((TITOStopInfoEtaState.Error) tITOStopInfoEtaState).f9688a;
                } else {
                    if (!tITOStopInfoEtaState.equals(vehicleDataNotAvailable)) {
                        throw pk0.p(composerStartRestartGroup, 57709345);
                    }
                    composerStartRestartGroup.startReplaceGroup(1789284290);
                    strC = StringResourcesHelperKt.c(StringEnum.SOME_DETAILS_ARE_CURRENTLY_UNAVAILABLE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (tITOStopInfoEtaState2 instanceof TITOStopInfoEtaState.Error) {
                composerStartRestartGroup.startReplaceGroup(57724611);
                composerStartRestartGroup.endReplaceGroup();
                strC = ((TITOStopInfoEtaState.Error) tITOStopInfoEtaState2).f9688a;
            } else {
                if (!tITOStopInfoEtaState2.equals(vehicleDataNotAvailable)) {
                    throw pk0.p(composerStartRestartGroup, 57705977);
                }
                composerStartRestartGroup.startReplaceGroup(1789533778);
                strC = StringResourcesHelperKt.c(StringEnum.SOME_DETAILS_ARE_CURRENTLY_UNAVAILABLE, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            mutableState.setValue(strC);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            String str4 = (String) mutableState.getValue();
            if (str4 == null || str4.length() == 0) {
                i3 = 0;
                i4 = 1557207349;
                str3 = null;
                composerStartRestartGroup.startReplaceGroup(1557207349);
            } else {
                composerStartRestartGroup.startReplaceGroup(1578002583);
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m4604copywmQWz5c$default(ChaloTheme.a(composerStartRestartGroup, 0).a0, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).f);
                String str5 = (String) mutableState.getValue();
                Intrinsics.f(str5);
                str3 = null;
                i3 = 0;
                i4 = 1557207349;
                ChaloAlertTextKt.a(modifierM784padding3ABfNKs, str5, ChaloTypographyKt.a(ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0))), ChaloTheme.a(composerStartRestartGroup, 0).X, IconType.ALERT_ICON_RED, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).d, composerStartRestartGroup, 24576, 0);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            String str6 = stopAppModel != null ? stopAppModel.b : str3;
            if (str6 == null) {
                composerStartRestartGroup.startReplaceGroup(1578770297);
            } else {
                composerStartRestartGroup.startReplaceGroup(1578770298);
                f(composerStartRestartGroup, i3, str6);
            }
            composerStartRestartGroup.endReplaceGroup();
            k(str, str2, tITOStopInfoEtaState, tITOStopInfoEtaState2, composerStartRestartGroup, (i2 >> 6) & 8190);
            composerStartRestartGroup.startReplaceGroup(i4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(modifier, (Object) stopAppModel, (Object) str, (Object) str2, (Object) tITOStopInfoEtaState, (Object) tITOStopInfoEtaState2, i, 16));
        }
    }

    public static final void f(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1378834795);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1378834795, i2, -1, "app.chalo.titoridedetail.ui.compose.TapInCardHeader (TitoRideDataScreen.kt:566)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BOARDED_AT, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 13, null), 0.6f), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i2 & 14, 24960, 110584);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAPPED_IN, new Object[0], composerStartRestartGroup, 6), rowScopeInstance.align(PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composerStartRestartGroup, 0).C, ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).e, ChaloTheme.b(composerStartRestartGroup, 0).c), companion2.getCenterVertically()), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 18));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public static final void g(Modifier modifier, TitoRideDetailsViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        TITOStopInfoEtaState tITOStopInfoEtaState;
        TITOStopInfoEtaState tITOStopInfoEtaState2;
        String str;
        String str2;
        Modifier.Companion companion;
        StopAppModel stopAppModel;
        Modifier.Companion companion2;
        String str3;
        TitoRouteData titoRouteData;
        TitoRouteData.RouteData routeDataA;
        StopAppModel stopAppModel2;
        TitoRouteData titoRouteData2;
        TitoRouteData.RouteData routeDataA2;
        TITOStopInfoEtaState tITOStopInfoEtaState3;
        StopAppModel stopAppModel3;
        Intrinsics.i(viewState, "viewState");
        TitoRideDataAppModel titoRideDataAppModel = viewState.f9723a;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(50494098);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(50494098, i3, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneDetailCard (TitoRideDataScreen.kt:434)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            ChaloDividerComposableKt.a(ChaloTheme.b(composerStartRestartGroup, 0).d, 0, ChaloTheme.a(composerStartRestartGroup, 0).S, composerStartRestartGroup, columnScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(SizeKt.m833width3ABfNKs(companion5, ChaloTheme.b(composerStartRestartGroup, 0).n), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 7, null), companion3.getCenterHorizontally()));
            composerStartRestartGroup = composerStartRestartGroup;
            TitoVehicleAndEtaData titoVehicleAndEtaData = titoRideDataAppModel != null ? titoRideDataAppModel.c : null;
            boolean z = titoVehicleAndEtaData instanceof TitoVehicleAndEtaData.RideData;
            TITOStopInfoEtaState tITOStopInfoEtaState4 = TITOStopInfoEtaState.Fetching.f9689a;
            if (z) {
                TitoVehicleAndEtaData titoVehicleAndEtaData2 = titoRideDataAppModel.c;
                TitoVehicleAndEtaData titoVehicleAndEtaData3 = titoRideDataAppModel.c;
                TitoVehicleAndEtaData.RideData rideDataA = titoVehicleAndEtaData2.a();
                str2 = (rideDataA == null || (stopAppModel3 = rideDataA.f9687a) == null) ? null : stopAppModel3.b;
                TitoVehicleAndEtaData.RideData rideDataA2 = titoVehicleAndEtaData3.a();
                if (rideDataA2 == null || (tITOStopInfoEtaState = rideDataA2.c) == null) {
                    tITOStopInfoEtaState = tITOStopInfoEtaState4;
                }
                TitoVehicleAndEtaData.RideData rideDataA3 = titoVehicleAndEtaData3.a();
                if (rideDataA3 != null && (tITOStopInfoEtaState3 = rideDataA3.b) != null) {
                    tITOStopInfoEtaState4 = tITOStopInfoEtaState3;
                }
                tITOStopInfoEtaState2 = tITOStopInfoEtaState4;
            } else {
                if (Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.VehicleNotAvailable.f9685a)) {
                    str2 = "-";
                    tITOStopInfoEtaState = TITOStopInfoEtaState.VehicleDataNotAvailable.f9691a;
                    tITOStopInfoEtaState2 = tITOStopInfoEtaState;
                } else {
                    if (!(titoVehicleAndEtaData instanceof TitoVehicleAndEtaData.DataFetchError.Error) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.RouteDataNotAvailable.f9683a) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.TapInDataNotAvailable.f9684a) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.Fetching.f9686a) && titoVehicleAndEtaData != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tITOStopInfoEtaState = tITOStopInfoEtaState4;
                    tITOStopInfoEtaState2 = tITOStopInfoEtaState;
                    str = null;
                }
                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(companion5, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                if (titoRideDataAppModel != null || (titoRouteData2 = titoRideDataAppModel.b) == null || (routeDataA2 = titoRouteData2.a()) == null) {
                    companion = companion5;
                    stopAppModel = null;
                } else {
                    stopAppModel = routeDataA2.b;
                    companion = companion5;
                }
                if (titoRideDataAppModel != null || (titoRouteData = titoRideDataAppModel.b) == null || (routeDataA = titoRouteData.a()) == null || (stopAppModel2 = routeDataA.c) == null) {
                    companion2 = companion;
                    str3 = null;
                } else {
                    Modifier.Companion companion6 = companion;
                    str3 = stopAppModel2.b;
                    companion2 = companion6;
                }
                e(modifierM786paddingVpY3zN4$default2, stopAppModel, str3, str, tITOStopInfoEtaState, tITOStopInfoEtaState2, composerStartRestartGroup, 0);
                b(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), viewState.i, sendIntent, composerStartRestartGroup, (i3 << 3) & 7168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            str = str2;
            Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(companion5, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            if (titoRideDataAppModel != null) {
                companion = companion5;
                stopAppModel = null;
            } else {
                companion = companion5;
                stopAppModel = null;
            }
            if (titoRideDataAppModel != null) {
                companion2 = companion;
                str3 = null;
            } else {
                companion2 = companion;
                str3 = null;
            }
            e(modifierM786paddingVpY3zN4$default3, stopAppModel, str3, str, tITOStopInfoEtaState, tITOStopInfoEtaState2, composerStartRestartGroup, 0);
            b(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), viewState.i, sendIntent, composerStartRestartGroup, (i3 << 3) & 7168);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sj1(modifier, viewState, sendIntent, i, 1));
        }
    }

    public static final void h(Modifier modifier, TitoRideDetailsViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248822319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248822319, i3, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneErrorCard (TitoRideDataScreen.kt:388)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).S;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ChaloDividerComposableKt.a(f, 0, j, composerStartRestartGroup, columnScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).n), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 7, null), companion.getCenterHorizontally()));
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FAILED_TO_FETCH_TRIP_DATA, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(companion3, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 13, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131068);
            String strC = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 7, null);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new rj1(sendIntent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(strC, PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierM788paddingqDBjuR0$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).d), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
            b(PaddingKt.m786paddingVpY3zN4$default(companion3, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), viewState.i, sendIntent, composer2, (i3 << 3) & 7168);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sj1(modifier, viewState, sendIntent, i, 0));
        }
    }

    public static final void i(int i, BottomSheetScaffoldState bottomSheetScaffoldState, Composer composer, TitoRideDetailsViewState titoRideDetailsViewState, Function1 function1) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-382518179);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(titoRideDetailsViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382518179, i2, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneErrorScreen (TitoRideDataScreen.kt:353)");
            }
            composer2 = composerStartRestartGroup;
            BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(768664430, true, new nj1(titoRideDetailsViewState, function1, 2), composerStartRestartGroup, 54), null, bottomSheetScaffoldState, Dp.m7278constructorimpl(80), 0.0f, null, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0.0f, 0.0f, null, false, null, null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1311620008, true, new pj1(titoRideDetailsViewState, 1), composerStartRestartGroup, 54), composer2, ((i2 << 6) & 896) | 3078, 1572870, 64434);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new oj1(bottomSheetScaffoldState, titoRideDetailsViewState, function1, i, 2));
        }
    }

    public static final void j(int i, BottomSheetScaffoldState bottomSheetScaffoldState, Composer composer, TitoRideDetailsViewState titoRideDetailsViewState, Function1 function1) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2040779880);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(titoRideDetailsViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040779880, i2, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneSuccessScreen (TitoRideDataScreen.kt:317)");
            }
            composer2 = composerStartRestartGroup;
            BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(439112297, true, new nj1(titoRideDetailsViewState, function1, 1), composerStartRestartGroup, 54), null, bottomSheetScaffoldState, Dp.m7278constructorimpl(80), 0.0f, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0.0f, 0.0f, null, false, null, null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1554439981, true, new pj1(titoRideDetailsViewState, 0), composerStartRestartGroup, 54), composer2, ((i2 << 6) & 896) | 3078, 1572870, 64402);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new oj1(bottomSheetScaffoldState, titoRideDetailsViewState, function1, i, 1));
        }
    }

    public static final void k(final String str, final String str2, final TITOStopInfoEtaState tITOStopInfoEtaState, final TITOStopInfoEtaState tITOStopInfoEtaState2, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        int i3;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-686506688);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(tITOStopInfoEtaState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(tITOStopInfoEtaState2) ? 2048 : 1024;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-686506688, i4, -1, "app.chalo.titoridedetail.ui.compose.TapInDropOffAndNextStopComposable (TitoRideDataScreen.kt:632)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).y0, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(261922747);
            TITOStopInfoEtaState.VehicleDataNotAvailable vehicleDataNotAvailable = TITOStopInfoEtaState.VehicleDataNotAvailable.f9691a;
            if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                composerStartRestartGroup.startReplaceGroup(261937192);
                c(StringResourcesHelperKt.c(StringEnum.NEXT_STOP_WITHOUT_COLON, new Object[0], composerStartRestartGroup, 6), "-", vehicleDataNotAvailable, composerStartRestartGroup, 432);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i6 = 0;
                function2 = new Function2() { // from class: tj1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i6) {
                            case 0:
                                ((Integer) obj3).intValue();
                                TitoRideDataScreenKt.k(str, str2, tITOStopInfoEtaState, tITOStopInfoEtaState2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj3).intValue();
                                TitoRideDataScreenKt.k(str, str2, tITOStopInfoEtaState, tITOStopInfoEtaState2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                composerStartRestartGroup.startReplaceGroup(237454508);
                composerStartRestartGroup.endReplaceGroup();
                if (str == null || str.length() == 0) {
                    composerStartRestartGroup.startReplaceGroup(237454508);
                } else {
                    composerStartRestartGroup.startReplaceGroup(262241116);
                    c(StringResourcesHelperKt.c(StringEnum.DROP_OFF, new Object[0], composerStartRestartGroup, 6), str, tITOStopInfoEtaState, composerStartRestartGroup, ((i4 << 3) & 112) | (i4 & 896));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                    i3 = 237454508;
                    obj = null;
                    composerStartRestartGroup.startReplaceGroup(237454508);
                } else {
                    composerStartRestartGroup.startReplaceGroup(262544017);
                    obj = null;
                    i3 = 237454508;
                    ChaloDividerComposableKt.a(ChaloTheme.b(composerStartRestartGroup, 0).c, 0, ChaloTheme.a(composerStartRestartGroup, 0).m0, composerStartRestartGroup, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str2 == null || str2.length() == 0) {
                    composerStartRestartGroup.startReplaceGroup(i3);
                } else {
                    composerStartRestartGroup.startReplaceGroup(262877267);
                    c(StringResourcesHelperKt.c(StringEnum.NEXT_STOP_WITHOUT_COLON, new Object[0], composerStartRestartGroup, 6), str2, tITOStopInfoEtaState2, composerStartRestartGroup, (i4 & 112) | ((i4 >> 3) & 896));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str == null || str.length() == 0) {
                    composerStartRestartGroup.startReplaceGroup(i3);
                } else {
                    composerStartRestartGroup.startReplaceGroup(263167892);
                    if ((tITOStopInfoEtaState2 instanceof TITOStopInfoEtaState.Error) || (tITOStopInfoEtaState2 instanceof TITOStopInfoEtaState.LiveEta) || tITOStopInfoEtaState2.equals(vehicleDataNotAvailable)) {
                        composerStartRestartGroup.startReplaceGroup(263324938);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!tITOStopInfoEtaState2.equals(TITOStopInfoEtaState.Fetching.f9689a)) {
                            throw pk0.p(composerStartRestartGroup, -822794706);
                        }
                        composerStartRestartGroup.startReplaceGroup(263388488);
                        ChaloDividerComposableKt.a(ChaloTheme.b(composerStartRestartGroup, 0).c, 0, ChaloTheme.a(composerStartRestartGroup, 0).m0, composerStartRestartGroup, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, obj));
                        d(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i7 = 1;
            function2 = new Function2() { // from class: tj1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i7) {
                        case 0:
                            ((Integer) obj3).intValue();
                            TitoRideDataScreenKt.k(str, str2, tITOStopInfoEtaState, tITOStopInfoEtaState2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj3).intValue();
                            TitoRideDataScreenKt.k(str, str2, tITOStopInfoEtaState, tITOStopInfoEtaState2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void l(int i, Composer composer, Modifier modifier, Function0 function0, Function0 function1) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1806260023);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806260023, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoOnboardingFinalScreen (TitoRideDataScreen.kt:981)");
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(modifier, Brush.Companion.m4566verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).D0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).t)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).X, composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ENJOY_HASSLE_FREE_EXPERIENCE_WITH, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DIGITAL_BUSES, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, TextUnitKt.getSp(32), FontWeight.INSTANCE.getExtraBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composerStartRestartGroup, 0, 0, 131070);
            ChaloSpacersKt.l(composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ImageKt.Image(IconAssetHelper_androidKt.a(IconType.BUS_AND_CITY_BACKGROUND, composerStartRestartGroup, 6), "", SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).w), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DONT_FORGET_TO_TAP_OUT_EMOJI, new Object[0], composerStartRestartGroup, 6), PaddingKt.m785paddingVpY3zN4(BorderKt.m275borderxT4_qwU(companion2, ChaloTheme.b(composerStartRestartGroup, 0).b, ChaloTheme.a(composerStartRestartGroup, 0).E0, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).f), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.GOT_IT_WITH_EXCLAIMATION, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).m);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(function0, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).m);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).b;
            ButtonElevation buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 0).f1917a, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).A;
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ag1(function1, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.b(modifierM814height3ABfNKs2, 0L, j, shape, null, buttonElevationM1675buttonElevationR_JCAzs, (Function0) objRememberedValue2, ComposableSingletons$TitoRideDataScreenKt.f9725a, composer2, 12582912, 18);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hw0(modifier, function0, function1, i, 1));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r20v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void m(app.chalo.titoridedetail.ui.TitoRideDetailsViewState r26, kotlin.jvm.functions.Function1 r27, androidx.compose.material3.BottomSheetScaffoldState r28, androidx.compose.material3.SheetState r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt.m(app.chalo.titoridedetail.ui.TitoRideDetailsViewState, kotlin.jvm.functions.Function1, androidx.compose.material3.BottomSheetScaffoldState, androidx.compose.material3.SheetState, androidx.compose.runtime.Composer, int):void");
    }

    public static final void n(int i, BottomSheetScaffoldState bottomSheetScaffoldState, Composer composer, TitoRideDetailsViewState titoRideDetailsViewState, Function1 function1) {
        int i2;
        TitoRouteData titoRouteData;
        Composer composerStartRestartGroup = composer.startRestartGroup(666749208);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(titoRideDetailsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(666749208, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoRideDetailMapWithEtaBottomSheetScreen (TitoRideDataScreen.kt:281)");
            }
            TitoRideDataAppModel titoRideDataAppModel = titoRideDetailsViewState.f9723a;
            TitoRouteData.Fetching fetching = TitoRouteData.Fetching.f9680a;
            if (titoRideDataAppModel == null || (titoRouteData = titoRideDataAppModel.b) == null) {
                titoRouteData = fetching;
            }
            if (titoRouteData.equals(TitoRouteData.DataFetchError.RouteDataNotAvailable.f9679a)) {
                composerStartRestartGroup.startReplaceGroup(-1097741797);
                i(((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 896), bottomSheetScaffoldState, composerStartRestartGroup, titoRideDetailsViewState, function1);
                composerStartRestartGroup.endReplaceGroup();
            } else if (titoRouteData.equals(fetching)) {
                composerStartRestartGroup.startReplaceGroup(-1097498819);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(titoRouteData instanceof TitoRouteData.RouteData)) {
                    throw pk0.p(composerStartRestartGroup, 795869094);
                }
                composerStartRestartGroup.startReplaceGroup(-1097194151);
                j(((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 896), bottomSheetScaffoldState, composerStartRestartGroup, titoRideDetailsViewState, function1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new oj1(titoRideDetailsViewState, bottomSheetScaffoldState, function1, i));
        }
    }

    public static final void o(TitoRideDetailsViewState titoRideDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, SheetState sheetState, ExoPlayer exoPlayer, boolean z, Composer composer, int i) {
        int i2;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        Function1 function2;
        SheetState sheetState2;
        ExoPlayer exoPlayer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1093285979);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(titoRideDetailsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState2) ? 32 : 16;
        } else {
            bottomSheetScaffoldState2 = bottomSheetScaffoldState;
        }
        if ((i & 384) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i & 3072) == 0) {
            sheetState2 = sheetState;
            i2 |= composerStartRestartGroup.changed(sheetState2) ? 2048 : 1024;
        } else {
            sheetState2 = sheetState;
        }
        if ((i & 24576) == 0) {
            exoPlayer2 = exoPlayer;
            i2 |= composerStartRestartGroup.changedInstance(exoPlayer2) ? 16384 : 8192;
        } else {
            exoPlayer2 = exoPlayer;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1093285979, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoRideDetailScreen (TitoRideDataScreen.kt:223)");
            }
            TITORideDetailScreenType tITORideDetailScreenType = titoRideDetailsViewState.b;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(titoRideDetailsViewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sh1(titoRideDetailsViewState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnimatedContentKt.AnimatedContent(tITORideDetailScreenType, null, (Function1) objRememberedValue, null, "", null, ComposableLambdaKt.rememberComposableLambda(1959799795, true, new lj1(titoRideDetailsViewState, bottomSheetScaffoldState2, function2, sheetState2, exoPlayer2, z), composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(titoRideDetailsViewState, bottomSheetScaffoldState, function1, sheetState, exoPlayer, z, i));
        }
    }

    public static final void p(TITORideDetailBottomsheetType tITORideDetailBottomsheetType, StringEnum stringEnum, StringEnum stringEnum2, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1450617505);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(tITORideDetailBottomsheetType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stringEnum.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(stringEnum2.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450617505, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoRideDetailsBottomSheetContent (TitoRideDataScreen.kt:914)");
            }
            int i3 = WhenMappings.b[tITORideDetailBottomsheetType.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(615188161);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1820960326);
                }
                composerStartRestartGroup.startReplaceGroup(615336341);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 120;
                ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(LottieType.VALIDATION_SUCCESS_LOTTIE, composerStartRestartGroup, 6), 1, false, composerStartRestartGroup, 48, 28), (String) null, SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion, Dp.m7278constructorimpl(f)), Dp.m7278constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 432, 120);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, (i2 >> 3) & 14);
                TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 130042);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum2, new Object[0], composerStartRestartGroup, (i2 >> 6) & 14), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130042);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                String strC2 = StringResourcesHelperKt.c(StringEnum.VIEW_RECEIPT_CAPS, new Object[0], composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z = (57344 & i2) == 16384;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ag1(function1, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC2, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                String strC3 = StringResourcesHelperKt.c(StringEnum.EXIT_CAPS, new Object[0], composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z2 = (i2 & 7168) == 2048;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ag1(function0, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloFilledButtonKt.f(strC3, false, modifierFillMaxWidth$default3, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 122);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new l61(tITORideDetailBottomsheetType, stringEnum, stringEnum2, function0, function1, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(TitoRideDetailsComponent titoRideDetailsComponent, Composer composer, int i) {
        int i2;
        TitoRideDetailsComponent titoRideDetailsComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-53586148);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(titoRideDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53586148, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoRideDetailsScreen (TitoRideDataScreen.kt:116)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(titoRideDetailsComponent.t0(), composerStartRestartGroup);
            BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Expanded, null, false, composerStartRestartGroup, 390, 2), null, composerStartRestartGroup, 0, 2);
            SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            TitoRideDetailsViewState titoRideDetailsViewState = (TitoRideDetailsViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(titoRideDetailsComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                titoRideDetailsComponent2 = titoRideDetailsComponent;
                TitoRideDataScreenKt$TitoRideDetailsScreen$1$1 titoRideDataScreenKt$TitoRideDetailsScreen$1$1 = new TitoRideDataScreenKt$TitoRideDetailsScreen$1$1(1, titoRideDetailsComponent2, TitoRideDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(titoRideDataScreenKt$TitoRideDetailsScreen$1$1);
                objRememberedValue = titoRideDataScreenKt$TitoRideDetailsScreen$1$1;
            } else {
                titoRideDetailsComponent2 = titoRideDetailsComponent;
            }
            m(titoRideDetailsViewState, (Function1) ((KFunction) objRememberedValue), bottomSheetScaffoldStateRememberBottomSheetScaffoldState, sheetStateRememberStandardBottomSheetState, composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            titoRideDetailsComponent2 = titoRideDetailsComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(titoRideDetailsComponent2, i, 27));
        }
    }
}
