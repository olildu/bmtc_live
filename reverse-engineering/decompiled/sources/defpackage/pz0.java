package defpackage;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.TextFormatAppModel;
import app.chalo.extensions.StringExtsKt;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegInfoCardSectionKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenUIState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pz0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19079a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pz0(int i, RegularBusPageDisplayItemData regularBusPageDisplayItemData, Function1 function1) {
        this.f19079a = 1;
        this.b = function1;
        this.d = regularBusPageDisplayItemData;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        String strC;
        Composer composer2;
        int i = this.f19079a;
        int i2 = this.c;
        Unit unit = Unit.f17538a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                QRValidationScreenUIState.QRWithProductAndUserDetails qRWithProductAndUserDetails = (QRValidationScreenUIState.QRWithProductAndUserDetails) obj4;
                Function1 function1 = (Function1) obj5;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1060408420, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRWithProductDetailsComponent.<anonymous>.<anonymous>.<anonymous> (QRValidationScreen.kt:238)");
                    }
                    QRValidationScreenKt.a(qRWithProductAndUserDetails, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.c, function1, composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 1:
                Function1 function2 = (Function1) obj5;
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-302980752, iIntValue2, -1, "app.chalo.home.ui.regularbus.compose.ProductPurchaseSectionsUI.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1174)");
                    }
                    Object objRememberedValue = composer4.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, Dp.m7278constructorimpl(32)), Dp.m7278constructorimpl(56));
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifier = (Modifier) objRememberedValue2;
                    Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.d(composer4, 0).c);
                    MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer4);
                    IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer4);
                    boolean zChanged = composer4.changed(function2) | composer4.changedInstance(regularBusPageDisplayItemData) | composer4.changed(i2);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new n11(function2, regularBusPageDisplayItemData, i2, 2);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(modifierClip, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue3, 28, null), ChaloTheme.b(composer4, 0).h);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer4, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str = regularBusPageDisplayItemData.o;
                    if (str == null) {
                        composer4.startReplaceGroup(1450566886);
                        composer4.endReplaceGroup();
                        composer = composer4;
                    } else {
                        composer4.startReplaceGroup(1450566887);
                        Alignment centerStart = companion2.getCenterStart();
                        ContentScale fit = ContentScale.INSTANCE.getFit();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(406302471, true, new q80(4, regularBusPageDisplayItemData, modifier, mutableState), composer4, 54);
                        Object objRememberedValue4 = composer4.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new xq0(mutableState, 8);
                            composer4.updateRememberedValue(objRememberedValue4);
                        }
                        SingletonSubcomposeAsyncImageKt.a(str, null, modifier, null, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue4, null, centerStart, fit, composer4, 102236592, 54, 62136);
                        composer = composer4;
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            composer.startReplaceGroup(-428047937);
                            ChaloSpacersKt.x(composer, 0);
                        } else {
                            composer.startReplaceGroup(-482374600);
                        }
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                    }
                    TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData.c;
                    if (textFormatAppModel == null) {
                        composer.startReplaceGroup(1452042548);
                    } else {
                        composer.startReplaceGroup(1452042549);
                        TextStyle textStyleA = ChaloTypographyKt.a(ChaloTheme.e(composer, 0).getBodyLarge());
                        long j = ChaloTheme.a(composer, 0).t0;
                        TextFormatAppModel.Companion companion4 = TextFormatAppModel.INSTANCE;
                        ChaloWidgetCardKt.f(textFormatAppModel, null, textStyleA, j, 0L, 0L, composer, 0, 50);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 2:
                TripPlannerLegUiModel.Metro metro = (TripPlannerLegUiModel.Metro) obj4;
                String str2 = metro.o;
                Function1 function3 = (Function1) obj5;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer5.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(715147007, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCard.<anonymous> (TripPlannerDetailsMetroLegCard.kt:39)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer5, 0).h, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor2);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion6, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i5 = TripPlannerDetailsMetroLegCardKt.WhenMappings.f4751a[metro.r.ordinal()];
                    if (i5 == 1) {
                        composer5.startReplaceGroup(1973814653);
                        String str3 = metro.s;
                        if (str3 == null) {
                            composer5.startReplaceGroup(1973904769);
                            composer5.endReplaceGroup();
                            strC = null;
                        } else {
                            composer5.startReplaceGroup(1973904770);
                            strC = StringResourcesHelperKt.c(StringEnum.X_LINE_METRO, new Object[]{StringExtsKt.a(str3)}, composer5, 6);
                            composer5.endReplaceGroup();
                        }
                        if (strC == null) {
                            strC = metro.b;
                        }
                        ItineraryLegInfoCardSectionKt.a(strC, metro.f, metro.c, metro.d, metro.g, null, ComposableLambdaKt.rememberComposableLambda(-1627562729, true, new ti1(metro, 4), composer5, 54), composer5, 1572864, 32);
                        composer2 = composer5;
                        composer2.endReplaceGroup();
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            throw pk0.p(composer5, 756405969);
                        }
                        composer5.startReplaceGroup(1974682219);
                        composer5.endReplaceGroup();
                        composer2 = composer5;
                    }
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer2, 0).h), composer2, 0);
                    List list = metro.k;
                    String str4 = metro.m;
                    int i6 = metro.p;
                    Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null);
                    int i7 = this.c;
                    boolean zChanged2 = composer2.changed(i7);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new wl(i7, 26);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    ItineraryLegStopListSectionKt.c(null, str4, i6, list, modifierM786paddingVpY3zN4$default2, i7, (Function2) objRememberedValue5, composer2, 6);
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer2, 0).h), composer2, 0);
                    if (str2.length() > 0) {
                        composer2.startReplaceGroup(1975687518);
                        Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null);
                        boolean zChanged3 = composer2.changed(function3) | composer2.changedInstance(metro);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new da1(24, function3, metro);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default3, str2, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue6, composer2, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
                    } else {
                        composer2.startReplaceGroup(1971862893);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 3:
                Function0 function0 = (Function0) obj4;
                TripPlannerItineraryUiModel tripPlannerItineraryUiModel = (TripPlannerItineraryUiModel) obj5;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer6.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1517643831, iIntValue4, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryCard.<anonymous> (TripPlannerResultsScreen.kt:744)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m295clickableO2vRcR0$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), RippleEffectKt.b(composer6), RippleEffectKt.a(composer6), false, null, null, function0, 28, null), 0.0f, ChaloTheme.b(composer6, 0).h, 1, null), null, null, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer6, modifierAnimateContentSize$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor3);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String str5 = tripPlannerItineraryUiModel.b;
                    int i9 = tripPlannerItineraryUiModel.c;
                    String str6 = tripPlannerItineraryUiModel.d;
                    Modifier modifierM786paddingVpY3zN4$default4 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ChaloTheme.b(composer6, 0).h, 0.0f, 2, null);
                    int i10 = this.c;
                    TripPlannerResultsScreenKt.j(str5, i9, str6, modifierM786paddingVpY3zN4$default4, Integer.valueOf(i10), composer6, 0, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composer6, 0).h), composer6, 0);
                    if (((Boolean) tripPlannerItineraryUiModel.l.getValue()).booleanValue()) {
                        composer6.startReplaceGroup(-135654714);
                        TripPlannerResultsScreenKt.o(composer6, 0);
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(-135571913);
                        TripPlannerResultsScreenKt.k(i10, 48, composer6, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), tripPlannerItineraryUiModel.g);
                        composer6.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composer6, 0).h), composer6, 0);
                    TripPlannerResultsScreenKt.i(tripPlannerItineraryUiModel.k, tripPlannerItineraryUiModel.e, tripPlannerItineraryUiModel.i, tripPlannerItineraryUiModel.f, tripPlannerItineraryUiModel.j, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ChaloTheme.b(composer6, 0).h, 0.0f, 2, null), i10, composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            default:
                Function1 function4 = (Function1) obj5;
                String str7 = (String) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer7.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1926399765, iIntValue5, -1, "app.chalo.wallet.ui.loadbalance.compose.WalletSuggestedDenominationItem.<anonymous> (WalletSuggestedDenominations.kt:27)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierBackground$default = BackgroundKt.background$default(companion9, new SolidColor(ChaloTheme.a(composer7, 0).Z, null), null, 0.0f, 6, null);
                    boolean zChanged4 = composer7.changed(function4) | composer7.changed(i2);
                    Object objRememberedValue7 = composer7.rememberedValue();
                    if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new cf(i2, 7, function4);
                        composer7.updateRememberedValue(objRememberedValue7);
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierBackground$default, false, null, null, null, (Function0) objRememberedValue7, 15, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierM299clickableoSLSa3U$default);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion10.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor4);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion10, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(str7, PaddingKt.m785paddingVpY3zN4(companion9, ChaloTheme.b(composer7, 0).k, ChaloTheme.b(composer7, 0).h), ChaloTheme.a(composer7, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer7, 0).getHeadlineMedium(), composer7, 0, 0, 131064);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ pz0(int i, String str, Function1 function1) {
        this.f19079a = 4;
        this.b = function1;
        this.c = i;
        this.d = str;
    }

    public /* synthetic */ pz0(Object obj, int i, Function1 function1, int i2) {
        this.f19079a = i2;
        this.d = obj;
        this.c = i;
        this.b = function1;
    }

    public /* synthetic */ pz0(Function0 function0, TripPlannerItineraryUiModel tripPlannerItineraryUiModel, int i) {
        this.f19079a = 3;
        this.d = function0;
        this.b = tripPlannerItineraryUiModel;
        this.c = i;
    }
}
