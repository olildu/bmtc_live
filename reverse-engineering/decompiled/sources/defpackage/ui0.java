package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripDetailsFareAndTravelTimeComponentKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ui0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19749a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ui0(Modifier modifier, Function0 function0, Function0 function1, Function0 function2, String str, int i, String str2) {
        this.f = modifier;
        this.b = function0;
        this.g = function1;
        this.h = function2;
        this.c = str;
        this.e = i;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strC;
        int i = this.f19749a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1537885132, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.MetroTicketPurchaseBottomSheetContent.<anonymous> (MetroTicketPurchaseBottomSheetContent.kt:47)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(modifier, ChaloTheme.b(composer, 0).h);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion.getTop(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_CLOSE, composer, 6);
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new p80(function1, 6);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ImageKt.Image(painterA, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 120);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).h), composer, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TP_METRO_TKT_BOTTOMSHEET_HEADER, new Object[0], composer, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.e(ChaloTheme.e(composer, 0)), 0L, TextUnitKt.getSp(24), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composer, 0, 0, 131070);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).d), composer, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TP_METRO_TKT_BOTTOMSHEET_DESC, new Object[0], composer, 6), null, ChaloTheme.a(composer, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer, 0)), composer, 0, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).i), composer, 0);
                    Modifier modifierHeight = IntrinsicKt.height(companion3, IntrinsicSize.Min);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierHeight);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    FromAndToStopDetailViewKt.e(0.0f, 0.0f, composer, 0, 3);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composer, 0).g), composer, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion3);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FROM_, new Object[]{this.c}, composer, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)), composer, 0, 0, 131070);
                    int i6 = 0;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).g), composer, 0);
                    int i7 = this.e;
                    if (i7 > 0) {
                        composer.startReplaceGroup(1881524632);
                        if (i7 > 1) {
                            composer.startReplaceGroup(-909135035);
                            strC = StringResourcesHelperKt.c(StringEnum.X_CHANGES, new Object[]{Integer.valueOf(i7)}, composer, 6);
                        } else {
                            composer.startReplaceGroup(-909133258);
                            strC = StringResourcesHelperKt.c(StringEnum.CHANGE_1, new Object[0], composer, 6);
                        }
                        composer.endReplaceGroup();
                        TextKt.m2623TextNvy7gAk(strC, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(companion3, ChaloTheme.a(composer, 0).L0, ChaloTheme.d(composer, 0).b), ChaloTheme.b(composer, 0).f, ChaloTheme.b(composer, 0).d), ChaloTheme.a(composer, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composer, 0)), composer, 0, 0, 131064);
                        i6 = 0;
                        gf.r(companion3, ChaloTheme.b(composer, 0).g, composer, 0);
                    } else {
                        composer.startReplaceGroup(1877886255);
                        composer.endReplaceGroup();
                    }
                    StringEnum stringEnum = StringEnum.TO_;
                    Object[] objArr = new Object[1];
                    objArr[i6] = this.d;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, objArr, composer, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer, i6)), composer, 0, 0, 131070);
                    composer.endNode();
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).k), composer, 0);
                    Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composer, 0).n);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.BUY_METRO_TICKET, new Object[0], composer, 6);
                    Shape shape = ChaloTheme.d(composer, 0).g;
                    Function0 function2 = this.b;
                    boolean zChanged2 = composer.changed(function2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new p80(function2, 7);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC2, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue2, composer, 0, 492);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer, 0).g), composer, 0);
                    Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composer, 0).n);
                    String strC3 = StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composer, 6);
                    Shape shape2 = ChaloTheme.d(composer, 0).g;
                    boolean zChanged3 = composer.changed(function0);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new p80(function0, 8);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ChaloFilledButtonKt.f(strC3, false, modifierM814height3ABfNKs2, null, shape2, 0.0f, 0L, (Function0) objRememberedValue3, composer, 0, 106);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                String str = (String) obj6;
                IconType iconType = (IconType) obj5;
                String str2 = (String) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-916489089, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegCard.<anonymous> (TripPlannerDefaultLegCard.kt:48)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion5.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion6, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion5.getTop(), composer2, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion6, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl6, Integer.valueOf(i9), composerM3915constructorimpl6));
                    TextKt.m2623TextNvy7gAk(this.c, i41.a(RowScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null), ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110584);
                    int i10 = this.e;
                    TripDetailsFareAndTravelTimeComponentKt.a(i10, 0, composer2, null, this.d, str);
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, 0).f), composer2, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion5.getCenterVertically(), composer2, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i11 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion6, composerM3915constructorimpl7, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl7, Integer.valueOf(i11), composerM3915constructorimpl7));
                    ImageKt.Image(PainterResourceHelperKt.a(iconType, composer2, 0), (String) null, SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer2, 0).k), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion4, ChaloTheme.b(composer2, 0).d), composer2, 0);
                    TextKt.m2623TextNvy7gAk(str2, pk0.d("PL_Drop_Stop_", i10, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null)), ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131064);
                    composer2.endNode();
                    composer2.startReplaceGroup(-960780467);
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ ui0(Function0 function0, String str, String str2, String str3, int i, IconType iconType, String str4) {
        this.b = function0;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i;
        this.g = iconType;
        this.h = str4;
    }
}
