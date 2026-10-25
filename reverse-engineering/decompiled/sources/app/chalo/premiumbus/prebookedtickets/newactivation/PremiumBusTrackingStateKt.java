package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTrackingStateKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.ar0;
import defpackage.bu0;
import defpackage.gb;
import defpackage.i41;
import defpackage.pk0;
import defpackage.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTrackingStateKt {
    public static final void a(Modifier modifier, IconType iconType, final String msg, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        Composer composer2;
        final Modifier modifier2;
        final IconType iconType2;
        final long j5;
        final long j6;
        int i4;
        long j7;
        IconType iconType3;
        Modifier modifier3;
        long j8;
        Intrinsics.i(msg, "msg");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1059603437);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(msg) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                int i7 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                i3 |= i7;
            } else {
                j3 = j;
            }
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j4 = j2;
                int i8 = composerStartRestartGroup.changed(j4) ? 16384 : 8192;
                i3 |= i8;
            } else {
                j4 = j2;
            }
            i3 |= i8;
        } else {
            j4 = j2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier;
                IconType iconType4 = i6 != 0 ? IconType.IC_INFO_I : iconType;
                if ((i2 & 8) != 0) {
                    j3 = ChaloTheme.a(composerStartRestartGroup, 0).t0;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j4 = ChaloTheme.a(composerStartRestartGroup, 0).t0;
                    i3 &= -57345;
                }
                i4 = i3;
                j7 = j4;
                iconType3 = iconType4;
                modifier3 = modifier4;
                j8 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i4 = i3;
                j8 = j3;
                j7 = j4;
                modifier3 = modifier;
                iconType3 = iconType;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059603437, i4, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusInfoBannerComponent (PremiumBusTrackingState.kt:79)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(modifier3, ChaloTheme.a(composerStartRestartGroup, 0).r0, ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            Modifier modifier5 = modifier3;
            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(iconType3, composerStartRestartGroup, (i4 >> 3) & 14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            IconKt.m2070Iconww6aTOc(painterA, (String) null, SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), j8, composerStartRestartGroup, Painter.$stable | 48 | (i4 & 7168), 0);
            long j9 = j8;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            int i10 = (i4 >> 6) & 910;
            composer2 = composerStartRestartGroup;
            IconType iconType5 = iconType3;
            long j10 = j7;
            TextKt.m2623TextNvy7gAk(msg, i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, i10, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j6 = j10;
            iconType2 = iconType5;
            j5 = j9;
            modifier2 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            iconType2 = iconType;
            j5 = j3;
            j6 = j4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jw0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PremiumBusTrackingStateKt.a(modifier2, iconType2, msg, j5, j6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(Modifier modifier, PremiumReserveTicketTrackingState trackingState, Composer composer, int i) {
        int i2;
        Intrinsics.i(trackingState, "trackingState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909814791);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(trackingState) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909814791, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTrackingState (PremiumBusTrackingState.kt:33)");
            }
            if (trackingState instanceof PremiumReserveTicketTrackingState.TrackingNotStarted) {
                composerStartRestartGroup.startReplaceGroup(139554974);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                a(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), null, ((PremiumReserveTicketTrackingState.TrackingNotStarted) trackingState).f7479a, 0L, 0L, composerStartRestartGroup, 0, 26);
                composerStartRestartGroup.endReplaceGroup();
            } else if (trackingState instanceof PremiumReserveTicketTrackingState.GpsTrackingStarted) {
                composerStartRestartGroup.startReplaceGroup(139887294);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                a(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), null, ((PremiumReserveTicketTrackingState.GpsTrackingStarted) trackingState).f7478a, 0L, 0L, composerStartRestartGroup, 0, 26);
                composerStartRestartGroup.endReplaceGroup();
            } else if (trackingState.equals(PremiumReserveTicketTrackingState.EtaFetchStarted.f7476a) || trackingState.equals(PremiumReserveTicketTrackingState.Unknown.f7480a)) {
                composerStartRestartGroup.startReplaceGroup(140256039);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(trackingState instanceof PremiumReserveTicketTrackingState.GpsTrackingNotAvailable)) {
                    throw pk0.p(composerStartRestartGroup, -1380973541);
                }
                composerStartRestartGroup.startReplaceGroup(140339646);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                a(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), null, ((PremiumReserveTicketTrackingState.GpsTrackingNotAvailable) trackingState).f7477a, 0L, 0L, composerStartRestartGroup, 0, 26);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 18, modifier, trackingState));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 onDismiss = function0;
        Intrinsics.i(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-386140217);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386140217, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.WomenSeatAdjacencyFailedOnSystemRescheduleWarningBanner (PremiumBusTrackingState.kt:111)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.LightOrange.f9816a), ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.b(composerStartRestartGroup, 0).g);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_HISTORY, composerStartRestartGroup, 6);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).i);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t0;
            int i5 = Painter.$stable | 48;
            IconKt.m2070Iconww6aTOc(painterA, (String) null, modifierM828size3ABfNKs, j, composerStartRestartGroup, i5, 0);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PB_WOMEN_SEAT_RESCHEDULED_WARNING_BANNER_MSG, new Object[0], composerStartRestartGroup, 6), i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131064);
            Modifier modifierAlign = rowScopeInstance.align(companion3, companion.getTop());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6);
            Modifier modifierM828size3ABfNKs2 = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                onDismiss = function0;
                objRememberedValue = new ar0(onDismiss, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                onDismiss = function0;
            }
            ImageKt.Image(painterA2, "", ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs2, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier, onDismiss, i, 9));
        }
    }
}
