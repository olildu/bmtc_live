package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ar0;
import defpackage.fr0;
import defpackage.h0;
import defpackage.nb;
import defpackage.pk0;
import defpackage.r1;
import defpackage.w60;
import defpackage.wm0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTicketActivationMoreOptionsListKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7329a;

        static {
            int[] iArr = new int[PremiumReserveTicketOptionAction.values().length];
            try {
                iArr[PremiumReserveTicketOptionAction.CANCEL_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.RESCHEDULE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CALL_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHAT_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHANGE_SEAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHANGE_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7329a = iArr;
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, String errorMsg) {
        int i2;
        Composer composer2;
        Intrinsics.i(errorMsg, "errorMsg");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493444388);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(errorMsg) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493444388, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsErrorContent (PremiumBusTicketActivationMoreOptionsList.kt:85)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(errorMsg, PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).o), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i2 & 14, 0, 130040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(errorMsg, modifier, i, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    public static final void b(List options, Modifier modifier, String str, Function1 onClick, Function1 onViewCancellationAndReschedulePolicyClick, Composer composer, int i) {
        Modifier modifier2;
        Composer composer2;
        Composer composer3;
        int i2;
        Modifier modifier3;
        int i3;
        Intrinsics.i(options, "options");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onViewCancellationAndReschedulePolicyClick, "onViewCancellationAndReschedulePolicyClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1223462757);
        int i4 = ((i & 6) == 0 ? (composerStartRestartGroup.changedInstance(options) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i5 = 2048;
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onViewCancellationAndReschedulePolicyClick) ? 16384 : 8192;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223462757, i4, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsList (PremiumBusTicketActivationMoreOptionsList.kt:40)");
            }
            Modifier modifier4 = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-627411635);
            int i8 = 0;
            for (Iterator it = options.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    ?? r20 = modifier4;
                    CollectionsKt.z0();
                    throw r20;
                }
                PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel = (PremiumBusProductOptionsAppModel) next;
                int i10 = ((i4 & 7168) == i5 ? 1 : i6) | (composerStartRestartGroup.changedInstance(premiumBusProductOptionsAppModel) ? 1 : 0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fr0(14, onClick, premiumBusProductOptionsAppModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                c(premiumBusProductOptionsAppModel, modifier4, (Function0) objRememberedValue, composerStartRestartGroup, i6);
                if (i8 != CollectionsKt.K(options)) {
                    composerStartRestartGroup.startReplaceGroup(-763704628);
                    i3 = i6;
                    i2 = 2048;
                    modifier3 = null;
                    DividerKt.m1950HorizontalDivider9IZ8Weo(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, modifier4), ChaloTheme.b(composerStartRestartGroup, i6).h, 0.0f, 2, modifier4), ChaloTheme.b(composerStartRestartGroup, i6).b, ChaloTheme.a(composerStartRestartGroup, i6).m, composerStartRestartGroup, 0, 0);
                } else {
                    i2 = i5;
                    modifier3 = modifier4;
                    i3 = i6;
                    composerStartRestartGroup.startReplaceGroup(-765838854);
                }
                composerStartRestartGroup.endReplaceGroup();
                companion = companion;
                i8 = i9;
                i6 = i3;
                i5 = i2;
                modifier4 = modifier3;
            }
            Modifier.Companion companion3 = companion;
            int i11 = i6;
            composerStartRestartGroup.endReplaceGroup();
            if (str == null || str.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(2023160369);
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(2025734919);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i11).h, ChaloTheme.b(composerStartRestartGroup, i11).i, 0.0f, ChaloTheme.b(composerStartRestartGroup, i11).i, 4, null);
                int i12 = ((57344 & i4) == 16384 ? 1 : i11) | ((i4 & 896) != 256 ? i11 : 1);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i12 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new w60(8, str, onViewCancellationAndReschedulePolicyClick);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_CANCELLATION_AND_RESCHEDULE_POLICY, new Object[i11], composerStartRestartGroup, 6), ClickableKt.m299clickableoSLSa3U$default(modifierM788paddingqDBjuR0$default, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloTheme.a(composerStartRestartGroup, i11).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i11)), composerStartRestartGroup, 0, 0, 131064);
                composer3 = composerStartRestartGroup;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion3;
            composer2 = composer3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) options, modifier2, (Object) str, (Object) onClick, (Object) onViewCancellationAndReschedulePolicyClick, i, 24));
        }
    }

    public static final void c(PremiumBusProductOptionsAppModel option, Modifier modifier, Function0 onClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        IconType iconType;
        Intrinsics.i(option, "option");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(9765634);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(option) : composerStartRestartGroup.changedInstance(option) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(9765634, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationOptionCard (PremiumBusTicketActivationMoreOptionsList.kt:105)");
            }
            float f = option.e ? 1.0f : 0.5f;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            boolean z = option.e;
            boolean z2 = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(onClick, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m784padding3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, z, null, null, (Function0) objRememberedValue, 24, null), ChaloTheme.b(composerStartRestartGroup, 0).h), f);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            switch (WhenMappings.f7329a[option.f2387a.ordinal()]) {
                case 1:
                    iconType = IconType.IC_CANCEL_IN_BLACK_CIRCLE;
                    break;
                case 2:
                    iconType = IconType.IC_CALENDAR_BLACK;
                    break;
                case 3:
                    iconType = IconType.IC_PHONE_MSG;
                    break;
                case 4:
                    iconType = IconType.IC_MESSAGE;
                    break;
                case 5:
                    iconType = IconType.IC_SEAT_BLACK;
                    break;
                case 6:
                    iconType = IconType.IC_BUS_STOP;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            modifier2 = companion;
            ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), "", SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = option.c;
            TextStyle headlineMedium = ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium();
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int iM7226getEllipsisgIe3tQ8 = companion4.m7226getEllipsisgIe3tQ8();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion5.m7173getStarte0LSkKk()), 0L, iM7226getEllipsisgIe3tQ8, false, 1, 0, null, headlineMedium, composerStartRestartGroup, 0, 24960, 109562);
            String str2 = option.d;
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(278081804);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(278081805);
                ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str2, null, PremiumBusBookingCancellationConfirmationBottomSheetKt.c(option.h, composerStartRestartGroup, 0), null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion5.m7173getStarte0LSkKk()), 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 24960, 109562);
                composer2.endReplaceGroup();
            }
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 25, option, modifier2, onClick));
        }
    }
}
