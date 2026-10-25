package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.ads.NativeInlineAdKt;
import app.chalo.ads.NativeInlineAdSlot;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModelKt;
import app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCardKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hl0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15838a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function f;
    public final /* synthetic */ Function g;

    public /* synthetic */ hl0(PBOriginDestinationAppModel pBOriginDestinationAppModel, TimeUtilsContract timeUtilsContract, String str, String str2, Function1 function1, Function1 function2) {
        this.c = pBOriginDestinationAppModel;
        this.d = timeUtilsContract;
        this.b = str;
        this.e = str2;
        this.f = function1;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15838a;
        Unit unit = Unit.f17538a;
        Function function = this.g;
        Function function2 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                NativeInlineAdSlot nativeInlineAdSlot = (NativeInlineAdSlot) obj6;
                Modifier modifier = (Modifier) obj5;
                Map map = (Map) obj4;
                Function3 function3 = (Function3) function2;
                Function2 function4 = (Function2) function;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1647003753, iIntValue, -1, "app.chalo.ads.NativeInlineAdComposable.<anonymous> (NativeInlineAd.kt:688)");
                    }
                    boolean zChanged = composer.changed(function3);
                    String str = this.b;
                    boolean zChanged2 = zChanged | composer.changed(str);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new h3(26, function3, str);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    NativeInlineAdKt.a(str, nativeInlineAdSlot, modifier, map, (Function2) objRememberedValue, function4, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) obj6;
                TimeUtilsContract timeUtilsContract = (TimeUtilsContract) obj5;
                String str2 = (String) obj4;
                Function1 function1 = (Function1) function2;
                Function1 function5 = (Function1) function;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-817653855, iIntValue2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumMultipleOriginDestinationBottomSheet.<anonymous>.<anonymous>.<anonymous> (PremiumBusStopSelectionScreen.kt:744)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composer2, 0).g, ChaloTheme.b(composer2, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM785paddingVpY3zN4);
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
                    FromAndToStopCardKt.b(PBOriginDestinationAppModelKt.a(pBOriginDestinationAppModel, timeUtilsContract), null, this.b, str2, 0L, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), null, true, 0, true, 0.0f, 0.0f, composer2, 817889280, 0, 7506);
                    if (pBOriginDestinationAppModel.f7091a.isEmpty()) {
                        composer2.startReplaceGroup(2087008183);
                    } else {
                        composer2.startReplaceGroup(2116416054);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).h), composer2, 0);
                        DividerKt.m1949Divider9IZ8Weo(null, ChaloTheme.b(composer2, 0).b, ChaloTheme.a(composer2, 0).m, composer2, 0, 1);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).h), composer2, 0);
                        boolean zChanged3 = composer2.changed(function1) | composer2.changedInstance(pBOriginDestinationAppModel);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new gw0(function1, pBOriginDestinationAppModel, 2);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        boolean zChanged4 = composer2.changed(function5) | composer2.changedInstance(pBOriginDestinationAppModel);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new gw0(function5, pBOriginDestinationAppModel, 3);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        PremiumBusStopSelectionScreenKt.n(0, composer2, null, function0, (Function0) objRememberedValue3);
                    }
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

    public /* synthetic */ hl0(String str, NativeInlineAdSlot nativeInlineAdSlot, Modifier modifier, Map map, Function3 function3, Function2 function2) {
        this.b = str;
        this.c = nativeInlineAdSlot;
        this.d = modifier;
        this.e = map;
        this.f = function3;
        this.g = function2;
    }
}
