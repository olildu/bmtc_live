package defpackage;

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
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ComposableSingletons$ChaloCircularBackButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ze implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20190a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ze(Function0 function0, int i) {
        this.f20190a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20190a;
        Function0 function0 = this.b;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1825361893, iIntValue, -1, "app.chalo.ncmc.ui.landing.compose.CardFetchFailed.<anonymous> (CardInfoLandingScreen.kt:346)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter());
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierAlign);
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
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SOMETHING_WENT_WRONG_PLEASE_TRY_AGAIN, new Object[0], composer, 6), SizeKt.fillMaxWidth(companion, 0.6f), ChaloTheme.a(composer, 0).t0, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.h(ChaloTheme.e(composer, 0)), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 130040);
                    ChaloSpacersKt.p(composer, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.REFRESH, new Object[0], composer, 6), ClickableKt.m295clickableO2vRcR0$default(companion, RippleEffectKt.b(composer), null, false, null, null, this.b, 28, null), ChaloTheme.a(composer, 0).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer, 0)), composer, 0, 0, 131064);
                    ChaloSpacersKt.B(composer, 0);
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.CAB_ACTIVITY_REFRESH, composer, 6), (String) null, (Modifier) null, ChaloTheme.a(composer, 0).B, composer, Painter.$stable | 48, 4);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-130044873, iIntValue2, -1, "app.chalo.ncmc.ui.landing.compose.NoCardLinkedView.<anonymous> (CardInfoLandingScreen.kt:395)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion6, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign2 = boxScopeInstance.align(companion4, companion5.getTopStart());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierAlign2);
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
                    pk0.v(companion6, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i6), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_LINK_BENEFITS_TITLE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, 1572864, 0, 131002);
                    ChaloSpacersKt.o(composer2, 0);
                    CardInfoLandingScreenKt.f(0, composer2, null, StringResourcesHelperKt.c(StringEnum.CARD_LINKING_BENEFIT_DESC_1, new Object[0], composer2, 6));
                    ChaloSpacersKt.n(composer2, 0);
                    CardInfoLandingScreenKt.f(0, composer2, null, StringResourcesHelperKt.c(StringEnum.CARD_LINKING_BENEFIT_DESC_2, new Object[0], composer2, 6));
                    composer2.endNode();
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_LINK_OFFER_IMAGE, composer2, 6), (String) null, boxScopeInstance.align(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer2, 0).r), companion5.getTopEnd()), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 104);
                    CardInfoLandingScreenKt.g(0, composer2, boxScopeInstance.align(companion4, companion5.getBottomStart()), function0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1944314785, iIntValue3, -1, "app.chalo.compose.components.buttons.CircularBackButton.<anonymous> (ChaloCircularBackButton.kt:35)");
                    }
                    boolean zChanged = composer3.changed(function0);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new hb(function0, 23);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableSingletons$ChaloCircularBackButtonKt.f1855a, composer3, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                if (!composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    composer4.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-435656169, iIntValue4, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:82)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composer4, 6), PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, this.b, 15, null), ChaloTheme.b(composer4, 6).f), ChaloTheme.a(composer4, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 6).getBodyMedium(), composer4, 0, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    composer5.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1948998953, iIntValue5, -1, "app.chalo.compose.ChaloCurrentLocationComposable.<anonymous> (ChaloHeaderTextComposable.kt:58)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ChaloTheme.a(composer5, 6).t, null, 2, null);
                    boolean zChanged2 = composer5.changed(function0);
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new fk(function0, 2);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloTheme.b(composer5, 6).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer5, 48);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i7 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion8, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl6, Integer.valueOf(i7), composerM3915constructorimpl6));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.LOCATION_SEARCH, composer5, 6), "", (Modifier) null, ChaloColorTokenKt.c(ChaloColorToken.Orange2.f9830a), composer5, Painter.$stable | 48, 4);
                    ChaloSpacersKt.y(composer5, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.USE_MY_CURRENT_LOCATION, new Object[0], composer5, 6), PaddingKt.m786paddingVpY3zN4$default(companion7, 0.0f, ChaloTheme.b(composer5, 6).g, 1, null), ChaloTheme.a(composer5, 6).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer5, 6)), composer5, 0, 0, 131064);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    composer6.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2122468483, iIntValue6, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:609)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(companion9, ChaloTheme.b(composer6, 0).i);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer6, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i8 = (int) ((currentCompositeKeyHashCode7 >>> 32) ^ currentCompositeKeyHashCode7);
                    CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer6, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion10.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor7);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion10, composerM3915constructorimpl7, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl7, Integer.valueOf(i8), composerM3915constructorimpl7));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TP_CHALO_BUS_TOOLTIP_DESC, new Object[0], composer6, 6), null, ChaloTheme.a(composer6, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131066);
                    ChaloSpacersKt.z(composer6, 0);
                    boolean zChanged3 = composer6.changed(function0);
                    Object objRememberedValue3 = composer6.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ag1(function0, 11);
                        composer6.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer6, 6), ClickableKt.m299clickableoSLSa3U$default(companion9, false, null, null, null, (Function0) objRememberedValue3, 15, null), ChaloTheme.a(composer6, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131064);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
