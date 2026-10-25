package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsViewKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import defpackage.gt;
import defpackage.i41;
import defpackage.ja;
import defpackage.ma;
import defpackage.pk0;
import defpackage.qg;
import defpackage.r1;
import defpackage.wc;
import defpackage.yp0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassengerDetailsViewKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3915a;

        static {
            int[] iArr = new int[PassengerSelectionPolicy.values().length];
            try {
                iArr[PassengerSelectionPolicy.Multiple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassengerSelectionPolicy.Single.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3915a = iArr;
        }
    }

    public static final void a(Composer composer, int i, String discountPercentage) {
        int i2;
        Composer composer2;
        Intrinsics.i(discountPercentage, "discountPercentage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1652526855);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(discountPercentage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652526855, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.DiscountPercentageComposable (PassengerDetailsView.kt:228)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).I, ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).d);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(discountPercentage, null, ChaloTheme.a(composerStartRestartGroup, 0).J, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, i2 & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(discountPercentage, i, 13));
        }
    }

    public static final void b(Modifier modifier, List passengerDetailsUiModelList, boolean z, PassengerSelectionPolicy passengerSelectionPolicy, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i) {
        boolean z2;
        Composer composer2;
        int i2;
        Composer composer3;
        Object obj;
        int i3;
        Modifier modifier2 = modifier;
        Function1 onIncreaseTicketClick = function1;
        Function1 onDecreaseTicketClick = function2;
        Function1 onCategorySelected = function3;
        Intrinsics.i(passengerDetailsUiModelList, "passengerDetailsUiModelList");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        Intrinsics.i(onIncreaseTicketClick, "onIncreaseTicketClick");
        Intrinsics.i(onDecreaseTicketClick, "onDecreaseTicketClick");
        Intrinsics.i(onCategorySelected, "onCategorySelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1074904457);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(passengerDetailsUiModelList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(passengerSelectionPolicy.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onIncreaseTicketClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDecreaseTicketClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCategorySelected) ? 1048576 : 524288;
        }
        int i5 = i4;
        int i6 = 1;
        if (composerStartRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074904457, i5, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsSection (PassengerDetailsView.kt:48)");
            }
            int i7 = 0;
            for (Object obj2 : passengerDetailsUiModelList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                PassengerFareDetailsUiModel passengerFareDetailsUiModel = (PassengerFareDetailsUiModel) obj2;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, i6, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i10 = WhenMappings.f3915a[passengerSelectionPolicy.ordinal()];
                if (i10 == 1) {
                    i2 = i7;
                    composer3 = composerStartRestartGroup;
                    obj = null;
                    composer3.startReplaceGroup(-389783844);
                    int i11 = i5 >> 3;
                    c(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), passengerFareDetailsUiModel, z, function1, function2, composer3, (i5 & 896) | (i11 & 7168) | (i11 & 57344));
                    composer3.endReplaceGroup();
                } else {
                    if (i10 != 2) {
                        throw pk0.p(composerStartRestartGroup, -1675143625);
                    }
                    composerStartRestartGroup.startReplaceGroup(-389150452);
                    int i12 = i5 >> 3;
                    obj = null;
                    i2 = i7;
                    d(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), passengerFareDetailsUiModel, z2, onIncreaseTicketClick, onDecreaseTicketClick, onCategorySelected, composerStartRestartGroup, (i12 & 458752) | (i5 & 896) | (i12 & 7168) | (i12 & 57344));
                    composer3 = composerStartRestartGroup;
                    composer3.endReplaceGroup();
                }
                if (i2 != passengerDetailsUiModelList.size() - 1) {
                    composer3.startReplaceGroup(-388428741);
                    DividerKt.m1949Divider9IZ8Weo(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer3, 0).h, 0.0f, 0.0f, 13, null), Dp.m7278constructorimpl(1), ChaloTheme.a(composer3, 0).m, composer3, 48, 0);
                    composer3.endReplaceGroup();
                    i3 = 1;
                } else {
                    composer3.startReplaceGroup(-388190909);
                    i3 = 1;
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer3, 0).h, 0.0f, 0.0f, 13, null), ChaloTheme.b(composer3, 0).f), 0.0f, 1, obj), ChaloTheme.a(composer3, 0).Y, null, 2, null), composer3, 0);
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                modifier2 = modifier;
                z2 = z;
                onIncreaseTicketClick = function1;
                onDecreaseTicketClick = function2;
                composerStartRestartGroup = composer3;
                i6 = i3;
                i7 = i8;
                onCategorySelected = function3;
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ja(modifier, passengerDetailsUiModelList, z, passengerSelectionPolicy, function1, function2, function3, i));
        }
    }

    public static final void c(Modifier modifier, PassengerFareDetailsUiModel passengerFareDetailsUiModel, boolean z, Function1 function1, Function1 function2, Composer composer, int i) {
        int i2;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1032774473);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(passengerFareDetailsUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1032774473, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerPriceAndCounterSection (PassengerDetailsView.kt:109)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = i2;
            f(passengerFareDetailsUiModel.b, passengerFareDetailsUiModel.f, passengerFareDetailsUiModel.e, passengerFareDetailsUiModel.c, passengerFareDetailsUiModel.d, composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(passengerFareDetailsUiModel) | ((i4 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Boolean.valueOf(z || passengerFareDetailsUiModel.k);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            boolean zChanged2 = composerStartRestartGroup.changed(passengerFareDetailsUiModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Boolean.valueOf(passengerFareDetailsUiModel.l);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean zBooleanValue2 = ((Boolean) objRememberedValue2).booleanValue();
            if (passengerFareDetailsUiModel.j > 1) {
                composerStartRestartGroup.startReplaceGroup(-696937101);
                int i5 = passengerFareDetailsUiModel.h;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(passengerFareDetailsUiModel) | ((i4 & 7168) == 2048);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    z2 = false;
                    objRememberedValue3 = new yp0(function1, passengerFareDetailsUiModel, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    z2 = false;
                }
                Function0 function0 = (Function0) objRememberedValue3;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(passengerFareDetailsUiModel) | ((i4 & 57344) == 16384 ? true : z2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new yp0(function2, passengerFareDetailsUiModel, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                e(i5, zBooleanValue, zBooleanValue2, function0, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-702749291);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(modifier, passengerFareDetailsUiModel, z, function1, function2, i, 3));
        }
    }

    public static final void d(Modifier modifier, PassengerFareDetailsUiModel passengerFareDetailsUiModel, boolean z, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i) {
        int i2;
        boolean z2;
        Function1 function4;
        Function1 function5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1631494909);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(passengerFareDetailsUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            function4 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        } else {
            function4 = function1;
        }
        if ((i & 24576) == 0) {
            function5 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        } else {
            function5 = function2;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1631494909, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerPriceAndCounterSectionWithRadioButton (PassengerDetailsView.kt:153)");
            }
            String str = passengerFareDetailsUiModel.f3895a;
            boolean z3 = passengerFareDetailsUiModel.n;
            boolean zChanged = composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(z3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RadioButtonUIState(z3, UiEventHandler.Companion.a(new yp0(function3, passengerFareDetailsUiModel, 2)), 44);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RadioButtonUIState radioButtonUIState = (RadioButtonUIState) objRememberedValue;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloRadioButtonKt.a(companion2, radioButtonUIState, composerStartRestartGroup, 6, 0);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            c(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), passengerFareDetailsUiModel, z2, function4, function5, composerStartRestartGroup, i2 & 65520);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(modifier, passengerFareDetailsUiModel, z, function1, function2, function3, i, 3));
        }
    }

    public static final void e(final int i, final boolean z, final boolean z2, final Function0 onIncreaseTicketClick, final Function0 onDecreaseTicketClick, Composer composer, final int i2) {
        int i3;
        boolean z3;
        Intrinsics.i(onIncreaseTicketClick, "onIncreaseTicketClick");
        Intrinsics.i(onDecreaseTicketClick, "onDecreaseTicketClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937962289);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIncreaseTicketClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDecreaseTicketClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937962289, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerTicketCounter (PassengerDetailsView.kt:256)");
            }
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
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
            IconType iconType = z2 ? IconType.REMOVE_TICKET_DISABLED : IconType.REMOVE_TICKET;
            IconType iconType2 = z ? IconType.ADD_TICKET_DISABLED : IconType.ADD_TICKET;
            Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            boolean z4 = ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == companion3.getEmpty()) {
                z3 = true;
                objRememberedValue2 = new gt(1, onDecreaseTicketClick, z2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                z3 = true;
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            int i5 = Painter.$stable | 48;
            int i6 = i3;
            boolean z5 = false;
            ImageKt.Image(painterA, (String) null, modifierM295clickableO2vRcR0$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            TextKt.m2623TextNvy7gAk(String.valueOf(i), PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            Painter painterA2 = PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue3;
            boolean z6 = (i6 & 112) == 32;
            if ((i6 & 7168) == 2048) {
                z5 = true;
            }
            boolean z7 = z6 | z5;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new gt(2, onIncreaseTicketClick, z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ImageKt.Image(painterA2, (String) null, ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: zp0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    PassengerDetailsViewKt.e(i, z, z2, onIncreaseTicketClick, onDecreaseTicketClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void f(String str, String payableFare, String actualFare, boolean z, String str2, Composer composer, int i) {
        int i2;
        String str3 = str2;
        Intrinsics.i(payableFare, "payableFare");
        Intrinsics.i(actualFare, "actualFare");
        Composer composerStartRestartGroup = composer.startRestartGroup(1693096543);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(payableFare) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(actualFare) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1693096543, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerTypeAndFareDetails (PassengerDetailsView.kt:192)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i2 & 14, 0, 131066);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(payableFare, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 11, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i4 >> 3) & 14, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1204444572);
                TextKt.m2623TextNvy7gAk(actualFare, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 11, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).plus(new TextStyle(ChaloTheme.a(composerStartRestartGroup, 0).e, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773118, (DefaultConstructorMarker) null)), composerStartRestartGroup, (i4 >> 6) & 14, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1212898179);
            }
            composerStartRestartGroup.endReplaceGroup();
            str3 = str2;
            if (str3 == null) {
                composerStartRestartGroup.startReplaceGroup(-1203940110);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1203940109);
                a(composerStartRestartGroup, 0, str3);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(str, payableFare, actualFare, z, str3, i, 4));
        }
    }
}
