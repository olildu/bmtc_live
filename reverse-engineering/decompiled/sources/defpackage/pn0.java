package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
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
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PremiumBusLandingScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pn0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19051a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ pn0(boolean z, Function1 function1, boolean z2, String str) {
        this.b = z;
        this.c = function1;
        this.d = z2;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.f19051a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.c;
        switch (i) {
            case 0:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1027324363, iIntValue, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OnlineBalanceAndCtaSection.<anonymous>.<anonymous> (OfflineCardRechargeScreen.kt:296)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer2, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    OfflineCardRechargeScreenKt.d(PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer2, 0).r0, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).h), this.b, this.d, this.e, composer2, 0);
                    ChaloSpacersKt.o(composer2, 0);
                    String strC = StringResourcesHelperKt.c(StringEnum.NCMC_ONLINE_RECHARGE_TITLE, new Object[0], composer2, 6);
                    boolean zChanged = composer2.changed(function1);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new qm0(function1, 16);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ChaloCardComposeItemsKt.e(null, strC, null, 0L, null, (Function0) objRememberedValue, composer2, 0, 29);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (!composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1685542798, iIntValue2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBLandingScreenToolbar.<anonymous>.<anonymous> (PremiumBusLandingScreen.kt:371)");
                    }
                    if (this.b) {
                        composer3.startReplaceGroup(1542895561);
                        boolean zChanged2 = composer3.changed(function1);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new yt0(function1, 15);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        IconButtonKt.IconButton((Function0) objRememberedValue2, PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Phone_Icon"), false, null, null, null, ComposableSingletons$PremiumBusLandingScreenKt.f7989a, composer3, 1572864, 60);
                        composer = composer3;
                    } else {
                        composer = composer3;
                        composer.startReplaceGroup(1529291924);
                    }
                    composer.endReplaceGroup();
                    if (this.d) {
                        composer.startReplaceGroup(1543449252);
                        Modifier modifierA = PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_PB_NOTIFICATION_ICON_".concat(this.e));
                        boolean zChanged3 = composer.changed(function1);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new yt0(function1, 16);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_NOTIFICATIONS, composer, 6), (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue3, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 120);
                    } else {
                        composer.startReplaceGroup(1529291924);
                    }
                    composer.endReplaceGroup();
                    boolean zChanged4 = composer.changed(function1);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new yt0(function1, 10);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue4, PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Help_Icon"), false, null, null, null, ComposableSingletons$PremiumBusLandingScreenKt.b, composer, 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ pn0(boolean z, boolean z2, String str, Function1 function1) {
        this.b = z;
        this.d = z2;
        this.e = str;
        this.c = function1;
    }
}
