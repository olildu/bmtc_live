package app.chalo.premiumbus.prebookedtickets.productmodification;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ar0;
import defpackage.b3;
import defpackage.dq;
import defpackage.fu0;
import defpackage.gu0;
import defpackage.iu0;
import defpackage.ju0;
import defpackage.kn0;
import defpackage.pk0;
import defpackage.qh;
import defpackage.r1;
import defpackage.sn0;
import defpackage.t20;
import defpackage.t3;
import defpackage.ve;
import defpackage.wm0;
import defpackage.yt0;
import defpackage.zc;
import defpackage.zr0;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusProductModificationReasonsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7353a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ProductModificationScreenType.values().length];
            try {
                iArr[ProductModificationScreenType.REASON_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7353a = iArr;
            int[] iArr2 = new int[PremiumReserveTicketOptionAction.values().length];
            try {
                iArr2[PremiumReserveTicketOptionAction.CANCEL_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.RESCHEDULE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHANGE_SEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CALL_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHAT_SUPPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHANGE_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[PremiumBusProductModificationDialogType.values().length];
            try {
                iArr3[PremiumBusProductModificationDialogType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PremiumBusProductModificationDialogType.CANCELLATION_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PremiumBusProductModificationDialogType.RESCHEDULE_CONFIRMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PremiumBusProductModificationDialogType.ORDER_CREATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public static final void a(Function0 onExploreAvailableRoutesClick, Function0 onOkBtnClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(onExploreAvailableRoutesClick, "onExploreAvailableRoutesClick");
        Intrinsics.i(onOkBtnClick, "onOkBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1702462018);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onExploreAvailableRoutesClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOkBtnClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1702462018, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.NoODPairAvailableBottomSheet (PremiumBusProductModificationReasonsScreen.kt:513)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = i2;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_ERROR_IMAGE, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_OD_PAIR_AVAILABLE_MSG, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131070);
            ChaloSpacersKt.j(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.EXPLORE_AVAILABLE_ROUTE, new Object[0], composerStartRestartGroup, 6);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).c;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n);
            boolean z = (i4 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(onExploreAvailableRoutesClick, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 0, 492);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY_RUNNING_CASE, new Object[0], composerStartRestartGroup, 6);
            Shape shape2 = ChaloTheme.d(composerStartRestartGroup, 0).c;
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n);
            boolean z2 = (i4 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ar0(onOkBtnClick, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.f(strC2, false, modifierM814height3ABfNKs2, null, shape2, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 106);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t20(onExploreAvailableRoutesClick, onOkBtnClick, i, 2));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919218793);
        int i2 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919218793, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusEmptySlotContent (PremiumBusProductModificationReasonsScreen.kt:474)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_NO_SLOTS_AVAILABLE, composerStartRestartGroup, 6);
            StringEnum stringEnum = StringEnum.NO_SLOTS_AVAILABLE_MSG;
            ImageKt.Image(painterA, StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6), SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).z, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24576, 104);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
            TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            TextAlign textAlignM7161boximpl = TextAlign.m7161boximpl(iM7168getCentere0LSkKk);
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(strC, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, textAlignM7161boximpl, 0L, 0, false, 0, 0, null, textStyleG, composerStartRestartGroup, 48, 0, 130040);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier2, i, 17));
        }
    }

    public static final void c(String str, PremiumBusProductModificationDialogType dialogType, Function1 sendIntent, Composer composer, int i) {
        String str2;
        int i2;
        boolean z;
        Intrinsics.i(dialogType, "dialogType");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(72397402);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(dialogType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72397402, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationDialogHandling (PremiumBusProductModificationReasonsScreen.kt:329)");
            }
            int i3 = WhenMappings.c[dialogType.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(717717372);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(717878665);
                String strC = StringResourcesHelperKt.c(StringEnum.PREMIUM_BUS_TICKET_CANCELLATION_CONFIRMATION_DIALOG_TITLE, new Object[0], composerStartRestartGroup, 6);
                String upperCase = StringResourcesHelperKt.c(StringEnum.YES, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                String strC2 = StringResourcesHelperKt.c(StringEnum.NO, new Object[0], composerStartRestartGroup, 6);
                int i4 = i2 & 896;
                boolean z2 = i4 == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new yt0(sendIntent, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z3 = i4 == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new yt0(sendIntent, 26);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function1 = (Function0) objRememberedValue2;
                z = i4 == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new yt0(sendIntent, 27);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ChaloConfirmationDialogKt.b(strC, null, upperCase, function0, strC2, function1, null, (Function0) objRememberedValue3, composerStartRestartGroup, 48, 64);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(718834891);
                String strC3 = StringResourcesHelperKt.c(StringEnum.PREMIUM_BUS_TICKET_RESCHEDULE_CONFIRMATION_DIALOG_TITLE, new Object[0], composerStartRestartGroup, 6);
                String upperCase2 = StringResourcesHelperKt.c(StringEnum.YES, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase2, "toUpperCase(...)");
                String strC4 = StringResourcesHelperKt.c(StringEnum.NO, new Object[0], composerStartRestartGroup, 6);
                int i5 = i2 & 896;
                boolean z4 = i5 == 256;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new yt0(sendIntent, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function2 = (Function0) objRememberedValue4;
                boolean z5 = i5 == 256;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new yt0(sendIntent, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function3 = (Function0) objRememberedValue5;
                z = i5 == 256;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new ju0(sendIntent, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ChaloConfirmationDialogKt.b(strC3, null, upperCase2, function2, strC4, function3, null, (Function0) objRememberedValue6, composerStartRestartGroup, 48, 64);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 4) {
                    throw pk0.p(composerStartRestartGroup, 854436337);
                }
                composerStartRestartGroup.startReplaceGroup(719777756);
                String upperCase3 = StringResourcesHelperKt.c(StringEnum.OK, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase3, "toUpperCase(...)");
                int i6 = i2 & 896;
                boolean z6 = i6 == 256;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new yt0(sendIntent, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function0 function4 = (Function0) objRememberedValue7;
                z = i6 == 256;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new yt0(sendIntent, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                ChaloConfirmationDialogKt.b(str2, null, upperCase3, function4, null, null, null, (Function0) objRememberedValue8, composerStartRestartGroup, (i2 & 14) | 24624, 96);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 21, str, dialogType, sendIntent));
        }
    }

    public static final void d(PremiumBusProductModificationReasonAppModel reason, Function0 onClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(reason, "reason");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1952827770);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(reason) : composerStartRestartGroup.changedInstance(reason) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1952827770, i3, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonCard (PremiumBusProductModificationReasonsScreen.kt:305)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(reason.b, PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(ClickableKt.m295clickableO2vRcR0$default(companion, RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, onClick, 28, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(reason, onClick, modifier2, i, 20));
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, List reasonsList, Function1 onClick) {
        int i2;
        Intrinsics.i(reasonsList, "reasonsList");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-36054362);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(reasonsList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36054362, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsList (PremiumBusProductModificationReasonsScreen.kt:277)");
            }
            int i3 = i2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            PaddingValues paddingValuesM779PaddingValuesYgX7TsA$default = PaddingKt.m779PaddingValuesYgX7TsA$default(0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reasonsList) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new iu0(0, reasonsList, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, paddingValuesM779PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_PERCENT_X);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(reasonsList, onClick, modifier, i, 5));
        }
    }

    public static final void f(PremiumBusProductModificationReasonsViewState state, SheetState modalBottomSheetState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(711986129);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(711986129, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsMainScreen (PremiumBusProductModificationReasonsScreen.kt:110)");
            }
            if (WhenMappings.f7353a[state.m.ordinal()] != 1) {
                throw pk0.p(composerStartRestartGroup, 1318877458);
            }
            composerStartRestartGroup.startReplaceGroup(-2064375846);
            int i3 = i2 & 896;
            h(state, modalBottomSheetState, sendIntent, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            composerStartRestartGroup.endReplaceGroup();
            if (state.j) {
                composerStartRestartGroup.startReplaceGroup(-2064135379);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2069450639);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusProductModificationDialogType premiumBusProductModificationDialogType = state.b;
            if (premiumBusProductModificationDialogType == null) {
                composerStartRestartGroup.startReplaceGroup(-2064070652);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2064070651);
                c(state.h, premiumBusProductModificationDialogType, sendIntent, composerStartRestartGroup, i3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new gu0(state, modalBottomSheetState, sendIntent, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1628058612);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusProductModificationReasonsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628058612, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreen (PremiumBusProductModificationReasonsScreen.kt:83)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(premiumBusProductModificationReasonsComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateA = SheetDefaultsHelperKt.a(true, null, SheetValue.Hidden, false, composerStartRestartGroup, 3462, 50);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusProductModificationReasonsComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kn0(premiumBusProductModificationReasonsComponent, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            PremiumBusProductModificationReasonsViewState premiumBusProductModificationReasonsViewState = (PremiumBusProductModificationReasonsViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(premiumBusProductModificationReasonsComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$2$1 premiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$2$1 = new PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$2$1(1, premiumBusProductModificationReasonsComponent, PremiumBusProductModificationReasonsComponent.class, "processIntent", "processIntent(Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(premiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$2$1);
                objRememberedValue2 = premiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$2$1;
            }
            f(premiumBusProductModificationReasonsViewState, sheetStateA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusProductModificationReasonsComponent, i, 17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(PremiumBusProductModificationReasonsViewState state, SheetState modalBottomSheetState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.i(state, "state");
        PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState = state.e;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1589118794);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i7 = i2;
        int i8 = 0;
        if (composerStartRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1589118794, i7, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreen (PremiumBusProductModificationReasonsScreen.kt:140)");
            }
            if (premiumBusBottomSheetTypeUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-1986164118);
                Object[] objArr = (i7 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new yt0(sendIntent, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                i3 = 0;
                i4 = 32;
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(-882180789, true, new fu0(i8, premiumBusBottomSheetTypeUIState, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            } else {
                i3 = 0;
                i4 = 32;
                composerStartRestartGroup.startReplaceGroup(-1992143336);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i4));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (state.d) {
                composerStartRestartGroup.startReplaceGroup(-1901165126);
                j(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), state.f, sendIntent, composerStartRestartGroup, ((i7 >> 3) & 112) | 384);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i5 = i7;
                i6 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1900918242);
                i5 = i7;
                i6 = 0;
                ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composerStartRestartGroup, 0, 63);
                composer2 = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).i), composer2, 0);
                i(state, sendIntent, composer2, (i5 & 14) | ((i5 >> 3) & 112));
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            int i10 = (composer2.changedInstance(state) ? 1 : 0) | ((i5 & 112) == i4 ? 1 : i6);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsScreen$7$1(state, modalBottomSheetState, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(premiumBusBottomSheetTypeUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gu0(state, modalBottomSheetState, sendIntent, i, 0));
        }
    }

    public static final void i(final PremiumBusProductModificationReasonsViewState state, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        final int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(state, "state");
        List list = state.f7354a;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(160051763);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160051763, i2, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenContent (PremiumBusProductModificationReasonsScreen.kt:214)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(657346411);
            PremiumReserveTicketOptionAction premiumReserveTicketOptionAction = state.c;
            int i5 = premiumReserveTicketOptionAction == null ? -1 : WhenMappings.b[premiumReserveTicketOptionAction.ordinal()];
            String strC = "";
            switch (i5) {
                case -1:
                    composerStartRestartGroup.startReplaceGroup(658004693);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 0:
                default:
                    throw pk0.p(composerStartRestartGroup, 1268129854);
                case 1:
                    composerStartRestartGroup.startReplaceGroup(1268131835);
                    strC = StringResourcesHelperKt.c(StringEnum.PREMIUM_RESERVE_TICKET_CANCEL_SCREEN_TITLE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(1268136543);
                    strC = StringResourcesHelperKt.c(StringEnum.PREMIUM_RESERVE_TICKET_RESCHEDULE_SCREEN_TITLE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(657670389);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(657760661);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(657867797);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(657956085);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
            }
            int i6 = i2;
            TextKt.m2623TextNvy7gAk(strC, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            if (state.i != null) {
                composerStartRestartGroup.startReplaceGroup(658416840);
                SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String str = state.i;
                boolean z = (i6 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new yt0(sendIntent, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloSnackbarKt.a(null, str, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 5);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i7 = 0;
                function2 = new Function2() { // from class: hu0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i7;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i8) {
                            case 0:
                                PremiumBusProductModificationReasonsScreenKt.i(state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                PremiumBusProductModificationReasonsScreenKt.i(state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                i3 = i;
                composerStartRestartGroup.startReplaceGroup(648538969);
                composerStartRestartGroup.endReplaceGroup();
                if (state.g) {
                    composerStartRestartGroup.startReplaceGroup(658782795);
                    k(null, 20, composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(658946165);
                    if (list == null) {
                        composerStartRestartGroup.startReplaceGroup(658946164);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(658946165);
                        boolean z2 = (i6 & 112) == 32;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new sn0(sendIntent, 16);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        e(0, composerStartRestartGroup, dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), list, (Function1) objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        i3 = i;
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = 1;
            function2 = new Function2() { // from class: hu0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i9) {
                        case 0:
                            PremiumBusProductModificationReasonsScreenKt.i(state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                            break;
                        default:
                            PremiumBusProductModificationReasonsScreenKt.i(state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void j(Modifier modifier, String str, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Function1 function1;
        Composer composer2;
        Modifier.Companion companion;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-79038941);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-79038941, i3, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductUserCancellationSuccessScreen (PremiumBusProductModificationReasonsScreen.kt:393)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getCenter()), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).l, 7, null);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 160;
            ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(LottieType.NEW_PAYMENT_SUCCESS, composerStartRestartGroup, 6), 0, false, composerStartRestartGroup, 0, 30), "", SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion4, Dp.m7278constructorimpl(f)), Dp.m7278constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 432, 120);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.RIDE_CANCELLED, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleM6753copyp1EtxEg$default = TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.a(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0))), 0L, TextUnitKt.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion5.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM6753copyp1EtxEg$default, composerStartRestartGroup, 48, 0, 130040);
            Composer composer3 = composerStartRestartGroup;
            if (str == null || str.length() == 0) {
                companion = companion4;
                composer3.startReplaceGroup(-576048101);
            } else {
                composer3.startReplaceGroup(-559162091);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer3, 0).g), composer3, 0);
                companion = companion4;
                TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloTheme.a(composer3, 0).w, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion5.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodyMedium(), composer3, (i3 & 14) | 48, 0, 130040);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer3, 0).h, 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM788paddingqDBjuR0$default2);
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
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY_SMALL, new Object[0], composer3, 6);
            float f2 = ChaloTheme.b(composer3, 0).n;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shape shape = ChaloTheme.d(composer3, 0).g;
            int i7 = i3 & 112;
            boolean z = i7 == 32;
            Object objRememberedValue = composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new yt0(sendIntent, 20);
                composer3.updateRememberedValue(objRememberedValue);
            }
            Composer composer4 = composer3;
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC2, null, 0L, shape, true, f2, null, 0L, (Function0) objRememberedValue, composer4, 196614, 396);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer4, 0).h), composer4, 0);
            String strC3 = StringResourcesHelperKt.c(StringEnum.BOOK_ANOTHER_RIDE_SMALL, new Object[0], composer4, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shape shape2 = ChaloTheme.d(composer4, 0).g;
            boolean z2 = i7 == 32;
            Object objRememberedValue2 = composer4.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                function1 = sendIntent;
                objRememberedValue2 = new yt0(function1, 21);
                composer4.updateRememberedValue(objRememberedValue2);
            } else {
                function1 = sendIntent;
            }
            composer2 = composer4;
            ChaloFilledButtonKt.f(strC3, false, modifierFillMaxWidth$default3, null, shape2, 0.0f, 0L, (Function0) objRememberedValue2, composer2, 384, 106);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = sendIntent;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ve(str, function1, modifier, i));
        }
    }

    public static final void k(Modifier modifier, int i, Composer composer, int i2) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(289938862);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289938862, i3, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusTicketActivationMoreOptionsShimmer (PremiumBusProductModificationReasonsScreen.kt:564)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1520572995);
            for (int i5 = 0; i5 < i; i5++) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).o), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).p, null, 2, null), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t3(modifier2, i, i2, 4));
        }
    }
}
