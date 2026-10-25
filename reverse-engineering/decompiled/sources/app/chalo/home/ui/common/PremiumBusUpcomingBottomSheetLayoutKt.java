package app.chalo.home.ui.common;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusTripScheduleTagTextKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.c0;
import defpackage.h0;
import defpackage.i41;
import defpackage.nd;
import defpackage.ow0;
import defpackage.pk0;
import defpackage.u6;
import defpackage.wm0;
import defpackage.yu0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusUpcomingBottomSheetLayoutKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3381a;

        static {
            int[] iArr = new int[NewPremiumReserveTicketDetailsScreenType.values().length];
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3381a = iArr;
        }
    }

    public static final void a(PremiumBusBookingCardData premiumBusBookingCardData, Modifier modifier, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Function1 function1, Composer composer, int i) {
        int i2;
        Object obj;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule;
        Composer composerStartRestartGroup = composer.startRestartGroup(-84363263);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBookingCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj = function1;
            i2 |= composerStartRestartGroup.changedInstance(obj) ? 2048 : 1024;
        } else {
            obj = function1;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84363263, i3, -1, "app.chalo.home.ui.common.PremiumBusBookingCardInfoComponent (PremiumBusUpcomingBottomSheetLayout.kt:68)");
            }
            int i4 = WhenMappings.f3381a[newPremiumReserveTicketDetailsScreenType.ordinal()];
            if (i4 == 1) {
                premiumBusPostBookingStopSchedule = premiumBusBookingCardData.f;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                premiumBusPostBookingStopSchedule = premiumBusBookingCardData.g;
            }
            ChaloRoundedCardKt.b(modifier, ChaloTheme.d(composerStartRestartGroup, 0).e, ChaloTheme.c(composerStartRestartGroup, 0).e, 0.0f, ComposableLambdaKt.rememberComposableLambda(339917762, true, new c0(premiumBusBookingCardData, premiumBusPostBookingStopSchedule, newPremiumReserveTicketDetailsScreenType, obj, 15), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(premiumBusBookingCardData, modifier, newPremiumReserveTicketDetailsScreenType, function1, i, 28));
        }
    }

    public static final void b(PremiumBusBookingTripTimeInfoState.LiveEta tripTimeInfoState, NewPremiumReserveTicketDetailsScreenType screenType, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        String strC;
        Intrinsics.i(tripTimeInfoState, "tripTimeInfoState");
        Intrinsics.i(screenType, "screenType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-455349697);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(tripTimeInfoState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(screenType.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455349697, i3, -1, "app.chalo.home.ui.common.PremiumBusLiveInfoComponent (PremiumBusUpcomingBottomSheetLayout.kt:223)");
            }
            int i4 = WhenMappings.f3381a[screenType.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(495615138);
                strC = StringResourcesHelperKt.c(StringEnum.ARRIVING, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    throw pk0.p(composerStartRestartGroup, 495612554);
                }
                composerStartRestartGroup.startReplaceGroup(495618469);
                strC = StringResourcesHelperKt.c(StringEnum.DROP_OFF_IN, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 0, 24960, 110586);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            ChaloEtaComponentKt.a(tripTimeInfoState.b, companion, null, composerStartRestartGroup, (i3 >> 3) & 112, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(tripTimeInfoState, screenType, modifier2, i, 26));
        }
    }

    public static final void c(PremiumBusBookingCardData premiumBusBookingCardData, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-648487908);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBookingCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648487908, i2, -1, "app.chalo.home.ui.common.PremiumBusScheduleAndStopHeaderComponent (PremiumBusUpcomingBottomSheetLayout.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHALO_BUS_WITH_NO_PADDING, composerStartRestartGroup, 6), (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).H), ChaloTheme.b(composerStartRestartGroup, 0).G), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            PremiumBusTripScheduleTag f7414a = premiumBusBookingCardData.h.getF7414a();
            if (f7414a == null) {
                composerStartRestartGroup.startReplaceGroup(1237906494);
            } else {
                composerStartRestartGroup.startReplaceGroup(1237906495);
                PremiumBusTripScheduleTagTextKt.a(f7414a, null, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(premiumBusBookingCardData, i, 12));
        }
    }

    public static final void d(PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Modifier modifier, Function1 function1, PremiumBusBookingCardData premiumBusBookingCardData, Composer composer, int i) {
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-372808251);
        if ((i & 6) == 0) {
            obj = premiumBusPostBookingStopSchedule;
            i2 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = premiumBusPostBookingStopSchedule;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj2 = modifier;
            i2 |= composerStartRestartGroup.changed(obj2) ? 256 : 128;
        } else {
            obj2 = modifier;
        }
        if ((i & 3072) == 0) {
            obj3 = function1;
            i2 |= composerStartRestartGroup.changedInstance(obj3) ? 2048 : 1024;
        } else {
            obj3 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusBookingCardData) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372808251, i2, -1, "app.chalo.home.ui.common.PremiumBusScheduleAndStopInfoComponent (PremiumBusUpcomingBottomSheetLayout.kt:132)");
            }
            boolean zChanged = composerStartRestartGroup.changed(premiumBusBookingCardData.h);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Boolean.valueOf(premiumBusBookingCardData.h instanceof PremiumBusBookingTripTimeInfoState.LiveEta);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, 0.0f, ComposableLambdaKt.rememberComposableLambda(1211207878, true, new nd(obj2, ((Boolean) objRememberedValue).booleanValue(), obj3, premiumBusBookingCardData, newPremiumReserveTicketDetailsScreenType, obj, 3), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) premiumBusPostBookingStopSchedule, (Enum) newPremiumReserveTicketDetailsScreenType, modifier, (Function) function1, (Object) premiumBusBookingCardData, i, 25));
        }
    }

    public static final void e(final PremiumBusBookingCardData premiumBusBookingCardData, Modifier modifier, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2076504872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBookingCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = composerStartRestartGroup;
            final Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2076504872, i3, -1, "app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayout (PremiumBusUpcomingBottomSheetLayout.kt:45)");
            }
            if ((premiumBusBookingCardData != null ? premiumBusBookingCardData.o : null) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: nw0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        Composer composer3 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i5) {
                            case 0:
                                PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, companion, sendIntent, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, companion, sendIntent, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier modifierClip = ClipKt.clip(companion, ChaloTheme.d(composer2, 0).e);
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer2);
                IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer2);
                boolean zChangedInstance = composer2.changedInstance(premiumBusBookingCardData) | ((i3 & 896) == 256);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ow0(sendIntent, premiumBusBookingCardData, 0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                a(premiumBusBookingCardData, ClickableKt.m295clickableO2vRcR0$default(modifierClip, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), premiumBusBookingCardData.o, sendIntent, composer2, ((i3 << 3) & 7168) | (i3 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        modifier2 = modifier;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: nw0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, modifier2, sendIntent, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, modifier2, sendIntent, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
