package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloHollowOrangeButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.hq0;
import defpackage.i41;
import defpackage.j5;
import defpackage.jl;
import defpackage.nb;
import defpackage.nk;
import defpackage.pk0;
import defpackage.uc;
import defpackage.w8;
import defpackage.zc;
import defpackage.zy0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDetailsBusLegCardKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4750a;

        static {
            int[] iArr = new int[RouteServiceType.values().length];
            try {
                iArr[RouteServiceType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteServiceType.PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteServiceType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4750a = iArr;
        }
    }

    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(154805941);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154805941, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegButtonLayoutForPremiumBus (TripPlannerDetailsBusLegCard.kt:195)");
            }
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-970884738);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ChaloHollowOrangeButtonKt.a((i3 & 14) | ((i3 << 3) & 896), 0, composerStartRestartGroup, pk0.d("PL_CTA_2_", i, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), str, function0);
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(-978314291);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nk(str, function0, modifier, i, i2));
        }
    }

    public static final void b(String str, String str2, Function0 function0, Function0 function1, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        String str3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1242860175);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242860175, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegButtonLayoutForRegularBus (TripPlannerDetailsBusLegCard.kt:217)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(322660328);
                i4 = 0;
                ChaloFilledButtonKt.f(str, false, pk0.d("PL_CTA_1_", i, i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null)), null, null, 0.0f, 0L, function0, composerStartRestartGroup, (i3 & 14) | ((i3 << 15) & 29360128), 122);
            } else {
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(314415351);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str3.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(322958114);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, i4).h), composerStartRestartGroup, i4);
                ChaloFilledButtonKt.g(pk0.d("PL_CTA_2_", i, i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null)), str3, null, 0L, null, false, 0.0f, null, 0L, function1, composerStartRestartGroup, (i3 & 112) | ((i3 << 18) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
            } else {
                composerStartRestartGroup.startReplaceGroup(314415351);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new j5(str, (Object) str2, (Object) function0, (Object) function1, modifier, i, i2, 6));
        }
    }

    public static final void c(RouteServiceType routeServiceType, String str, String str2, Function0 function0, Function0 function1, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2034617681);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(routeServiceType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2034617681, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegButtonSection (TripPlannerDetailsBusLegCard.kt:167)");
            }
            int i4 = WhenMappings.f4750a[routeServiceType.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(1057481896);
                b(str, str2, function0, function1, modifier, i, composerStartRestartGroup, (i3 >> 3) & 524286);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceGroup(1057492966);
                int i5 = (i3 >> 6) & 14;
                int i6 = i3 >> 9;
                a(i, i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168), composerStartRestartGroup, modifier, str2, function1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 3) {
                    throw pk0.p(composerStartRestartGroup, 1057480484);
                }
                composerStartRestartGroup.startReplaceGroup(-1577217937);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(routeServiceType, str, str2, function0, function1, modifier, i, i2, 6));
        }
    }

    public static final void d(String str, SeatAvailabilityLevel seatAvailabilityLevel, String str2, String str3, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        String str4;
        int i4;
        int i5 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(-761386759);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(seatAvailabilityLevel == null ? -1 : seatAvailabilityLevel.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i5) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761386759, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegEtaAndCapacitySection (TripPlannerDetailsBusLegCard.kt:255)");
            }
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(modifier, null, false, 3, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(179857900);
                String strC = StringResourcesHelperKt.c(StringEnum.ARRIVING, new Object[0], composerStartRestartGroup, 6);
                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                TextKt.m2623TextNvy7gAk(strC, hq0.c("PL_Bus_Leg_Eta_Arriving_Text", i5, companion3), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composerStartRestartGroup, 0, 0, 131064);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
                i4 = i3;
                ChaloEtaComponentKt.a(str, pk0.d("PL_Bus_Leg_Eta_Component_", i5, i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null)), null, composerStartRestartGroup, i3 & 14, 4);
                composerStartRestartGroup.endReplaceGroup();
                str4 = str3;
                i5 = i5;
            } else {
                i4 = i3;
                composerStartRestartGroup.startReplaceGroup(180506513);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (str2 != null) {
                    composerStartRestartGroup.startReplaceGroup(747864769);
                    str4 = str3;
                    TextKt.m2623TextNvy7gAk(str2, hq0.c("PL_Bus_Leg_Scheduled_String_", i5, companion4), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i4 >> 6) & 14, 0, 131064);
                } else {
                    str4 = str3;
                    composerStartRestartGroup.startReplaceGroup(737801518);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str4 != null) {
                    composerStartRestartGroup.startReplaceGroup(748228213);
                    h((i4 >> 9) & 14, composerStartRestartGroup, null, str4);
                } else {
                    composerStartRestartGroup.startReplaceGroup(737801518);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            f(seatAvailabilityLevel, i5, composerStartRestartGroup, ((i4 >> 3) & 14) | ((i4 >> 12) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str4 = str3;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j5(str, (Object) seatAvailabilityLevel, (Object) str2, (Object) str4, modifier, i, i2, 7));
        }
    }

    public static final void e(Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-831306519);
        int i2 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831306519, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegPremiumBusLogo (TripPlannerDetailsBusLegCard.kt:143)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(modifier, null, false, 3, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHALO_BUS_LOGO, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 28));
        }
    }

    public static final void f(SeatAvailabilityLevel seatAvailabilityLevel, int i, Composer composer, int i2) {
        int i3;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1987353691);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(seatAvailabilityLevel == null ? -1 : seatAvailabilityLevel.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1987353691, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.BusLegSeatCapacityComponent (TripPlannerDetailsBusLegCard.kt:306)");
            }
            if (seatAvailabilityLevel == null || seatAvailabilityLevel == SeatAvailabilityLevel.UNKNOWN) {
                composerStartRestartGroup.startReplaceGroup(-881019865);
            } else {
                composerStartRestartGroup.startReplaceGroup(-870143298);
                IconType iconTypeB = ExtensionsKt.b(seatAvailabilityLevel);
                if (iconTypeB == null) {
                    composerStartRestartGroup.startReplaceGroup(-870099961);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-870099960);
                    ImageKt.Image(PainterResourceHelperKt.a(iconTypeB, composerStartRestartGroup, 0), (String) null, hq0.c("PL_Seat_Capacity_Image_", i, Modifier.INSTANCE), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
                StringEnum stringEnumC = ExtensionsKt.c(seatAvailabilityLevel);
                if (stringEnumC == null) {
                    composerStartRestartGroup.startReplaceGroup(-869731092);
                    composerStartRestartGroup.endReplaceGroup();
                    strC = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-869731091);
                    strC = StringResourcesHelperKt.c(stringEnumC, new Object[0], composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (strC == null) {
                    strC = "";
                }
                TextKt.m2623TextNvy7gAk(strC, hq0.c("PL_Seat_Capacity_Text_", i, companion), ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zy0(seatAvailabilityLevel, i, i2));
        }
    }

    public static final void g(Function1 sendIntent, TripPlannerLegUiModel.Bus bus, String routeId, int i, Modifier modifier, Composer composer, int i2) {
        int i3;
        Object obj;
        Composer composer2;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(routeId, "routeId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886098077);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sendIntent) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            obj = bus;
            i3 |= composerStartRestartGroup.changedInstance(obj) ? 32 : 16;
        } else {
            obj = bus;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(routeId) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1886098077, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCard (TripPlannerDetailsBusLegCard.kt:52)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
            int i4 = CardDefaults.$stable;
            CardKt.Card(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-988091983, true, new jl(obj, i, sendIntent, routeId, 1), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(sendIntent, bus, routeId, i, modifier, i2, 11));
        }
    }

    public static final void h(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(106701227);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(106701227, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDisclaimerText (TripPlannerDetailsBusLegCard.kt:332)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.ALERT_ROUTESCREEN, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i3 & 14, 384, 126970);
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(str, modifier2, i, 10));
        }
    }
}
