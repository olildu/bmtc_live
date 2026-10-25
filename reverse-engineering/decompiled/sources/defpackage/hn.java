package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.data.TextFormatAppModel;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hn implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15842a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hn(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, Function1 function1, float f, float f2, float f3, MutableFloatState mutableFloatState, State state) {
        this.e = newPremiumBusReserveTicketActivationState;
        this.f = function1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.g = mutableFloatState;
        this.h = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15842a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj7;
                IconType iconType = (IconType) obj6;
                TextFormatAppModel textFormatAppModel = (TextFormatAppModel) obj5;
                TextStyle textStyle = (TextStyle) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1785293394, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon.<anonymous> (ChaloWidgetCard.kt:164)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new fk(function0, 11);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, 1, null), ChaloTheme.b(composer, 6).h);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer.startReplaceGroup(1311427045);
                    ImageKt.Image(PainterResourceHelperKt.a(iconType, composer, 0), (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f3), f2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 120);
                    ChaloSpacersKt.x(composer, 0);
                    composer.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (textFormatAppModel == null) {
                        composer.startReplaceGroup(-1687894958);
                    } else {
                        composer.startReplaceGroup(-1687894957);
                        ChaloWidgetCardKt.f(textFormatAppModel, null, textStyle, ChaloTheme.a(composer, 6).t0, 0L, 0L, composer, 0, 50);
                    }
                    composer.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composer, 0);
                    composer.startReplaceGroup(-1687578851);
                    composer.endReplaceGroup();
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) obj7;
                Function1 function1 = (Function1) obj6;
                MutableFloatState mutableFloatState = (MutableFloatState) obj5;
                State state = (State) obj4;
                ColumnScope BottomSheetScaffold = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(BottomSheetScaffold, "$this$BottomSheetScaffold");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(173008327, iIntValue2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMapAndTicketDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:427)");
                    }
                    Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).t, null, 2, null), 0.0f, f3, 1, null);
                    boolean zChanged2 = composer2.changed(f2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new bm(f2, mutableFloatState, 1);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    NewPremiumBusActivationBottomSheetContentKt.c(0, composer2, PaddingKt.m788paddingqDBjuR0$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM816heightInVpY3zN4$default, (Function1) objRememberedValue2), 0.0f, Dp.m7278constructorimpl(((Number) state.getValue()).floatValue() * f), 0.0f, 0.0f, 13, null), newPremiumBusReserveTicketActivationState, function1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ hn(Function0 function0, IconType iconType, float f, float f2, TextFormatAppModel textFormatAppModel, float f3, TextStyle textStyle, TextStyle textStyle2) {
        this.e = function0;
        this.f = iconType;
        this.b = f;
        this.c = f2;
        this.g = textFormatAppModel;
        this.d = f3;
        this.h = textStyle;
    }
}
