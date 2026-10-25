package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.ProductModificationSubtextColour;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingCancellationConfirmationBottomSheetKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ar0;
import defpackage.og;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBookingCancellationConfirmationBottomSheetKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7327a;

        static {
            int[] iArr = new int[ProductModificationSubtextColour.values().length];
            try {
                iArr[ProductModificationSubtextColour.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductModificationSubtextColour.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7327a = iArr;
        }
    }

    public static final void a(boolean z, ProductModificationSubtextColour actionSubtextColour, String str, PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel, Function0 onCancelRideClick, Function0 onRescheduleRideClick, Function0 onGoBackClick, Function0 additionalInfoCtaClick, Composer composer, int i) {
        int i2;
        Function0 function0;
        Function0 function1;
        Modifier.Companion companion;
        int i3;
        int i4;
        Intrinsics.i(actionSubtextColour, "actionSubtextColour");
        Intrinsics.i(onCancelRideClick, "onCancelRideClick");
        Intrinsics.i(onRescheduleRideClick, "onRescheduleRideClick");
        Intrinsics.i(onGoBackClick, "onGoBackClick");
        Intrinsics.i(additionalInfoCtaClick, "additionalInfoCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(72559327);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(actionSubtextColour.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(premiumBusProductModificationAdditionalInfoAppModel) : composerStartRestartGroup.changedInstance(premiumBusProductModificationAdditionalInfoAppModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelRideClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRescheduleRideClick) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGoBackClick) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(additionalInfoCtaClick) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72559327, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingCancellationConfirmationBottomSheet (PremiumBusBookingCancellationConfirmationBottomSheet.kt:35)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i5 = i2;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ARE_YOU_SURE_YOU_WANT_TO_CANCEL, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, 0, 0, 131070);
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(1666035518);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                TextKt.m2623TextNvy7gAk(str, null, c(actionSubtextColour, composerStartRestartGroup, (i5 >> 3) & 14), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, (i5 >> 6) & 14, 0, 131066);
            } else {
                composerStartRestartGroup.startReplaceGroup(1664036793);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (premiumBusProductModificationAdditionalInfoAppModel != null) {
                composerStartRestartGroup.startReplaceGroup(1666355066);
                companion = companion2;
                i4 = 0;
                i3 = 6;
                b(null, premiumBusProductModificationAdditionalInfoAppModel, null, null, 0L, 0L, additionalInfoCtaClick, composerStartRestartGroup, ((i5 >> 6) & 112) | ((i5 >> 3) & 3670016), 61);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
            } else {
                companion = companion2;
                i3 = 6;
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(1664036793);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strC = StringResourcesHelperKt.c(StringEnum.CANCEL_RIDE, new Object[i4], composerStartRestartGroup, i3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i7 = (i5 & 57344) == 16384 ? 1 : i4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(onCancelRideClick, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1666820190);
                ChaloSpacersKt.o(composerStartRestartGroup, i4);
                String strC2 = StringResourcesHelperKt.c(StringEnum.RESCHEDULE_MY_RIDE_INSTEAD, new Object[i4], composerStartRestartGroup, i3);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                int i8 = (i5 & 458752) == 131072 ? 1 : i4;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i8 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function1 = onRescheduleRideClick;
                    objRememberedValue2 = new ar0(function1, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    function1 = onRescheduleRideClick;
                }
                ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default2, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 122);
            } else {
                function1 = onRescheduleRideClick;
                composerStartRestartGroup.startReplaceGroup(1664036793);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.o(composerStartRestartGroup, i4);
            String strC3 = StringResourcesHelperKt.c(StringEnum.GO_BACK, new Object[i4], composerStartRestartGroup, i3);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i9 = (i5 & 3670016) == 1048576 ? 1 : i4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function0 = onGoBackClick;
                objRememberedValue3 = new ar0(function0, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function0 = onGoBackClick;
            }
            ChaloFilledButtonKt.f(strC3, false, modifierFillMaxWidth$default3, null, null, 0.0f, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, 384, 122);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onGoBackClick;
            function1 = onRescheduleRideClick;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new og(z, actionSubtextColour, str, premiumBusProductModificationAdditionalInfoAppModel, onCancelRideClick, function1, function0, additionalInfoCtaClick, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0258  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    public static final void b(String str, final PremiumBusProductModificationAdditionalInfoAppModel additionalInfo, TextStyle textStyle, TextStyle textStyle2, long j, long j2, final Function0 additionalInfoCtaClick, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        long j3;
        Function0 function0;
        final TextStyle textStyle3;
        final long j4;
        final String str3;
        Composer composer2;
        final long j5;
        final TextStyle textStyle4;
        TextStyle headlineSmall;
        int i4;
        final TextStyle textStyleI;
        final long j6;
        int i5;
        final long j7;
        String str4;
        int i6;
        String str5;
        long j8;
        int i7;
        Composer composer3;
        int i8;
        Intrinsics.i(additionalInfo, "additionalInfo");
        Intrinsics.i(additionalInfoCtaClick, "additionalInfoCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-473954941);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(additionalInfo) : composerStartRestartGroup.changedInstance(additionalInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            j3 = j2;
            i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(additionalInfoCtaClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    str2 = null;
                }
                headlineSmall = ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall();
                int i10 = i3 & (-897);
                if ((i2 & 8) != 0) {
                    textStyleI = ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0));
                    i4 = i3 & (-8065);
                } else {
                    i4 = i10;
                    textStyleI = textStyle2;
                }
                j6 = ChaloTheme.a(composerStartRestartGroup, 0).t0;
                int i11 = i4 & (-57345);
                if ((i2 & 32) != 0) {
                    j3 = ChaloTheme.a(composerStartRestartGroup, 0).g;
                    i5 = i4 & (-516097);
                } else {
                    i5 = i11;
                }
                j7 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i12 = i3 & (-897);
                if ((i2 & 8) != 0) {
                    i12 = i3 & (-8065);
                }
                int i13 = i12 & (-57345);
                if ((i2 & 32) != 0) {
                    i13 = i12 & (-516097);
                }
                j7 = j3;
                headlineSmall = textStyle;
                j6 = j;
                str2 = str2;
                i5 = i13;
                textStyleI = textStyle2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473954941, i5, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.ProductModificationAdditionalInfo (PremiumBusBookingCancellationConfirmationBottomSheet.kt:93)");
            }
            String str6 = additionalInfo.b;
            if (str6 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i14 = 0;
                    final TextStyle textStyle5 = headlineSmall;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lt0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i14) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    PremiumBusBookingCancellationConfirmationBottomSheetKt.b(str2, additionalInfo, textStyle5, textStyleI, j6, j7, additionalInfoCtaClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    PremiumBusBookingCancellationConfirmationBottomSheetKt.b(str2, additionalInfo, textStyle5, textStyleI, j6, j7, additionalInfoCtaClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            String str7 = str2;
            TextStyle textStyle6 = textStyleI;
            long j9 = j7;
            String str8 = additionalInfo.c;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).L0, ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i15 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i15), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str7 == null) {
                str4 = str7;
                i6 = i5;
                str5 = str8;
                j8 = j6;
                i7 = 1;
                composer3 = composerStartRestartGroup;
                i8 = 0;
                composer3.startReplaceGroup(-196048363);
                composer3.endReplaceGroup();
            } else {
                if (str7.length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-191867269);
                    long j10 = j6;
                    i7 = 1;
                    i6 = i5;
                    str5 = str8;
                    i8 = 0;
                    TextKt.m2623TextNvy7gAk(str7, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineSmall, composerStartRestartGroup, i5 & 14, 0, 131066);
                    str4 = str7;
                    j8 = j10;
                    composer3 = composerStartRestartGroup;
                    ChaloSpacersKt.m(composer3, 0);
                    composer3.endReplaceGroup();
                } else {
                    str4 = str7;
                    i6 = i5;
                    str5 = str8;
                    j8 = j6;
                    i7 = 1;
                    composer3 = composerStartRestartGroup;
                    i8 = 0;
                    composer3.startReplaceGroup(-196048363);
                    composer3.endReplaceGroup();
                }
            }
            Composer composer4 = composer3;
            TextKt.m2623TextNvy7gAk(str6, null, j9, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer4, (i6 >> 9) & 896, (i6 << 12) & 29360128, 131066);
            if (str5 == null) {
                function0 = additionalInfoCtaClick;
                composer4.startReplaceGroup(-196048363);
            } else {
                if ((str5.length() > 0 ? i7 : i8) != 0) {
                    composer4.startReplaceGroup(-191446506);
                    ChaloSpacersKt.n(composer4, i8);
                    TextStyle textStyleI2 = ChaloTypographyKt.i(ChaloTheme.e(composer4, i8));
                    int i16 = (i6 & 3670016) == 1048576 ? i7 : i8;
                    Object objRememberedValue = composer4.rememberedValue();
                    if (i16 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = additionalInfoCtaClick;
                        objRememberedValue = new ar0(function0, 6);
                        composer4.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = additionalInfoCtaClick;
                    }
                    ChaloCardComposeItemsKt.e(null, str5, textStyleI2, 0L, null, (Function0) objRememberedValue, composer4, 0, 25);
                } else {
                    function0 = additionalInfoCtaClick;
                    composer4.startReplaceGroup(-196048363);
                }
            }
            composer4.endReplaceGroup();
            composer4.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composer4;
            textStyle3 = textStyle6;
            j5 = j9;
            str3 = str4;
            textStyle4 = headlineSmall;
            j4 = j8;
        } else {
            function0 = additionalInfoCtaClick;
            composerStartRestartGroup.skipToGroupEnd();
            textStyle3 = textStyle2;
            j4 = j;
            str3 = str2;
            composer2 = composerStartRestartGroup;
            j5 = j3;
            textStyle4 = textStyle;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i17 = 1;
            final Function0 function1 = function0;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: lt0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj2).getClass();
                            PremiumBusBookingCancellationConfirmationBottomSheetKt.b(str3, additionalInfo, textStyle4, textStyle3, j4, j5, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            PremiumBusBookingCancellationConfirmationBottomSheetKt.b(str3, additionalInfo, textStyle4, textStyle3, j4, j5, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final long c(ProductModificationSubtextColour actionSubtextColour, Composer composer, int i) {
        long j;
        Intrinsics.i(actionSubtextColour, "actionSubtextColour");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2091143351, i, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.getActionSubtextColour (PremiumBusBookingCancellationConfirmationBottomSheet.kt:133)");
        }
        int i2 = WhenMappings.f7327a[actionSubtextColour.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-455927938);
            j = ChaloTheme.a(composer, 0).X;
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                throw pk0.p(composer, -455930768);
            }
            composer.startReplaceGroup(-455925473);
            j = ChaloTheme.a(composer, 0).g;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }
}
